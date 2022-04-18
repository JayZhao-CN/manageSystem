package com.pp.managesystem.entity;

import java.util.ArrayList;
import java.util.List;

public class SysProcessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysProcessExample() {
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

        public Criteria andPrcIdIsNull() {
            addCriterion("prc_id is null");
            return (Criteria) this;
        }

        public Criteria andPrcIdIsNotNull() {
            addCriterion("prc_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrcIdEqualTo(Integer value) {
            addCriterion("prc_id =", value, "prcId");
            return (Criteria) this;
        }

        public Criteria andPrcIdNotEqualTo(Integer value) {
            addCriterion("prc_id <>", value, "prcId");
            return (Criteria) this;
        }

        public Criteria andPrcIdGreaterThan(Integer value) {
            addCriterion("prc_id >", value, "prcId");
            return (Criteria) this;
        }

        public Criteria andPrcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prc_id >=", value, "prcId");
            return (Criteria) this;
        }

        public Criteria andPrcIdLessThan(Integer value) {
            addCriterion("prc_id <", value, "prcId");
            return (Criteria) this;
        }

        public Criteria andPrcIdLessThanOrEqualTo(Integer value) {
            addCriterion("prc_id <=", value, "prcId");
            return (Criteria) this;
        }

        public Criteria andPrcIdIn(List<Integer> values) {
            addCriterion("prc_id in", values, "prcId");
            return (Criteria) this;
        }

        public Criteria andPrcIdNotIn(List<Integer> values) {
            addCriterion("prc_id not in", values, "prcId");
            return (Criteria) this;
        }

        public Criteria andPrcIdBetween(Integer value1, Integer value2) {
            addCriterion("prc_id between", value1, value2, "prcId");
            return (Criteria) this;
        }

