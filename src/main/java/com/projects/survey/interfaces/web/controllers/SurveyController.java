package com.projects.survey.interfaces.web.controllers;

import com.projects.survey.application.dtos.SurveyDto;
import com.projects.survey.application.services.CreateSurveyService;
import com.projects.survey.domain.model.Survey;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/surveys")
public class SurveyController {

    private final CreateSurveyService createSurveyService;

    public SurveyController(CreateSurveyService createSurveyService) {
        this.createSurveyService = createSurveyService;
    }

    @PostMapping
    public Survey createSurvey(@RequestBody SurveyDto surveyDto) {
        Survey survey = new Survey();
        survey.setTitle(surveyDto.title());
        survey.setDescription(surveyDto.description());
        // Map questions and options from DTO to Survey entity
        return createSurveyService.createSurvey(survey);
    }
}
