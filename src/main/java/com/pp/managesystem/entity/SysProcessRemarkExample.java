package com.pp.managesystem.entity;

import java.util.ArrayList;
import java.util.List;

public class SysProcessRemarkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysProcessRemarkExample() {
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

        public Criteria andPrrIdIsNull() {
            addCriterion("prr_id is null");
            return (Criteria) this;
        }

        public Criteria andPrrIdIsNotNull() {
            addCriterion("prr_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrrIdEqualTo(Integer value) {
            addCriterion("prr_id =", value, "prrId");
            return (Criteria) this;
        }

        public Criteria andPrrIdNotEqualTo(Integer value) {
            addCriterion("prr_id <>", value, "prrId");
            return (Criteria) this;
        }

        public Criteria andPrrIdGreaterThan(Integer value) {
            addCriterion("prr_id >", value, "prrId");
            return (Criteria) this;
        }

        public Criteria andPrrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prr_id >=", value, "prrId");
            return (Criteria) this;
        }

        public Criteria andPrrIdLessThan(Integer value) {
            addCriterion("prr_id <", value, "prrId");
            return (Criteria) this;
        }

        public Criteria andPrrIdLessThanOrEqualTo(Integer value) {
            addCriterion("prr_id <=", value, "prrId");
            return (Criteria) this;
        }

        public Criteria andPrrIdIn(List<Integer> values) {
            addCriterion("prr_id in", values, "prrId");
            return (Criteria) this;
        }

        public Criteria andPrrIdNotIn(List<Integer> values) {
            addCriterion("prr_id not in", values, "prrId");
            return (Criteria) this;
        }

        public Criteria andPrrIdBetween(Integer value1, Integer value2) {
            addCriterion("prr_id between", value1, value2, "prrId");
            return (Criteria) this;
        }

