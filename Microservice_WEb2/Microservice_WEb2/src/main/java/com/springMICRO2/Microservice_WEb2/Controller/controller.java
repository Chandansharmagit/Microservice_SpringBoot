package com.springMICRO2.Microservice_WEb2.Controller;

import com.springMICRO2.Microservice_WEb2.Service.Impl.IMPL.IMpl;
import com.springMICRO2.Microservice_WEb2.presentation.Questions2;
import com.springMICRO2.Microservice_WEb2.presentation.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class controller {
//    private final IMpl quizService;
//
//    @Autowired
//    public controller(IMpl quizService) {
//        this.quizService = quizService;
//    }

    // Use constructor injection


    @GetMapping("/get")
    public String hello(){
        return "hello world web2";
    }

//    // Creating the quiz
//    @PostMapping("/adding")
//    @ResponseStatus(HttpStatus.CREATED) // Specify the response status for created resource
//    public Quiz creating(@RequestBody Quiz quiz) {
//        return quizService.add(quiz);
//    }
//
//    // Getting all quizzes
//    @GetMapping("/get")
//    public List<Quiz> getAll() {
//        return quizService.get();
//    }
//
//    // Getting quiz by ID
//    @GetMapping("/{id}")
//    public Quiz getById(@PathVariable int id) {
//        return quizService.get(id);
//    }


}
