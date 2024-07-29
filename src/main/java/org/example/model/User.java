package org.example.model;

public abstract class User {
    private String ID;
    private String email;
    private String password;
    private String phone;

    public User(){};
    public User(String ID, String email, String password, String phone) {
        this.ID = ID;
        this.email = email;
        this.password = password;
        this.phone = phone;
    }

    public void print(){
        System.out.println("ID of user: "+ID+
                "\n Email: "+email+
                "\n Phone: "+phone);
    }

    public abstract void printRole();
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
