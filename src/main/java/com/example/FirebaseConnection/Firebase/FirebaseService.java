package com.example.FirebaseConnection.Firebase;


import com.example.Database.Person;
import com.example.Database.Student.EnrolledCourses;
import com.example.Database.Student.QuizData;
import com.example.Database.Student.Student;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import com.google.protobuf.Api;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;

@Service
public class FirebaseService {
    public void saveUserDetails(String googleID, String courseID,String abc) throws ExecutionException, InterruptedException{
        Firestore dbFirestore = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> collectionApiFuture = dbFirestore.collection("Student").document(googleID).collection("EnrolledCourses").document(courseID).set(abc);
        return;
    }

    public Person getUserDetails(String name) throws ExecutionException, InterruptedException {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        DocumentReference documentReference = dbFirestore.collection("users").document(name);
        ApiFuture<DocumentSnapshot> future = documentReference.get();
        DocumentSnapshot documentSnapshot = future.get();

        Person person = null;

        if (documentSnapshot.exists())
        {
            person = documentSnapshot.toObject(Person.class);
            return person;
        }
        else{
            return null;
        }
    }

    public Student savedetails(Student student){
        Firestore dbFirestore = FirestoreClient.getFirestore();
        try{
            ApiFuture<WriteResult> collectionApiFuture = dbFirestore.collection("Student").document(student.getGoogleID()).set(student);

        }
        catch(Exception e){
            System.out.println("Exception caught "+ e );
        }
        return student;
    }

    public String enrollStudent(String googleID, String portfolioLink){
        Firestore dbFirestore = FirestoreClient.getFirestore();
        Student student = new Student();
        student.setGoogleID(googleID);
        student.setPortfolioLink(portfolioLink);
        ApiFuture<WriteResult> collectionApiFuture = dbFirestore.collection("Student").document(googleID).set(student);
        return "success";
    }

    public String enrollCourse(String googleID, String courseID, String completionStatus){
        Firestore db = FirestoreClient.getFirestore();
        EnrolledCourses ec = new EnrolledCourses();

        ec.setCourseID(courseID);
        ec.setCompletionStatus(completionStatus);
        ApiFuture<WriteResult> apiFuture = db.collection("Student").document(googleID).collection("Enrolled Courses").document(courseID).set(ec);
        return "success";
    }

    public String enrollQuiz(String googleID, String courseID, String quizID, String score){
        Firestore db = FirestoreClient.getFirestore();
        QuizData qz = new QuizData();
        qz.setQuizID(quizID);
        qz.setScore(score);
        ApiFuture<WriteResult> apiFuture = db.collection("Student").document(googleID).collection("Enrolled Courses").document(courseID).collection("Quiz").document(quizID).set(qz);
        return "success";
    }

    public Student getdetails(String googleID) throws ExecutionException, InterruptedException {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        DocumentReference documentReference = dbFirestore.collection("Student").document(googleID);
        ApiFuture<DocumentSnapshot> future = documentReference.get();
        DocumentSnapshot documentSnapshot = future.get();

        Student student = null;

        if(documentSnapshot.exists()){
            student = documentSnapshot.toObject(Student.class);
            return  student;
        }
        else
        {
            return null;
        }
    }



}


