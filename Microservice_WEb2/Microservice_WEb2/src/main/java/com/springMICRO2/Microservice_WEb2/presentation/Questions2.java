package com.springMICRO2.Microservice_WEb2.presentation;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Questions2 {
    private int id;

    @Column(nullable = false) // Adding constraint to ensure question cannot be null
    private String question;

    @Column(name = "quiz_id", nullable = false) // Map field to database column and ensure it cannot be null
    private int quizId;
}
