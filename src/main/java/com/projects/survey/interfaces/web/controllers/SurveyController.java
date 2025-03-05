package com.projects.survey.interfaces.web.controllers;

import com.projects.survey.application.dtos.SurveyDto;

import com.projects.survey.application.services.SurveyService;
import com.projects.survey.domain.model.Survey;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/surveys")
public class SurveyController {

    private final SurveyService surveyService;

    public SurveyController(SurveyService surveyService) {
        this.surveyService = surveyService;
    }
    @GetMapping
    public List<Survey> getSurvey() {
        return surveyService.getAllSurveys();
    }

    @PostMapping
    public Survey createSurvey(@RequestBody SurveyDto surveyDto) {
        Survey survey = new Survey();
        survey.setTitle(surveyDto.title());
        survey.setDescription(surveyDto.description());
        return surveyService.createSurvey(survey);
    }
}
