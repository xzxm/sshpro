package com.ds.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;

@Entity
@Table(name = "question",schema = "d_blog")
public class Question {
    private int qid;
    private String qlabel;
    private Integer qanswernum;
    private Timestamp issuetime;
    private Integer auditstatus;
    private Integer qstatus;
    private String qtitle;
    //多对一问题所属的分类
    private Types types;
    //多对一 问题发布的用户
    private User user;
    //一对多 一个问题对应多个答复
    private Set<Answer> answer;

    @ManyToOne(targetEntity = Types.class )
    @JoinColumn(name = "types_id",referencedColumnName = "id")
    public Types getTypes() {
        return types;
    }

    public void setTypes(Types types) {
        this.types = types;
    }

    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name = "user_id",referencedColumnName = "id")
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @OneToMany(cascade = CascadeType.ALL,targetEntity = Answer.class)
    @JoinColumn(name = "question_qid",referencedColumnName = "id")
    public Set<Answer> getAnswer() {
        return answer;
    }

    public void setAnswer(Set<Answer> answer) {
        this.answer = answer;
    }

    @Id
    @Column(name = "qid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getQid() {
        return qid;
    }

    public void setQid(int qid) {
        this.qid = qid;
    }

    @Basic
    @Column(name = "qlabel")
    public String getQlabel() {
        return qlabel;
    }

    public void setQlabel(String qlabel) {
        this.qlabel = qlabel;
    }

    @Basic
    @Column(name = "qanswernum")
    public Integer getQanswernum() {
        return qanswernum;
    }

    public void setQanswernum(Integer qanswernum) {
        this.qanswernum = qanswernum;
    }

    @Basic
    @Column(name = "issuetime")
    public Timestamp getIssuetime() {
        return issuetime;
    }

    public void setIssuetime(Timestamp issuetime) {
        this.issuetime = issuetime;
    }

    @Basic
    @Column(name = "auditstatus")
    public Integer getAuditstatus() {
        return auditstatus;
    }

    public void setAuditstatus(Integer auditstatus) {
        this.auditstatus = auditstatus;
    }

    @Basic
    @Column(name = "qstatus")
    public Integer getQstatus() {
        return qstatus;
    }

    public void setQstatus(Integer qstatus) {
        this.qstatus = qstatus;
    }

    @Basic
    @Column(name = "qtitle")
    public String getQtitle() {
        return qtitle;
    }

    public void setQtitle(String qtitle) {
        this.qtitle = qtitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Question question = (Question) o;

        if (qid != question.qid) return false;
        if (qlabel != null ? !qlabel.equals(question.qlabel) : question.qlabel != null) return false;
        if (qanswernum != null ? !qanswernum.equals(question.qanswernum) : question.qanswernum != null) return false;
        if (issuetime != null ? !issuetime.equals(question.issuetime) : question.issuetime != null) return false;
        if (auditstatus != null ? !auditstatus.equals(question.auditstatus) : question.auditstatus != null)
            return false;
        if (qstatus != null ? !qstatus.equals(question.qstatus) : question.qstatus != null) return false;
        if (qtitle != null ? !qtitle.equals(question.qtitle) : question.qtitle != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = qid;
        result = 31 * result + (qlabel != null ? qlabel.hashCode() : 0);
        result = 31 * result + (qanswernum != null ? qanswernum.hashCode() : 0);
        result = 31 * result + (issuetime != null ? issuetime.hashCode() : 0);
        result = 31 * result + (auditstatus != null ? auditstatus.hashCode() : 0);
        result = 31 * result + (qstatus != null ? qstatus.hashCode() : 0);
        result = 31 * result + (qtitle != null ? qtitle.hashCode() : 0);
        return result;
    }
}
