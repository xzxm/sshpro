package com.ds.domain;

import javax.persistence.*;

@Entity
@Table(name = "types",schema = "d_blog")
public class Types {
    private int id;
    private String tname;

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
    @Column(name = "tname")
    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Types types = (Types) o;

        if (id != types.id) return false;
        if (tname != null ? !tname.equals(types.tname) : types.tname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (tname != null ? tname.hashCode() : 0);
        return result;
    }
}
