package com.projects.survey.application.services;

import com.projects.survey.domain.model.Survey;
import com.projects.survey.domain.repositories.SurveyRepository;
import org.springframework.stereotype.Service;

@Service
public class CreateSurveyService {
    private final SurveyRepository surveyRepository;

    public CreateSurveyService(SurveyRepository surveyRepository) {
        this.surveyRepository = surveyRepository;
    }

    public Survey createSurvey(Survey survey) {
        return surveyRepository.save(survey);
    }
}