package com.projects.survey.domain.model;

import jakarta.persistence.*;

@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String text;

    @ManyToOne
    @JoinColumn(name = "response_id")
    private Response response;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;


}