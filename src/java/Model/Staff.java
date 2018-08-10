package Model;

/**
 *
 * @author GraceTina
 */
public class Staff {

    private Long staffId;
    private String surname;
    private String otherNames;
    private String nationalId;
    private String phoneNumber;
    private String password;
    private String emailAddress;
    private String staffRole;

    public Staff() {
    }

    public Staff(Long staffId, String surname, String otherNames, String nationalId, String phoneNumber, String password, String emailAddress, String staffRole) {
        this.staffId = staffId;
        this.surname = surname;
        this.otherNames = otherNames;
        this.nationalId = nationalId;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.emailAddress = emailAddress;
        this.staffRole = staffRole;
    }

    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getOtherNames() {
        return otherNames;
    }

    public void setOtherNames(String otherNames) {
        this.otherNames = otherNames;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getStaffRole() {
        return staffRole;
    }

    public void setStaffRole(String staffRole) {
        this.staffRole = staffRole;
    }

    @Override
    public String toString() {
        return "Staff{" + "surname=" + surname + ", otherNames=" + otherNames + '}';
    }

}
