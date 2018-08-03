/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Barno
 */
public class LoginBean 
{
     private String STAFFID;
    private String PASSWORD;
    
    public String getStaffId()
    {
        return STAFFID;
    }
    public void setStaffId(String STAFFID)
    {
        this.STAFFID = STAFFID;
    }
    
     public String getPassword()
    {
        return PASSWORD;
    }
    public void setPassword(String PASSWORD)
    {
        this.PASSWORD = PASSWORD;
    }
}
