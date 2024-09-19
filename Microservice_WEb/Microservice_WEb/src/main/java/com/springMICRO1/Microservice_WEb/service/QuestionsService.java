package com.springMICRO1.Microservice_WEb.service;

import com.springMICRO1.Microservice_WEb.presentation.Questions;
import com.springMICRO1.Microservice_WEb.repositiory.QuestionREpository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionsService implements QuestionsData {
    private final QuestionREpository questionsRepo;

    public QuestionsService(QuestionREpository questionsRepo) {
        this.questionsRepo = questionsRepo;
    }


    @Override
    public Questions add(Questions questionsJa) {
        return questionsRepo.save(questionsJa);
    }

    @Override
    public List<Questions> gettingall() {
        return questionsRepo.findAll();
    }

    @Override
    public Questions get(int id) {
        return questionsRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Question not found for ID: " + id));
    }

    @Override
    public List<Questions> getbyquizid(int id) {
        return questionsRepo.findByQuizId(id); // Corrected method name
    }
}
