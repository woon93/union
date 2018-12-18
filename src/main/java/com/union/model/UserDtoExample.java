package com.union.model;

import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@ToString()
public class UserDtoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserDtoExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("USER_ID like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("USER_ID not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNull() {
            addCriterion("USER_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNotNull() {
            addCriterion("USER_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("USER_PASSWORD =", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("USER_PASSWORD <>", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("USER_PASSWORD >", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("USER_PASSWORD >=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("USER_PASSWORD <", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("USER_PASSWORD <=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLike(String value) {
            addCriterion("USER_PASSWORD like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("USER_PASSWORD not like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("USER_PASSWORD in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("USER_PASSWORD not in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("USER_PASSWORD between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("USER_PASSWORD not between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNull() {
            addCriterion("USER_SEX is null");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNotNull() {
            addCriterion("USER_SEX is not null");
            return (Criteria) this;
        }

        public Criteria andUserSexEqualTo(String value) {
            addCriterion("USER_SEX =", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotEqualTo(String value) {
            addCriterion("USER_SEX <>", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThan(String value) {
            addCriterion("USER_SEX >", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThanOrEqualTo(String value) {
            addCriterion("USER_SEX >=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThan(String value) {
            addCriterion("USER_SEX <", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThanOrEqualTo(String value) {
            addCriterion("USER_SEX <=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLike(String value) {
            addCriterion("USER_SEX like", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotLike(String value) {
            addCriterion("USER_SEX not like", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexIn(List<String> values) {
            addCriterion("USER_SEX in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotIn(List<String> values) {
            addCriterion("USER_SEX not in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexBetween(String value1, String value2) {
            addCriterion("USER_SEX between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotBetween(String value1, String value2) {
            addCriterion("USER_SEX not between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserIdentityIsNull() {
            addCriterion("USER_IDENTITY is null");
            return (Criteria) this;
        }

        public Criteria andUserIdentityIsNotNull() {
            addCriterion("USER_IDENTITY is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdentityEqualTo(String value) {
            addCriterion("USER_IDENTITY =", value, "userIdentity");
            return (Criteria) this;
        }

        public Criteria andUserIdentityNotEqualTo(String value) {
            addCriterion("USER_IDENTITY <>", value, "userIdentity");
            return (Criteria) this;
        }

        public Criteria andUserIdentityGreaterThan(String value) {
            addCriterion("USER_IDENTITY >", value, "userIdentity");
            return (Criteria) this;
        }

        public Criteria andUserIdentityGreaterThanOrEqualTo(String value) {
            addCriterion("USER_IDENTITY >=", value, "userIdentity");
            return (Criteria) this;
        }

        public Criteria andUserIdentityLessThan(String value) {
            addCriterion("USER_IDENTITY <", value, "userIdentity");
            return (Criteria) this;
        }

        public Criteria andUserIdentityLessThanOrEqualTo(String value) {
            addCriterion("USER_IDENTITY <=", value, "userIdentity");
            return (Criteria) this;
        }

        public Criteria andUserIdentityLike(String value) {
            addCriterion("USER_IDENTITY like", value, "userIdentity");
            return (Criteria) this;
        }

        public Criteria andUserIdentityNotLike(String value) {
            addCriterion("USER_IDENTITY not like", value, "userIdentity");
            return (Criteria) this;
        }

        public Criteria andUserIdentityIn(List<String> values) {
            addCriterion("USER_IDENTITY in", values, "userIdentity");
            return (Criteria) this;
        }

        public Criteria andUserIdentityNotIn(List<String> values) {
            addCriterion("USER_IDENTITY not in", values, "userIdentity");
            return (Criteria) this;
        }

        public Criteria andUserIdentityBetween(String value1, String value2) {
            addCriterion("USER_IDENTITY between", value1, value2, "userIdentity");
            return (Criteria) this;
        }

        public Criteria andUserIdentityNotBetween(String value1, String value2) {
            addCriterion("USER_IDENTITY not between", value1, value2, "userIdentity");
            return (Criteria) this;
        }

        public Criteria andUserHometownIsNull() {
            addCriterion("USER_HOMETOWN is null");
            return (Criteria) this;
        }

        public Criteria andUserHometownIsNotNull() {
            addCriterion("USER_HOMETOWN is not null");
            return (Criteria) this;
        }

        public Criteria andUserHometownEqualTo(String value) {
            addCriterion("USER_HOMETOWN =", value, "userHometown");
            return (Criteria) this;
        }

        public Criteria andUserHometownNotEqualTo(String value) {
            addCriterion("USER_HOMETOWN <>", value, "userHometown");
            return (Criteria) this;
        }

        public Criteria andUserHometownGreaterThan(String value) {
            addCriterion("USER_HOMETOWN >", value, "userHometown");
            return (Criteria) this;
        }

        public Criteria andUserHometownGreaterThanOrEqualTo(String value) {
            addCriterion("USER_HOMETOWN >=", value, "userHometown");
            return (Criteria) this;
        }

        public Criteria andUserHometownLessThan(String value) {
            addCriterion("USER_HOMETOWN <", value, "userHometown");
            return (Criteria) this;
        }

        public Criteria andUserHometownLessThanOrEqualTo(String value) {
            addCriterion("USER_HOMETOWN <=", value, "userHometown");
            return (Criteria) this;
        }

        public Criteria andUserHometownLike(String value) {
            addCriterion("USER_HOMETOWN like", value, "userHometown");
            return (Criteria) this;
        }

        public Criteria andUserHometownNotLike(String value) {
            addCriterion("USER_HOMETOWN not like", value, "userHometown");
            return (Criteria) this;
        }

        public Criteria andUserHometownIn(List<String> values) {
            addCriterion("USER_HOMETOWN in", values, "userHometown");
            return (Criteria) this;
        }

        public Criteria andUserHometownNotIn(List<String> values) {
            addCriterion("USER_HOMETOWN not in", values, "userHometown");
            return (Criteria) this;
        }

        public Criteria andUserHometownBetween(String value1, String value2) {
            addCriterion("USER_HOMETOWN between", value1, value2, "userHometown");
            return (Criteria) this;
        }

        public Criteria andUserHometownNotBetween(String value1, String value2) {
            addCriterion("USER_HOMETOWN not between", value1, value2, "userHometown");
            return (Criteria) this;
        }

        public Criteria andPoliticalStastusIsNull() {
            addCriterion("POLITICAL_STASTUS is null");
            return (Criteria) this;
        }

        public Criteria andPoliticalStastusIsNotNull() {
            addCriterion("POLITICAL_STASTUS is not null");
            return (Criteria) this;
        }

        public Criteria andPoliticalStastusEqualTo(String value) {
            addCriterion("POLITICAL_STASTUS =", value, "politicalStastus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStastusNotEqualTo(String value) {
            addCriterion("POLITICAL_STASTUS <>", value, "politicalStastus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStastusGreaterThan(String value) {
            addCriterion("POLITICAL_STASTUS >", value, "politicalStastus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStastusGreaterThanOrEqualTo(String value) {
            addCriterion("POLITICAL_STASTUS >=", value, "politicalStastus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStastusLessThan(String value) {
            addCriterion("POLITICAL_STASTUS <", value, "politicalStastus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStastusLessThanOrEqualTo(String value) {
            addCriterion("POLITICAL_STASTUS <=", value, "politicalStastus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStastusLike(String value) {
            addCriterion("POLITICAL_STASTUS like", value, "politicalStastus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStastusNotLike(String value) {
            addCriterion("POLITICAL_STASTUS not like", value, "politicalStastus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStastusIn(List<String> values) {
            addCriterion("POLITICAL_STASTUS in", values, "politicalStastus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStastusNotIn(List<String> values) {
            addCriterion("POLITICAL_STASTUS not in", values, "politicalStastus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStastusBetween(String value1, String value2) {
            addCriterion("POLITICAL_STASTUS between", value1, value2, "politicalStastus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStastusNotBetween(String value1, String value2) {
            addCriterion("POLITICAL_STASTUS not between", value1, value2, "politicalStastus");
            return (Criteria) this;
        }

        public Criteria andUserMailaddressIsNull() {
            addCriterion("USER_MAILADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andUserMailaddressIsNotNull() {
            addCriterion("USER_MAILADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andUserMailaddressEqualTo(String value) {
            addCriterion("USER_MAILADDRESS =", value, "userMailaddress");
            return (Criteria) this;
        }

        public Criteria andUserMailaddressNotEqualTo(String value) {
            addCriterion("USER_MAILADDRESS <>", value, "userMailaddress");
            return (Criteria) this;
        }

        public Criteria andUserMailaddressGreaterThan(String value) {
            addCriterion("USER_MAILADDRESS >", value, "userMailaddress");
            return (Criteria) this;
        }

        public Criteria andUserMailaddressGreaterThanOrEqualTo(String value) {
            addCriterion("USER_MAILADDRESS >=", value, "userMailaddress");
            return (Criteria) this;
        }

        public Criteria andUserMailaddressLessThan(String value) {
            addCriterion("USER_MAILADDRESS <", value, "userMailaddress");
            return (Criteria) this;
        }

        public Criteria andUserMailaddressLessThanOrEqualTo(String value) {
            addCriterion("USER_MAILADDRESS <=", value, "userMailaddress");
            return (Criteria) this;
        }

        public Criteria andUserMailaddressLike(String value) {
            addCriterion("USER_MAILADDRESS like", value, "userMailaddress");
            return (Criteria) this;
        }

        public Criteria andUserMailaddressNotLike(String value) {
            addCriterion("USER_MAILADDRESS not like", value, "userMailaddress");
            return (Criteria) this;
        }

        public Criteria andUserMailaddressIn(List<String> values) {
            addCriterion("USER_MAILADDRESS in", values, "userMailaddress");
            return (Criteria) this;
        }

        public Criteria andUserMailaddressNotIn(List<String> values) {
            addCriterion("USER_MAILADDRESS not in", values, "userMailaddress");
            return (Criteria) this;
        }

        public Criteria andUserMailaddressBetween(String value1, String value2) {
            addCriterion("USER_MAILADDRESS between", value1, value2, "userMailaddress");
            return (Criteria) this;
        }

        public Criteria andUserMailaddressNotBetween(String value1, String value2) {
            addCriterion("USER_MAILADDRESS not between", value1, value2, "userMailaddress");
            return (Criteria) this;
        }

        public Criteria andUserTelIsNull() {
            addCriterion("USER_TEL is null");
            return (Criteria) this;
        }

        public Criteria andUserTelIsNotNull() {
            addCriterion("USER_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andUserTelEqualTo(String value) {
            addCriterion("USER_TEL =", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelNotEqualTo(String value) {
            addCriterion("USER_TEL <>", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelGreaterThan(String value) {
            addCriterion("USER_TEL >", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelGreaterThanOrEqualTo(String value) {
            addCriterion("USER_TEL >=", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelLessThan(String value) {
            addCriterion("USER_TEL <", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelLessThanOrEqualTo(String value) {
            addCriterion("USER_TEL <=", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelLike(String value) {
            addCriterion("USER_TEL like", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelNotLike(String value) {
            addCriterion("USER_TEL not like", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelIn(List<String> values) {
            addCriterion("USER_TEL in", values, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelNotIn(List<String> values) {
            addCriterion("USER_TEL not in", values, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelBetween(String value1, String value2) {
            addCriterion("USER_TEL between", value1, value2, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelNotBetween(String value1, String value2) {
            addCriterion("USER_TEL not between", value1, value2, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsNull() {
            addCriterion("USER_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsNotNull() {
            addCriterion("USER_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andUserAddressEqualTo(String value) {
            addCriterion("USER_ADDRESS =", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotEqualTo(String value) {
            addCriterion("USER_ADDRESS <>", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressGreaterThan(String value) {
            addCriterion("USER_ADDRESS >", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ADDRESS >=", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLessThan(String value) {
            addCriterion("USER_ADDRESS <", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLessThanOrEqualTo(String value) {
            addCriterion("USER_ADDRESS <=", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLike(String value) {
            addCriterion("USER_ADDRESS like", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotLike(String value) {
            addCriterion("USER_ADDRESS not like", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressIn(List<String> values) {
            addCriterion("USER_ADDRESS in", values, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotIn(List<String> values) {
            addCriterion("USER_ADDRESS not in", values, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressBetween(String value1, String value2) {
            addCriterion("USER_ADDRESS between", value1, value2, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotBetween(String value1, String value2) {
            addCriterion("USER_ADDRESS not between", value1, value2, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserStastusIsNull() {
            addCriterion("USER_STASTUS is null");
            return (Criteria) this;
        }

        public Criteria andUserStastusIsNotNull() {
            addCriterion("USER_STASTUS is not null");
            return (Criteria) this;
        }

        public Criteria andUserStastusEqualTo(String value) {
            addCriterion("USER_STASTUS =", value, "userStastus");
            return (Criteria) this;
        }

        public Criteria andUserStastusNotEqualTo(String value) {
            addCriterion("USER_STASTUS <>", value, "userStastus");
            return (Criteria) this;
        }

        public Criteria andUserStastusGreaterThan(String value) {
            addCriterion("USER_STASTUS >", value, "userStastus");
            return (Criteria) this;
        }

        public Criteria andUserStastusGreaterThanOrEqualTo(String value) {
            addCriterion("USER_STASTUS >=", value, "userStastus");
            return (Criteria) this;
        }

        public Criteria andUserStastusLessThan(String value) {
            addCriterion("USER_STASTUS <", value, "userStastus");
            return (Criteria) this;
        }

        public Criteria andUserStastusLessThanOrEqualTo(String value) {
            addCriterion("USER_STASTUS <=", value, "userStastus");
            return (Criteria) this;
        }

        public Criteria andUserStastusLike(String value) {
            addCriterion("USER_STASTUS like", value, "userStastus");
            return (Criteria) this;
        }

        public Criteria andUserStastusNotLike(String value) {
            addCriterion("USER_STASTUS not like", value, "userStastus");
            return (Criteria) this;
        }

        public Criteria andUserStastusIn(List<String> values) {
            addCriterion("USER_STASTUS in", values, "userStastus");
            return (Criteria) this;
        }

        public Criteria andUserStastusNotIn(List<String> values) {
            addCriterion("USER_STASTUS not in", values, "userStastus");
            return (Criteria) this;
        }

        public Criteria andUserStastusBetween(String value1, String value2) {
            addCriterion("USER_STASTUS between", value1, value2, "userStastus");
            return (Criteria) this;
        }

        public Criteria andUserStastusNotBetween(String value1, String value2) {
            addCriterion("USER_STASTUS not between", value1, value2, "userStastus");
            return (Criteria) this;
        }

        public Criteria andUserMessageIsNull() {
            addCriterion("USER_MESSAGE is null");
            return (Criteria) this;
        }

        public Criteria andUserMessageIsNotNull() {
            addCriterion("USER_MESSAGE is not null");
            return (Criteria) this;
        }

        public Criteria andUserMessageEqualTo(String value) {
            addCriterion("USER_MESSAGE =", value, "userMessage");
            return (Criteria) this;
        }

        public Criteria andUserMessageNotEqualTo(String value) {
            addCriterion("USER_MESSAGE <>", value, "userMessage");
            return (Criteria) this;
        }

        public Criteria andUserMessageGreaterThan(String value) {
            addCriterion("USER_MESSAGE >", value, "userMessage");
            return (Criteria) this;
        }

        public Criteria andUserMessageGreaterThanOrEqualTo(String value) {
            addCriterion("USER_MESSAGE >=", value, "userMessage");
            return (Criteria) this;
        }

        public Criteria andUserMessageLessThan(String value) {
            addCriterion("USER_MESSAGE <", value, "userMessage");
            return (Criteria) this;
        }

        public Criteria andUserMessageLessThanOrEqualTo(String value) {
            addCriterion("USER_MESSAGE <=", value, "userMessage");
            return (Criteria) this;
        }

        public Criteria andUserMessageLike(String value) {
            addCriterion("USER_MESSAGE like", value, "userMessage");
            return (Criteria) this;
        }

        public Criteria andUserMessageNotLike(String value) {
            addCriterion("USER_MESSAGE not like", value, "userMessage");
            return (Criteria) this;
        }

        public Criteria andUserMessageIn(List<String> values) {
            addCriterion("USER_MESSAGE in", values, "userMessage");
            return (Criteria) this;
        }

        public Criteria andUserMessageNotIn(List<String> values) {
            addCriterion("USER_MESSAGE not in", values, "userMessage");
            return (Criteria) this;
        }

        public Criteria andUserMessageBetween(String value1, String value2) {
            addCriterion("USER_MESSAGE between", value1, value2, "userMessage");
            return (Criteria) this;
        }

        public Criteria andUserMessageNotBetween(String value1, String value2) {
            addCriterion("USER_MESSAGE not between", value1, value2, "userMessage");
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