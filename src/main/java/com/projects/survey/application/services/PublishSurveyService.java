package com.projects.survey.application.services;

import com.projects.survey.domain.model.Survey;
import com.projects.survey.domain.model.SurveyStatus;
import com.projects.survey.domain.repositories.SurveyRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PublishSurveyService {

    private final SurveyRepository surveyRepository;

    public PublishSurveyService(SurveyRepository surveyRepository) {
        this.surveyRepository = surveyRepository;
    }

    @Transactional
    public Survey publishSurvey(Long surveyId) {
        Optional<Survey> optionalSurvey = surveyRepository.findById(surveyId);
        if (optionalSurvey.isEmpty()) {
            throw new IllegalArgumentException("Survey not found");
        }
        Survey survey = optionalSurvey.get();
        if (survey.getStatus() != SurveyStatus.DRAFT) {
            throw new IllegalStateException("Survey is not in draft state and cannot be published");
        }
        survey.setStatus(SurveyStatus.PUBLISHED);
        return surveyRepository.save(survey);
    }
}