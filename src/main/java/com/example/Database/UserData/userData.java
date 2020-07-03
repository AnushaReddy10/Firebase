package com.example.Database.UserData;

public class userData {
    private String email;
    private String googleID;
    boolean loggedIN;
    private String name;
    private String photo;

    public userData(){
        super();
    }

    public userData(String email, String googleID, String name, String photo) {
        this.email = email;
        this.googleID = googleID;
        this.name = name;
        this.photo = photo;
        this.loggedIN=false;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGoogleID() {
        return googleID;
    }

    public void setGoogleID(String googleID) {
        this.googleID = googleID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
