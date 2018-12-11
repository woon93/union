package com.union.model;

import java.util.ArrayList;
import java.util.List;

public class InfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InfoExample() {
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

        public Criteria andClass1IsNull() {
            addCriterion("CLASS1 is null");
            return (Criteria) this;
        }

        public Criteria andClass1IsNotNull() {
            addCriterion("CLASS1 is not null");
            return (Criteria) this;
        }

        public Criteria andClass1EqualTo(String value) {
            addCriterion("CLASS1 =", value, "class1");
            return (Criteria) this;
        }

        public Criteria andClass1NotEqualTo(String value) {
            addCriterion("CLASS1 <>", value, "class1");
            return (Criteria) this;
        }

        public Criteria andClass1GreaterThan(String value) {
            addCriterion("CLASS1 >", value, "class1");
            return (Criteria) this;
        }

        public Criteria andClass1GreaterThanOrEqualTo(String value) {
            addCriterion("CLASS1 >=", value, "class1");
            return (Criteria) this;
        }

        public Criteria andClass1LessThan(String value) {
            addCriterion("CLASS1 <", value, "class1");
            return (Criteria) this;
        }

        public Criteria andClass1LessThanOrEqualTo(String value) {
            addCriterion("CLASS1 <=", value, "class1");
            return (Criteria) this;
        }

        public Criteria andClass1Like(String value) {
            addCriterion("CLASS1 like", value, "class1");
            return (Criteria) this;
        }

        public Criteria andClass1NotLike(String value) {
            addCriterion("CLASS1 not like", value, "class1");
            return (Criteria) this;
        }

        public Criteria andClass1In(List<String> values) {
            addCriterion("CLASS1 in", values, "class1");
            return (Criteria) this;
        }

        public Criteria andClass1NotIn(List<String> values) {
            addCriterion("CLASS1 not in", values, "class1");
            return (Criteria) this;
        }

        public Criteria andClass1Between(String value1, String value2) {
            addCriterion("CLASS1 between", value1, value2, "class1");
            return (Criteria) this;
        }

        public Criteria andClass1NotBetween(String value1, String value2) {
            addCriterion("CLASS1 not between", value1, value2, "class1");
            return (Criteria) this;
        }

        public Criteria andClass2IsNull() {
            addCriterion("CLASS2 is null");
            return (Criteria) this;
        }

        public Criteria andClass2IsNotNull() {
            addCriterion("CLASS2 is not null");
            return (Criteria) this;
        }

        public Criteria andClass2EqualTo(String value) {
            addCriterion("CLASS2 =", value, "class2");
            return (Criteria) this;
        }

        public Criteria andClass2NotEqualTo(String value) {
            addCriterion("CLASS2 <>", value, "class2");
            return (Criteria) this;
        }

        public Criteria andClass2GreaterThan(String value) {
            addCriterion("CLASS2 >", value, "class2");
            return (Criteria) this;
        }

        public Criteria andClass2GreaterThanOrEqualTo(String value) {
            addCriterion("CLASS2 >=", value, "class2");
            return (Criteria) this;
        }

        public Criteria andClass2LessThan(String value) {
            addCriterion("CLASS2 <", value, "class2");
            return (Criteria) this;
        }

        public Criteria andClass2LessThanOrEqualTo(String value) {
            addCriterion("CLASS2 <=", value, "class2");
            return (Criteria) this;
        }

        public Criteria andClass2Like(String value) {
            addCriterion("CLASS2 like", value, "class2");
            return (Criteria) this;
        }

        public Criteria andClass2NotLike(String value) {
            addCriterion("CLASS2 not like", value, "class2");
            return (Criteria) this;
        }

        public Criteria andClass2In(List<String> values) {
            addCriterion("CLASS2 in", values, "class2");
            return (Criteria) this;
        }

        public Criteria andClass2NotIn(List<String> values) {
            addCriterion("CLASS2 not in", values, "class2");
            return (Criteria) this;
        }

        public Criteria andClass2Between(String value1, String value2) {
            addCriterion("CLASS2 between", value1, value2, "class2");
            return (Criteria) this;
        }

        public Criteria andClass2NotBetween(String value1, String value2) {
            addCriterion("CLASS2 not between", value1, value2, "class2");
            return (Criteria) this;
        }

        public Criteria andClass3IsNull() {
            addCriterion("CLASS3 is null");
            return (Criteria) this;
        }

        public Criteria andClass3IsNotNull() {
            addCriterion("CLASS3 is not null");
            return (Criteria) this;
        }

        public Criteria andClass3EqualTo(String value) {
            addCriterion("CLASS3 =", value, "class3");
            return (Criteria) this;
        }

        public Criteria andClass3NotEqualTo(String value) {
            addCriterion("CLASS3 <>", value, "class3");
            return (Criteria) this;
        }

        public Criteria andClass3GreaterThan(String value) {
            addCriterion("CLASS3 >", value, "class3");
            return (Criteria) this;
        }

        public Criteria andClass3GreaterThanOrEqualTo(String value) {
            addCriterion("CLASS3 >=", value, "class3");
            return (Criteria) this;
        }

