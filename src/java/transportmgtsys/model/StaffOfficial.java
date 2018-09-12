
package transportmgtsys.model;


public class StaffOfficial {
    
    private Integer staffOfficialId;
    private String department;
    private String faculty;

    public StaffOfficial() {
    }
    
    public Integer getStaffOfficialId() {
        return staffOfficialId;
    }

    public void setStaffOfficialId(Integer staffOfficialId) {
        this.staffOfficialId = staffOfficialId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
    
    
}
