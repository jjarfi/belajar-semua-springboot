package com.github.jjarfi.bean;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long  serialVersionUUID = - 339516038496531943L;

    private String sno;
    private String name;
    private String jk;

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }
}
