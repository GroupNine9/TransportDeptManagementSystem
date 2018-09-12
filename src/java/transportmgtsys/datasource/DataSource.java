package transportmgtsys.datasource;

import transportmgtsys.model.Staff;
import transportmgtsys.model.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import transportmgtsys.model.ServiceRequest;
import transportmgtsys.model.TaskReport;
import transportmgtsys.model.Trip;
import transportmgtsys.model.TripApplication;
import transportmgtsys.model.TripReport;
import transportmgtsys.model.Vehicle;

/**
 *
 * @author GraceTina
 */

public class DataSource {

    private Connection connection;
    private static final String DB_USER = "root";
    private static final String DB_PWD = "TinaGrace@1";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/maintenance?zeroDateTimeBehavior=convertToNull";
    private static final String DB_DRIVER_NAME = "com.mysql.jdbc.Driver";
    private static final Logger LOGGER = Logger.getLogger(DataSource.class.getName());

    public DataSource() {
    }

    @PostConstruct
    public void init() {
        LOGGER.log(Level.INFO, "Initializing database connection ...");

        try {
            // register driver
            Class.forName(DB_DRIVER_NAME);
            // create connection
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PWD);
            LOGGER.log(Level.INFO, "Database connection created successfully");
        } catch (ClassNotFoundException | SQLException exception) {
            LOGGER.log(Level.SEVERE, "An issue with database connection : ", exception);
        }
    }

    @PreDestroy
    public void destroyDbConnection() {
        try {
            connection.close();
        } catch (SQLException ex) {
            LOGGER.log(Level.SEVERE, "Error occurred while closing database connection");
        }
    }

    /*
    public ArrayList<Staff> findAllStaff() {

        ArrayList<Staff> allStaff = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM staff");
            allStaff = new ArrayList<>();

            while (resultSet.next()) {
                allStaff.add(
                        new Staff(
                                resultSet.getLong("staffId"), resultSet.getString("surname"),
                                resultSet.getString("otherNames"), resultSet.getString("nationalId"),
                                resultSet.getString("phoneNumber"), resultSet.getString("password"),
                                resultSet.getString("emailAddress"), resultSet.getString("staffRole")
                        )
                );
            }
        } catch (SQLException exception) {
            LOGGER.log(Level.SEVERE, exception.toString());
        } finally {
            // close result set and statement
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException exception) {
                    //do nothing
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException exception) {
                    //do nothing
                }
            }
        }
        return allStaff;
    }*/
    // create a user
    public boolean createUser(User newUser) {

        PreparedStatement pStatement = null;
        boolean user_added = false;
        try {
            String query = "INSERT INTO user (staffId, pwd, role, firstName, "
                    + "lastName, nationalId, emailAddr, gender) values(?, ?, ?, ?, ?, ?, ?, ?)";
            pStatement = connection.prepareStatement(query);
            pStatement.setString(1, newUser.getStaffId());
            pStatement.setString(2, newUser.getPwd());
            pStatement.setString(3, newUser.getRole().getRoleEnum());
            pStatement.setString(4, newUser.getFirstName());
            pStatement.setString(5, newUser.getLastName());
            pStatement.setString(6, newUser.getNationalId());
            pStatement.setString(7, newUser.getEmailAddr());
            pStatement.setString(8, newUser.getGender());

            if (pStatement.executeUpdate() == 0) {
                LOGGER.log(Level.INFO, "New Staff Created: ", newUser.toString());
                // try - with resources
                try (PreparedStatement getIdSttmnt = connection.prepareStatement("SELECT userId FROM user WHERE staffId = ?")) {
                    getIdSttmnt.setString(1, newUser.getStaffId());
                    try (ResultSet resultSet = pStatement.executeQuery()) {
                        if (resultSet.next()) {
                            newUser.setUserId(resultSet.getInt("userId"));
                            user_added = true;
                        }
                    }
                }
            }
        } catch (SQLException exception) {
            LOGGER.log(Level.SEVERE, null, exception);
        } finally {
            if (pStatement != null) {
                try {
                    pStatement.close();
                } catch (SQLException exception) {
                    /*do nothing*/
                }
            }
        }
        return user_added;
    }

    public void createVehicle(Vehicle vehicle) {

        PreparedStatement pStatement = null;
        try {
            String query = "INSERT INTO Vehicle (plateNumber, capacity, "
                    + "description) values(?, ?, ?)";
            pStatement = connection.prepareStatement(query);
            pStatement.setString(1, vehicle.getPlateNumber());
            pStatement.setInt(2, vehicle.getCapacity());
            pStatement.setString(3, vehicle.getDescription());

            if (pStatement.executeUpdate() == 0) {
                LOGGER.log(Level.INFO, "New Vehicle Created: ");
            }
        } catch (SQLException exception) {
            LOGGER.log(Level.SEVERE, null, exception);
        } finally {
            if (pStatement != null) {
                try {
                    pStatement.close();
                } catch (SQLException exception) {/*do nothing*/
                }
            }
        }
    }

    public void createTripApplication(TripApplication tripApplication) {

        PreparedStatement pStatement = null;
        try {
            String query = "INSERT INTO TripApplication (staffOfficialId, expectedDateOut, expectedDateIn, "
                    + "destination, capacity,) values(?, ?, ?, ?, ?,)";
            pStatement = connection.prepareStatement(query);
            pStatement.setInt(1, tripApplication.getStaffOfficialId());
            pStatement.setDate(2, tripApplication.getExpectedDateOut());
            pStatement.setDate(3, tripApplication.getExpectedDateIn());
            pStatement.setString(4, tripApplication.getDestination());
            pStatement.setInt(5, tripApplication.getCapacity());

            pStatement.executeUpdate();

            if (pStatement.executeUpdate() == 0) {
                LOGGER.log(Level.INFO, "New TripApplication Created: ");
            }
        } catch (SQLException exception) {
            LOGGER.log(Level.SEVERE, null, exception);
        } finally {
            if (pStatement != null) {
                try {
                    pStatement.close();
                } catch (SQLException exception) {/*do nothing*/
                }
            }
        }

    }

    public void createTrip(Trip trip) {

        PreparedStatement pStatement = null;
        try {
            String query = "INSERT INTO Trip (tripApplicationId, driverId, vehicleId, "
                    + "inProgress) values(?, ?, ?, ?)";
            pStatement = connection.prepareStatement(query);
            pStatement.setInt(1, trip.getTripApplicationId());
            pStatement.setInt(2, trip.getDriverId());
            pStatement.setInt(3, trip.getVehicleId());
            pStatement.setBoolean(4, trip.getInProgress());

            pStatement.executeUpdate();

            if (pStatement.executeUpdate() == 0) {
                LOGGER.log(Level.INFO, "New Trip Created: ");
            }
        } catch (SQLException exception) {
            LOGGER.log(Level.SEVERE, null, exception);
        } finally {
            if (pStatement != null) {
                try {
                    pStatement.close();
                } catch (SQLException exception) {/*do nothing*/
                }
            }
        }
    }

    public void createTripReport(TripReport tripReport) {

        PreparedStatement pStatement = null;
        try {
            String query = "INSERT INTO TripReport (tripId, fuelDrawn, "
                    + "dateTimeIn, dateTimeOut, driverNo ,kmJourney, receiptNo, services,speedReading) values(?,?,?,?,?,?, ?, ?, ?, ?)";
            pStatement = connection.prepareStatement(query);
            pStatement.setString(1, tripReport.getTripName());
            pStatement.setString(2, tripReport.getFuelDrawn());
            pStatement.setString(3, tripReport.getDateTimeIn());
            pStatement.setString(4, tripReport.getDateTimeOut());
            pStatement.setString(6, tripReport.getDriverNo());
            pStatement.setString(7, tripReport.getKmJourney());
            pStatement.setString(8, tripReport.getReceiptNo());
            pStatement.setString(9, tripReport.getServices());
            pStatement.setString(10, tripReport.getSpeedReading());
            pStatement.executeUpdate();

            if (pStatement.executeUpdate() == 0) {
                LOGGER.log(Level.INFO, "New TripReport Created: ");
            }
        } catch (SQLException exception) {
            LOGGER.log(Level.SEVERE, null, exception);
        } finally {
            if (pStatement != null) {
                try {
                    pStatement.close();
                } catch (SQLException exception) {/*do nothing*/
                }
            }
        }
    }

    public User authenticate(String staffId, String pwd) {

        PreparedStatement pStatement = null;
        ResultSet resultSet = null;
        User user = null;
        try {
            pStatement = connection.prepareStatement("SELECT * FROM user WHERE staffId = ? AND pwd = ?");
            pStatement.setString(1, staffId);
            pStatement.setString(2, pwd);
            resultSet = pStatement.executeQuery();

            if (resultSet.next()) {
                user = new User();
                user.setUserId(resultSet.getInt("userId"));
                user.setStaffId(resultSet.getString("staffId"));
                user.setPwd(resultSet.getString("pwd"));
                user.setRole(User.enumToObject(resultSet.getString("role")));
                user.setFirstName(resultSet.getString("firstName"));
                user.setLastName(resultSet.getString("lastName"));
                user.setNationalId(resultSet.getString("nationalId"));
                user.setGender(resultSet.getString("gender"));
                user.setPhoneNo(resultSet.getString("phoneNo"));
                user.setEmailAddr(resultSet.getString("emailAddr"));
            }
        } catch (SQLException exception) {
            LOGGER.log(Level.SEVERE, null, exception);
        } finally {
            // close result set and statement
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException exception) {
                    /*do nothing*/ }
            }

            if (pStatement != null) {
                try {
                    pStatement.close();
                } catch (SQLException exception) {
                    /*do nothing*/ }
            }
        }
        return user;
    }

    // UPDATE PROFILES
    public void updateStaff(Staff updatedStaff) {
        PreparedStatement pStatement = null;
        try {
            String query = "UPDATE Staff SET  pwd = ?, role = ?, firstName = ?, "
                    + "lastName = ?, nationalId = ?, emailAddr = ?, gender = ? WHERE staffId = ?";
            pStatement = connection.prepareStatement(query);
            pStatement.setString(1, updatedStaff.getStaffId());
            pStatement.setString(2, updatedStaff.getPwd());
            pStatement.setString(3, updatedStaff.getRole().getRoleEnum());
            pStatement.setString(4, updatedStaff.getFirstName());
            pStatement.setString(5, updatedStaff.getLastName());
            pStatement.setString(6, updatedStaff.getNationalId());
            pStatement.setString(7, updatedStaff.getEmailAddr());
            pStatement.setString(8, updatedStaff.getGender());
           

            if (pStatement.executeUpdate() == 0) {
                LOGGER.log(Level.INFO, "User updated.");
            }
        } catch (SQLException exception) {
            LOGGER.log(Level.SEVERE, null, exception);
        } finally {
            if (pStatement != null) {
                try {
                    pStatement.close();
                } catch (SQLException exception) {
                    /*do nothing*/
                }
            }
        }
    }

    public void createTaskReport(TaskReport taskReport) {
        PreparedStatement pStatement = null;
        try {
            String query = "INSERT INTO TaskReport (department,odometerNo,fuel,engineNo,service,vehicleCnd,dateIn,promisedDate,contactPerson values(?,?,?,?,?,?, ?, ?, ?)";
            pStatement = connection.prepareStatement(query);
            pStatement.setString(1, taskReport.getDepartment());
            pStatement.setString(2, taskReport.getOdometerNo());
            pStatement.setString(3, taskReport.getFuel());
            pStatement.setString(4, taskReport.getEngineNo());
            pStatement.setString(5, taskReport.getService());
            pStatement.setString(6, taskReport.getVehicleCnd());
            pStatement.setString(7, taskReport.getDateIn());
            pStatement.setString(8, taskReport.getPromisedDate());
            pStatement.setString(9, taskReport.getContactPerson());

            pStatement.executeUpdate();

            if (pStatement.executeUpdate() == 0) {
                LOGGER.log(Level.INFO, "New TaskReport Created: ");
            }
        } catch (SQLException exception) {
            LOGGER.log(Level.SEVERE, null, exception);
        } finally {
            if (pStatement != null) {
                try {
                    pStatement.close();
                } catch (SQLException exception) {/*do nothing*/
                }
            }
        }

    }

    public void createServiceRequest(ServiceRequest serviceRequest) {
        PreparedStatement pStatement = null;
        try {
            String query = "INSERT INTO ServiceReport (vehicleId,dateIn,serviceWanted,partRepair,contactPrsn values(?,?,?,?,?)";
            pStatement = connection.prepareStatement(query);
            pStatement.setString(1, serviceRequest.getVehicleId());
            pStatement.setString(2, serviceRequest.getDateIn());
            pStatement.setString(3, serviceRequest.getServiceWanted());
            pStatement.setString(4, serviceRequest.getPartRepair());
            pStatement.setString(5, serviceRequest.getContactPrsn());

            pStatement.executeUpdate();

            if (pStatement.executeUpdate() == 0) {
                LOGGER.log(Level.INFO, "New ServiceRequest Created: ");
            }
        } catch (SQLException exception) {
            LOGGER.log(Level.SEVERE, null, exception);
        } finally {
            if (pStatement != null) {
                try {
                    pStatement.close();
                } catch (SQLException exception) {/*do nothing*/
                }
            }
        }
    }
}
