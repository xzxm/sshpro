package com.ds.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "answer",schema = "d_blog")
public class Answer {
    private int id;
//    private String qtitle;
    private String anickname;
    private Integer qpranum;
    private Integer anum;
    private Timestamp atime;
    private Integer astatus;
    private String msg;


    private Answer answer;

    @ManyToOne(targetEntity = Question.class)
    @JoinColumn(name = "question_id" ,referencedColumnName = "id")
    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }





    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   /* @Basic
    @Column(name = "qtitle")
    public String getQtitle() {
        return qtitle;
    }

    public void setQtitle(String qtitle) {
        this.qtitle = qtitle;
    }*/

    @Basic
    @Column(name = "anickname")
    public String getAnickname() {
        return anickname;
    }

    public void setAnickname(String anickname) {
        this.anickname = anickname;
    }

    @Basic
    @Column(name = "qpranum")
    public Integer getQpranum() {
        return qpranum;
    }

    public void setQpranum(Integer qpranum) {
        this.qpranum = qpranum;
    }

    @Basic
    @Column(name = "anum")
    public Integer getAnum() {
        return anum;
    }

    public void setAnum(Integer anum) {
        this.anum = anum;
    }

    @Basic
    @Column(name = "atime")
    public Timestamp getAtime() {
        return atime;
    }

    public void setAtime(Timestamp atime) {
        this.atime = atime;
    }

    @Basic
    @Column(name = "astatus")
    public Integer getAstatus() {
        return astatus;
    }

    public void setAstatus(Integer astatus) {
        this.astatus = astatus;
    }

    @Basic
    @Column(name = "msg")
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Answer answer = (Answer) o;

        if (id != answer.id) return false;
//        if (qtitle != null ? !qtitle.equals(answer.qtitle) : answer.qtitle != null) return false;
        if (anickname != null ? !anickname.equals(answer.anickname) : answer.anickname != null) return false;
        if (qpranum != null ? !qpranum.equals(answer.qpranum) : answer.qpranum != null) return false;
        if (anum != null ? !anum.equals(answer.anum) : answer.anum != null) return false;
        if (atime != null ? !atime.equals(answer.atime) : answer.atime != null) return false;
        if (astatus != null ? !astatus.equals(answer.astatus) : answer.astatus != null) return false;
        if (msg != null ? !msg.equals(answer.msg) : answer.msg != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
//        result = 31 * result + (qtitle != null ? qtitle.hashCode() : 0);
        result = 31 * result + (anickname != null ? anickname.hashCode() : 0);
        result = 31 * result + (qpranum != null ? qpranum.hashCode() : 0);
        result = 31 * result + (anum != null ? anum.hashCode() : 0);
        result = 31 * result + (atime != null ? atime.hashCode() : 0);
        result = 31 * result + (astatus != null ? astatus.hashCode() : 0);
        result = 31 * result + (msg != null ? msg.hashCode() : 0);
        return result;
    }
}
