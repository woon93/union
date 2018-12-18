package com.union.model;

import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@ToString()
public class CommentDtoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentDtoExample() {
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

        public Criteria andCommentIdIsNull() {
            addCriterion("COMMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andCommentIdIsNotNull() {
            addCriterion("COMMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCommentIdEqualTo(String value) {
            addCriterion("COMMENT_ID =", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotEqualTo(String value) {
            addCriterion("COMMENT_ID <>", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThan(String value) {
            addCriterion("COMMENT_ID >", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThanOrEqualTo(String value) {
            addCriterion("COMMENT_ID >=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThan(String value) {
            addCriterion("COMMENT_ID <", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThanOrEqualTo(String value) {
            addCriterion("COMMENT_ID <=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLike(String value) {
            addCriterion("COMMENT_ID like", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotLike(String value) {
            addCriterion("COMMENT_ID not like", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdIn(List<String> values) {
            addCriterion("COMMENT_ID in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotIn(List<String> values) {
            addCriterion("COMMENT_ID not in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdBetween(String value1, String value2) {
            addCriterion("COMMENT_ID between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotBetween(String value1, String value2) {
            addCriterion("COMMENT_ID not between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentSeqIsNull() {
            addCriterion("COMMENT_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andCommentSeqIsNotNull() {
            addCriterion("COMMENT_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andCommentSeqEqualTo(Integer value) {
            addCriterion("COMMENT_SEQ =", value, "commentSeq");
            return (Criteria) this;
        }

        public Criteria andCommentSeqNotEqualTo(Integer value) {
            addCriterion("COMMENT_SEQ <>", value, "commentSeq");
            return (Criteria) this;
        }

        public Criteria andCommentSeqGreaterThan(Integer value) {
            addCriterion("COMMENT_SEQ >", value, "commentSeq");
            return (Criteria) this;
        }

        public Criteria andCommentSeqGreaterThanOrEqualTo(Integer value) {
            addCriterion("COMMENT_SEQ >=", value, "commentSeq");
            return (Criteria) this;
        }

        public Criteria andCommentSeqLessThan(Integer value) {
            addCriterion("COMMENT_SEQ <", value, "commentSeq");
            return (Criteria) this;
        }

        public Criteria andCommentSeqLessThanOrEqualTo(Integer value) {
            addCriterion("COMMENT_SEQ <=", value, "commentSeq");
            return (Criteria) this;
        }

        public Criteria andCommentSeqIn(List<Integer> values) {
            addCriterion("COMMENT_SEQ in", values, "commentSeq");
            return (Criteria) this;
        }

        public Criteria andCommentSeqNotIn(List<Integer> values) {
            addCriterion("COMMENT_SEQ not in", values, "commentSeq");
            return (Criteria) this;
        }

        public Criteria andCommentSeqBetween(Integer value1, Integer value2) {
            addCriterion("COMMENT_SEQ between", value1, value2, "commentSeq");
            return (Criteria) this;
        }

        public Criteria andCommentSeqNotBetween(Integer value1, Integer value2) {
            addCriterion("COMMENT_SEQ not between", value1, value2, "commentSeq");
            return (Criteria) this;
        }

        public Criteria andCommentUserIdIsNull() {
            addCriterion("COMMENT_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCommentUserIdIsNotNull() {
            addCriterion("COMMENT_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCommentUserIdEqualTo(String value) {
            addCriterion("COMMENT_USER_ID =", value, "commentUserId");
            return (Criteria) this;
        }

        public Criteria andCommentUserIdNotEqualTo(String value) {
            addCriterion("COMMENT_USER_ID <>", value, "commentUserId");
            return (Criteria) this;
        }

        public Criteria andCommentUserIdGreaterThan(String value) {
            addCriterion("COMMENT_USER_ID >", value, "commentUserId");
            return (Criteria) this;
        }

        public Criteria andCommentUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("COMMENT_USER_ID >=", value, "commentUserId");
            return (Criteria) this;
        }

        public Criteria andCommentUserIdLessThan(String value) {
            addCriterion("COMMENT_USER_ID <", value, "commentUserId");
            return (Criteria) this;
        }

        public Criteria andCommentUserIdLessThanOrEqualTo(String value) {
            addCriterion("COMMENT_USER_ID <=", value, "commentUserId");
            return (Criteria) this;
        }

        public Criteria andCommentUserIdLike(String value) {
            addCriterion("COMMENT_USER_ID like", value, "commentUserId");
            return (Criteria) this;
        }

        public Criteria andCommentUserIdNotLike(String value) {
            addCriterion("COMMENT_USER_ID not like", value, "commentUserId");
            return (Criteria) this;
        }

        public Criteria andCommentUserIdIn(List<String> values) {
            addCriterion("COMMENT_USER_ID in", values, "commentUserId");
            return (Criteria) this;
        }

        public Criteria andCommentUserIdNotIn(List<String> values) {
            addCriterion("COMMENT_USER_ID not in", values, "commentUserId");
            return (Criteria) this;
        }

        public Criteria andCommentUserIdBetween(String value1, String value2) {
            addCriterion("COMMENT_USER_ID between", value1, value2, "commentUserId");
            return (Criteria) this;
        }

        public Criteria andCommentUserIdNotBetween(String value1, String value2) {
            addCriterion("COMMENT_USER_ID not between", value1, value2, "commentUserId");
            return (Criteria) this;
        }

        public Criteria andCommentContentIsNull() {
            addCriterion("COMMENT_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andCommentContentIsNotNull() {
            addCriterion("COMMENT_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andCommentContentEqualTo(String value) {
            addCriterion("COMMENT_CONTENT =", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotEqualTo(String value) {
            addCriterion("COMMENT_CONTENT <>", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentGreaterThan(String value) {
            addCriterion("COMMENT_CONTENT >", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentGreaterThanOrEqualTo(String value) {
            addCriterion("COMMENT_CONTENT >=", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentLessThan(String value) {
            addCriterion("COMMENT_CONTENT <", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentLessThanOrEqualTo(String value) {
            addCriterion("COMMENT_CONTENT <=", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentLike(String value) {
            addCriterion("COMMENT_CONTENT like", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotLike(String value) {
            addCriterion("COMMENT_CONTENT not like", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentIn(List<String> values) {
            addCriterion("COMMENT_CONTENT in", values, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotIn(List<String> values) {
            addCriterion("COMMENT_CONTENT not in", values, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentBetween(String value1, String value2) {
            addCriterion("COMMENT_CONTENT between", value1, value2, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotBetween(String value1, String value2) {
            addCriterion("COMMENT_CONTENT not between", value1, value2, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentStatusIsNull() {
            addCriterion("COMMENT_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andCommentStatusIsNotNull() {
            addCriterion("COMMENT_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCommentStatusEqualTo(String value) {
            addCriterion("COMMENT_STATUS =", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusNotEqualTo(String value) {
            addCriterion("COMMENT_STATUS <>", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusGreaterThan(String value) {
            addCriterion("COMMENT_STATUS >", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusGreaterThanOrEqualTo(String value) {
            addCriterion("COMMENT_STATUS >=", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusLessThan(String value) {
            addCriterion("COMMENT_STATUS <", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusLessThanOrEqualTo(String value) {
            addCriterion("COMMENT_STATUS <=", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusLike(String value) {
            addCriterion("COMMENT_STATUS like", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusNotLike(String value) {
            addCriterion("COMMENT_STATUS not like", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusIn(List<String> values) {
            addCriterion("COMMENT_STATUS in", values, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusNotIn(List<String> values) {
            addCriterion("COMMENT_STATUS not in", values, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusBetween(String value1, String value2) {
            addCriterion("COMMENT_STATUS between", value1, value2, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusNotBetween(String value1, String value2) {
            addCriterion("COMMENT_STATUS not between", value1, value2, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIsNull() {
            addCriterion("INSERT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIsNotNull() {
            addCriterion("INSERT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andInsertTimeEqualTo(Date value) {
            addCriterion("INSERT_TIME =", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotEqualTo(Date value) {
            addCriterion("INSERT_TIME <>", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeGreaterThan(Date value) {
            addCriterion("INSERT_TIME >", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("INSERT_TIME >=", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeLessThan(Date value) {
            addCriterion("INSERT_TIME <", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeLessThanOrEqualTo(Date value) {
            addCriterion("INSERT_TIME <=", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIn(List<Date> values) {
            addCriterion("INSERT_TIME in", values, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotIn(List<Date> values) {
            addCriterion("INSERT_TIME not in", values, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeBetween(Date value1, Date value2) {
            addCriterion("INSERT_TIME between", value1, value2, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotBetween(Date value1, Date value2) {
            addCriterion("INSERT_TIME not between", value1, value2, "insertTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateCntIsNull() {
            addCriterion("UPDATE_CNT is null");
            return (Criteria) this;
        }

        public Criteria andUpdateCntIsNotNull() {
            addCriterion("UPDATE_CNT is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateCntEqualTo(Integer value) {
            addCriterion("UPDATE_CNT =", value, "updateCnt");
            return (Criteria) this;
        }

        public Criteria andUpdateCntNotEqualTo(Integer value) {
            addCriterion("UPDATE_CNT <>", value, "updateCnt");
            return (Criteria) this;
        }

        public Criteria andUpdateCntGreaterThan(Integer value) {
            addCriterion("UPDATE_CNT >", value, "updateCnt");
            return (Criteria) this;
        }

        public Criteria andUpdateCntGreaterThanOrEqualTo(Integer value) {
            addCriterion("UPDATE_CNT >=", value, "updateCnt");
            return (Criteria) this;
        }

        public Criteria andUpdateCntLessThan(Integer value) {
            addCriterion("UPDATE_CNT <", value, "updateCnt");
            return (Criteria) this;
        }

        public Criteria andUpdateCntLessThanOrEqualTo(Integer value) {
            addCriterion("UPDATE_CNT <=", value, "updateCnt");
            return (Criteria) this;
        }

        public Criteria andUpdateCntIn(List<Integer> values) {
            addCriterion("UPDATE_CNT in", values, "updateCnt");
            return (Criteria) this;
        }

        public Criteria andUpdateCntNotIn(List<Integer> values) {
            addCriterion("UPDATE_CNT not in", values, "updateCnt");
            return (Criteria) this;
        }

        public Criteria andUpdateCntBetween(Integer value1, Integer value2) {
            addCriterion("UPDATE_CNT between", value1, value2, "updateCnt");
            return (Criteria) this;
        }

        public Criteria andUpdateCntNotBetween(Integer value1, Integer value2) {
            addCriterion("UPDATE_CNT not between", value1, value2, "updateCnt");
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