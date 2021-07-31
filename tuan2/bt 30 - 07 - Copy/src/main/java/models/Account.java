package models;

public class Account {
    private int id;
    private String userName;
    private String password;
    private String gmail;

    public Account(){}

    public Account(int id, String userName, String password, String gmail) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.gmail = gmail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }
}
