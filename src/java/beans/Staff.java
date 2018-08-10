package beans;

import Model.MyDb;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Staff {
    
    private String name,email,role,password,staffid, phonenumber,idnumber;
    //private int staffid,idnumber, phonenumber;
    //constructor
    public Staff()
    {
        staffid ="";
        name = "";
        email = "";
        idnumber = "";
        phonenumber = "";
        role = "";
        password = "";
    }
//setters and getters
    public String getStaffid() {
        return staffid;
    }

    public void setStaffid(String staffid) {
        this.staffid = staffid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    //other methods
    public void registerWorker()
    {
          try
          {
            MyDb db = new MyDb();
            db.getCon();
            String query = "insert into staff (STAFFID,NAME,EMAIL,IDNUMBER,PHONENUMBER,ROLE,PASSWORD) values ('"+staffid+"' , '"+name+"' ,'"+email+"' , '"+idnumber+"' , '"+phonenumber+"' , '"+role+"' , '"+password+"')";           
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
