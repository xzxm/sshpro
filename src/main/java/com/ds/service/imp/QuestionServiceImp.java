package com.ds.service.imp;

import com.ds.dao.QuestionDao;
import com.ds.domain.Question;
import com.ds.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImp implements QuestionService {
    @Autowired
    private QuestionDao questionDao;
    @Override
    public void saveQuestion(Question question) {
        questionDao.saveQuestion(question);
    }

    @Override
    public List<Question> findQuestion() {
        return questionDao.findQuestion();
    }

    @Override
    public List<Question> findList(Question question, int startIndex, int pageSize) {
        return questionDao.findList(question,startIndex,pageSize);
    }

    @Override
    public void updateQuestion(Question question) {
        questionDao.updateQuestion(question);
    }

    @Override
    public void deleteQuestion(Question question) {
        questionDao.deleteQuestion(question);
    }
}
