package cn.edu.lzit.jdbc02.pojo;

public class User {
    private int number;
    private String petName;
    private String userNameTrue;
    private String userPassword;
    private String gender;
    private String email;
    private String address;

    public User() {
    }

    public User( String petName, String userNameTrue, String userPassword, String gender, String email, String address) {
        this.petName = petName;
        this.userNameTrue = userNameTrue;
        this.userPassword = userPassword;
        this.gender = gender;
        this.email = email;
        this.address = address;
    }

    public User(int number, String petName, String userNameTrue, String userPassword, String gender, String email, String address) {
        this.number = number;
        this.petName = petName;
        this.userNameTrue = userNameTrue;
        this.userPassword = userPassword;
        this.gender = gender;
        this.email = email;
        this.address = address;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getUserNameTrue() {
        return userNameTrue;
    }

    public void setUserNameTrue(String userNameTrue) {
        this.userNameTrue = userNameTrue;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
