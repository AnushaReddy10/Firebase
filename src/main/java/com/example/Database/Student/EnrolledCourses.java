package com.example.Database.Student;

import java.util.ArrayList;
import java.util.List;

public class EnrolledCourses {
    private String completionStatus;
    private  String courseID;
    protected ArrayList<QuizData> qz = new ArrayList<QuizData>();


    public EnrolledCourses(){
        super();
    }

    public EnrolledCourses(String completionStatus, String courseID, ArrayList<QuizData> qz) {
        this.completionStatus = completionStatus;
        this.courseID = courseID;
        this.qz = qz;
    }

    @Override
    public String toString() {
        return completionStatus+ " "+courseID+" "+qz;
    }

    public String getCompletionStatus() {
        return completionStatus;
    }

    public void setCompletionStatus(String completionStatus) {
        this.completionStatus = completionStatus;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public ArrayList<QuizData> getQz() {
        return qz;
    }


    public void setQz(QuizData qz) {

        //System.out.println("qz from ec"+ qz);

        try {
            this.qz.add(qz) ;
        }
        catch (Exception e){
            System.out.println("QZ error"+ e);
        }

        //System.out.println("qz from ec after change"+ this.qz);
    }



}