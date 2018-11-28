package com.ds.dao;

import com.ds.domain.Question;

import java.util.List;

public interface QuestionDao {
    public List<Question> findQuestion();
    public void saveQuestion(Question question);
    public List<Question> findList(Question question, int startIndex, int pageSize);
    public void updateQuestion(Question question);
    public void deleteQuestion(Question question);
}
