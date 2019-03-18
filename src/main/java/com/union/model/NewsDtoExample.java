package com.union.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NewsDtoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewsDtoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("AREA is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("AREA is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("AREA =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("AREA <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("AREA >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("AREA >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("AREA <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("AREA <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("AREA like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("AREA not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("AREA in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("AREA not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("AREA between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("AREA not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andClassIsNull() {
            addCriterion("CLASS is null");
            return (Criteria) this;
        }

        public Criteria andClassIsNotNull() {
            addCriterion("CLASS is not null");
            return (Criteria) this;
        }

        public Criteria andClassEqualTo(String value) {
            addCriterion("CLASS =", value, "class");
            return (Criteria) this;
        }

        public Criteria andClassNotEqualTo(String value) {
            addCriterion("CLASS <>", value, "class");
            return (Criteria) this;
        }

        public Criteria andClassGreaterThan(String value) {
            addCriterion("CLASS >", value, "class");
            return (Criteria) this;
        }

        public Criteria andClassGreaterThanOrEqualTo(String value) {
            addCriterion("CLASS >=", value, "class");
            return (Criteria) this;
        }

        public Criteria andClassLessThan(String value) {
            addCriterion("CLASS <", value, "class");
            return (Criteria) this;
        }

        public Criteria andClassLessThanOrEqualTo(String value) {
            addCriterion("CLASS <=", value, "class");
            return (Criteria) this;
        }

        public Criteria andClassLike(String value) {
            addCriterion("CLASS like", value, "class");
            return (Criteria) this;
        }

        public Criteria andClassNotLike(String value) {
            addCriterion("CLASS not like", value, "class");
            return (Criteria) this;
        }

        public Criteria andClassIn(List<String> values) {
            addCriterion("CLASS in", values, "class");
            return (Criteria) this;
        }

        public Criteria andClassNotIn(List<String> values) {
            addCriterion("CLASS not in", values, "class");
            return (Criteria) this;
        }

        public Criteria andClassBetween(String value1, String value2) {
            addCriterion("CLASS between", value1, value2, "class");
            return (Criteria) this;
        }

        public Criteria andClassNotBetween(String value1, String value2) {
            addCriterion("CLASS not between", value1, value2, "class");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("TITLE =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("TITLE <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("TITLE >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("TITLE >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("TITLE <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("TITLE <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("TITLE like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("TITLE not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("TITLE in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("TITLE not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("TITLE between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("TITLE not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andPicidIsNull() {
            addCriterion("PICID is null");
            return (Criteria) this;
        }

        public Criteria andPicidIsNotNull() {
            addCriterion("PICID is not null");
            return (Criteria) this;
        }

        public Criteria andPicidEqualTo(String value) {
            addCriterion("PICID =", value, "picid");
            return (Criteria) this;
        }

        public Criteria andPicidNotEqualTo(String value) {
            addCriterion("PICID <>", value, "picid");
            return (Criteria) this;
        }

        public Criteria andPicidGreaterThan(String value) {
            addCriterion("PICID >", value, "picid");
            return (Criteria) this;
        }

        public Criteria andPicidGreaterThanOrEqualTo(String value) {
            addCriterion("PICID >=", value, "picid");
            return (Criteria) this;
        }

        public Criteria andPicidLessThan(String value) {
            addCriterion("PICID <", value, "picid");
            return (Criteria) this;
        }

        public Criteria andPicidLessThanOrEqualTo(String value) {
            addCriterion("PICID <=", value, "picid");
            return (Criteria) this;
        }

        public Criteria andPicidLike(String value) {
            addCriterion("PICID like", value, "picid");
            return (Criteria) this;
        }

        public Criteria andPicidNotLike(String value) {
            addCriterion("PICID not like", value, "picid");
            return (Criteria) this;
        }

        public Criteria andPicidIn(List<String> values) {
            addCriterion("PICID in", values, "picid");
            return (Criteria) this;
        }

        public Criteria andPicidNotIn(List<String> values) {
            addCriterion("PICID not in", values, "picid");
            return (Criteria) this;
        }

        public Criteria andPicidBetween(String value1, String value2) {
            addCriterion("PICID between", value1, value2, "picid");
            return (Criteria) this;
        }

        public Criteria andPicidNotBetween(String value1, String value2) {
            addCriterion("PICID not between", value1, value2, "picid");
            return (Criteria) this;
        }

        public Criteria andGlancnIsNull() {
            addCriterion("GLANCN is null");
            return (Criteria) this;
        }

        public Criteria andGlancnIsNotNull() {
            addCriterion("GLANCN is not null");
            return (Criteria) this;
        }

        public Criteria andGlancnEqualTo(Integer value) {
            addCriterion("GLANCN =", value, "glancn");
            return (Criteria) this;
        }

        public Criteria andGlancnNotEqualTo(Integer value) {
            addCriterion("GLANCN <>", value, "glancn");
            return (Criteria) this;
        }

        public Criteria andGlancnGreaterThan(Integer value) {
            addCriterion("GLANCN >", value, "glancn");
            return (Criteria) this;
        }

        public Criteria andGlancnGreaterThanOrEqualTo(Integer value) {
            addCriterion("GLANCN >=", value, "glancn");
            return (Criteria) this;
        }

        public Criteria andGlancnLessThan(Integer value) {
            addCriterion("GLANCN <", value, "glancn");
            return (Criteria) this;
        }

        public Criteria andGlancnLessThanOrEqualTo(Integer value) {
            addCriterion("GLANCN <=", value, "glancn");
            return (Criteria) this;
        }

        public Criteria andGlancnIn(List<Integer> values) {
            addCriterion("GLANCN in", values, "glancn");
            return (Criteria) this;
        }

        public Criteria andGlancnNotIn(List<Integer> values) {
            addCriterion("GLANCN not in", values, "glancn");
            return (Criteria) this;
        }

        public Criteria andGlancnBetween(Integer value1, Integer value2) {
            addCriterion("GLANCN between", value1, value2, "glancn");
            return (Criteria) this;
        }

        public Criteria andGlancnNotBetween(Integer value1, Integer value2) {
            addCriterion("GLANCN not between", value1, value2, "glancn");
            return (Criteria) this;
        }

        public Criteria andLikeIsNull() {
            addCriterion("LIKE is null");
            return (Criteria) this;
        }

        public Criteria andLikeIsNotNull() {
            addCriterion("LIKE is not null");
            return (Criteria) this;
        }

        public Criteria andLikeEqualTo(Integer value) {
            addCriterion("LIKE =", value, "like");
            return (Criteria) this;
        }

        public Criteria andLikeNotEqualTo(Integer value) {
            addCriterion("LIKE <>", value, "like");
            return (Criteria) this;
        }

        public Criteria andLikeGreaterThan(Integer value) {
            addCriterion("LIKE >", value, "like");
            return (Criteria) this;
        }

        public Criteria andLikeGreaterThanOrEqualTo(Integer value) {
            addCriterion("LIKE >=", value, "like");
            return (Criteria) this;
        }

        public Criteria andLikeLessThan(Integer value) {
            addCriterion("LIKE <", value, "like");
            return (Criteria) this;
        }

        public Criteria andLikeLessThanOrEqualTo(Integer value) {
            addCriterion("LIKE <=", value, "like");
            return (Criteria) this;
        }

        public Criteria andLikeIn(List<Integer> values) {
            addCriterion("LIKE in", values, "like");
            return (Criteria) this;
        }

        public Criteria andLikeNotIn(List<Integer> values) {
            addCriterion("LIKE not in", values, "like");
            return (Criteria) this;
        }

        public Criteria andLikeBetween(Integer value1, Integer value2) {
            addCriterion("LIKE between", value1, value2, "like");
            return (Criteria) this;
        }

        public Criteria andLikeNotBetween(Integer value1, Integer value2) {
            addCriterion("LIKE not between", value1, value2, "like");
            return (Criteria) this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("GRADE is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("GRADE is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(String value) {
            addCriterion("GRADE =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(String value) {
            addCriterion("GRADE <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(String value) {
            addCriterion("GRADE >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(String value) {
            addCriterion("GRADE >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(String value) {
            addCriterion("GRADE <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(String value) {
            addCriterion("GRADE <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLike(String value) {
            addCriterion("GRADE like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotLike(String value) {
            addCriterion("GRADE not like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<String> values) {
            addCriterion("GRADE in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<String> values) {
            addCriterion("GRADE not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(String value1, String value2) {
            addCriterion("GRADE between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(String value1, String value2) {
            addCriterion("GRADE not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andWrtidIsNull() {
            addCriterion("WRTID is null");
            return (Criteria) this;
        }

        public Criteria andWrtidIsNotNull() {
            addCriterion("WRTID is not null");
            return (Criteria) this;
        }

        public Criteria andWrtidEqualTo(String value) {
            addCriterion("WRTID =", value, "wrtid");
            return (Criteria) this;
        }

        public Criteria andWrtidNotEqualTo(String value) {
            addCriterion("WRTID <>", value, "wrtid");
            return (Criteria) this;
        }

        public Criteria andWrtidGreaterThan(String value) {
            addCriterion("WRTID >", value, "wrtid");
            return (Criteria) this;
        }

        public Criteria andWrtidGreaterThanOrEqualTo(String value) {
            addCriterion("WRTID >=", value, "wrtid");
            return (Criteria) this;
        }

        public Criteria andWrtidLessThan(String value) {
            addCriterion("WRTID <", value, "wrtid");
            return (Criteria) this;
        }

        public Criteria andWrtidLessThanOrEqualTo(String value) {
            addCriterion("WRTID <=", value, "wrtid");
            return (Criteria) this;
        }

        public Criteria andWrtidLike(String value) {
            addCriterion("WRTID like", value, "wrtid");
            return (Criteria) this;
        }

        public Criteria andWrtidNotLike(String value) {
            addCriterion("WRTID not like", value, "wrtid");
            return (Criteria) this;
        }

        public Criteria andWrtidIn(List<String> values) {
            addCriterion("WRTID in", values, "wrtid");
            return (Criteria) this;
        }

        public Criteria andWrtidNotIn(List<String> values) {
            addCriterion("WRTID not in", values, "wrtid");
            return (Criteria) this;
        }

        public Criteria andWrtidBetween(String value1, String value2) {
            addCriterion("WRTID between", value1, value2, "wrtid");
            return (Criteria) this;
        }

        public Criteria andWrtidNotBetween(String value1, String value2) {
            addCriterion("WRTID not between", value1, value2, "wrtid");
            return (Criteria) this;
        }

        public Criteria andAdtidIsNull() {
            addCriterion("ADTID is null");
            return (Criteria) this;
        }

        public Criteria andAdtidIsNotNull() {
            addCriterion("ADTID is not null");
            return (Criteria) this;
        }

        public Criteria andAdtidEqualTo(String value) {
            addCriterion("ADTID =", value, "adtid");
            return (Criteria) this;
        }

        public Criteria andAdtidNotEqualTo(String value) {
            addCriterion("ADTID <>", value, "adtid");
            return (Criteria) this;
        }

        public Criteria andAdtidGreaterThan(String value) {
            addCriterion("ADTID >", value, "adtid");
            return (Criteria) this;
        }

        public Criteria andAdtidGreaterThanOrEqualTo(String value) {
            addCriterion("ADTID >=", value, "adtid");
            return (Criteria) this;
        }

        public Criteria andAdtidLessThan(String value) {
            addCriterion("ADTID <", value, "adtid");
            return (Criteria) this;
        }

        public Criteria andAdtidLessThanOrEqualTo(String value) {
            addCriterion("ADTID <=", value, "adtid");
            return (Criteria) this;
        }

        public Criteria andAdtidLike(String value) {
            addCriterion("ADTID like", value, "adtid");
            return (Criteria) this;
        }

        public Criteria andAdtidNotLike(String value) {
            addCriterion("ADTID not like", value, "adtid");
            return (Criteria) this;
        }

        public Criteria andAdtidIn(List<String> values) {
            addCriterion("ADTID in", values, "adtid");
            return (Criteria) this;
        }

        public Criteria andAdtidNotIn(List<String> values) {
            addCriterion("ADTID not in", values, "adtid");
            return (Criteria) this;
        }

        public Criteria andAdtidBetween(String value1, String value2) {
            addCriterion("ADTID between", value1, value2, "adtid");
            return (Criteria) this;
        }

        public Criteria andAdtidNotBetween(String value1, String value2) {
            addCriterion("ADTID not between", value1, value2, "adtid");
            return (Criteria) this;
        }

        public Criteria andPubtimIsNull() {
            addCriterion("PUBTIM is null");
            return (Criteria) this;
        }

        public Criteria andPubtimIsNotNull() {
            addCriterion("PUBTIM is not null");
            return (Criteria) this;
        }

        public Criteria andPubtimEqualTo(Date value) {
            addCriterion("PUBTIM =", value, "pubtim");
            return (Criteria) this;
        }

        public Criteria andPubtimNotEqualTo(Date value) {
            addCriterion("PUBTIM <>", value, "pubtim");
            return (Criteria) this;
        }

        public Criteria andPubtimGreaterThan(Date value) {
            addCriterion("PUBTIM >", value, "pubtim");
            return (Criteria) this;
        }

        public Criteria andPubtimGreaterThanOrEqualTo(Date value) {
            addCriterion("PUBTIM >=", value, "pubtim");
            return (Criteria) this;
        }

        public Criteria andPubtimLessThan(Date value) {
            addCriterion("PUBTIM <", value, "pubtim");
            return (Criteria) this;
        }

        public Criteria andPubtimLessThanOrEqualTo(Date value) {
            addCriterion("PUBTIM <=", value, "pubtim");
            return (Criteria) this;
        }

        public Criteria andPubtimIn(List<Date> values) {
            addCriterion("PUBTIM in", values, "pubtim");
            return (Criteria) this;
        }

        public Criteria andPubtimNotIn(List<Date> values) {
            addCriterion("PUBTIM not in", values, "pubtim");
            return (Criteria) this;
        }

        public Criteria andPubtimBetween(Date value1, Date value2) {
            addCriterion("PUBTIM between", value1, value2, "pubtim");
            return (Criteria) this;
        }

        public Criteria andPubtimNotBetween(Date value1, Date value2) {
            addCriterion("PUBTIM not between", value1, value2, "pubtim");
            return (Criteria) this;
        }

        public Criteria andMdfidIsNull() {
            addCriterion("MDFID is null");
            return (Criteria) this;
        }

        public Criteria andMdfidIsNotNull() {
            addCriterion("MDFID is not null");
            return (Criteria) this;
        }

        public Criteria andMdfidEqualTo(String value) {
            addCriterion("MDFID =", value, "mdfid");
            return (Criteria) this;
        }

        public Criteria andMdfidNotEqualTo(String value) {
            addCriterion("MDFID <>", value, "mdfid");
            return (Criteria) this;
        }

        public Criteria andMdfidGreaterThan(String value) {
            addCriterion("MDFID >", value, "mdfid");
            return (Criteria) this;
        }

        public Criteria andMdfidGreaterThanOrEqualTo(String value) {
            addCriterion("MDFID >=", value, "mdfid");
            return (Criteria) this;
        }

        public Criteria andMdfidLessThan(String value) {
            addCriterion("MDFID <", value, "mdfid");
            return (Criteria) this;
        }

        public Criteria andMdfidLessThanOrEqualTo(String value) {
            addCriterion("MDFID <=", value, "mdfid");
            return (Criteria) this;
        }

        public Criteria andMdfidLike(String value) {
            addCriterion("MDFID like", value, "mdfid");
            return (Criteria) this;
        }

        public Criteria andMdfidNotLike(String value) {
            addCriterion("MDFID not like", value, "mdfid");
            return (Criteria) this;
        }

        public Criteria andMdfidIn(List<String> values) {
            addCriterion("MDFID in", values, "mdfid");
            return (Criteria) this;
        }

        public Criteria andMdfidNotIn(List<String> values) {
            addCriterion("MDFID not in", values, "mdfid");
            return (Criteria) this;
        }

        public Criteria andMdfidBetween(String value1, String value2) {
            addCriterion("MDFID between", value1, value2, "mdfid");
            return (Criteria) this;
        }

        public Criteria andMdfidNotBetween(String value1, String value2) {
            addCriterion("MDFID not between", value1, value2, "mdfid");
            return (Criteria) this;
        }

        public Criteria andMdftmIsNull() {
            addCriterion("MDFTM is null");
            return (Criteria) this;
        }

        public Criteria andMdftmIsNotNull() {
            addCriterion("MDFTM is not null");
            return (Criteria) this;
        }

        public Criteria andMdftmEqualTo(Date value) {
            addCriterion("MDFTM =", value, "mdftm");
            return (Criteria) this;
        }

        public Criteria andMdftmNotEqualTo(Date value) {
            addCriterion("MDFTM <>", value, "mdftm");
            return (Criteria) this;
        }

        public Criteria andMdftmGreaterThan(Date value) {
            addCriterion("MDFTM >", value, "mdftm");
            return (Criteria) this;
        }

        public Criteria andMdftmGreaterThanOrEqualTo(Date value) {
            addCriterion("MDFTM >=", value, "mdftm");
            return (Criteria) this;
        }

        public Criteria andMdftmLessThan(Date value) {
            addCriterion("MDFTM <", value, "mdftm");
            return (Criteria) this;
        }

        public Criteria andMdftmLessThanOrEqualTo(Date value) {
            addCriterion("MDFTM <=", value, "mdftm");
            return (Criteria) this;
        }

        public Criteria andMdftmIn(List<Date> values) {
            addCriterion("MDFTM in", values, "mdftm");
            return (Criteria) this;
        }

        public Criteria andMdftmNotIn(List<Date> values) {
            addCriterion("MDFTM not in", values, "mdftm");
            return (Criteria) this;
        }

        public Criteria andMdftmBetween(Date value1, Date value2) {
            addCriterion("MDFTM between", value1, value2, "mdftm");
            return (Criteria) this;
        }

        public Criteria andMdftmNotBetween(Date value1, Date value2) {
            addCriterion("MDFTM not between", value1, value2, "mdftm");
            return (Criteria) this;
        }

        public Criteria andDelflgIsNull() {
            addCriterion("DELFLG is null");
            return (Criteria) this;
        }

        public Criteria andDelflgIsNotNull() {
            addCriterion("DELFLG is not null");
            return (Criteria) this;
        }

        public Criteria andDelflgEqualTo(String value) {
            addCriterion("DELFLG =", value, "delflg");
            return (Criteria) this;
        }

        public Criteria andDelflgNotEqualTo(String value) {
            addCriterion("DELFLG <>", value, "delflg");
            return (Criteria) this;
        }

        public Criteria andDelflgGreaterThan(String value) {
            addCriterion("DELFLG >", value, "delflg");
            return (Criteria) this;
        }

        public Criteria andDelflgGreaterThanOrEqualTo(String value) {
            addCriterion("DELFLG >=", value, "delflg");
            return (Criteria) this;
        }

        public Criteria andDelflgLessThan(String value) {
            addCriterion("DELFLG <", value, "delflg");
            return (Criteria) this;
        }

        public Criteria andDelflgLessThanOrEqualTo(String value) {
            addCriterion("DELFLG <=", value, "delflg");
            return (Criteria) this;
        }

        public Criteria andDelflgLike(String value) {
            addCriterion("DELFLG like", value, "delflg");
            return (Criteria) this;
        }

        public Criteria andDelflgNotLike(String value) {
            addCriterion("DELFLG not like", value, "delflg");
            return (Criteria) this;
        }

        public Criteria andDelflgIn(List<String> values) {
            addCriterion("DELFLG in", values, "delflg");
            return (Criteria) this;
        }

        public Criteria andDelflgNotIn(List<String> values) {
            addCriterion("DELFLG not in", values, "delflg");
            return (Criteria) this;
        }

        public Criteria andDelflgBetween(String value1, String value2) {
            addCriterion("DELFLG between", value1, value2, "delflg");
            return (Criteria) this;
        }

        public Criteria andDelflgNotBetween(String value1, String value2) {
            addCriterion("DELFLG not between", value1, value2, "delflg");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}