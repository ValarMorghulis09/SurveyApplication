package com.projects.survey.application.services;

import com.projects.survey.domain.model.Survey;
import com.projects.survey.domain.repositories.SurveyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SurveyService {
    private final SurveyRepository surveyRepository;

    public SurveyService(SurveyRepository surveyRepository) {
        this.surveyRepository = surveyRepository;
    }

    public Survey createSurvey(Survey survey) {
        return surveyRepository.save(survey);
    }
    public List<Survey> getAllSurveys(){
        return surveyRepository.findAll();
    }
}