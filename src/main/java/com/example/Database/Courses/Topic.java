package com.example.Database.Courses;

public class Topic {
    private String topicID;
    private String topicName;
    private String quizID;
    private videos video;
    private String courseCategory;
    private String courseID;
    private String description;
    private String duration;
    private int currentlyEnrolled;
    private float rating;

    public Topic(){
        super();
    }

    public Topic(String topicID, String topicName, String quizID, videos video, String courseCategory, String courseID, String description, String duration, int currentlyEnrolled, float rating) {
        this.topicID = topicID;
        this.topicName = topicName;
        this.quizID = quizID;
        this.video = video;
        this.courseCategory = courseCategory;
        this.courseID = courseID;
        this.description = description;
        this.duration = duration;
        this.currentlyEnrolled = currentlyEnrolled;
        this.rating = rating;
    }

    public String getTopicID() {
        return topicID;
    }

    public void setTopicID(String topicID) {
        this.topicID = topicID;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getQuizID() {
        return quizID;
    }

    public void setQuizID(String quizID) {
        this.quizID = quizID;
    }

    public videos getVideo() {
        return video;
    }

    public void setVideo(videos video) {
        this.video = video;
    }

    public String getCourseCategory() {
        return courseCategory;
    }

    public void setCourseCategory(String courseCategory) {
        this.courseCategory = courseCategory;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getCurrentlyEnrolled() {
        return currentlyEnrolled;
    }

    public void setCurrentlyEnrolled(int currentlyEnrolled) {
        this.currentlyEnrolled = currentlyEnrolled;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
