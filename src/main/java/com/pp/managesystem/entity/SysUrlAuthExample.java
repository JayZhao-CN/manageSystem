package com.pp.managesystem.entity;

import java.util.ArrayList;
import java.util.List;

public class SysUrlAuthExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysUrlAuthExample() {
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

        public Criteria andUaIdIsNull() {
            addCriterion("ua_id is null");
            return (Criteria) this;
        }

        public Criteria andUaIdIsNotNull() {
            addCriterion("ua_id is not null");
            return (Criteria) this;
        }

        public Criteria andUaIdEqualTo(Integer value) {
            addCriterion("ua_id =", value, "uaId");
            return (Criteria) this;
        }

        public Criteria andUaIdNotEqualTo(Integer value) {
            addCriterion("ua_id <>", value, "uaId");
            return (Criteria) this;
        }

        public Criteria andUaIdGreaterThan(Integer value) {
            addCriterion("ua_id >", value, "uaId");
            return (Criteria) this;
        }

        public Criteria andUaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ua_id >=", value, "uaId");
            return (Criteria) this;
        }

        public Criteria andUaIdLessThan(Integer value) {
            addCriterion("ua_id <", value, "uaId");
            return (Criteria) this;
        }

        public Criteria andUaIdLessThanOrEqualTo(Integer value) {
            addCriterion("ua_id <=", value, "uaId");
            return (Criteria) this;
        }

        public Criteria andUaIdIn(List<Integer> values) {
            addCriterion("ua_id in", values, "uaId");
            return (Criteria) this;
        }

        public Criteria andUaIdNotIn(List<Integer> values) {
            addCriterion("ua_id not in", values, "uaId");
            return (Criteria) this;
        }

        public Criteria andUaIdBetween(Integer value1, Integer value2) {
            addCriterion("ua_id between", value1, value2, "uaId");
            return (Criteria) this;
        }

        public Criteria andUaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ua_id not between", value1, value2, "uaId");
            return (Criteria) this;
        }

        public Criteria andUaUrlIsNull() {
            addCriterion("ua_url is null");
            return (Criteria) this;
        }

        public Criteria andUaUrlIsNotNull() {
            addCriterion("ua_url is not null");
            return (Criteria) this;
        }

        public Criteria andUaUrlEqualTo(String value) {
            addCriterion("ua_url =", value, "uaUrl");
            return (Criteria) this;
        }

        public Criteria andUaUrlNotEqualTo(String value) {
            addCriterion("ua_url <>", value, "uaUrl");
            return (Criteria) this;
        }

        public Criteria andUaUrlGreaterThan(String value) {
            addCriterion("ua_url >", value, "uaUrl");
            return (Criteria) this;
        }

        public Criteria andUaUrlGreaterThanOrEqualTo(String value) {
            addCriterion("ua_url >=", value, "uaUrl");
            return (Criteria) this;
        }

        public Criteria andUaUrlLessThan(String value) {
            addCriterion("ua_url <", value, "uaUrl");
            return (Criteria) this;
        }

        public Criteria andUaUrlLessThanOrEqualTo(String value) {
            addCriterion("ua_url <=", value, "uaUrl");
            return (Criteria) this;
        }

        public Criteria andUaUrlLike(String value) {
            addCriterion("ua_url like", value, "uaUrl");
            return (Criteria) this;
        }

        public Criteria andUaUrlNotLike(String value) {
            addCriterion("ua_url not like", value, "uaUrl");
            return (Criteria) this;
        }

        public Criteria andUaUrlIn(List<String> values) {
            addCriterion("ua_url in", values, "uaUrl");
            return (Criteria) this;
        }

        public Criteria andUaUrlNotIn(List<String> values) {
            addCriterion("ua_url not in", values, "uaUrl");
            return (Criteria) this;
        }

        public Criteria andUaUrlBetween(String value1, String value2) {
            addCriterion("ua_url between", value1, value2, "uaUrl");
            return (Criteria) this;
        }

        public Criteria andUaUrlNotBetween(String value1, String value2) {
            addCriterion("ua_url not between", value1, value2, "uaUrl");
            return (Criteria) this;
        }

        public Criteria andUaAuthIsNull() {
            addCriterion("ua_auth is null");
            return (Criteria) this;
        }

        public Criteria andUaAuthIsNotNull() {
            addCriterion("ua_auth is not null");
            return (Criteria) this;
        }

        public Criteria andUaAuthEqualTo(String value) {
            addCriterion("ua_auth =", value, "uaAuth");
            return (Criteria) this;
        }

        public Criteria andUaAuthNotEqualTo(String value) {
            addCriterion("ua_auth <>", value, "uaAuth");
            return (Criteria) this;
        }

        public Criteria andUaAuthGreaterThan(String value) {
            addCriterion("ua_auth >", value, "uaAuth");
            return (Criteria) this;
        }

        public Criteria andUaAuthGreaterThanOrEqualTo(String value) {
            addCriterion("ua_auth >=", value, "uaAuth");
            return (Criteria) this;
        }

        public Criteria andUaAuthLessThan(String value) {
            addCriterion("ua_auth <", value, "uaAuth");
            return (Criteria) this;
        }

        public Criteria andUaAuthLessThanOrEqualTo(String value) {
            addCriterion("ua_auth <=", value, "uaAuth");
            return (Criteria) this;
        }

        public Criteria andUaAuthLike(String value) {
            addCriterion("ua_auth like", value, "uaAuth");
            return (Criteria) this;
        }

        public Criteria andUaAuthNotLike(String value) {
            addCriterion("ua_auth not like", value, "uaAuth");
            return (Criteria) this;
        }

        public Criteria andUaAuthIn(List<String> values) {
            addCriterion("ua_auth in", values, "uaAuth");
            return (Criteria) this;
        }

        public Criteria andUaAuthNotIn(List<String> values) {
            addCriterion("ua_auth not in", values, "uaAuth");
            return (Criteria) this;
        }

        public Criteria andUaAuthBetween(String value1, String value2) {
            addCriterion("ua_auth between", value1, value2, "uaAuth");
            return (Criteria) this;
        }

        public Criteria andUaAuthNotBetween(String value1, String value2) {
            addCriterion("ua_auth not between", value1, value2, "uaAuth");
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