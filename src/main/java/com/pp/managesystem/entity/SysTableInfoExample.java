package com.pp.managesystem.entity;

import java.util.ArrayList;
import java.util.List;

public class SysTableInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysTableInfoExample() {
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

        public Criteria andTiIdIsNull() {
            addCriterion("ti_id is null");
            return (Criteria) this;
        }

        public Criteria andTiIdIsNotNull() {
            addCriterion("ti_id is not null");
            return (Criteria) this;
        }

        public Criteria andTiIdEqualTo(Integer value) {
            addCriterion("ti_id =", value, "tiId");
            return (Criteria) this;
        }

        public Criteria andTiIdNotEqualTo(Integer value) {
            addCriterion("ti_id <>", value, "tiId");
            return (Criteria) this;
        }

        public Criteria andTiIdGreaterThan(Integer value) {
            addCriterion("ti_id >", value, "tiId");
            return (Criteria) this;
        }

        public Criteria andTiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ti_id >=", value, "tiId");
            return (Criteria) this;
        }

        public Criteria andTiIdLessThan(Integer value) {
            addCriterion("ti_id <", value, "tiId");
            return (Criteria) this;
        }

        public Criteria andTiIdLessThanOrEqualTo(Integer value) {
            addCriterion("ti_id <=", value, "tiId");
            return (Criteria) this;
        }

        public Criteria andTiIdIn(List<Integer> values) {
            addCriterion("ti_id in", values, "tiId");
            return (Criteria) this;
        }

        public Criteria andTiIdNotIn(List<Integer> values) {
            addCriterion("ti_id not in", values, "tiId");
            return (Criteria) this;
        }

        public Criteria andTiIdBetween(Integer value1, Integer value2) {
            addCriterion("ti_id between", value1, value2, "tiId");
            return (Criteria) this;
        }

        public Criteria andTiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ti_id not between", value1, value2, "tiId");
            return (Criteria) this;
        }

        public Criteria andTiTableIsNull() {
            addCriterion("ti_table is null");
            return (Criteria) this;
        }

        public Criteria andTiTableIsNotNull() {
            addCriterion("ti_table is not null");
            return (Criteria) this;
        }

        public Criteria andTiTableEqualTo(String value) {
            addCriterion("ti_table =", value, "tiTable");
            return (Criteria) this;
        }

        public Criteria andTiTableNotEqualTo(String value) {
            addCriterion("ti_table <>", value, "tiTable");
            return (Criteria) this;
        }

        public Criteria andTiTableGreaterThan(String value) {
            addCriterion("ti_table >", value, "tiTable");
            return (Criteria) this;
        }

        public Criteria andTiTableGreaterThanOrEqualTo(String value) {
            addCriterion("ti_table >=", value, "tiTable");
            return (Criteria) this;
        }

        public Criteria andTiTableLessThan(String value) {
            addCriterion("ti_table <", value, "tiTable");
            return (Criteria) this;
        }

        public Criteria andTiTableLessThanOrEqualTo(String value) {
            addCriterion("ti_table <=", value, "tiTable");
            return (Criteria) this;
        }

        public Criteria andTiTableLike(String value) {
            addCriterion("ti_table like", value, "tiTable");
            return (Criteria) this;
        }

        public Criteria andTiTableNotLike(String value) {
            addCriterion("ti_table not like", value, "tiTable");
            return (Criteria) this;
        }

        public Criteria andTiTableIn(List<String> values) {
            addCriterion("ti_table in", values, "tiTable");
            return (Criteria) this;
        }

        public Criteria andTiTableNotIn(List<String> values) {
            addCriterion("ti_table not in", values, "tiTable");
            return (Criteria) this;
        }

        public Criteria andTiTableBetween(String value1, String value2) {
            addCriterion("ti_table between", value1, value2, "tiTable");
            return (Criteria) this;
        }

        public Criteria andTiTableNotBetween(String value1, String value2) {
            addCriterion("ti_table not between", value1, value2, "tiTable");
            return (Criteria) this;
        }

        public Criteria andTiNameIsNull() {
            addCriterion("ti_name is null");
            return (Criteria) this;
        }

        public Criteria andTiNameIsNotNull() {
            addCriterion("ti_name is not null");
            return (Criteria) this;
        }

        public Criteria andTiNameEqualTo(String value) {
            addCriterion("ti_name =", value, "tiName");
            return (Criteria) this;
        }

        public Criteria andTiNameNotEqualTo(String value) {
            addCriterion("ti_name <>", value, "tiName");
            return (Criteria) this;
        }

        public Criteria andTiNameGreaterThan(String value) {
            addCriterion("ti_name >", value, "tiName");
            return (Criteria) this;
        }

        public Criteria andTiNameGreaterThanOrEqualTo(String value) {
            addCriterion("ti_name >=", value, "tiName");
            return (Criteria) this;
        }

        public Criteria andTiNameLessThan(String value) {
            addCriterion("ti_name <", value, "tiName");
            return (Criteria) this;
        }

        public Criteria andTiNameLessThanOrEqualTo(String value) {
            addCriterion("ti_name <=", value, "tiName");
            return (Criteria) this;
        }

        public Criteria andTiNameLike(String value) {
            addCriterion("ti_name like", value, "tiName");
            return (Criteria) this;
        }

        public Criteria andTiNameNotLike(String value) {
            addCriterion("ti_name not like", value, "tiName");
            return (Criteria) this;
        }

        public Criteria andTiNameIn(List<String> values) {
            addCriterion("ti_name in", values, "tiName");
            return (Criteria) this;
        }

        public Criteria andTiNameNotIn(List<String> values) {
            addCriterion("ti_name not in", values, "tiName");
            return (Criteria) this;
        }

        public Criteria andTiNameBetween(String value1, String value2) {
            addCriterion("ti_name between", value1, value2, "tiName");
            return (Criteria) this;
        }

        public Criteria andTiNameNotBetween(String value1, String value2) {
            addCriterion("ti_name not between", value1, value2, "tiName");
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