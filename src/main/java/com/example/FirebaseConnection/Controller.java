package com.example.FirebaseConnection;

import com.example.Database.Person;
import com.example.Database.Student.EnrolledCourses;
import com.example.Database.Student.QuizData;
import com.example.Database.Student.Student;
import com.example.FirebaseConnection.Firebase.FirebaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import javax.annotation.RegEx;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

@RestController
public class Controller {

    @Autowired
    FirebaseService firebaseService;

    @GetMapping("/get")
    public Person getuser(@RequestHeader String name) throws ExecutionException, InterruptedException {
        return firebaseService.getUserDetails(name);

    }

@PostMapping("/post")
    public String saveDetails(@RequestHeader String googleID,@RequestHeader String courseID,@RequestHeader String abc)throws ExecutionException, InterruptedException{
    firebaseService.saveUserDetails(googleID,courseID,abc);
    return "Success";
}

@PostMapping("/post1")
    public Student save(@RequestHeader String googleID, @RequestHeader String portfolioLink, @RequestHeader String courseID, @RequestHeader String completionStatus, @RequestHeader String quizID, @RequestHeader String score ){
        Student student = new Student();
        EnrolledCourses en = new EnrolledCourses();
        QuizData qz = new QuizData();
        student.setPortfolioLink(portfolioLink);
        student.setGoogleID(googleID);
        en.setCompletionStatus(completionStatus);
        en.setCourseID(courseID);
        qz.setQuizID(quizID);
        qz.setScore(score);
        en.setQz(qz);
        student.setEc(en);
        System.out.println("en from post1"+en);
        System.out.println(student);
        return firebaseService.savedetails(student);

}

@PostMapping("/post2")
    public String abc(@RequestHeader String googleID, @RequestHeader String courseID,@RequestHeader String quizID,@RequestHeader String score){
       return firebaseService.enrollQuiz(googleID,courseID,quizID,score);

}
@GetMapping("/get1")
    public Student getstudent(@RequestHeader String googleID) throws ExecutionException, InterruptedException {
        return firebaseService.getdetails(googleID);

}


}

/*
* {
    "googleID" : "001",
    "portfolioLink" : "abc.com",
    "courseID" : "01",
    "completionStatus" : "INCOMPLETE",
    "quizID" : "1.1",
    "score" : "20"

}
* */