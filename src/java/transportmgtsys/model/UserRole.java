package transportmgtsys.model;


// map enums to human readable user role strings
public enum UserRole {

    TO("TO", "Transport Officer"),
    DRIVER("D", "Driver"),
    MECHANIC("M", "Mechanic"),
    TTS("TTS", "Timetabling Officer"),
    SO("SO", "Staff Official");

    private final String roleStr;
    private final String roleEnum;

    UserRole(String roleEnum, String roleStr) {
        this.roleEnum = roleEnum;
        this.roleStr = roleStr;
    }

    public String getRoleStr() {
        return roleStr;
    }

    public String getRoleEnum() {
        return roleEnum;
    }
}