        public Criteria andPrcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prc_id not between", value1, value2, "prcId");
            return (Criteria) this;
        }

        public Criteria andPrcCodeIsNull() {
            addCriterion("prc_code is null");
            return (Criteria) this;
        }

        public Criteria andPrcCodeIsNotNull() {
            addCriterion("prc_code is not null");
            return (Criteria) this;
        }

        public Criteria andPrcCodeEqualTo(String value) {
            addCriterion("prc_code =", value, "prcCode");
            return (Criteria) this;
        }

        public Criteria andPrcCodeNotEqualTo(String value) {
            addCriterion("prc_code <>", value, "prcCode");
            return (Criteria) this;
        }

        public Criteria andPrcCodeGreaterThan(String value) {
            addCriterion("prc_code >", value, "prcCode");
            return (Criteria) this;
        }

        public Criteria andPrcCodeGreaterThanOrEqualTo(String value) {
            addCriterion("prc_code >=", value, "prcCode");
            return (Criteria) this;
        }

        public Criteria andPrcCodeLessThan(String value) {
            addCriterion("prc_code <", value, "prcCode");
            return (Criteria) this;
        }

        public Criteria andPrcCodeLessThanOrEqualTo(String value) {
            addCriterion("prc_code <=", value, "prcCode");
            return (Criteria) this;
        }

        public Criteria andPrcCodeLike(String value) {
            addCriterion("prc_code like", value, "prcCode");
            return (Criteria) this;
        }

        public Criteria andPrcCodeNotLike(String value) {
            addCriterion("prc_code not like", value, "prcCode");
            return (Criteria) this;
        }

        public Criteria andPrcCodeIn(List<String> values) {
            addCriterion("prc_code in", values, "prcCode");
            return (Criteria) this;
        }

        public Criteria andPrcCodeNotIn(List<String> values) {
            addCriterion("prc_code not in", values, "prcCode");
            return (Criteria) this;
        }

        public Criteria andPrcCodeBetween(String value1, String value2) {
            addCriterion("prc_code between", value1, value2, "prcCode");
            return (Criteria) this;
        }

        public Criteria andPrcCodeNotBetween(String value1, String value2) {
            addCriterion("prc_code not between", value1, value2, "prcCode");
            return (Criteria) this;
        }

        public Criteria andPrcNameIsNull() {
            addCriterion("prc_name is null");
            return (Criteria) this;
        }

        public Criteria andPrcNameIsNotNull() {
            addCriterion("prc_name is not null");
            return (Criteria) this;
        }

        public Criteria andPrcNameEqualTo(Integer value) {
            addCriterion("prc_name =", value, "prcName");
            return (Criteria) this;
        }

        public Criteria andPrcNameNotEqualTo(Integer value) {
            addCriterion("prc_name <>", value, "prcName");
            return (Criteria) this;
        }

        public Criteria andPrcNameGreaterThan(Integer value) {
            addCriterion("prc_name >", value, "prcName");
            return (Criteria) this;
        }

        public Criteria andPrcNameGreaterThanOrEqualTo(Integer value) {
            addCriterion("prc_name >=", value, "prcName");
            return (Criteria) this;
        }

        public Criteria andPrcNameLessThan(Integer value) {
            addCriterion("prc_name <", value, "prcName");
            return (Criteria) this;
        }

        public Criteria andPrcNameLessThanOrEqualTo(Integer value) {
            addCriterion("prc_name <=", value, "prcName");
            return (Criteria) this;
        }

        public Criteria andPrcNameIn(List<Integer> values) {
            addCriterion("prc_name in", values, "prcName");
            return (Criteria) this;
        }

        public Criteria andPrcNameNotIn(List<Integer> values) {
            addCriterion("prc_name not in", values, "prcName");
            return (Criteria) this;
        }

        public Criteria andPrcNameBetween(Integer value1, Integer value2) {
            addCriterion("prc_name between", value1, value2, "prcName");
            return (Criteria) this;
        }

        public Criteria andPrcNameNotBetween(Integer value1, Integer value2) {
            addCriterion("prc_name not between", value1, value2, "prcName");
            return (Criteria) this;
        }

        public Criteria andPrcCompanyIsNull() {
            addCriterion("prc_company is null");
            return (Criteria) this;
        }

        public Criteria andPrcCompanyIsNotNull() {
            addCriterion("prc_company is not null");
            return (Criteria) this;
        }

        public Criteria andPrcCompanyEqualTo(String value) {
            addCriterion("prc_company =", value, "prcCompany");
            return (Criteria) this;
        }

        public Criteria andPrcCompanyNotEqualTo(String value) {
            addCriterion("prc_company <>", value, "prcCompany");
            return (Criteria) this;
        }

        public Criteria andPrcCompanyGreaterThan(String value) {
            addCriterion("prc_company >", value, "prcCompany");
            return (Criteria) this;
        }

        public Criteria andPrcCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("prc_company >=", value, "prcCompany");
            return (Criteria) this;
        }

        public Criteria andPrcCompanyLessThan(String value) {
            addCriterion("prc_company <", value, "prcCompany");
            return (Criteria) this;
        }

        public Criteria andPrcCompanyLessThanOrEqualTo(String value) {
            addCriterion("prc_company <=", value, "prcCompany");
            return (Criteria) this;
        }

        public Criteria andPrcCompanyLike(String value) {
            addCriterion("prc_company like", value, "prcCompany");
            return (Criteria) this;
        }

        public Criteria andPrcCompanyNotLike(String value) {
            addCriterion("prc_company not like", value, "prcCompany");
            return (Criteria) this;
        }

        public Criteria andPrcCompanyIn(List<String> values) {
            addCriterion("prc_company in", values, "prcCompany");
            return (Criteria) this;
        }

        public Criteria andPrcCompanyNotIn(List<String> values) {
            addCriterion("prc_company not in", values, "prcCompany");
            return (Criteria) this;
        }

        public Criteria andPrcCompanyBetween(String value1, String value2) {
            addCriterion("prc_company between", value1, value2, "prcCompany");
            return (Criteria) this;
        }

        public Criteria andPrcCompanyNotBetween(String value1, String value2) {
            addCriterion("prc_company not between", value1, value2, "prcCompany");
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