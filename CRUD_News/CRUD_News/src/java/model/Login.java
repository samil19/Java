/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Samil
 */
public class Login {
    private int UserID;
    private String LoginName;
    private String Password;
    private String FirstName;
    private String LastName;

    public Login(int UserID, String LoginName, String Password, String FirstName, String LastName) {
        this.UserID = UserID;
        this.LoginName = LoginName;
        this.Password = Password;
        this.FirstName = FirstName;
        this.LastName = LastName;
    }

    public void setUserID(int UserID) {
        this.UserID = UserID;
    }

    public void setLoginName(String LoginName) {
        this.LoginName = LoginName;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    
    
    public int getUserID() {
        return UserID;
    }

    public String getLoginName() {
        return LoginName;
    }

    public String getPassword() {
        return Password;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }
    
    
    
    
}
