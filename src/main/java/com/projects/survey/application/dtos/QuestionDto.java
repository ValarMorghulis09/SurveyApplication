package com.projects.survey.application.dtos;

import java.util.List;

public record QuestionDto(String text,
                          String type,
                          List<String> options) {
}
