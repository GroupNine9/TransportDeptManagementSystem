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


public class ServiceRequest {
    private String vehicleId;

    private String dateIn;
    private String serviceWanted;
    private String partRepair;
    private String contactPrsn;

    public ServiceRequest() {
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getDateIn() {
        return dateIn;
    }

    public void setDateIn(String dateIn) {
        this.dateIn = dateIn;
    }



   


    public String getServiceWanted() {
        return serviceWanted;
    }

    public void setServiceWanted(String serviceWanted) {
        this.serviceWanted = serviceWanted;
    }

    public String getPartRepair() {
        return partRepair;
    }

    public void setPartRepair(String partRepair) {
        this.partRepair = partRepair;
    }

    public String getContactPrsn() {
        return contactPrsn;
    }

    public void setContactPrsn(String contactPrsn) {
        this.contactPrsn = contactPrsn;
    }
    
    
}
