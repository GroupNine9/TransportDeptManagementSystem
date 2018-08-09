package Model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author GraceTina
 */
public class User implements Serializable {

    private Integer userId;
    private String emailAddr;
    private String pwd;
    private String surName;
    private String OtherNames;
    private Date dateJoined;
    private Date lastLogin;
    private Boolean isActive;
    private String role;

    public User() {
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getEmailAddr() {
        return emailAddr;
    }

    public void setEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getOtherNames() {
        return OtherNames;
    }

    public void setOtherNames(String OtherNames) {
        this.OtherNames = OtherNames;
    }

    public Date getDateJoined() {
        return dateJoined;
    }

    public void setDateJoined(Date dateJoined) {
        this.dateJoined = dateJoined;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" + "surName=" + surName + ", OtherNames=" + OtherNames + ", role=" + role + '}';
    }

    // convert a role from enum to string
    // e.g. from "A" ==> "Administrator"
    public static String enumToString(String enumRole) {

        if (enumRole.equalsIgnoreCase("D")) {
            return "Driver";
        } else if (enumRole.equalsIgnoreCase("M")) {
            return "Mechanic";
        } else if (enumRole.equalsIgnoreCase("TO")) {
            return "Transport Officer";
        } else if (enumRole.equalsIgnoreCase("TS")) {
            return "Time Tabling Secretary";
        } else if (enumRole.equalsIgnoreCase("SO")) {
            return "Staff Official";
        } else {
            return "Unknown";
        }
    }

    // convert a role from string to string
    // e.g. from "Administrator" ==> "A"
    public static String stringToEnum(String stringRole) {

        if (stringRole.equalsIgnoreCase("Driver")) {
            return "D";
        } else if (stringRole.equalsIgnoreCase("Mechanic")) {
            return "M";
        } else if (stringRole.equalsIgnoreCase("Transport Officer")) {
            return "TO";
        } else if (stringRole.equalsIgnoreCase("Staff Official")) {
            return "SO";
        } else if (stringRole.equalsIgnoreCase("Time Tabling Secretary")) {
            return "TS";
        } else {
            return null;
        }
    }
}
