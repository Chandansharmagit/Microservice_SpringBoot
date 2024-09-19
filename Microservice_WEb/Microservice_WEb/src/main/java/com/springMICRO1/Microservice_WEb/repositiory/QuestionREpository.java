package com.springMICRO1.Microservice_WEb.repositiory;

import com.springMICRO1.Microservice_WEb.presentation.Questions;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionREpository extends JpaRepository<Questions , Integer> {
    List<Questions> findByQuizId(int quizId);
}