        public Criteria andPrrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prr_id not between", value1, value2, "prrId");
            return (Criteria) this;
        }

        public Criteria andPrrCompanyIsNull() {
            addCriterion("prr_company is null");
            return (Criteria) this;
        }

        public Criteria andPrrCompanyIsNotNull() {
            addCriterion("prr_company is not null");
            return (Criteria) this;
        }

        public Criteria andPrrCompanyEqualTo(String value) {
            addCriterion("prr_company =", value, "prrCompany");
            return (Criteria) this;
        }

        public Criteria andPrrCompanyNotEqualTo(String value) {
            addCriterion("prr_company <>", value, "prrCompany");
            return (Criteria) this;
        }

        public Criteria andPrrCompanyGreaterThan(String value) {
            addCriterion("prr_company >", value, "prrCompany");
            return (Criteria) this;
        }

        public Criteria andPrrCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("prr_company >=", value, "prrCompany");
            return (Criteria) this;
        }

        public Criteria andPrrCompanyLessThan(String value) {
            addCriterion("prr_company <", value, "prrCompany");
            return (Criteria) this;
        }

        public Criteria andPrrCompanyLessThanOrEqualTo(String value) {
            addCriterion("prr_company <=", value, "prrCompany");
            return (Criteria) this;
        }

        public Criteria andPrrCompanyLike(String value) {
            addCriterion("prr_company like", value, "prrCompany");
            return (Criteria) this;
        }

        public Criteria andPrrCompanyNotLike(String value) {
            addCriterion("prr_company not like", value, "prrCompany");
            return (Criteria) this;
        }

        public Criteria andPrrCompanyIn(List<String> values) {
            addCriterion("prr_company in", values, "prrCompany");
            return (Criteria) this;
        }

        public Criteria andPrrCompanyNotIn(List<String> values) {
            addCriterion("prr_company not in", values, "prrCompany");
            return (Criteria) this;
        }

        public Criteria andPrrCompanyBetween(String value1, String value2) {
            addCriterion("prr_company between", value1, value2, "prrCompany");
            return (Criteria) this;
        }

        public Criteria andPrrCompanyNotBetween(String value1, String value2) {
            addCriterion("prr_company not between", value1, value2, "prrCompany");
            return (Criteria) this;
        }

        public Criteria andPrrXIsNull() {
            addCriterion("prr_x is null");
            return (Criteria) this;
        }

        public Criteria andPrrXIsNotNull() {
            addCriterion("prr_x is not null");
            return (Criteria) this;
        }

        public Criteria andPrrXEqualTo(String value) {
            addCriterion("prr_x =", value, "prrX");
            return (Criteria) this;
        }

        public Criteria andPrrXNotEqualTo(String value) {
            addCriterion("prr_x <>", value, "prrX");
            return (Criteria) this;
        }

        public Criteria andPrrXGreaterThan(String value) {
            addCriterion("prr_x >", value, "prrX");
            return (Criteria) this;
        }

        public Criteria andPrrXGreaterThanOrEqualTo(String value) {
            addCriterion("prr_x >=", value, "prrX");
            return (Criteria) this;
        }

        public Criteria andPrrXLessThan(String value) {
            addCriterion("prr_x <", value, "prrX");
            return (Criteria) this;
        }

        public Criteria andPrrXLessThanOrEqualTo(String value) {
            addCriterion("prr_x <=", value, "prrX");
            return (Criteria) this;
        }

        public Criteria andPrrXLike(String value) {
            addCriterion("prr_x like", value, "prrX");
            return (Criteria) this;
        }

        public Criteria andPrrXNotLike(String value) {
            addCriterion("prr_x not like", value, "prrX");
            return (Criteria) this;
        }

        public Criteria andPrrXIn(List<String> values) {
            addCriterion("prr_x in", values, "prrX");
            return (Criteria) this;
        }

        public Criteria andPrrXNotIn(List<String> values) {
            addCriterion("prr_x not in", values, "prrX");
            return (Criteria) this;
        }

        public Criteria andPrrXBetween(String value1, String value2) {
            addCriterion("prr_x between", value1, value2, "prrX");
            return (Criteria) this;
        }

        public Criteria andPrrXNotBetween(String value1, String value2) {
            addCriterion("prr_x not between", value1, value2, "prrX");
            return (Criteria) this;
        }

        public Criteria andPrrRemarkIsNull() {
            addCriterion("prr_remark is null");
            return (Criteria) this;
        }

        public Criteria andPrrRemarkIsNotNull() {
            addCriterion("prr_remark is not null");
            return (Criteria) this;
        }

        public Criteria andPrrRemarkEqualTo(String value) {
            addCriterion("prr_remark =", value, "prrRemark");
            return (Criteria) this;
        }

        public Criteria andPrrRemarkNotEqualTo(String value) {
            addCriterion("prr_remark <>", value, "prrRemark");
            return (Criteria) this;
        }

        public Criteria andPrrRemarkGreaterThan(String value) {
            addCriterion("prr_remark >", value, "prrRemark");
            return (Criteria) this;
        }

        public Criteria andPrrRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("prr_remark >=", value, "prrRemark");
            return (Criteria) this;
        }

        public Criteria andPrrRemarkLessThan(String value) {
            addCriterion("prr_remark <", value, "prrRemark");
            return (Criteria) this;
        }

        public Criteria andPrrRemarkLessThanOrEqualTo(String value) {
            addCriterion("prr_remark <=", value, "prrRemark");
            return (Criteria) this;
        }

        public Criteria andPrrRemarkLike(String value) {
            addCriterion("prr_remark like", value, "prrRemark");
            return (Criteria) this;
        }

        public Criteria andPrrRemarkNotLike(String value) {
            addCriterion("prr_remark not like", value, "prrRemark");
            return (Criteria) this;
        }

        public Criteria andPrrRemarkIn(List<String> values) {
            addCriterion("prr_remark in", values, "prrRemark");
            return (Criteria) this;
        }

        public Criteria andPrrRemarkNotIn(List<String> values) {
            addCriterion("prr_remark not in", values, "prrRemark");
            return (Criteria) this;
        }

        public Criteria andPrrRemarkBetween(String value1, String value2) {
            addCriterion("prr_remark between", value1, value2, "prrRemark");
            return (Criteria) this;
        }

        public Criteria andPrrRemarkNotBetween(String value1, String value2) {
            addCriterion("prr_remark not between", value1, value2, "prrRemark");
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