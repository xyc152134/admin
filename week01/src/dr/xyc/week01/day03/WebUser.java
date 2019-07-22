package dr.xyc.week01.day03;

public class WebUser {
    private String id;
    private String password;
    private String email;

    public WebUser(String id, String password) {
        this.id = id;
        this.password = password;
        this.email=this.id+"@gameschool.com";

    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}
