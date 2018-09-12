
package transportmgtsys.model;

import java.io.Serializable;
import java.sql.Date;


// infor provided by Staff official
// approved by TT secretary
// later, approved by Transport officer
public class TripApplication implements Serializable {
    
    private Integer tripApplicationId;
    // foreign key
    private Integer staffOfficialId;
    private Date expectedDateOut;
    private Date expectedDateIn;
    private String destination;
    private Short capacity;
    // academic or official
    private String tripType;
    // approved, pending or declined
    private String ttSecApprovalStatus;
    // approved, pending or declined
    private String tOfficerApprovalStatus;

    public TripApplication() {
    }

    public Integer getStaffOfficialId() {
        return staffOfficialId;
    }

    public void setStaffOfficialId(Integer staffOfficialId) {
        this.staffOfficialId = staffOfficialId;
    }
    
    public Integer getTripApplicationId() {
        return tripApplicationId;
    }

    public void setTripApplicationId(Integer tripApplicationId) {
        this.tripApplicationId = tripApplicationId;
    }

    public Date getExpectedDateOut() {
        return expectedDateOut;
    }

    public void setExpectedDateOut(Date expectedDateOut) {
        this.expectedDateOut = expectedDateOut;
    }

    public Date getExpectedDateIn() {
        return expectedDateIn;
    }

    public void setExpectedDateIn(Date expectedDateIn) {
        this.expectedDateIn = expectedDateIn;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Short getCapacity() {
        return capacity;
    }

    public void setCapacity(Short capacity) {
        this.capacity = capacity;
    }

    public String getTripType() {
        return tripType;
    }

    public void setTripType(String tripType) {
        this.tripType = tripType;
    }

    public String getTtSecApprovalStatus() {
        return ttSecApprovalStatus;
    }

    public void setTtSecApprovalStatus(String ttSecApprovalStatus) {
        this.ttSecApprovalStatus = ttSecApprovalStatus;
    }

    public String gettOfficerApprovalStatus() {
        return tOfficerApprovalStatus;
    }

    public void settOfficerApprovalStatus(String tOfficerApprovalStatus) {
        this.tOfficerApprovalStatus = tOfficerApprovalStatus;
    }
    
    
}
