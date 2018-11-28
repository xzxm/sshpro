package com.ds.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "person",schema = "d_blog")
public class Person {
    private int id;
    private String icon;
    private String atype;
    private Integer anum;
    private Integer vip;
    private String astatus;
    private Timestamp register;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "icon")
    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Basic
    @Column(name = "atype")
    public String getAtype() {
        return atype;
    }

    public void setAtype(String atype) {
        this.atype = atype;
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
    @Column(name = "vip")
    public Integer getVip() {
        return vip;
    }

    public void setVip(Integer vip) {
        this.vip = vip;
    }

    @Basic
    @Column(name = "astatus")
    public String getAstatus() {
        return astatus;
    }

    public void setAstatus(String astatus) {
        this.astatus = astatus;
    }

    @Basic
    @Column(name = "register")
    public Timestamp getRegister() {
        return register;
    }

    public void setRegister(Timestamp register) {
        this.register = register;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        if (icon != null ? !icon.equals(person.icon) : person.icon != null) return false;
        if (atype != null ? !atype.equals(person.atype) : person.atype != null) return false;
        if (anum != null ? !anum.equals(person.anum) : person.anum != null) return false;
        if (vip != null ? !vip.equals(person.vip) : person.vip != null) return false;
        if (astatus != null ? !astatus.equals(person.astatus) : person.astatus != null) return false;
        if (register != null ? !register.equals(person.register) : person.register != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (icon != null ? icon.hashCode() : 0);
        result = 31 * result + (atype != null ? atype.hashCode() : 0);
        result = 31 * result + (anum != null ? anum.hashCode() : 0);
        result = 31 * result + (vip != null ? vip.hashCode() : 0);
        result = 31 * result + (astatus != null ? astatus.hashCode() : 0);
        result = 31 * result + (register != null ? register.hashCode() : 0);
        return result;
    }
}
