package com.union.model;

import lombok.ToString;

@ToString()
public class Info {
    private Integer id;

    private String class1;

    private String class2;

    private String class3;

    private String index;

    private String fldnm;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClass1() {
        return class1;
    }

    public void setClass1(String class1) {
        this.class1 = class1 == null ? null : class1.trim();
    }

    public String getClass2() {
        return class2;
    }

    public void setClass2(String class2) {
        this.class2 = class2 == null ? null : class2.trim();
    }

    public String getClass3() {
        return class3;
    }

    public void setClass3(String class3) {
        this.class3 = class3 == null ? null : class3.trim();
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index == null ? null : index.trim();
    }

    public String getFldnm() {
        return fldnm;
    }

    public void setFldnm(String fldnm) {
        this.fldnm = fldnm == null ? null : fldnm.trim();
    }
}