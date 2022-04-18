package com.pp.managesystem.entity;

import java.util.ArrayList;
import java.util.List;

public class SysProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysProductExample() {
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

        public Criteria andPrIdIsNull() {
            addCriterion("pr_id is null");
            return (Criteria) this;
        }

        public Criteria andPrIdIsNotNull() {
            addCriterion("pr_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrIdEqualTo(Integer value) {
            addCriterion("pr_id =", value, "prId");
            return (Criteria) this;
        }

        public Criteria andPrIdNotEqualTo(Integer value) {
            addCriterion("pr_id <>", value, "prId");
            return (Criteria) this;
        }

        public Criteria andPrIdGreaterThan(Integer value) {
            addCriterion("pr_id >", value, "prId");
            return (Criteria) this;
        }

        public Criteria andPrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pr_id >=", value, "prId");
            return (Criteria) this;
        }

        public Criteria andPrIdLessThan(Integer value) {
            addCriterion("pr_id <", value, "prId");
            return (Criteria) this;
        }

        public Criteria andPrIdLessThanOrEqualTo(Integer value) {
            addCriterion("pr_id <=", value, "prId");
            return (Criteria) this;
        }

        public Criteria andPrIdIn(List<Integer> values) {
            addCriterion("pr_id in", values, "prId");
            return (Criteria) this;
        }

        public Criteria andPrIdNotIn(List<Integer> values) {
            addCriterion("pr_id not in", values, "prId");
            return (Criteria) this;
        }

        public Criteria andPrIdBetween(Integer value1, Integer value2) {
            addCriterion("pr_id between", value1, value2, "prId");
            return (Criteria) this;
        }

