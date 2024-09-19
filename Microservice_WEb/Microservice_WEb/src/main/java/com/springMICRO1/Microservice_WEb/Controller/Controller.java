package com.springMICRO1.Microservice_WEb.Controller;

import com.springMICRO1.Microservice_WEb.presentation.Questions;
import com.springMICRO1.Microservice_WEb.service.QuestionsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/questions")  // Optional: Add a base path to all endpoints
public class Controller {

    private final QuestionsService questionsService;

    public Controller(QuestionsService questionsService) {
        this.questionsService = questionsService;
    }

    @GetMapping("/naming")
    public String index() {
        return "hello world web1";
    }

    @PostMapping("/add")
    public Questions addQuestion(@RequestBody Questions questionsJa) {
        return questionsService.add(questionsJa);
    }

    @GetMapping("/all")
    public List<Questions> getAllQuestions() {
        return questionsService.gettingall();
    }

    @GetMapping("/{id}")
    public Questions getQuestionById(@PathVariable int id) {
        return questionsService.get(id);
    }

    @GetMapping("/quiz/{id}")
    public List<Questions> getQuestionsByQuizId(@PathVariable int id) {
        return questionsService.getbyquizid(id);
    }
}
