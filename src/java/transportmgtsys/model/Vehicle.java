
package transportmgtsys.model;

import java.io.Serializable;


public class Vehicle implements Serializable {
    
    private Integer vehicleId;
    private String plateNumber;
    private Integer capacity;
    private String description;
    private Boolean isVailable;

    public Vehicle() {
    }

    public Boolean getIsVailable() {
        return isVailable;
    }

    public void setIsVailable(Boolean isVailable) {
        this.isVailable = isVailable;
    }
    
    public Integer getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Integer vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
