package com.example.Database.Category;

public class category {
    private String courseID;
    private String categoryID;
    private String carName;

    public category(){
        super();
    }

    public category(String courseID, String categoryID, String carName) {
        this.courseID = courseID;
        this.categoryID = categoryID;
        this.carName = carName;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(String categoryID) {
        this.categoryID = categoryID;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }
}
