package transportmgtsys.model;

import java.io.Serializable;

/**
 *
 * @author GraceTina
 */
public class User implements Serializable {
    
    private Integer userId;
    private String staffId;
    private String pwd;
    private UserRole role;
    private String firstName;
    private String lastName;
    private String nationalId;
    private String emailAddr;
    private String phoneNo;
    private String gender;

    public User() {
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getEmailAddr() {
        return emailAddr;
    }

    public void setEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
    
    public static UserRole stringToObject(String roleStr) {
        
        if (roleStr.equalsIgnoreCase("Driver")) {
            return UserRole.DRIVER;
        } else if (roleStr.equalsIgnoreCase("Mechanic")) {
            return UserRole.MECHANIC;
        } else if (roleStr.equalsIgnoreCase("Transport Officer")) {
            return UserRole.TO;
        } else if (roleStr.equalsIgnoreCase("Staff Official")) {
            return UserRole.SO;
        } else if (roleStr.equalsIgnoreCase("Timetabling Secretary")) {
            return UserRole.TTS;
        } else {
            return null;
        }
    }
    
    public static UserRole enumToObject(String roleEnum) {
        
        if (roleEnum.equalsIgnoreCase("D")) {
            return UserRole.DRIVER;
        } else if (roleEnum.equalsIgnoreCase("M")) {
            return UserRole.MECHANIC;
        } else if (roleEnum.equalsIgnoreCase("TO")) {
            return UserRole.TO;
        } else if (roleEnum.equalsIgnoreCase("SO")) {
            return UserRole.SO;
        } else if (roleEnum.equalsIgnoreCase("TTS")) {
            return UserRole.TTS;
        } else {
            return null;
        }
    }
}
