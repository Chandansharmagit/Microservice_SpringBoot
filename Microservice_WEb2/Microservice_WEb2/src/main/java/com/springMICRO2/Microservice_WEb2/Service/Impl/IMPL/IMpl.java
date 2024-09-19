package com.springMICRO2.Microservice_WEb2.Service.Impl.IMPL;

import com.springMICRO2.Microservice_WEb2.Repostitory_Service.Quizquestioons;

import com.springMICRO2.Microservice_WEb2.presentation.Quiz;

import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;

@Service
public class IMpl implements QuizData {
    private final Quizquestioons quizRepo;  // Corrected field name to follow Java conventions
    private final QuestionsClient questionsClient;

    public IMpl(Quizquestioons quizRepo, QuestionsClient questionsClient) {
        this.quizRepo = quizRepo;
        this.questionsClient = questionsClient;
    }


    @Override
    public Quiz add(Quiz quiz) {
        return quizRepo.save(quiz);
    }

    @Override
    public List<Quiz> get() {
        List<Quiz> quizList = quizRepo.findAll();

        // Corrected lambda to return the modified quiz object
        List<Quiz> newQuizList = quizList.stream().map(quiz -> {
            quiz.setQuestionList(questionsClient.getQuestions(quiz.getId()));
            return quiz;  // Important: return the modified quiz object
        }).collect(Collectors.toList());

        return newQuizList;
    }

    @Override
    public Quiz get(Integer id) {
        // Corrected exception throwing syntax and added return statement
        Quiz quiz = quizRepo.findById(id).orElseThrow(() -> new RuntimeException("Quiz not found"));
        quiz.setQuestionList(questionsClient.getQuestions(quiz.getId()));
        return quiz;
    }
}
