package com.ds.service;

import com.ds.domain.Question;

import java.util.List;

public interface QuestionService {
    public List<Question> findQuestion();
    public void saveQuestion(Question question);
    public List<Question> findList(Question question, int startIndex, int pageSize);
    public void updateQuestion(Question question);
    public void deleteQuestion(Question question);
}