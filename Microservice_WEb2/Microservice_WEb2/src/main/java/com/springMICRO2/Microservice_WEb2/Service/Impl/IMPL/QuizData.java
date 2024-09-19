package com.springMICRO2.Microservice_WEb2.Service.Impl.IMPL;

import com.springMICRO2.Microservice_WEb2.presentation.Quiz;

import java.util.List;

public interface QuizData {
    Quiz add(Quiz quiz);
    List<Quiz> get();
    Quiz get(Integer id);
}
