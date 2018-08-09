package datasource;

import Model.Staff;
import Model.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateless;

/**
 *
 * @author GraceTina
 */
@Stateless
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
                    /*do nothing*/
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException exception) {
                    /*do nothing*/
                }
            }
        }
        return allStaff;
    }

    public void createUser(User newUser) {

        PreparedStatement pStatement = null;
        try {
            String query = "INSERT INTO user (emailAddr, pwd, surName, otherNames, "
                    + "role) values(?, ?, ?, ?, ?)";
            pStatement = connection.prepareStatement(query);
            pStatement.setString(1, newUser.getEmailAddr());
            pStatement.setString(2, newUser.getPwd());
            pStatement.setString(3, newUser.getSurName());
            pStatement.setString(4, newUser.getOtherNames());
            pStatement.setString(5, User.stringToEnum(newUser.getRole()));

            if (pStatement.executeUpdate() == 0) {
                LOGGER.log(Level.INFO, "New Staff Created: ", newUser.toString());
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

    public void createStaff(Staff staff) {

        PreparedStatement preparedStatement = null;
        try {
            String SQL = "INSERT INTO staff (surname, otherNames, nationalId, phoneNumber, password,"
                    + "emailAddress, staffRole) values(?, ?, ?, ?, ?, ?, ?)";

            preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, staff.getSurname());
            preparedStatement.setString(2, staff.getOtherNames());
            preparedStatement.setString(3, staff.getNationalId());
            preparedStatement.setString(4, staff.getPhoneNumber());
            preparedStatement.setString(5, staff.getPassword());
            preparedStatement.setString(6, staff.getEmailAddress());
            preparedStatement.setString(7, staff.getStaffRole());

            if (preparedStatement.executeUpdate() == 0) {
                LOGGER.log(Level.INFO, "New Staff Created: ", staff.toString());
            }

        } catch (SQLException ex) {
            LOGGER.log(Level.SEVERE, null, ex);
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException exception) {/*do nothing*/
                }
            }
        }
    }

    public User authenticate(String emailAddr, String pwd) {

        PreparedStatement pStatement = null;
        ResultSet resultSet = null;
        User user = null;
        try {
            pStatement = connection.prepareStatement("SELECT * FROM user WHERE emailAddr = ? AND pwd = ?");
            pStatement.setString(1, emailAddr);
            pStatement.setString(2, pwd);
            resultSet = pStatement.executeQuery();

            if (resultSet.next()) {
                user = new User();
                user.setUserId(resultSet.getInt("userId"));
                user.setEmailAddr(resultSet.getString("emailAddr"));
                user.setIsActive(resultSet.getBoolean("isActive"));
                user.setPwd(resultSet.getString("pwd"));
                user.setSurName(resultSet.getString("surName"));
                user.setOtherNames(resultSet.getString("otherNames"));
                user.setDateJoined(resultSet.getDate("dateJoined"));
                user.setLastLogin(resultSet.getDate("lastLogin"));
                user.setRole(User.enumToString(resultSet.getString("role")));
            }
        } catch (SQLException exception) {
            LOGGER.log(Level.SEVERE, null, exception);
        } finally {
            // close result set and statement
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException exception) {
                    /*do nothing*/
                }
            }
            if (pStatement != null) {
                try {
                    pStatement.close();
                } catch (SQLException exception) {
                    /*do nothing*/
                }
            }
        }
        return user;
    }
}
