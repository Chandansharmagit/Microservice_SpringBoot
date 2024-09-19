package com.springMICRO2.Microservice_WEb2.Repostitory_Service;

import com.springMICRO2.Microservice_WEb2.presentation.Questions2;
import com.springMICRO2.Microservice_WEb2.presentation.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Quizquestioons extends JpaRepository<Quiz, Integer> {
}