        public Criteria andPrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pr_id not between", value1, value2, "prId");
            return (Criteria) this;
        }

        public Criteria andPrCodeIsNull() {
            addCriterion("pr_code is null");
            return (Criteria) this;
        }

        public Criteria andPrCodeIsNotNull() {
            addCriterion("pr_code is not null");
            return (Criteria) this;
        }

        public Criteria andPrCodeEqualTo(String value) {
            addCriterion("pr_code =", value, "prCode");
            return (Criteria) this;
        }

        public Criteria andPrCodeNotEqualTo(String value) {
            addCriterion("pr_code <>", value, "prCode");
            return (Criteria) this;
        }

        public Criteria andPrCodeGreaterThan(String value) {
            addCriterion("pr_code >", value, "prCode");
            return (Criteria) this;
        }

        public Criteria andPrCodeGreaterThanOrEqualTo(String value) {
            addCriterion("pr_code >=", value, "prCode");
            return (Criteria) this;
        }

        public Criteria andPrCodeLessThan(String value) {
            addCriterion("pr_code <", value, "prCode");
            return (Criteria) this;
        }

        public Criteria andPrCodeLessThanOrEqualTo(String value) {
            addCriterion("pr_code <=", value, "prCode");
            return (Criteria) this;
        }

        public Criteria andPrCodeLike(String value) {
            addCriterion("pr_code like", value, "prCode");
            return (Criteria) this;
        }

        public Criteria andPrCodeNotLike(String value) {
            addCriterion("pr_code not like", value, "prCode");
            return (Criteria) this;
        }

        public Criteria andPrCodeIn(List<String> values) {
            addCriterion("pr_code in", values, "prCode");
            return (Criteria) this;
        }

        public Criteria andPrCodeNotIn(List<String> values) {
            addCriterion("pr_code not in", values, "prCode");
            return (Criteria) this;
        }

        public Criteria andPrCodeBetween(String value1, String value2) {
            addCriterion("pr_code between", value1, value2, "prCode");
            return (Criteria) this;
        }

        public Criteria andPrCodeNotBetween(String value1, String value2) {
            addCriterion("pr_code not between", value1, value2, "prCode");
            return (Criteria) this;
        }

        public Criteria andPrCompanyIsNull() {
            addCriterion("pr_company is null");
            return (Criteria) this;
        }

        public Criteria andPrCompanyIsNotNull() {
            addCriterion("pr_company is not null");
            return (Criteria) this;
        }

        public Criteria andPrCompanyEqualTo(String value) {
            addCriterion("pr_company =", value, "prCompany");
            return (Criteria) this;
        }

        public Criteria andPrCompanyNotEqualTo(String value) {
            addCriterion("pr_company <>", value, "prCompany");
            return (Criteria) this;
        }

        public Criteria andPrCompanyGreaterThan(String value) {
            addCriterion("pr_company >", value, "prCompany");
            return (Criteria) this;
        }

        public Criteria andPrCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("pr_company >=", value, "prCompany");
            return (Criteria) this;
        }

        public Criteria andPrCompanyLessThan(String value) {
            addCriterion("pr_company <", value, "prCompany");
            return (Criteria) this;
        }

        public Criteria andPrCompanyLessThanOrEqualTo(String value) {
            addCriterion("pr_company <=", value, "prCompany");
            return (Criteria) this;
        }

        public Criteria andPrCompanyLike(String value) {
            addCriterion("pr_company like", value, "prCompany");
            return (Criteria) this;
        }

        public Criteria andPrCompanyNotLike(String value) {
            addCriterion("pr_company not like", value, "prCompany");
            return (Criteria) this;
        }

        public Criteria andPrCompanyIn(List<String> values) {
            addCriterion("pr_company in", values, "prCompany");
            return (Criteria) this;
        }

        public Criteria andPrCompanyNotIn(List<String> values) {
            addCriterion("pr_company not in", values, "prCompany");
            return (Criteria) this;
        }

        public Criteria andPrCompanyBetween(String value1, String value2) {
            addCriterion("pr_company between", value1, value2, "prCompany");
            return (Criteria) this;
        }

        public Criteria andPrCompanyNotBetween(String value1, String value2) {
            addCriterion("pr_company not between", value1, value2, "prCompany");
            return (Criteria) this;
        }

        public Criteria andPrBatchIsNull() {
            addCriterion("pr_batch is null");
            return (Criteria) this;
        }

        public Criteria andPrBatchIsNotNull() {
            addCriterion("pr_batch is not null");
            return (Criteria) this;
        }

        public Criteria andPrBatchEqualTo(String value) {
            addCriterion("pr_batch =", value, "prBatch");
            return (Criteria) this;
        }

        public Criteria andPrBatchNotEqualTo(String value) {
            addCriterion("pr_batch <>", value, "prBatch");
            return (Criteria) this;
        }

        public Criteria andPrBatchGreaterThan(String value) {
            addCriterion("pr_batch >", value, "prBatch");
            return (Criteria) this;
        }

        public Criteria andPrBatchGreaterThanOrEqualTo(String value) {
            addCriterion("pr_batch >=", value, "prBatch");
            return (Criteria) this;
        }

        public Criteria andPrBatchLessThan(String value) {
            addCriterion("pr_batch <", value, "prBatch");
            return (Criteria) this;
        }

        public Criteria andPrBatchLessThanOrEqualTo(String value) {
            addCriterion("pr_batch <=", value, "prBatch");
            return (Criteria) this;
        }

        public Criteria andPrBatchLike(String value) {
            addCriterion("pr_batch like", value, "prBatch");
            return (Criteria) this;
        }

        public Criteria andPrBatchNotLike(String value) {
            addCriterion("pr_batch not like", value, "prBatch");
            return (Criteria) this;
        }

        public Criteria andPrBatchIn(List<String> values) {
            addCriterion("pr_batch in", values, "prBatch");
            return (Criteria) this;
        }

        public Criteria andPrBatchNotIn(List<String> values) {
            addCriterion("pr_batch not in", values, "prBatch");
            return (Criteria) this;
        }

        public Criteria andPrBatchBetween(String value1, String value2) {
            addCriterion("pr_batch between", value1, value2, "prBatch");
            return (Criteria) this;
        }

        public Criteria andPrBatchNotBetween(String value1, String value2) {
            addCriterion("pr_batch not between", value1, value2, "prBatch");
            return (Criteria) this;
        }

        public Criteria andPrProcessIsNull() {
            addCriterion("pr_process is null");
            return (Criteria) this;
        }

        public Criteria andPrProcessIsNotNull() {
            addCriterion("pr_process is not null");
            return (Criteria) this;
        }

        public Criteria andPrProcessEqualTo(String value) {
            addCriterion("pr_process =", value, "prProcess");
            return (Criteria) this;
        }

        public Criteria andPrProcessNotEqualTo(String value) {
            addCriterion("pr_process <>", value, "prProcess");
            return (Criteria) this;
        }

        public Criteria andPrProcessGreaterThan(String value) {
            addCriterion("pr_process >", value, "prProcess");
            return (Criteria) this;
        }

        public Criteria andPrProcessGreaterThanOrEqualTo(String value) {
            addCriterion("pr_process >=", value, "prProcess");
            return (Criteria) this;
        }

        public Criteria andPrProcessLessThan(String value) {
            addCriterion("pr_process <", value, "prProcess");
            return (Criteria) this;
        }

        public Criteria andPrProcessLessThanOrEqualTo(String value) {
            addCriterion("pr_process <=", value, "prProcess");
            return (Criteria) this;
        }

        public Criteria andPrProcessLike(String value) {
            addCriterion("pr_process like", value, "prProcess");
            return (Criteria) this;
        }

        public Criteria andPrProcessNotLike(String value) {
            addCriterion("pr_process not like", value, "prProcess");
            return (Criteria) this;
        }

        public Criteria andPrProcessIn(List<String> values) {
            addCriterion("pr_process in", values, "prProcess");
            return (Criteria) this;
        }

        public Criteria andPrProcessNotIn(List<String> values) {
            addCriterion("pr_process not in", values, "prProcess");
            return (Criteria) this;
        }

        public Criteria andPrProcessBetween(String value1, String value2) {
            addCriterion("pr_process between", value1, value2, "prProcess");
            return (Criteria) this;
        }

        public Criteria andPrProcessNotBetween(String value1, String value2) {
            addCriterion("pr_process not between", value1, value2, "prProcess");
            return (Criteria) this;
        }

        public Criteria andPrProductorIsNull() {
            addCriterion("pr_productor is null");
            return (Criteria) this;
        }

        public Criteria andPrProductorIsNotNull() {
            addCriterion("pr_productor is not null");
            return (Criteria) this;
        }

        public Criteria andPrProductorEqualTo(String value) {
            addCriterion("pr_productor =", value, "prProductor");
            return (Criteria) this;
        }

        public Criteria andPrProductorNotEqualTo(String value) {
            addCriterion("pr_productor <>", value, "prProductor");
            return (Criteria) this;
        }

        public Criteria andPrProductorGreaterThan(String value) {
            addCriterion("pr_productor >", value, "prProductor");
            return (Criteria) this;
        }

        public Criteria andPrProductorGreaterThanOrEqualTo(String value) {
            addCriterion("pr_productor >=", value, "prProductor");
            return (Criteria) this;
        }

        public Criteria andPrProductorLessThan(String value) {
            addCriterion("pr_productor <", value, "prProductor");
            return (Criteria) this;
        }

        public Criteria andPrProductorLessThanOrEqualTo(String value) {
            addCriterion("pr_productor <=", value, "prProductor");
            return (Criteria) this;
        }

        public Criteria andPrProductorLike(String value) {
            addCriterion("pr_productor like", value, "prProductor");
            return (Criteria) this;
        }

        public Criteria andPrProductorNotLike(String value) {
            addCriterion("pr_productor not like", value, "prProductor");
            return (Criteria) this;
        }

        public Criteria andPrProductorIn(List<String> values) {
            addCriterion("pr_productor in", values, "prProductor");
            return (Criteria) this;
        }

        public Criteria andPrProductorNotIn(List<String> values) {
            addCriterion("pr_productor not in", values, "prProductor");
            return (Criteria) this;
        }

        public Criteria andPrProductorBetween(String value1, String value2) {
            addCriterion("pr_productor between", value1, value2, "prProductor");
            return (Criteria) this;
        }

        public Criteria andPrProductorNotBetween(String value1, String value2) {
            addCriterion("pr_productor not between", value1, value2, "prProductor");
            return (Criteria) this;
        }

        public Criteria andPrCountIsNull() {
            addCriterion("pr_count is null");
            return (Criteria) this;
        }

        public Criteria andPrCountIsNotNull() {
            addCriterion("pr_count is not null");
            return (Criteria) this;
        }

        public Criteria andPrCountEqualTo(Integer value) {
            addCriterion("pr_count =", value, "prCount");
            return (Criteria) this;
        }

        public Criteria andPrCountNotEqualTo(Integer value) {
            addCriterion("pr_count <>", value, "prCount");
            return (Criteria) this;
        }

        public Criteria andPrCountGreaterThan(Integer value) {
            addCriterion("pr_count >", value, "prCount");
            return (Criteria) this;
        }

        public Criteria andPrCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("pr_count >=", value, "prCount");
            return (Criteria) this;
        }

        public Criteria andPrCountLessThan(Integer value) {
            addCriterion("pr_count <", value, "prCount");
            return (Criteria) this;
        }

        public Criteria andPrCountLessThanOrEqualTo(Integer value) {
            addCriterion("pr_count <=", value, "prCount");
            return (Criteria) this;
        }

        public Criteria andPrCountIn(List<Integer> values) {
            addCriterion("pr_count in", values, "prCount");
            return (Criteria) this;
        }

        public Criteria andPrCountNotIn(List<Integer> values) {
            addCriterion("pr_count not in", values, "prCount");
            return (Criteria) this;
        }

        public Criteria andPrCountBetween(Integer value1, Integer value2) {
            addCriterion("pr_count between", value1, value2, "prCount");
            return (Criteria) this;
        }

        public Criteria andPrCountNotBetween(Integer value1, Integer value2) {
            addCriterion("pr_count not between", value1, value2, "prCount");
            return (Criteria) this;
        }

        public Criteria andPrRemarkIsNull() {
            addCriterion("pr_remark is null");
            return (Criteria) this;
        }

        public Criteria andPrRemarkIsNotNull() {
            addCriterion("pr_remark is not null");
            return (Criteria) this;
        }

        public Criteria andPrRemarkEqualTo(String value) {
            addCriterion("pr_remark =", value, "prRemark");
            return (Criteria) this;
        }

        public Criteria andPrRemarkNotEqualTo(String value) {
            addCriterion("pr_remark <>", value, "prRemark");
            return (Criteria) this;
        }

        public Criteria andPrRemarkGreaterThan(String value) {
            addCriterion("pr_remark >", value, "prRemark");
            return (Criteria) this;
        }

        public Criteria andPrRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("pr_remark >=", value, "prRemark");
            return (Criteria) this;
        }

        public Criteria andPrRemarkLessThan(String value) {
            addCriterion("pr_remark <", value, "prRemark");
            return (Criteria) this;
        }

        public Criteria andPrRemarkLessThanOrEqualTo(String value) {
            addCriterion("pr_remark <=", value, "prRemark");
            return (Criteria) this;
        }

        public Criteria andPrRemarkLike(String value) {
            addCriterion("pr_remark like", value, "prRemark");
            return (Criteria) this;
        }

        public Criteria andPrRemarkNotLike(String value) {
            addCriterion("pr_remark not like", value, "prRemark");
            return (Criteria) this;
        }

        public Criteria andPrRemarkIn(List<String> values) {
            addCriterion("pr_remark in", values, "prRemark");
            return (Criteria) this;
        }

        public Criteria andPrRemarkNotIn(List<String> values) {
            addCriterion("pr_remark not in", values, "prRemark");
            return (Criteria) this;
        }

        public Criteria andPrRemarkBetween(String value1, String value2) {
            addCriterion("pr_remark between", value1, value2, "prRemark");
            return (Criteria) this;
        }

        public Criteria andPrRemarkNotBetween(String value1, String value2) {
            addCriterion("pr_remark not between", value1, value2, "prRemark");
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