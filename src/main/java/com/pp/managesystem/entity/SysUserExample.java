package com.pp.managesystem.entity;

import java.util.ArrayList;
import java.util.List;

public class SysUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysUserExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andUIdIsNull() {
            addCriterion("u_id is null");
            return (Criteria) this;
        }

        public Criteria andUIdIsNotNull() {
            addCriterion("u_id is not null");
            return (Criteria) this;
        }

        public Criteria andUIdEqualTo(Integer value) {
            addCriterion("u_id =", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotEqualTo(Integer value) {
            addCriterion("u_id <>", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThan(Integer value) {
            addCriterion("u_id >", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_id >=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThan(Integer value) {
            addCriterion("u_id <", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThanOrEqualTo(Integer value) {
            addCriterion("u_id <=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdIn(List<Integer> values) {
            addCriterion("u_id in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotIn(List<Integer> values) {
            addCriterion("u_id not in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdBetween(Integer value1, Integer value2) {
            addCriterion("u_id between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotBetween(Integer value1, Integer value2) {
            addCriterion("u_id not between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUUsernameIsNull() {
            addCriterion("u_username is null");
            return (Criteria) this;
        }

        public Criteria andUUsernameIsNotNull() {
            addCriterion("u_username is not null");
            return (Criteria) this;
        }

        public Criteria andUUsernameEqualTo(String value) {
            addCriterion("u_username =", value, "uUsername");
            return (Criteria) this;
        }

        public Criteria andUUsernameNotEqualTo(String value) {
            addCriterion("u_username <>", value, "uUsername");
            return (Criteria) this;
        }

        public Criteria andUUsernameGreaterThan(String value) {
            addCriterion("u_username >", value, "uUsername");
            return (Criteria) this;
        }

        public Criteria andUUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("u_username >=", value, "uUsername");
            return (Criteria) this;
        }

        public Criteria andUUsernameLessThan(String value) {
            addCriterion("u_username <", value, "uUsername");
            return (Criteria) this;
        }

        public Criteria andUUsernameLessThanOrEqualTo(String value) {
            addCriterion("u_username <=", value, "uUsername");
            return (Criteria) this;
        }

        public Criteria andUUsernameLike(String value) {
            addCriterion("u_username like", value, "uUsername");
            return (Criteria) this;
        }

        public Criteria andUUsernameNotLike(String value) {
            addCriterion("u_username not like", value, "uUsername");
            return (Criteria) this;
        }

        public Criteria andUUsernameIn(List<String> values) {
            addCriterion("u_username in", values, "uUsername");
            return (Criteria) this;
        }

        public Criteria andUUsernameNotIn(List<String> values) {
            addCriterion("u_username not in", values, "uUsername");
            return (Criteria) this;
        }

        public Criteria andUUsernameBetween(String value1, String value2) {
            addCriterion("u_username between", value1, value2, "uUsername");
            return (Criteria) this;
        }

        public Criteria andUUsernameNotBetween(String value1, String value2) {
            addCriterion("u_username not between", value1, value2, "uUsername");
            return (Criteria) this;
        }

        public Criteria andUCodeIsNull() {
            addCriterion("u_code is null");
            return (Criteria) this;
        }

        public Criteria andUCodeIsNotNull() {
            addCriterion("u_code is not null");
            return (Criteria) this;
        }

        public Criteria andUCodeEqualTo(String value) {
            addCriterion("u_code =", value, "uCode");
            return (Criteria) this;
        }

        public Criteria andUCodeNotEqualTo(String value) {
            addCriterion("u_code <>", value, "uCode");
            return (Criteria) this;
        }

        public Criteria andUCodeGreaterThan(String value) {
            addCriterion("u_code >", value, "uCode");
            return (Criteria) this;
        }

        public Criteria andUCodeGreaterThanOrEqualTo(String value) {
            addCriterion("u_code >=", value, "uCode");
            return (Criteria) this;
        }

        public Criteria andUCodeLessThan(String value) {
            addCriterion("u_code <", value, "uCode");
            return (Criteria) this;
        }

        public Criteria andUCodeLessThanOrEqualTo(String value) {
            addCriterion("u_code <=", value, "uCode");
            return (Criteria) this;
        }

        public Criteria andUCodeLike(String value) {
            addCriterion("u_code like", value, "uCode");
            return (Criteria) this;
        }

        public Criteria andUCodeNotLike(String value) {
            addCriterion("u_code not like", value, "uCode");
            return (Criteria) this;
        }

        public Criteria andUCodeIn(List<String> values) {
            addCriterion("u_code in", values, "uCode");
            return (Criteria) this;
        }

        public Criteria andUCodeNotIn(List<String> values) {
            addCriterion("u_code not in", values, "uCode");
            return (Criteria) this;
        }

        public Criteria andUCodeBetween(String value1, String value2) {
            addCriterion("u_code between", value1, value2, "uCode");
            return (Criteria) this;
        }

        public Criteria andUCodeNotBetween(String value1, String value2) {
            addCriterion("u_code not between", value1, value2, "uCode");
            return (Criteria) this;
        }

        public Criteria andUPasswordIsNull() {
            addCriterion("u_password is null");
            return (Criteria) this;
        }

        public Criteria andUPasswordIsNotNull() {
            addCriterion("u_password is not null");
            return (Criteria) this;
        }

        public Criteria andUPasswordEqualTo(String value) {
            addCriterion("u_password =", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordNotEqualTo(String value) {
            addCriterion("u_password <>", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordGreaterThan(String value) {
            addCriterion("u_password >", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("u_password >=", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordLessThan(String value) {
            addCriterion("u_password <", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordLessThanOrEqualTo(String value) {
            addCriterion("u_password <=", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordLike(String value) {
            addCriterion("u_password like", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordNotLike(String value) {
            addCriterion("u_password not like", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordIn(List<String> values) {
            addCriterion("u_password in", values, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordNotIn(List<String> values) {
            addCriterion("u_password not in", values, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordBetween(String value1, String value2) {
            addCriterion("u_password between", value1, value2, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordNotBetween(String value1, String value2) {
            addCriterion("u_password not between", value1, value2, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPhoneIsNull() {
            addCriterion("u_phone is null");
            return (Criteria) this;
        }

        public Criteria andUPhoneIsNotNull() {
            addCriterion("u_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUPhoneEqualTo(String value) {
            addCriterion("u_phone =", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneNotEqualTo(String value) {
            addCriterion("u_phone <>", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneGreaterThan(String value) {
            addCriterion("u_phone >", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("u_phone >=", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneLessThan(String value) {
            addCriterion("u_phone <", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneLessThanOrEqualTo(String value) {
            addCriterion("u_phone <=", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneLike(String value) {
            addCriterion("u_phone like", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneNotLike(String value) {
            addCriterion("u_phone not like", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneIn(List<String> values) {
            addCriterion("u_phone in", values, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneNotIn(List<String> values) {
            addCriterion("u_phone not in", values, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneBetween(String value1, String value2) {
            addCriterion("u_phone between", value1, value2, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneNotBetween(String value1, String value2) {
            addCriterion("u_phone not between", value1, value2, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUCompanyIsNull() {
            addCriterion("u_company is null");
            return (Criteria) this;
        }

        public Criteria andUCompanyIsNotNull() {
            addCriterion("u_company is not null");
            return (Criteria) this;
        }

        public Criteria andUCompanyEqualTo(String value) {
            addCriterion("u_company =", value, "uCompany");
            return (Criteria) this;
        }

        public Criteria andUCompanyNotEqualTo(String value) {
            addCriterion("u_company <>", value, "uCompany");
            return (Criteria) this;
        }

        public Criteria andUCompanyGreaterThan(String value) {
            addCriterion("u_company >", value, "uCompany");
            return (Criteria) this;
        }

        public Criteria andUCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("u_company >=", value, "uCompany");
            return (Criteria) this;
        }

        public Criteria andUCompanyLessThan(String value) {
            addCriterion("u_company <", value, "uCompany");
            return (Criteria) this;
        }

        public Criteria andUCompanyLessThanOrEqualTo(String value) {
            addCriterion("u_company <=", value, "uCompany");
            return (Criteria) this;
        }

        public Criteria andUCompanyLike(String value) {
            addCriterion("u_company like", value, "uCompany");
            return (Criteria) this;
        }

        public Criteria andUCompanyNotLike(String value) {
            addCriterion("u_company not like", value, "uCompany");
            return (Criteria) this;
        }

        public Criteria andUCompanyIn(List<String> values) {
            addCriterion("u_company in", values, "uCompany");
            return (Criteria) this;
        }

        public Criteria andUCompanyNotIn(List<String> values) {
            addCriterion("u_company not in", values, "uCompany");
            return (Criteria) this;
        }

        public Criteria andUCompanyBetween(String value1, String value2) {
            addCriterion("u_company between", value1, value2, "uCompany");
            return (Criteria) this;
        }

        public Criteria andUCompanyNotBetween(String value1, String value2) {
            addCriterion("u_company not between", value1, value2, "uCompany");
            return (Criteria) this;
        }

        public Criteria andUPositionIsNull() {
            addCriterion("u_position is null");
            return (Criteria) this;
        }

        public Criteria andUPositionIsNotNull() {
            addCriterion("u_position is not null");
            return (Criteria) this;
        }

        public Criteria andUPositionEqualTo(String value) {
            addCriterion("u_position =", value, "uPosition");
            return (Criteria) this;
        }

        public Criteria andUPositionNotEqualTo(String value) {
            addCriterion("u_position <>", value, "uPosition");
            return (Criteria) this;
        }

        public Criteria andUPositionGreaterThan(String value) {
            addCriterion("u_position >", value, "uPosition");
            return (Criteria) this;
        }

        public Criteria andUPositionGreaterThanOrEqualTo(String value) {
            addCriterion("u_position >=", value, "uPosition");
            return (Criteria) this;
        }

        public Criteria andUPositionLessThan(String value) {
            addCriterion("u_position <", value, "uPosition");
            return (Criteria) this;
        }

        public Criteria andUPositionLessThanOrEqualTo(String value) {
            addCriterion("u_position <=", value, "uPosition");
            return (Criteria) this;
        }

        public Criteria andUPositionLike(String value) {
            addCriterion("u_position like", value, "uPosition");
            return (Criteria) this;
        }

        public Criteria andUPositionNotLike(String value) {
            addCriterion("u_position not like", value, "uPosition");
            return (Criteria) this;
        }

        public Criteria andUPositionIn(List<String> values) {
            addCriterion("u_position in", values, "uPosition");
            return (Criteria) this;
        }

        public Criteria andUPositionNotIn(List<String> values) {
            addCriterion("u_position not in", values, "uPosition");
            return (Criteria) this;
        }

        public Criteria andUPositionBetween(String value1, String value2) {
            addCriterion("u_position between", value1, value2, "uPosition");
            return (Criteria) this;
        }

        public Criteria andUPositionNotBetween(String value1, String value2) {
            addCriterion("u_position not between", value1, value2, "uPosition");
            return (Criteria) this;
        }

        public Criteria andUTimeStartIsNull() {
            addCriterion("u_time_start is null");
            return (Criteria) this;
        }

        public Criteria andUTimeStartIsNotNull() {
            addCriterion("u_time_start is not null");
            return (Criteria) this;
        }

        public Criteria andUTimeStartEqualTo(Long value) {
            addCriterion("u_time_start =", value, "uTimeStart");
            return (Criteria) this;
        }

        public Criteria andUTimeStartNotEqualTo(Long value) {
            addCriterion("u_time_start <>", value, "uTimeStart");
            return (Criteria) this;
        }

        public Criteria andUTimeStartGreaterThan(Long value) {
            addCriterion("u_time_start >", value, "uTimeStart");
            return (Criteria) this;
        }

        public Criteria andUTimeStartGreaterThanOrEqualTo(Long value) {
            addCriterion("u_time_start >=", value, "uTimeStart");
            return (Criteria) this;
        }

        public Criteria andUTimeStartLessThan(Long value) {
            addCriterion("u_time_start <", value, "uTimeStart");
            return (Criteria) this;
        }

        public Criteria andUTimeStartLessThanOrEqualTo(Long value) {
            addCriterion("u_time_start <=", value, "uTimeStart");
            return (Criteria) this;
        }

        public Criteria andUTimeStartIn(List<Long> values) {
            addCriterion("u_time_start in", values, "uTimeStart");
            return (Criteria) this;
        }

        public Criteria andUTimeStartNotIn(List<Long> values) {
            addCriterion("u_time_start not in", values, "uTimeStart");
            return (Criteria) this;
        }

        public Criteria andUTimeStartBetween(Long value1, Long value2) {
            addCriterion("u_time_start between", value1, value2, "uTimeStart");
            return (Criteria) this;
        }

        public Criteria andUTimeStartNotBetween(Long value1, Long value2) {
            addCriterion("u_time_start not between", value1, value2, "uTimeStart");
            return (Criteria) this;
        }

        public Criteria andUTimeEndIsNull() {
            addCriterion("u_time_end is null");
            return (Criteria) this;
        }

        public Criteria andUTimeEndIsNotNull() {
            addCriterion("u_time_end is not null");
            return (Criteria) this;
        }

        public Criteria andUTimeEndEqualTo(Long value) {
            addCriterion("u_time_end =", value, "uTimeEnd");
            return (Criteria) this;
        }

        public Criteria andUTimeEndNotEqualTo(Long value) {
            addCriterion("u_time_end <>", value, "uTimeEnd");
            return (Criteria) this;
        }

        public Criteria andUTimeEndGreaterThan(Long value) {
            addCriterion("u_time_end >", value, "uTimeEnd");
            return (Criteria) this;
        }

        public Criteria andUTimeEndGreaterThanOrEqualTo(Long value) {
            addCriterion("u_time_end >=", value, "uTimeEnd");
            return (Criteria) this;
        }

        public Criteria andUTimeEndLessThan(Long value) {
            addCriterion("u_time_end <", value, "uTimeEnd");
            return (Criteria) this;
        }

        public Criteria andUTimeEndLessThanOrEqualTo(Long value) {
            addCriterion("u_time_end <=", value, "uTimeEnd");
            return (Criteria) this;
        }

        public Criteria andUTimeEndIn(List<Long> values) {
            addCriterion("u_time_end in", values, "uTimeEnd");
            return (Criteria) this;
        }

        public Criteria andUTimeEndNotIn(List<Long> values) {
            addCriterion("u_time_end not in", values, "uTimeEnd");
            return (Criteria) this;
        }

        public Criteria andUTimeEndBetween(Long value1, Long value2) {
            addCriterion("u_time_end between", value1, value2, "uTimeEnd");
            return (Criteria) this;
        }

        public Criteria andUTimeEndNotBetween(Long value1, Long value2) {
            addCriterion("u_time_end not between", value1, value2, "uTimeEnd");
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