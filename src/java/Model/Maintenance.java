package Model;

/**
 *
 * @author GraceTina
 */
public class Maintenance {

    private String department;
    private String odometerNumber;
    private String fuel;
    private String model;
    private String engineNumber;
    private String service;
    private String vehicleCondition;
    private String dateIn;
    private String promiseddate;
    private String contactPerson;

    public Maintenance(String department, String odometerNumber, String fuel, String model, String engineNumber, String service, String vehicleCondition, String dateIn, String promiseddate, String contactPerson) {
        this.department = department;
        this.odometerNumber = odometerNumber;
        this.fuel = fuel;
        this.model = model;
        this.engineNumber = engineNumber;
        this.service = service;
        this.vehicleCondition = vehicleCondition;
        this.dateIn = dateIn;
        this.promiseddate = promiseddate;
        this.contactPerson = contactPerson;
    }

    public Maintenance() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getOdometerNumber() {
        return odometerNumber;
    }

    public void setOdometerNumber(String odometerNumber) {
        this.odometerNumber = odometerNumber;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngineNumber() {
        return engineNumber;
    }

    public void setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getVehicleCondition() {
        return vehicleCondition;
    }

    public void setVehicleCondition(String vehicleCondition) {
        this.vehicleCondition = vehicleCondition;
    }

    public String getDateIn() {
        return dateIn;
    }

    public void setDateIn(String dateIn) {
        this.dateIn = dateIn;
    }

    public String getPromiseddate() {
        return promiseddate;
    }

    public void setPromiseddate(String promiseddate) {
        this.promiseddate = promiseddate;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

}
