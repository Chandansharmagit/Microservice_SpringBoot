package com.springMICRO1.Microservice_WEb.service;

import com.springMICRO1.Microservice_WEb.presentation.Questions;

import java.util.List;

public interface QuestionsData {
    Questions add(Questions questionsJa);

    List<Questions> gettingall();

    Questions get(int id);

    List<Questions> getbyquizid(int id);
}
