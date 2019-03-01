package com.union.model;

import java.util.Date;

public class NewsDto {
    private Integer id;

    private String area;

    private String class;

    private String title;

    private String picid;

    private Integer glancn;

    private Integer like;

    private String grade;

    private String wrtid;

    private String adtid;

    private Date pubtim;

    private String mdfid;

    private Date mdftm;

    private String delflg;

    private String contnt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getClass() {
        return class;
    }

    public void setClass(String class) {
        this.class = class == null ? null : class.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getPicid() {
        return picid;
    }

    public void setPicid(String picid) {
        this.picid = picid == null ? null : picid.trim();
    }

    public Integer getGlancn() {
        return glancn;
    }

    public void setGlancn(Integer glancn) {
        this.glancn = glancn;
    }

    public Integer getLike() {
        return like;
    }

    public void setLike(Integer like) {
        this.like = like;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public String getWrtid() {
        return wrtid;
    }

    public void setWrtid(String wrtid) {
        this.wrtid = wrtid == null ? null : wrtid.trim();
    }

    public String getAdtid() {
        return adtid;
    }

    public void setAdtid(String adtid) {
        this.adtid = adtid == null ? null : adtid.trim();
    }

    public Date getPubtim() {
        return pubtim;
    }

    public void setPubtim(Date pubtim) {
        this.pubtim = pubtim;
    }

    public String getMdfid() {
        return mdfid;
    }

    public void setMdfid(String mdfid) {
        this.mdfid = mdfid == null ? null : mdfid.trim();
    }

    public Date getMdftm() {
        return mdftm;
    }

    public void setMdftm(Date mdftm) {
        this.mdftm = mdftm;
    }

    public String getDelflg() {
        return delflg;
    }

    public void setDelflg(String delflg) {
        this.delflg = delflg == null ? null : delflg.trim();
    }

    public String getContnt() {
        return contnt;
    }

    public void setContnt(String contnt) {
        this.contnt = contnt == null ? null : contnt.trim();
    }
}