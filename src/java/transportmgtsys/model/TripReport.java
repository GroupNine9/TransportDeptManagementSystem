package transportmgtsys.model;

import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author GraceTina
 */
public class TripReport implements Serializable {

    // auto generated
    private Integer tripReportId;
    // unique, foreign key
    private String tripName;
    // in litres
    private String fuelDrawn;
    private String dateTimeIn;
    private String dateTimeOut;
    // kilometers covered
    
    private String services;
    private String driverNo;
    private String speedReading;
    private String kmJourney;
    private String receiptNo;

    public TripReport() {
        
    }

    public String getServices() {
        return services;
    }

    public void setServices(String services) {
        this.services = services;
    }

    public String getDriverNo() {
        return driverNo;
    }

    public void setDriverNo(String driverNo) {
        this.driverNo = driverNo;
    }

    public String getSpeedReading() {
        return speedReading;
    }

    public void setSpeedReading(String speedReading) {
        this.speedReading = speedReading;
    }

    public String getKmJourney() {
        return kmJourney;
    }

    public void setKmJourney(String kmJourney) {
        this.kmJourney = kmJourney;
    }

    public String getReceiptNo() {
        return receiptNo;
    }

    public void setReceiptNo(String receiptNo) {
        this.receiptNo = receiptNo;
    }
    

    public Integer getTripReportId() {
        return tripReportId;
    }

    public void setTripReportId(Integer tripReportId) {
        this.tripReportId = tripReportId;
    }

    public String getTripName() {
        return tripName;
    }

    public void setTripName(String tripName) {
        this.tripName = tripName;
    }

    public String getFuelDrawn() {
        return fuelDrawn;
    }

    public void setFuelDrawn(String fuelDrawn) {
        this.fuelDrawn = fuelDrawn;
    }

   
    

    public String getDateTimeIn() {
        return dateTimeIn;
    }

    public void setDateTimeIn(String dateTimeIn) {
        this.dateTimeIn = dateTimeIn;
    }

    public String getDateTimeOut() {
        return dateTimeOut;
    }

    public void setDateTimeOut(String dateTimeOut) {
        this.dateTimeOut = dateTimeOut;
    }



  
}
