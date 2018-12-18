package com.union.model;

import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@ToString()
public class PostDtoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PostDtoExample() {
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

        public Criteria andPostIdIsNull() {
            addCriterion("POST_ID is null");
            return (Criteria) this;
        }

        public Criteria andPostIdIsNotNull() {
            addCriterion("POST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPostIdEqualTo(String value) {
            addCriterion("POST_ID =", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotEqualTo(String value) {
            addCriterion("POST_ID <>", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdGreaterThan(String value) {
            addCriterion("POST_ID >", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdGreaterThanOrEqualTo(String value) {
            addCriterion("POST_ID >=", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdLessThan(String value) {
            addCriterion("POST_ID <", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdLessThanOrEqualTo(String value) {
            addCriterion("POST_ID <=", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdLike(String value) {
            addCriterion("POST_ID like", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotLike(String value) {
            addCriterion("POST_ID not like", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdIn(List<String> values) {
            addCriterion("POST_ID in", values, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotIn(List<String> values) {
            addCriterion("POST_ID not in", values, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdBetween(String value1, String value2) {
            addCriterion("POST_ID between", value1, value2, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotBetween(String value1, String value2) {
            addCriterion("POST_ID not between", value1, value2, "postId");
            return (Criteria) this;
        }

        public Criteria andPostSeqIsNull() {
            addCriterion("POST_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andPostSeqIsNotNull() {
            addCriterion("POST_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andPostSeqEqualTo(Integer value) {
            addCriterion("POST_SEQ =", value, "postSeq");
            return (Criteria) this;
        }

        public Criteria andPostSeqNotEqualTo(Integer value) {
            addCriterion("POST_SEQ <>", value, "postSeq");
            return (Criteria) this;
        }

        public Criteria andPostSeqGreaterThan(Integer value) {
            addCriterion("POST_SEQ >", value, "postSeq");
            return (Criteria) this;
        }

        public Criteria andPostSeqGreaterThanOrEqualTo(Integer value) {
            addCriterion("POST_SEQ >=", value, "postSeq");
            return (Criteria) this;
        }

        public Criteria andPostSeqLessThan(Integer value) {
            addCriterion("POST_SEQ <", value, "postSeq");
            return (Criteria) this;
        }

        public Criteria andPostSeqLessThanOrEqualTo(Integer value) {
            addCriterion("POST_SEQ <=", value, "postSeq");
            return (Criteria) this;
        }

        public Criteria andPostSeqIn(List<Integer> values) {
            addCriterion("POST_SEQ in", values, "postSeq");
            return (Criteria) this;
        }

        public Criteria andPostSeqNotIn(List<Integer> values) {
            addCriterion("POST_SEQ not in", values, "postSeq");
            return (Criteria) this;
        }

        public Criteria andPostSeqBetween(Integer value1, Integer value2) {
            addCriterion("POST_SEQ between", value1, value2, "postSeq");
            return (Criteria) this;
        }

        public Criteria andPostSeqNotBetween(Integer value1, Integer value2) {
            addCriterion("POST_SEQ not between", value1, value2, "postSeq");
            return (Criteria) this;
        }

        public Criteria andPostCommentIdIsNull() {
            addCriterion("POST_COMMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andPostCommentIdIsNotNull() {
            addCriterion("POST_COMMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPostCommentIdEqualTo(String value) {
            addCriterion("POST_COMMENT_ID =", value, "postCommentId");
            return (Criteria) this;
        }

        public Criteria andPostCommentIdNotEqualTo(String value) {
            addCriterion("POST_COMMENT_ID <>", value, "postCommentId");
            return (Criteria) this;
        }

        public Criteria andPostCommentIdGreaterThan(String value) {
            addCriterion("POST_COMMENT_ID >", value, "postCommentId");
            return (Criteria) this;
        }

        public Criteria andPostCommentIdGreaterThanOrEqualTo(String value) {
            addCriterion("POST_COMMENT_ID >=", value, "postCommentId");
            return (Criteria) this;
        }

        public Criteria andPostCommentIdLessThan(String value) {
            addCriterion("POST_COMMENT_ID <", value, "postCommentId");
            return (Criteria) this;
        }

        public Criteria andPostCommentIdLessThanOrEqualTo(String value) {
            addCriterion("POST_COMMENT_ID <=", value, "postCommentId");
            return (Criteria) this;
        }

        public Criteria andPostCommentIdLike(String value) {
            addCriterion("POST_COMMENT_ID like", value, "postCommentId");
            return (Criteria) this;
        }

        public Criteria andPostCommentIdNotLike(String value) {
            addCriterion("POST_COMMENT_ID not like", value, "postCommentId");
            return (Criteria) this;
        }

        public Criteria andPostCommentIdIn(List<String> values) {
            addCriterion("POST_COMMENT_ID in", values, "postCommentId");
            return (Criteria) this;
        }

        public Criteria andPostCommentIdNotIn(List<String> values) {
            addCriterion("POST_COMMENT_ID not in", values, "postCommentId");
            return (Criteria) this;
        }

        public Criteria andPostCommentIdBetween(String value1, String value2) {
            addCriterion("POST_COMMENT_ID between", value1, value2, "postCommentId");
            return (Criteria) this;
        }

        public Criteria andPostCommentIdNotBetween(String value1, String value2) {
            addCriterion("POST_COMMENT_ID not between", value1, value2, "postCommentId");
            return (Criteria) this;
        }

        public Criteria andPostUserIdIsNull() {
            addCriterion("POST_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andPostUserIdIsNotNull() {
            addCriterion("POST_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPostUserIdEqualTo(String value) {
            addCriterion("POST_USER_ID =", value, "postUserId");
            return (Criteria) this;
        }

        public Criteria andPostUserIdNotEqualTo(String value) {
            addCriterion("POST_USER_ID <>", value, "postUserId");
            return (Criteria) this;
        }

        public Criteria andPostUserIdGreaterThan(String value) {
            addCriterion("POST_USER_ID >", value, "postUserId");
            return (Criteria) this;
        }

        public Criteria andPostUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("POST_USER_ID >=", value, "postUserId");
            return (Criteria) this;
        }

        public Criteria andPostUserIdLessThan(String value) {
            addCriterion("POST_USER_ID <", value, "postUserId");
            return (Criteria) this;
        }

        public Criteria andPostUserIdLessThanOrEqualTo(String value) {
            addCriterion("POST_USER_ID <=", value, "postUserId");
            return (Criteria) this;
        }

        public Criteria andPostUserIdLike(String value) {
            addCriterion("POST_USER_ID like", value, "postUserId");
            return (Criteria) this;
        }

        public Criteria andPostUserIdNotLike(String value) {
            addCriterion("POST_USER_ID not like", value, "postUserId");
            return (Criteria) this;
        }

        public Criteria andPostUserIdIn(List<String> values) {
            addCriterion("POST_USER_ID in", values, "postUserId");
            return (Criteria) this;
        }

        public Criteria andPostUserIdNotIn(List<String> values) {
            addCriterion("POST_USER_ID not in", values, "postUserId");
            return (Criteria) this;
        }

        public Criteria andPostUserIdBetween(String value1, String value2) {
            addCriterion("POST_USER_ID between", value1, value2, "postUserId");
            return (Criteria) this;
        }

        public Criteria andPostUserIdNotBetween(String value1, String value2) {
            addCriterion("POST_USER_ID not between", value1, value2, "postUserId");
            return (Criteria) this;
        }

        public Criteria andPostTitleIsNull() {
            addCriterion("POST_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andPostTitleIsNotNull() {
            addCriterion("POST_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andPostTitleEqualTo(String value) {
            addCriterion("POST_TITLE =", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleNotEqualTo(String value) {
            addCriterion("POST_TITLE <>", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleGreaterThan(String value) {
            addCriterion("POST_TITLE >", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleGreaterThanOrEqualTo(String value) {
            addCriterion("POST_TITLE >=", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleLessThan(String value) {
            addCriterion("POST_TITLE <", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleLessThanOrEqualTo(String value) {
            addCriterion("POST_TITLE <=", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleLike(String value) {
            addCriterion("POST_TITLE like", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleNotLike(String value) {
            addCriterion("POST_TITLE not like", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleIn(List<String> values) {
            addCriterion("POST_TITLE in", values, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleNotIn(List<String> values) {
            addCriterion("POST_TITLE not in", values, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleBetween(String value1, String value2) {
            addCriterion("POST_TITLE between", value1, value2, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleNotBetween(String value1, String value2) {
            addCriterion("POST_TITLE not between", value1, value2, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostContentIsNull() {
            addCriterion("POST_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andPostContentIsNotNull() {
            addCriterion("POST_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andPostContentEqualTo(String value) {
            addCriterion("POST_CONTENT =", value, "postContent");
            return (Criteria) this;
        }

        public Criteria andPostContentNotEqualTo(String value) {
            addCriterion("POST_CONTENT <>", value, "postContent");
            return (Criteria) this;
        }

        public Criteria andPostContentGreaterThan(String value) {
            addCriterion("POST_CONTENT >", value, "postContent");
            return (Criteria) this;
        }

        public Criteria andPostContentGreaterThanOrEqualTo(String value) {
            addCriterion("POST_CONTENT >=", value, "postContent");
            return (Criteria) this;
        }

        public Criteria andPostContentLessThan(String value) {
            addCriterion("POST_CONTENT <", value, "postContent");
            return (Criteria) this;
        }

        public Criteria andPostContentLessThanOrEqualTo(String value) {
            addCriterion("POST_CONTENT <=", value, "postContent");
            return (Criteria) this;
        }

        public Criteria andPostContentLike(String value) {
            addCriterion("POST_CONTENT like", value, "postContent");
            return (Criteria) this;
        }

        public Criteria andPostContentNotLike(String value) {
            addCriterion("POST_CONTENT not like", value, "postContent");
            return (Criteria) this;
        }

        public Criteria andPostContentIn(List<String> values) {
            addCriterion("POST_CONTENT in", values, "postContent");
            return (Criteria) this;
        }

        public Criteria andPostContentNotIn(List<String> values) {
            addCriterion("POST_CONTENT not in", values, "postContent");
            return (Criteria) this;
        }

        public Criteria andPostContentBetween(String value1, String value2) {
            addCriterion("POST_CONTENT between", value1, value2, "postContent");
            return (Criteria) this;
        }

        public Criteria andPostContentNotBetween(String value1, String value2) {
            addCriterion("POST_CONTENT not between", value1, value2, "postContent");
            return (Criteria) this;
        }

        public Criteria andPostStatusIsNull() {
            addCriterion("POST_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andPostStatusIsNotNull() {
            addCriterion("POST_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andPostStatusEqualTo(String value) {
            addCriterion("POST_STATUS =", value, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusNotEqualTo(String value) {
            addCriterion("POST_STATUS <>", value, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusGreaterThan(String value) {
            addCriterion("POST_STATUS >", value, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusGreaterThanOrEqualTo(String value) {
            addCriterion("POST_STATUS >=", value, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusLessThan(String value) {
            addCriterion("POST_STATUS <", value, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusLessThanOrEqualTo(String value) {
            addCriterion("POST_STATUS <=", value, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusLike(String value) {
            addCriterion("POST_STATUS like", value, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusNotLike(String value) {
            addCriterion("POST_STATUS not like", value, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusIn(List<String> values) {
            addCriterion("POST_STATUS in", values, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusNotIn(List<String> values) {
            addCriterion("POST_STATUS not in", values, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusBetween(String value1, String value2) {
            addCriterion("POST_STATUS between", value1, value2, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusNotBetween(String value1, String value2) {
            addCriterion("POST_STATUS not between", value1, value2, "postStatus");
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