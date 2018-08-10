
package beans;

import Model.MyDb;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Vehicle {
    private String vehicleid,platenumber,model,capacity,type,status;
    
    public Vehicle(){
    vehicleid="";
    platenumber="";
    model="";
    capacity="";
    type="";  
    status="";
    }

    public String getVehicleid() {
        return vehicleid;
    }

    public void setVehicleid(String vehicleid) {
        this.vehicleid = vehicleid;
    }

    public String getPlatenumber() {
        return platenumber;
    }

    public void setPlatenumber(String platenumber) {
        this.platenumber = platenumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public void registerVehicle()
    {
         try
          {
            MyDb db = new MyDb();
            db.getCon();
            String query = "insert into vehicles (VEHICLEID,PLATENUMBER,MODEL,CAPACITY,TYPE,STATUS) values ('"+vehicleid+"' , '"+platenumber+"' ,'"+model+"' , '"+capacity+"' , '"+type+"' , '"+status+"')";           
            Statement stmt = db.con.createStatement();
             try
             {
            stmt.executeUpdate(query);
            stmt.close();
             db.con.close();
              }
            catch (SQLException ex) 
            {
                Logger.getLogger(Staff.class.getName()).log(Level.SEVERE, null, ex);
            }
          } 
          catch (SQLException ex) 
          {
              Logger.getLogger(Staff.class.getName()).log(Level.SEVERE, null, ex);
          }   
          
    
    
    }
    
    
}
