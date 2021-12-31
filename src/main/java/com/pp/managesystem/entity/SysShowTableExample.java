package com.pp.managesystem.entity;

import java.util.ArrayList;
import java.util.List;

public class SysShowTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysShowTableExample() {
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

        public Criteria andStIdIsNull() {
            addCriterion("st_id is null");
            return (Criteria) this;
        }

        public Criteria andStIdIsNotNull() {
            addCriterion("st_id is not null");
            return (Criteria) this;
        }

        public Criteria andStIdEqualTo(Integer value) {
            addCriterion("st_id =", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdNotEqualTo(Integer value) {
            addCriterion("st_id <>", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdGreaterThan(Integer value) {
            addCriterion("st_id >", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("st_id >=", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdLessThan(Integer value) {
            addCriterion("st_id <", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdLessThanOrEqualTo(Integer value) {
            addCriterion("st_id <=", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdIn(List<Integer> values) {
            addCriterion("st_id in", values, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdNotIn(List<Integer> values) {
            addCriterion("st_id not in", values, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdBetween(Integer value1, Integer value2) {
            addCriterion("st_id between", value1, value2, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdNotBetween(Integer value1, Integer value2) {
            addCriterion("st_id not between", value1, value2, "stId");
            return (Criteria) this;
        }

        public Criteria andStTableIsNull() {
            addCriterion("st_table is null");
            return (Criteria) this;
        }

        public Criteria andStTableIsNotNull() {
            addCriterion("st_table is not null");
            return (Criteria) this;
        }

        public Criteria andStTableEqualTo(Integer value) {
            addCriterion("st_table =", value, "stTable");
            return (Criteria) this;
        }

        public Criteria andStTableNotEqualTo(Integer value) {
            addCriterion("st_table <>", value, "stTable");
            return (Criteria) this;
        }

        public Criteria andStTableGreaterThan(Integer value) {
            addCriterion("st_table >", value, "stTable");
            return (Criteria) this;
        }

        public Criteria andStTableGreaterThanOrEqualTo(Integer value) {
            addCriterion("st_table >=", value, "stTable");
            return (Criteria) this;
        }

        public Criteria andStTableLessThan(Integer value) {
            addCriterion("st_table <", value, "stTable");
            return (Criteria) this;
        }

        public Criteria andStTableLessThanOrEqualTo(Integer value) {
            addCriterion("st_table <=", value, "stTable");
            return (Criteria) this;
        }

        public Criteria andStTableIn(List<Integer> values) {
            addCriterion("st_table in", values, "stTable");
            return (Criteria) this;
        }

        public Criteria andStTableNotIn(List<Integer> values) {
            addCriterion("st_table not in", values, "stTable");
            return (Criteria) this;
        }

        public Criteria andStTableBetween(Integer value1, Integer value2) {
            addCriterion("st_table between", value1, value2, "stTable");
            return (Criteria) this;
        }

        public Criteria andStTableNotBetween(Integer value1, Integer value2) {
            addCriterion("st_table not between", value1, value2, "stTable");
            return (Criteria) this;
        }

        public Criteria andStColumnIsNull() {
            addCriterion("st_column is null");
            return (Criteria) this;
        }

        public Criteria andStColumnIsNotNull() {
            addCriterion("st_column is not null");
            return (Criteria) this;
        }

        public Criteria andStColumnEqualTo(String value) {
            addCriterion("st_column =", value, "stColumn");
            return (Criteria) this;
        }

        public Criteria andStColumnNotEqualTo(String value) {
            addCriterion("st_column <>", value, "stColumn");
            return (Criteria) this;
        }

        public Criteria andStColumnGreaterThan(String value) {
            addCriterion("st_column >", value, "stColumn");
            return (Criteria) this;
        }

        public Criteria andStColumnGreaterThanOrEqualTo(String value) {
            addCriterion("st_column >=", value, "stColumn");
            return (Criteria) this;
        }

        public Criteria andStColumnLessThan(String value) {
            addCriterion("st_column <", value, "stColumn");
            return (Criteria) this;
        }

        public Criteria andStColumnLessThanOrEqualTo(String value) {
            addCriterion("st_column <=", value, "stColumn");
            return (Criteria) this;
        }

        public Criteria andStColumnLike(String value) {
            addCriterion("st_column like", value, "stColumn");
            return (Criteria) this;
        }

        public Criteria andStColumnNotLike(String value) {
            addCriterion("st_column not like", value, "stColumn");
            return (Criteria) this;
        }

        public Criteria andStColumnIn(List<String> values) {
            addCriterion("st_column in", values, "stColumn");
            return (Criteria) this;
        }

        public Criteria andStColumnNotIn(List<String> values) {
            addCriterion("st_column not in", values, "stColumn");
            return (Criteria) this;
        }

        public Criteria andStColumnBetween(String value1, String value2) {
            addCriterion("st_column between", value1, value2, "stColumn");
            return (Criteria) this;
        }

        public Criteria andStColumnNotBetween(String value1, String value2) {
            addCriterion("st_column not between", value1, value2, "stColumn");
            return (Criteria) this;
        }

        public Criteria andStNameIsNull() {
            addCriterion("st_name is null");
            return (Criteria) this;
        }

        public Criteria andStNameIsNotNull() {
            addCriterion("st_name is not null");
            return (Criteria) this;
        }

        public Criteria andStNameEqualTo(String value) {
            addCriterion("st_name =", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameNotEqualTo(String value) {
            addCriterion("st_name <>", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameGreaterThan(String value) {
            addCriterion("st_name >", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameGreaterThanOrEqualTo(String value) {
            addCriterion("st_name >=", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameLessThan(String value) {
            addCriterion("st_name <", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameLessThanOrEqualTo(String value) {
            addCriterion("st_name <=", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameLike(String value) {
            addCriterion("st_name like", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameNotLike(String value) {
            addCriterion("st_name not like", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameIn(List<String> values) {
            addCriterion("st_name in", values, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameNotIn(List<String> values) {
            addCriterion("st_name not in", values, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameBetween(String value1, String value2) {
            addCriterion("st_name between", value1, value2, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameNotBetween(String value1, String value2) {
            addCriterion("st_name not between", value1, value2, "stName");
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