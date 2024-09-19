package com.springMICRO1.Microservice_WEb.presentation;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "questions")
public class Questions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false) // Adding constraint to ensure question cannot be null
    private String question;

    @Column(name = "quiz_id", nullable = false) // Map field to database column and ensure it cannot be null
    private int quizId;
}
