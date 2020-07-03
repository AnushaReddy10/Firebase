package com.example.Database.Courses;

import java.util.List;

public class videos {
    private String videoID;
    private List<comments> cm;

    private String url;
    private String description;
    private String videoName;


    public videos(String videoID, List<comments> cm, String url, String description, String videoName) {
        this.videoID = videoID;
        this.cm = cm;
        this.url = url;
        this.description = description;
        this.videoName = videoName;
    }

    public String getVideoID() {
        return videoID;
    }

    public void setVideoID(String videoID) {
        this.videoID = videoID;
    }

    public List<comments> getCm() {
        return cm;
    }

    public void setCm(List<comments> cm) {
        this.cm = cm;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }
}
