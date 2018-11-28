package com.ds.dao.imp;

import com.ds.dao.QuestionDao;
import com.ds.domain.Question;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class QuestionDaoImp implements QuestionDao {
    @Autowired
    private HibernateTemplate hibernateTemplate;
    @Override
    public void saveQuestion(Question question) {
        hibernateTemplate.save(question);
    }

    @Override
    public List<Question> findQuestion() {
        List<Question> list=hibernateTemplate.loadAll(Question.class);
        for (Question q:list){
            System.out.println(q.getQid()+q.getQtitle()+q.getUser().getUsername()+q.getTypes().getTname()+q.getAnswer());
        }
        return list;
    }
    @Override
    public List<Question> findList(Question question, int startIndex, int pageSize) {
        //1、使用byExample查询
        List<Question> list=hibernateTemplate.findByExample(question,startIndex,pageSize);
        //2、使用hibernate自身query查询
        Session session=hibernateTemplate.getSessionFactory().getCurrentSession();
        List parametrList=new ArrayList();
        StringBuilder sb=new StringBuilder("from Question q where 1=1");
        if(question.getUser() != null){
            int id = question.getUser().getId();
            sb.append(" and q.user.id = ? ");
            parametrList.add(id);
        }
        if(question.getTypes() != null){
            int cid = question.getTypes().getId();
            sb.append(" and q.types.id = ? ");
            parametrList.add(cid);
        }
        Query query = session.createQuery(sb.toString());
        for(int i=0;i<parametrList.size();i++){
            query.setParameter(i,parametrList.get(i));
        }
        List<Question> list2 = query.setFirstResult(startIndex).setMaxResults(pageSize).list();

        return list2;

    }

    @Override
    public void updateQuestion(Question question) {
        hibernateTemplate.update(question);
    }

    @Override
    public void deleteQuestion(Question question) {
                hibernateTemplate.delete(question);
    }
}
