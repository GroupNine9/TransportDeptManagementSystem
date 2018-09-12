
package transportmgtsys.model;

import java.io.Serializable;


public class Trip implements Serializable {
    
    // auto-generated
    private Integer tripId;
    // attach a trip to its application infor
    private Integer tripApplicationId;
    // foreign key
    private Integer driverId;
    // a trip needs a vehicle
    private Integer vehicleId;
    // on-going or what? I mean, are they back from wherever it is they went?
    private Boolean inProgress;

    public Trip() {
    }

    public Integer getTripId() {
        return tripId;
    }

    public void setTripId(Integer tripId) {
        this.tripId = tripId;
    }

    public Integer getTripApplicationId() {
        return tripApplicationId;
    }

    public void setTripApplicationId(Integer tripApplicationId) {
        this.tripApplicationId = tripApplicationId;
    }

    public Integer getDriverId() {
        return driverId;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    public Integer getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Integer vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Boolean getInProgress() {
        return inProgress;
    }

    public void setInProgress(Boolean inProgress) {
        this.inProgress = inProgress;
    }
}
