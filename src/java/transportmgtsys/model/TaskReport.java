/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportmgtsys.model;

import java.sql.Date;

/**
 *
 * @author GraceTina
 */

public class TaskReport {
    
    private String department;
    private String odometerNo;
    private String fuel;
    private String engineNo;
    private String service;
    private String vehicleCnd;
    private String dateIn;
    private String promisedDate;
    private String contactPerson;

    public TaskReport() {
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getOdometerNo() {
        return odometerNo;
    }

    public void setOdometerNo(String odometerNo) {
        this.odometerNo = odometerNo;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getEngineNo() {
        return engineNo;
    }

    public void setEngineNo(String engineNo) {
        this.engineNo = engineNo;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getVehicleCnd() {
        return vehicleCnd;
    }

    public void setVehicleCnd(String vehicleCnd) {
        this.vehicleCnd = vehicleCnd;
    }

    public String getDateIn() {
        return dateIn;
    }

    public void setDateIn(String dateIn) {
        this.dateIn = dateIn;
    }

    public String getPromisedDate() {
        return promisedDate;
    }

    public void setPromisedDate(String promisedDate) {
        this.promisedDate = promisedDate;
    }



    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }
    
    
}


