package com.projects.survey.application.dtos;

import java.util.List;

public record SurveyDto(String title, String description, List<QuestionDto> questions) {
}
