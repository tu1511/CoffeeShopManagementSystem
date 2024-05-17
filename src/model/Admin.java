package model;

/**
 *
 * @author LENOVO
 */
public class Admin {
    private int id;
    private String usernameString;
    private String passwordString;
    private String sQuesString;
    private String ansString;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsernameString() {
        return usernameString;
    }

    public void setUsernameString(String usernameString) {
        this.usernameString = usernameString;
    }

    public String getPasswordString() {
        return passwordString;
    }

    public void setPasswordString(String passwordString) {
        this.passwordString = passwordString;
    }

    public String getsQuesString() {
        return sQuesString;
    }

    public void setsQuesString(String sQuesString) {
        this.sQuesString = sQuesString;
    }

    public String getAnsString() {
        return ansString;
    }

    public void setAnsString(String ansString) {
        this.ansString = ansString;
    }
    
    
}