        public Criteria andClass3LessThan(String value) {
            addCriterion("CLASS3 <", value, "class3");
            return (Criteria) this;
        }

        public Criteria andClass3LessThanOrEqualTo(String value) {
            addCriterion("CLASS3 <=", value, "class3");
            return (Criteria) this;
        }

        public Criteria andClass3Like(String value) {
            addCriterion("CLASS3 like", value, "class3");
            return (Criteria) this;
        }

        public Criteria andClass3NotLike(String value) {
            addCriterion("CLASS3 not like", value, "class3");
            return (Criteria) this;
        }

        public Criteria andClass3In(List<String> values) {
            addCriterion("CLASS3 in", values, "class3");
            return (Criteria) this;
        }

        public Criteria andClass3NotIn(List<String> values) {
            addCriterion("CLASS3 not in", values, "class3");
            return (Criteria) this;
        }

        public Criteria andClass3Between(String value1, String value2) {
            addCriterion("CLASS3 between", value1, value2, "class3");
            return (Criteria) this;
        }

        public Criteria andClass3NotBetween(String value1, String value2) {
            addCriterion("CLASS3 not between", value1, value2, "class3");
            return (Criteria) this;
        }

        public Criteria andIndxIsNull() {
            addCriterion("INDX is null");
            return (Criteria) this;
        }

        public Criteria andIndxIsNotNull() {
            addCriterion("INDX is not null");
            return (Criteria) this;
        }

        public Criteria andIndxEqualTo(String value) {
            addCriterion("INDX =", value, "indx");
            return (Criteria) this;
        }

        public Criteria andIndxNotEqualTo(String value) {
            addCriterion("INDX <>", value, "indx");
            return (Criteria) this;
        }

        public Criteria andIndxGreaterThan(String value) {
            addCriterion("INDX >", value, "indx");
            return (Criteria) this;
        }

        public Criteria andIndxGreaterThanOrEqualTo(String value) {
            addCriterion("INDX >=", value, "indx");
            return (Criteria) this;
        }

        public Criteria andIndxLessThan(String value) {
            addCriterion("INDX <", value, "indx");
            return (Criteria) this;
        }

        public Criteria andIndxLessThanOrEqualTo(String value) {
            addCriterion("INDX <=", value, "indx");
            return (Criteria) this;
        }

        public Criteria andIndxLike(String value) {
            addCriterion("INDX like", value, "indx");
            return (Criteria) this;
        }

        public Criteria andIndxNotLike(String value) {
            addCriterion("INDX not like", value, "indx");
            return (Criteria) this;
        }

        public Criteria andIndxIn(List<String> values) {
            addCriterion("INDX in", values, "indx");
            return (Criteria) this;
        }

        public Criteria andIndxNotIn(List<String> values) {
            addCriterion("INDX not in", values, "indx");
            return (Criteria) this;
        }

        public Criteria andIndxBetween(String value1, String value2) {
            addCriterion("INDX between", value1, value2, "indx");
            return (Criteria) this;
        }

        public Criteria andIndxNotBetween(String value1, String value2) {
            addCriterion("INDX not between", value1, value2, "indx");
            return (Criteria) this;
        }

        public Criteria andFldnmIsNull() {
            addCriterion("FLDNM is null");
            return (Criteria) this;
        }

        public Criteria andFldnmIsNotNull() {
            addCriterion("FLDNM is not null");
            return (Criteria) this;
        }

        public Criteria andFldnmEqualTo(String value) {
            addCriterion("FLDNM =", value, "fldnm");
            return (Criteria) this;
        }

        public Criteria andFldnmNotEqualTo(String value) {
            addCriterion("FLDNM <>", value, "fldnm");
            return (Criteria) this;
        }

        public Criteria andFldnmGreaterThan(String value) {
            addCriterion("FLDNM >", value, "fldnm");
            return (Criteria) this;
        }

        public Criteria andFldnmGreaterThanOrEqualTo(String value) {
            addCriterion("FLDNM >=", value, "fldnm");
            return (Criteria) this;
        }

        public Criteria andFldnmLessThan(String value) {
            addCriterion("FLDNM <", value, "fldnm");
            return (Criteria) this;
        }

        public Criteria andFldnmLessThanOrEqualTo(String value) {
            addCriterion("FLDNM <=", value, "fldnm");
            return (Criteria) this;
        }

        public Criteria andFldnmLike(String value) {
            addCriterion("FLDNM like", value, "fldnm");
            return (Criteria) this;
        }

        public Criteria andFldnmNotLike(String value) {
            addCriterion("FLDNM not like", value, "fldnm");
            return (Criteria) this;
        }

        public Criteria andFldnmIn(List<String> values) {
            addCriterion("FLDNM in", values, "fldnm");
            return (Criteria) this;
        }

        public Criteria andFldnmNotIn(List<String> values) {
            addCriterion("FLDNM not in", values, "fldnm");
            return (Criteria) this;
        }

        public Criteria andFldnmBetween(String value1, String value2) {
            addCriterion("FLDNM between", value1, value2, "fldnm");
            return (Criteria) this;
        }

        public Criteria andFldnmNotBetween(String value1, String value2) {
            addCriterion("FLDNM not between", value1, value2, "fldnm");
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