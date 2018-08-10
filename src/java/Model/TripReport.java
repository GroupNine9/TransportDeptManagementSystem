
package Model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author GraceTina
 */
public class TripReport implements Serializable {
    
    // auto generated
    private Integer tripReportId;
    // unique, foreign key
    private Integer approvedTripId;
    // unique, foreign key
    private Integer staffId;
    // in litres
    private Double fuelDrawn;
    private Date dateTimeIn;
    private Date dateTimeOut;
    // kilometers covered
    private Double mileage;
   
    
    public TripReport() {
    }

    public Integer getTripReportId() {
        return tripReportId;
    }

    public void setTripReportId(Integer tripReportId) {
        this.tripReportId = tripReportId;
    }

    public Integer getApprovedTripId() {
        return approvedTripId;
    }

    public void setApprovedTripId(Integer approvedTripId) {
        this.approvedTripId = approvedTripId;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public Double getFuelDrawn() {
        return fuelDrawn;
    }

    public void setFuelDrawn(Double fuelDrawn) {
        this.fuelDrawn = fuelDrawn;
    }

    public Date getDateTimeIn() {
        return dateTimeIn;
    }

    public void setDateTimeIn(Date dateTimeIn) {
        this.dateTimeIn = dateTimeIn;
    }

    public Date getDateTimeOut() {
        return dateTimeOut;
    }

    public void setDateTimeOut(Date dateTimeOut) {
        this.dateTimeOut = dateTimeOut;
    }

    public Double getMileage() {
        return mileage;
    }

    public void setMileage(Double mileage) {
        this.mileage = mileage;
    }
}
