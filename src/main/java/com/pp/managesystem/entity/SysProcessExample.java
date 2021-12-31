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

        public Criteria andPrcAIsNull() {
            addCriterion("prc_a is null");
            return (Criteria) this;
        }

        public Criteria andPrcAIsNotNull() {
            addCriterion("prc_a is not null");
            return (Criteria) this;
        }

        public Criteria andPrcAEqualTo(String value) {
            addCriterion("prc_a =", value, "prcA");
            return (Criteria) this;
        }

        public Criteria andPrcANotEqualTo(String value) {
            addCriterion("prc_a <>", value, "prcA");
            return (Criteria) this;
        }

        public Criteria andPrcAGreaterThan(String value) {
            addCriterion("prc_a >", value, "prcA");
            return (Criteria) this;
        }

        public Criteria andPrcAGreaterThanOrEqualTo(String value) {
            addCriterion("prc_a >=", value, "prcA");
            return (Criteria) this;
        }

        public Criteria andPrcALessThan(String value) {
            addCriterion("prc_a <", value, "prcA");
            return (Criteria) this;
        }

        public Criteria andPrcALessThanOrEqualTo(String value) {
            addCriterion("prc_a <=", value, "prcA");
            return (Criteria) this;
        }

        public Criteria andPrcALike(String value) {
            addCriterion("prc_a like", value, "prcA");
            return (Criteria) this;
        }

        public Criteria andPrcANotLike(String value) {
            addCriterion("prc_a not like", value, "prcA");
            return (Criteria) this;
        }

        public Criteria andPrcAIn(List<String> values) {
            addCriterion("prc_a in", values, "prcA");
            return (Criteria) this;
        }

        public Criteria andPrcANotIn(List<String> values) {
            addCriterion("prc_a not in", values, "prcA");
            return (Criteria) this;
        }

        public Criteria andPrcABetween(String value1, String value2) {
            addCriterion("prc_a between", value1, value2, "prcA");
            return (Criteria) this;
        }

        public Criteria andPrcANotBetween(String value1, String value2) {
            addCriterion("prc_a not between", value1, value2, "prcA");
            return (Criteria) this;
        }

        public Criteria andPrcAtIsNull() {
            addCriterion("prc_at is null");
            return (Criteria) this;
        }

        public Criteria andPrcAtIsNotNull() {
            addCriterion("prc_at is not null");
            return (Criteria) this;
        }

        public Criteria andPrcAtEqualTo(Long value) {
            addCriterion("prc_at =", value, "prcAt");
            return (Criteria) this;
        }

        public Criteria andPrcAtNotEqualTo(Long value) {
            addCriterion("prc_at <>", value, "prcAt");
            return (Criteria) this;
        }

        public Criteria andPrcAtGreaterThan(Long value) {
            addCriterion("prc_at >", value, "prcAt");
            return (Criteria) this;
        }

        public Criteria andPrcAtGreaterThanOrEqualTo(Long value) {
            addCriterion("prc_at >=", value, "prcAt");
            return (Criteria) this;
        }

        public Criteria andPrcAtLessThan(Long value) {
            addCriterion("prc_at <", value, "prcAt");
            return (Criteria) this;
        }

        public Criteria andPrcAtLessThanOrEqualTo(Long value) {
            addCriterion("prc_at <=", value, "prcAt");
            return (Criteria) this;
        }

        public Criteria andPrcAtIn(List<Long> values) {
            addCriterion("prc_at in", values, "prcAt");
            return (Criteria) this;
        }

        public Criteria andPrcAtNotIn(List<Long> values) {
            addCriterion("prc_at not in", values, "prcAt");
            return (Criteria) this;
        }

        public Criteria andPrcAtBetween(Long value1, Long value2) {
            addCriterion("prc_at between", value1, value2, "prcAt");
            return (Criteria) this;
        }

        public Criteria andPrcAtNotBetween(Long value1, Long value2) {
            addCriterion("prc_at not between", value1, value2, "prcAt");
            return (Criteria) this;
        }

        public Criteria andPrcArIsNull() {
            addCriterion("prc_ar is null");
            return (Criteria) this;
        }

        public Criteria andPrcArIsNotNull() {
            addCriterion("prc_ar is not null");
            return (Criteria) this;
        }

        public Criteria andPrcArEqualTo(String value) {
            addCriterion("prc_ar =", value, "prcAr");
            return (Criteria) this;
        }

        public Criteria andPrcArNotEqualTo(String value) {
            addCriterion("prc_ar <>", value, "prcAr");
            return (Criteria) this;
        }

        public Criteria andPrcArGreaterThan(String value) {
            addCriterion("prc_ar >", value, "prcAr");
            return (Criteria) this;
        }

        public Criteria andPrcArGreaterThanOrEqualTo(String value) {
            addCriterion("prc_ar >=", value, "prcAr");
            return (Criteria) this;
        }

        public Criteria andPrcArLessThan(String value) {
            addCriterion("prc_ar <", value, "prcAr");
            return (Criteria) this;
        }

        public Criteria andPrcArLessThanOrEqualTo(String value) {
            addCriterion("prc_ar <=", value, "prcAr");
            return (Criteria) this;
        }

        public Criteria andPrcArLike(String value) {
            addCriterion("prc_ar like", value, "prcAr");
            return (Criteria) this;
        }

        public Criteria andPrcArNotLike(String value) {
            addCriterion("prc_ar not like", value, "prcAr");
            return (Criteria) this;
        }

        public Criteria andPrcArIn(List<String> values) {
            addCriterion("prc_ar in", values, "prcAr");
            return (Criteria) this;
        }

        public Criteria andPrcArNotIn(List<String> values) {
            addCriterion("prc_ar not in", values, "prcAr");
            return (Criteria) this;
        }

        public Criteria andPrcArBetween(String value1, String value2) {
            addCriterion("prc_ar between", value1, value2, "prcAr");
            return (Criteria) this;
        }

        public Criteria andPrcArNotBetween(String value1, String value2) {
            addCriterion("prc_ar not between", value1, value2, "prcAr");
            return (Criteria) this;
        }

        public Criteria andPrcBIsNull() {
            addCriterion("prc_b is null");
            return (Criteria) this;
        }

        public Criteria andPrcBIsNotNull() {
            addCriterion("prc_b is not null");
            return (Criteria) this;
        }

        public Criteria andPrcBEqualTo(String value) {
            addCriterion("prc_b =", value, "prcB");
            return (Criteria) this;
        }

        public Criteria andPrcBNotEqualTo(String value) {
            addCriterion("prc_b <>", value, "prcB");
            return (Criteria) this;
        }

        public Criteria andPrcBGreaterThan(String value) {
            addCriterion("prc_b >", value, "prcB");
            return (Criteria) this;
        }

        public Criteria andPrcBGreaterThanOrEqualTo(String value) {
            addCriterion("prc_b >=", value, "prcB");
            return (Criteria) this;
        }

        public Criteria andPrcBLessThan(String value) {
            addCriterion("prc_b <", value, "prcB");
            return (Criteria) this;
        }

        public Criteria andPrcBLessThanOrEqualTo(String value) {
            addCriterion("prc_b <=", value, "prcB");
            return (Criteria) this;
        }

        public Criteria andPrcBLike(String value) {
            addCriterion("prc_b like", value, "prcB");
            return (Criteria) this;
        }

        public Criteria andPrcBNotLike(String value) {
            addCriterion("prc_b not like", value, "prcB");
            return (Criteria) this;
        }

        public Criteria andPrcBIn(List<String> values) {
            addCriterion("prc_b in", values, "prcB");
            return (Criteria) this;
        }

        public Criteria andPrcBNotIn(List<String> values) {
            addCriterion("prc_b not in", values, "prcB");
            return (Criteria) this;
        }

        public Criteria andPrcBBetween(String value1, String value2) {
            addCriterion("prc_b between", value1, value2, "prcB");
            return (Criteria) this;
        }

        public Criteria andPrcBNotBetween(String value1, String value2) {
            addCriterion("prc_b not between", value1, value2, "prcB");
            return (Criteria) this;
        }

        public Criteria andPrcBtIsNull() {
            addCriterion("prc_bt is null");
            return (Criteria) this;
        }

        public Criteria andPrcBtIsNotNull() {
            addCriterion("prc_bt is not null");
            return (Criteria) this;
        }

        public Criteria andPrcBtEqualTo(Long value) {
            addCriterion("prc_bt =", value, "prcBt");
            return (Criteria) this;
        }

        public Criteria andPrcBtNotEqualTo(Long value) {
            addCriterion("prc_bt <>", value, "prcBt");
            return (Criteria) this;
        }

        public Criteria andPrcBtGreaterThan(Long value) {
            addCriterion("prc_bt >", value, "prcBt");
            return (Criteria) this;
        }

        public Criteria andPrcBtGreaterThanOrEqualTo(Long value) {
            addCriterion("prc_bt >=", value, "prcBt");
            return (Criteria) this;
        }

        public Criteria andPrcBtLessThan(Long value) {
            addCriterion("prc_bt <", value, "prcBt");
            return (Criteria) this;
        }

        public Criteria andPrcBtLessThanOrEqualTo(Long value) {
            addCriterion("prc_bt <=", value, "prcBt");
            return (Criteria) this;
        }

        public Criteria andPrcBtIn(List<Long> values) {
            addCriterion("prc_bt in", values, "prcBt");
            return (Criteria) this;
        }

        public Criteria andPrcBtNotIn(List<Long> values) {
            addCriterion("prc_bt not in", values, "prcBt");
            return (Criteria) this;
        }

        public Criteria andPrcBtBetween(Long value1, Long value2) {
            addCriterion("prc_bt between", value1, value2, "prcBt");
            return (Criteria) this;
        }

        public Criteria andPrcBtNotBetween(Long value1, Long value2) {
            addCriterion("prc_bt not between", value1, value2, "prcBt");
            return (Criteria) this;
        }

        public Criteria andPrcBrIsNull() {
            addCriterion("prc_br is null");
            return (Criteria) this;
        }

        public Criteria andPrcBrIsNotNull() {
            addCriterion("prc_br is not null");
            return (Criteria) this;
        }

        public Criteria andPrcBrEqualTo(String value) {
            addCriterion("prc_br =", value, "prcBr");
            return (Criteria) this;
        }

        public Criteria andPrcBrNotEqualTo(String value) {
            addCriterion("prc_br <>", value, "prcBr");
            return (Criteria) this;
        }

        public Criteria andPrcBrGreaterThan(String value) {
            addCriterion("prc_br >", value, "prcBr");
            return (Criteria) this;
        }

        public Criteria andPrcBrGreaterThanOrEqualTo(String value) {
            addCriterion("prc_br >=", value, "prcBr");
            return (Criteria) this;
        }

        public Criteria andPrcBrLessThan(String value) {
            addCriterion("prc_br <", value, "prcBr");
            return (Criteria) this;
        }

        public Criteria andPrcBrLessThanOrEqualTo(String value) {
            addCriterion("prc_br <=", value, "prcBr");
            return (Criteria) this;
        }

        public Criteria andPrcBrLike(String value) {
            addCriterion("prc_br like", value, "prcBr");
            return (Criteria) this;
        }

        public Criteria andPrcBrNotLike(String value) {
            addCriterion("prc_br not like", value, "prcBr");
            return (Criteria) this;
        }

        public Criteria andPrcBrIn(List<String> values) {
            addCriterion("prc_br in", values, "prcBr");
            return (Criteria) this;
        }

        public Criteria andPrcBrNotIn(List<String> values) {
            addCriterion("prc_br not in", values, "prcBr");
            return (Criteria) this;
        }

        public Criteria andPrcBrBetween(String value1, String value2) {
            addCriterion("prc_br between", value1, value2, "prcBr");
            return (Criteria) this;
        }

        public Criteria andPrcBrNotBetween(String value1, String value2) {
            addCriterion("prc_br not between", value1, value2, "prcBr");
            return (Criteria) this;
        }

        public Criteria andPrcCIsNull() {
            addCriterion("prc_c is null");
            return (Criteria) this;
        }

        public Criteria andPrcCIsNotNull() {
            addCriterion("prc_c is not null");
            return (Criteria) this;
        }

        public Criteria andPrcCEqualTo(String value) {
            addCriterion("prc_c =", value, "prcC");
            return (Criteria) this;
        }

        public Criteria andPrcCNotEqualTo(String value) {
            addCriterion("prc_c <>", value, "prcC");
            return (Criteria) this;
        }

        public Criteria andPrcCGreaterThan(String value) {
            addCriterion("prc_c >", value, "prcC");
            return (Criteria) this;
        }

        public Criteria andPrcCGreaterThanOrEqualTo(String value) {
            addCriterion("prc_c >=", value, "prcC");
            return (Criteria) this;
        }

        public Criteria andPrcCLessThan(String value) {
            addCriterion("prc_c <", value, "prcC");
            return (Criteria) this;
        }

        public Criteria andPrcCLessThanOrEqualTo(String value) {
            addCriterion("prc_c <=", value, "prcC");
            return (Criteria) this;
        }

        public Criteria andPrcCLike(String value) {
            addCriterion("prc_c like", value, "prcC");
            return (Criteria) this;
        }

        public Criteria andPrcCNotLike(String value) {
            addCriterion("prc_c not like", value, "prcC");
            return (Criteria) this;
        }

        public Criteria andPrcCIn(List<String> values) {
            addCriterion("prc_c in", values, "prcC");
            return (Criteria) this;
        }

        public Criteria andPrcCNotIn(List<String> values) {
            addCriterion("prc_c not in", values, "prcC");
            return (Criteria) this;
        }

        public Criteria andPrcCBetween(String value1, String value2) {
            addCriterion("prc_c between", value1, value2, "prcC");
            return (Criteria) this;
        }

        public Criteria andPrcCNotBetween(String value1, String value2) {
            addCriterion("prc_c not between", value1, value2, "prcC");
            return (Criteria) this;
        }

        public Criteria andPrcCtIsNull() {
            addCriterion("prc_ct is null");
            return (Criteria) this;
        }

        public Criteria andPrcCtIsNotNull() {
            addCriterion("prc_ct is not null");
            return (Criteria) this;
        }

        public Criteria andPrcCtEqualTo(Long value) {
            addCriterion("prc_ct =", value, "prcCt");
            return (Criteria) this;
        }

        public Criteria andPrcCtNotEqualTo(Long value) {
            addCriterion("prc_ct <>", value, "prcCt");
            return (Criteria) this;
        }

        public Criteria andPrcCtGreaterThan(Long value) {
            addCriterion("prc_ct >", value, "prcCt");
            return (Criteria) this;
        }

        public Criteria andPrcCtGreaterThanOrEqualTo(Long value) {
            addCriterion("prc_ct >=", value, "prcCt");
            return (Criteria) this;
        }

        public Criteria andPrcCtLessThan(Long value) {
            addCriterion("prc_ct <", value, "prcCt");
            return (Criteria) this;
        }

        public Criteria andPrcCtLessThanOrEqualTo(Long value) {
            addCriterion("prc_ct <=", value, "prcCt");
            return (Criteria) this;
        }

        public Criteria andPrcCtIn(List<Long> values) {
            addCriterion("prc_ct in", values, "prcCt");
            return (Criteria) this;
        }

        public Criteria andPrcCtNotIn(List<Long> values) {
            addCriterion("prc_ct not in", values, "prcCt");
            return (Criteria) this;
        }

        public Criteria andPrcCtBetween(Long value1, Long value2) {
            addCriterion("prc_ct between", value1, value2, "prcCt");
            return (Criteria) this;
        }

        public Criteria andPrcCtNotBetween(Long value1, Long value2) {
            addCriterion("prc_ct not between", value1, value2, "prcCt");
            return (Criteria) this;
        }

        public Criteria andPrcCrIsNull() {
            addCriterion("prc_cr is null");
            return (Criteria) this;
        }

        public Criteria andPrcCrIsNotNull() {
            addCriterion("prc_cr is not null");
            return (Criteria) this;
        }

        public Criteria andPrcCrEqualTo(String value) {
            addCriterion("prc_cr =", value, "prcCr");
            return (Criteria) this;
        }

        public Criteria andPrcCrNotEqualTo(String value) {
            addCriterion("prc_cr <>", value, "prcCr");
            return (Criteria) this;
        }

        public Criteria andPrcCrGreaterThan(String value) {
            addCriterion("prc_cr >", value, "prcCr");
            return (Criteria) this;
        }

        public Criteria andPrcCrGreaterThanOrEqualTo(String value) {
            addCriterion("prc_cr >=", value, "prcCr");
            return (Criteria) this;
        }

        public Criteria andPrcCrLessThan(String value) {
            addCriterion("prc_cr <", value, "prcCr");
            return (Criteria) this;
        }

        public Criteria andPrcCrLessThanOrEqualTo(String value) {
            addCriterion("prc_cr <=", value, "prcCr");
            return (Criteria) this;
        }

        public Criteria andPrcCrLike(String value) {
            addCriterion("prc_cr like", value, "prcCr");
            return (Criteria) this;
        }

        public Criteria andPrcCrNotLike(String value) {
            addCriterion("prc_cr not like", value, "prcCr");
            return (Criteria) this;
        }

        public Criteria andPrcCrIn(List<String> values) {
            addCriterion("prc_cr in", values, "prcCr");
            return (Criteria) this;
        }

        public Criteria andPrcCrNotIn(List<String> values) {
            addCriterion("prc_cr not in", values, "prcCr");
            return (Criteria) this;
        }

        public Criteria andPrcCrBetween(String value1, String value2) {
            addCriterion("prc_cr between", value1, value2, "prcCr");
            return (Criteria) this;
        }

        public Criteria andPrcCrNotBetween(String value1, String value2) {
            addCriterion("prc_cr not between", value1, value2, "prcCr");
            return (Criteria) this;
        }

        public Criteria andPrcDIsNull() {
            addCriterion("prc_d is null");
            return (Criteria) this;
        }

        public Criteria andPrcDIsNotNull() {
            addCriterion("prc_d is not null");
            return (Criteria) this;
        }

        public Criteria andPrcDEqualTo(String value) {
            addCriterion("prc_d =", value, "prcD");
            return (Criteria) this;
        }

        public Criteria andPrcDNotEqualTo(String value) {
            addCriterion("prc_d <>", value, "prcD");
            return (Criteria) this;
        }

        public Criteria andPrcDGreaterThan(String value) {
            addCriterion("prc_d >", value, "prcD");
            return (Criteria) this;
        }

        public Criteria andPrcDGreaterThanOrEqualTo(String value) {
            addCriterion("prc_d >=", value, "prcD");
            return (Criteria) this;
        }

        public Criteria andPrcDLessThan(String value) {
            addCriterion("prc_d <", value, "prcD");
            return (Criteria) this;
        }

        public Criteria andPrcDLessThanOrEqualTo(String value) {
            addCriterion("prc_d <=", value, "prcD");
            return (Criteria) this;
        }

        public Criteria andPrcDLike(String value) {
            addCriterion("prc_d like", value, "prcD");
            return (Criteria) this;
        }

        public Criteria andPrcDNotLike(String value) {
            addCriterion("prc_d not like", value, "prcD");
            return (Criteria) this;
        }

        public Criteria andPrcDIn(List<String> values) {
            addCriterion("prc_d in", values, "prcD");
            return (Criteria) this;
        }

        public Criteria andPrcDNotIn(List<String> values) {
            addCriterion("prc_d not in", values, "prcD");
            return (Criteria) this;
        }

        public Criteria andPrcDBetween(String value1, String value2) {
            addCriterion("prc_d between", value1, value2, "prcD");
            return (Criteria) this;
        }

        public Criteria andPrcDNotBetween(String value1, String value2) {
            addCriterion("prc_d not between", value1, value2, "prcD");
            return (Criteria) this;
        }

        public Criteria andPrcDtIsNull() {
            addCriterion("prc_dt is null");
            return (Criteria) this;
        }

        public Criteria andPrcDtIsNotNull() {
            addCriterion("prc_dt is not null");
            return (Criteria) this;
        }

        public Criteria andPrcDtEqualTo(Long value) {
            addCriterion("prc_dt =", value, "prcDt");
            return (Criteria) this;
        }

        public Criteria andPrcDtNotEqualTo(Long value) {
            addCriterion("prc_dt <>", value, "prcDt");
            return (Criteria) this;
        }

        public Criteria andPrcDtGreaterThan(Long value) {
            addCriterion("prc_dt >", value, "prcDt");
            return (Criteria) this;
        }

        public Criteria andPrcDtGreaterThanOrEqualTo(Long value) {
            addCriterion("prc_dt >=", value, "prcDt");
            return (Criteria) this;
        }

        public Criteria andPrcDtLessThan(Long value) {
            addCriterion("prc_dt <", value, "prcDt");
            return (Criteria) this;
        }

        public Criteria andPrcDtLessThanOrEqualTo(Long value) {
            addCriterion("prc_dt <=", value, "prcDt");
            return (Criteria) this;
        }

        public Criteria andPrcDtIn(List<Long> values) {
            addCriterion("prc_dt in", values, "prcDt");
            return (Criteria) this;
        }

        public Criteria andPrcDtNotIn(List<Long> values) {
            addCriterion("prc_dt not in", values, "prcDt");
            return (Criteria) this;
        }

        public Criteria andPrcDtBetween(Long value1, Long value2) {
            addCriterion("prc_dt between", value1, value2, "prcDt");
            return (Criteria) this;
        }

        public Criteria andPrcDtNotBetween(Long value1, Long value2) {
            addCriterion("prc_dt not between", value1, value2, "prcDt");
            return (Criteria) this;
        }

        public Criteria andPrcDrIsNull() {
            addCriterion("prc_dr is null");
            return (Criteria) this;
        }

        public Criteria andPrcDrIsNotNull() {
            addCriterion("prc_dr is not null");
            return (Criteria) this;
        }

        public Criteria andPrcDrEqualTo(String value) {
            addCriterion("prc_dr =", value, "prcDr");
            return (Criteria) this;
        }

        public Criteria andPrcDrNotEqualTo(String value) {
            addCriterion("prc_dr <>", value, "prcDr");
            return (Criteria) this;
        }

        public Criteria andPrcDrGreaterThan(String value) {
            addCriterion("prc_dr >", value, "prcDr");
            return (Criteria) this;
        }

        public Criteria andPrcDrGreaterThanOrEqualTo(String value) {
            addCriterion("prc_dr >=", value, "prcDr");
            return (Criteria) this;
        }

        public Criteria andPrcDrLessThan(String value) {
            addCriterion("prc_dr <", value, "prcDr");
            return (Criteria) this;
        }

        public Criteria andPrcDrLessThanOrEqualTo(String value) {
            addCriterion("prc_dr <=", value, "prcDr");
            return (Criteria) this;
        }

        public Criteria andPrcDrLike(String value) {
            addCriterion("prc_dr like", value, "prcDr");
            return (Criteria) this;
        }

        public Criteria andPrcDrNotLike(String value) {
            addCriterion("prc_dr not like", value, "prcDr");
            return (Criteria) this;
        }

        public Criteria andPrcDrIn(List<String> values) {
            addCriterion("prc_dr in", values, "prcDr");
            return (Criteria) this;
        }

        public Criteria andPrcDrNotIn(List<String> values) {
            addCriterion("prc_dr not in", values, "prcDr");
            return (Criteria) this;
        }

        public Criteria andPrcDrBetween(String value1, String value2) {
            addCriterion("prc_dr between", value1, value2, "prcDr");
            return (Criteria) this;
        }

        public Criteria andPrcDrNotBetween(String value1, String value2) {
            addCriterion("prc_dr not between", value1, value2, "prcDr");
            return (Criteria) this;
        }

        public Criteria andPrcEIsNull() {
            addCriterion("prc_e is null");
            return (Criteria) this;
        }

        public Criteria andPrcEIsNotNull() {
            addCriterion("prc_e is not null");
            return (Criteria) this;
        }

        public Criteria andPrcEEqualTo(String value) {
            addCriterion("prc_e =", value, "prcE");
            return (Criteria) this;
        }

        public Criteria andPrcENotEqualTo(String value) {
            addCriterion("prc_e <>", value, "prcE");
            return (Criteria) this;
        }

        public Criteria andPrcEGreaterThan(String value) {
            addCriterion("prc_e >", value, "prcE");
            return (Criteria) this;
        }

        public Criteria andPrcEGreaterThanOrEqualTo(String value) {
            addCriterion("prc_e >=", value, "prcE");
            return (Criteria) this;
        }

        public Criteria andPrcELessThan(String value) {
            addCriterion("prc_e <", value, "prcE");
            return (Criteria) this;
        }

        public Criteria andPrcELessThanOrEqualTo(String value) {
            addCriterion("prc_e <=", value, "prcE");
            return (Criteria) this;
        }

        public Criteria andPrcELike(String value) {
            addCriterion("prc_e like", value, "prcE");
            return (Criteria) this;
        }

        public Criteria andPrcENotLike(String value) {
            addCriterion("prc_e not like", value, "prcE");
            return (Criteria) this;
        }

        public Criteria andPrcEIn(List<String> values) {
            addCriterion("prc_e in", values, "prcE");
            return (Criteria) this;
        }

        public Criteria andPrcENotIn(List<String> values) {
            addCriterion("prc_e not in", values, "prcE");
            return (Criteria) this;
        }

        public Criteria andPrcEBetween(String value1, String value2) {
            addCriterion("prc_e between", value1, value2, "prcE");
            return (Criteria) this;
        }

        public Criteria andPrcENotBetween(String value1, String value2) {
            addCriterion("prc_e not between", value1, value2, "prcE");
            return (Criteria) this;
        }

        public Criteria andPrcEtIsNull() {
            addCriterion("prc_et is null");
            return (Criteria) this;
        }

        public Criteria andPrcEtIsNotNull() {
            addCriterion("prc_et is not null");
            return (Criteria) this;
        }

        public Criteria andPrcEtEqualTo(Long value) {
            addCriterion("prc_et =", value, "prcEt");
            return (Criteria) this;
        }

        public Criteria andPrcEtNotEqualTo(Long value) {
            addCriterion("prc_et <>", value, "prcEt");
            return (Criteria) this;
        }

        public Criteria andPrcEtGreaterThan(Long value) {
            addCriterion("prc_et >", value, "prcEt");
            return (Criteria) this;
        }

        public Criteria andPrcEtGreaterThanOrEqualTo(Long value) {
            addCriterion("prc_et >=", value, "prcEt");
            return (Criteria) this;
        }

        public Criteria andPrcEtLessThan(Long value) {
            addCriterion("prc_et <", value, "prcEt");
            return (Criteria) this;
        }

        public Criteria andPrcEtLessThanOrEqualTo(Long value) {
            addCriterion("prc_et <=", value, "prcEt");
            return (Criteria) this;
        }

        public Criteria andPrcEtIn(List<Long> values) {
            addCriterion("prc_et in", values, "prcEt");
            return (Criteria) this;
        }

        public Criteria andPrcEtNotIn(List<Long> values) {
            addCriterion("prc_et not in", values, "prcEt");
            return (Criteria) this;
        }

        public Criteria andPrcEtBetween(Long value1, Long value2) {
            addCriterion("prc_et between", value1, value2, "prcEt");
            return (Criteria) this;
        }

        public Criteria andPrcEtNotBetween(Long value1, Long value2) {
            addCriterion("prc_et not between", value1, value2, "prcEt");
            return (Criteria) this;
        }

        public Criteria andPrcFrIsNull() {
            addCriterion("prc_fr is null");
            return (Criteria) this;
        }

        public Criteria andPrcFrIsNotNull() {
            addCriterion("prc_fr is not null");
            return (Criteria) this;
        }

        public Criteria andPrcFrEqualTo(String value) {
            addCriterion("prc_fr =", value, "prcFr");
            return (Criteria) this;
        }

        public Criteria andPrcFrNotEqualTo(String value) {
            addCriterion("prc_fr <>", value, "prcFr");
            return (Criteria) this;
        }

        public Criteria andPrcFrGreaterThan(String value) {
            addCriterion("prc_fr >", value, "prcFr");
            return (Criteria) this;
        }

        public Criteria andPrcFrGreaterThanOrEqualTo(String value) {
            addCriterion("prc_fr >=", value, "prcFr");
            return (Criteria) this;
        }

        public Criteria andPrcFrLessThan(String value) {
            addCriterion("prc_fr <", value, "prcFr");
            return (Criteria) this;
        }

        public Criteria andPrcFrLessThanOrEqualTo(String value) {
            addCriterion("prc_fr <=", value, "prcFr");
            return (Criteria) this;
        }

        public Criteria andPrcFrLike(String value) {
            addCriterion("prc_fr like", value, "prcFr");
            return (Criteria) this;
        }

        public Criteria andPrcFrNotLike(String value) {
            addCriterion("prc_fr not like", value, "prcFr");
            return (Criteria) this;
        }

        public Criteria andPrcFrIn(List<String> values) {
            addCriterion("prc_fr in", values, "prcFr");
            return (Criteria) this;
        }

        public Criteria andPrcFrNotIn(List<String> values) {
            addCriterion("prc_fr not in", values, "prcFr");
            return (Criteria) this;
        }

        public Criteria andPrcFrBetween(String value1, String value2) {
            addCriterion("prc_fr between", value1, value2, "prcFr");
            return (Criteria) this;
        }

        public Criteria andPrcFrNotBetween(String value1, String value2) {
            addCriterion("prc_fr not between", value1, value2, "prcFr");
            return (Criteria) this;
        }

        public Criteria andPrcGIsNull() {
            addCriterion("prc_g is null");
            return (Criteria) this;
        }

        public Criteria andPrcGIsNotNull() {
            addCriterion("prc_g is not null");
            return (Criteria) this;
        }

        public Criteria andPrcGEqualTo(String value) {
            addCriterion("prc_g =", value, "prcG");
            return (Criteria) this;
        }

        public Criteria andPrcGNotEqualTo(String value) {
            addCriterion("prc_g <>", value, "prcG");
            return (Criteria) this;
        }

        public Criteria andPrcGGreaterThan(String value) {
            addCriterion("prc_g >", value, "prcG");
            return (Criteria) this;
        }

        public Criteria andPrcGGreaterThanOrEqualTo(String value) {
            addCriterion("prc_g >=", value, "prcG");
            return (Criteria) this;
        }

        public Criteria andPrcGLessThan(String value) {
            addCriterion("prc_g <", value, "prcG");
            return (Criteria) this;
        }

        public Criteria andPrcGLessThanOrEqualTo(String value) {
            addCriterion("prc_g <=", value, "prcG");
            return (Criteria) this;
        }

        public Criteria andPrcGLike(String value) {
            addCriterion("prc_g like", value, "prcG");
            return (Criteria) this;
        }

        public Criteria andPrcGNotLike(String value) {
            addCriterion("prc_g not like", value, "prcG");
            return (Criteria) this;
        }

        public Criteria andPrcGIn(List<String> values) {
            addCriterion("prc_g in", values, "prcG");
            return (Criteria) this;
        }

        public Criteria andPrcGNotIn(List<String> values) {
            addCriterion("prc_g not in", values, "prcG");
            return (Criteria) this;
        }

        public Criteria andPrcGBetween(String value1, String value2) {
            addCriterion("prc_g between", value1, value2, "prcG");
            return (Criteria) this;
        }

        public Criteria andPrcGNotBetween(String value1, String value2) {
            addCriterion("prc_g not between", value1, value2, "prcG");
            return (Criteria) this;
        }

        public Criteria andPrcGtIsNull() {
            addCriterion("prc_gt is null");
            return (Criteria) this;
        }

        public Criteria andPrcGtIsNotNull() {
            addCriterion("prc_gt is not null");
            return (Criteria) this;
        }

        public Criteria andPrcGtEqualTo(Long value) {
            addCriterion("prc_gt =", value, "prcGt");
            return (Criteria) this;
        }

        public Criteria andPrcGtNotEqualTo(Long value) {
            addCriterion("prc_gt <>", value, "prcGt");
            return (Criteria) this;
        }

        public Criteria andPrcGtGreaterThan(Long value) {
            addCriterion("prc_gt >", value, "prcGt");
            return (Criteria) this;
        }

        public Criteria andPrcGtGreaterThanOrEqualTo(Long value) {
            addCriterion("prc_gt >=", value, "prcGt");
            return (Criteria) this;
        }

        public Criteria andPrcGtLessThan(Long value) {
            addCriterion("prc_gt <", value, "prcGt");
            return (Criteria) this;
        }

        public Criteria andPrcGtLessThanOrEqualTo(Long value) {
            addCriterion("prc_gt <=", value, "prcGt");
            return (Criteria) this;
        }

        public Criteria andPrcGtIn(List<Long> values) {
            addCriterion("prc_gt in", values, "prcGt");
            return (Criteria) this;
        }

        public Criteria andPrcGtNotIn(List<Long> values) {
            addCriterion("prc_gt not in", values, "prcGt");
            return (Criteria) this;
        }

        public Criteria andPrcGtBetween(Long value1, Long value2) {
            addCriterion("prc_gt between", value1, value2, "prcGt");
            return (Criteria) this;
        }

        public Criteria andPrcGtNotBetween(Long value1, Long value2) {
            addCriterion("prc_gt not between", value1, value2, "prcGt");
            return (Criteria) this;
        }

        public Criteria andPrcHrIsNull() {
            addCriterion("prc_hr is null");
            return (Criteria) this;
        }

        public Criteria andPrcHrIsNotNull() {
            addCriterion("prc_hr is not null");
            return (Criteria) this;
        }

        public Criteria andPrcHrEqualTo(String value) {
            addCriterion("prc_hr =", value, "prcHr");
            return (Criteria) this;
        }

        public Criteria andPrcHrNotEqualTo(String value) {
            addCriterion("prc_hr <>", value, "prcHr");
            return (Criteria) this;
        }

        public Criteria andPrcHrGreaterThan(String value) {
            addCriterion("prc_hr >", value, "prcHr");
            return (Criteria) this;
        }

        public Criteria andPrcHrGreaterThanOrEqualTo(String value) {
            addCriterion("prc_hr >=", value, "prcHr");
            return (Criteria) this;
        }

        public Criteria andPrcHrLessThan(String value) {
            addCriterion("prc_hr <", value, "prcHr");
            return (Criteria) this;
        }

        public Criteria andPrcHrLessThanOrEqualTo(String value) {
            addCriterion("prc_hr <=", value, "prcHr");
            return (Criteria) this;
        }

        public Criteria andPrcHrLike(String value) {
            addCriterion("prc_hr like", value, "prcHr");
            return (Criteria) this;
        }

        public Criteria andPrcHrNotLike(String value) {
            addCriterion("prc_hr not like", value, "prcHr");
            return (Criteria) this;
        }

        public Criteria andPrcHrIn(List<String> values) {
            addCriterion("prc_hr in", values, "prcHr");
            return (Criteria) this;
        }

        public Criteria andPrcHrNotIn(List<String> values) {
            addCriterion("prc_hr not in", values, "prcHr");
            return (Criteria) this;
        }

        public Criteria andPrcHrBetween(String value1, String value2) {
            addCriterion("prc_hr between", value1, value2, "prcHr");
            return (Criteria) this;
        }

        public Criteria andPrcHrNotBetween(String value1, String value2) {
            addCriterion("prc_hr not between", value1, value2, "prcHr");
            return (Criteria) this;
        }

        public Criteria andPrcIIsNull() {
            addCriterion("prc_i is null");
            return (Criteria) this;
        }

        public Criteria andPrcIIsNotNull() {
            addCriterion("prc_i is not null");
            return (Criteria) this;
        }

        public Criteria andPrcIEqualTo(String value) {
            addCriterion("prc_i =", value, "prcI");
            return (Criteria) this;
        }

        public Criteria andPrcINotEqualTo(String value) {
            addCriterion("prc_i <>", value, "prcI");
            return (Criteria) this;
        }

        public Criteria andPrcIGreaterThan(String value) {
            addCriterion("prc_i >", value, "prcI");
            return (Criteria) this;
        }

        public Criteria andPrcIGreaterThanOrEqualTo(String value) {
            addCriterion("prc_i >=", value, "prcI");
            return (Criteria) this;
        }

        public Criteria andPrcILessThan(String value) {
            addCriterion("prc_i <", value, "prcI");
            return (Criteria) this;
        }

        public Criteria andPrcILessThanOrEqualTo(String value) {
            addCriterion("prc_i <=", value, "prcI");
            return (Criteria) this;
        }

        public Criteria andPrcILike(String value) {
            addCriterion("prc_i like", value, "prcI");
            return (Criteria) this;
        }

        public Criteria andPrcINotLike(String value) {
            addCriterion("prc_i not like", value, "prcI");
            return (Criteria) this;
        }

        public Criteria andPrcIIn(List<String> values) {
            addCriterion("prc_i in", values, "prcI");
            return (Criteria) this;
        }

        public Criteria andPrcINotIn(List<String> values) {
            addCriterion("prc_i not in", values, "prcI");
            return (Criteria) this;
        }

        public Criteria andPrcIBetween(String value1, String value2) {
            addCriterion("prc_i between", value1, value2, "prcI");
            return (Criteria) this;
        }

        public Criteria andPrcINotBetween(String value1, String value2) {
            addCriterion("prc_i not between", value1, value2, "prcI");
            return (Criteria) this;
        }

        public Criteria andPrcItIsNull() {
            addCriterion("prc_it is null");
            return (Criteria) this;
        }

        public Criteria andPrcItIsNotNull() {
            addCriterion("prc_it is not null");
            return (Criteria) this;
        }

        public Criteria andPrcItEqualTo(Long value) {
            addCriterion("prc_it =", value, "prcIt");
            return (Criteria) this;
        }

        public Criteria andPrcItNotEqualTo(Long value) {
            addCriterion("prc_it <>", value, "prcIt");
            return (Criteria) this;
        }

        public Criteria andPrcItGreaterThan(Long value) {
            addCriterion("prc_it >", value, "prcIt");
            return (Criteria) this;
        }

        public Criteria andPrcItGreaterThanOrEqualTo(Long value) {
            addCriterion("prc_it >=", value, "prcIt");
            return (Criteria) this;
        }

        public Criteria andPrcItLessThan(Long value) {
            addCriterion("prc_it <", value, "prcIt");
            return (Criteria) this;
        }

        public Criteria andPrcItLessThanOrEqualTo(Long value) {
            addCriterion("prc_it <=", value, "prcIt");
            return (Criteria) this;
        }

        public Criteria andPrcItIn(List<Long> values) {
            addCriterion("prc_it in", values, "prcIt");
            return (Criteria) this;
        }

        public Criteria andPrcItNotIn(List<Long> values) {
            addCriterion("prc_it not in", values, "prcIt");
            return (Criteria) this;
        }

        public Criteria andPrcItBetween(Long value1, Long value2) {
            addCriterion("prc_it between", value1, value2, "prcIt");
            return (Criteria) this;
        }

        public Criteria andPrcItNotBetween(Long value1, Long value2) {
            addCriterion("prc_it not between", value1, value2, "prcIt");
            return (Criteria) this;
        }

        public Criteria andPrcIrIsNull() {
            addCriterion("prc_ir is null");
            return (Criteria) this;
        }

        public Criteria andPrcIrIsNotNull() {
            addCriterion("prc_ir is not null");
            return (Criteria) this;
        }

        public Criteria andPrcIrEqualTo(String value) {
            addCriterion("prc_ir =", value, "prcIr");
            return (Criteria) this;
        }

        public Criteria andPrcIrNotEqualTo(String value) {
            addCriterion("prc_ir <>", value, "prcIr");
            return (Criteria) this;
        }

        public Criteria andPrcIrGreaterThan(String value) {
            addCriterion("prc_ir >", value, "prcIr");
            return (Criteria) this;
        }

        public Criteria andPrcIrGreaterThanOrEqualTo(String value) {
            addCriterion("prc_ir >=", value, "prcIr");
            return (Criteria) this;
        }

        public Criteria andPrcIrLessThan(String value) {
            addCriterion("prc_ir <", value, "prcIr");
            return (Criteria) this;
        }

        public Criteria andPrcIrLessThanOrEqualTo(String value) {
            addCriterion("prc_ir <=", value, "prcIr");
            return (Criteria) this;
        }

        public Criteria andPrcIrLike(String value) {
            addCriterion("prc_ir like", value, "prcIr");
            return (Criteria) this;
        }

        public Criteria andPrcIrNotLike(String value) {
            addCriterion("prc_ir not like", value, "prcIr");
            return (Criteria) this;
        }

        public Criteria andPrcIrIn(List<String> values) {
            addCriterion("prc_ir in", values, "prcIr");
            return (Criteria) this;
        }

        public Criteria andPrcIrNotIn(List<String> values) {
            addCriterion("prc_ir not in", values, "prcIr");
            return (Criteria) this;
        }

        public Criteria andPrcIrBetween(String value1, String value2) {
            addCriterion("prc_ir between", value1, value2, "prcIr");
            return (Criteria) this;
        }

        public Criteria andPrcIrNotBetween(String value1, String value2) {
            addCriterion("prc_ir not between", value1, value2, "prcIr");
            return (Criteria) this;
        }

        public Criteria andPrcJIsNull() {
            addCriterion("prc_j is null");
            return (Criteria) this;
        }

        public Criteria andPrcJIsNotNull() {
            addCriterion("prc_j is not null");
            return (Criteria) this;
        }

        public Criteria andPrcJEqualTo(String value) {
            addCriterion("prc_j =", value, "prcJ");
            return (Criteria) this;
        }

        public Criteria andPrcJNotEqualTo(String value) {
            addCriterion("prc_j <>", value, "prcJ");
            return (Criteria) this;
        }

        public Criteria andPrcJGreaterThan(String value) {
            addCriterion("prc_j >", value, "prcJ");
            return (Criteria) this;
        }

        public Criteria andPrcJGreaterThanOrEqualTo(String value) {
            addCriterion("prc_j >=", value, "prcJ");
            return (Criteria) this;
        }

        public Criteria andPrcJLessThan(String value) {
            addCriterion("prc_j <", value, "prcJ");
            return (Criteria) this;
        }

        public Criteria andPrcJLessThanOrEqualTo(String value) {
            addCriterion("prc_j <=", value, "prcJ");
            return (Criteria) this;
        }

        public Criteria andPrcJLike(String value) {
            addCriterion("prc_j like", value, "prcJ");
            return (Criteria) this;
        }

        public Criteria andPrcJNotLike(String value) {
            addCriterion("prc_j not like", value, "prcJ");
            return (Criteria) this;
        }

        public Criteria andPrcJIn(List<String> values) {
            addCriterion("prc_j in", values, "prcJ");
            return (Criteria) this;
        }

        public Criteria andPrcJNotIn(List<String> values) {
            addCriterion("prc_j not in", values, "prcJ");
            return (Criteria) this;
        }

        public Criteria andPrcJBetween(String value1, String value2) {
            addCriterion("prc_j between", value1, value2, "prcJ");
            return (Criteria) this;
        }

        public Criteria andPrcJNotBetween(String value1, String value2) {
            addCriterion("prc_j not between", value1, value2, "prcJ");
            return (Criteria) this;
        }

        public Criteria andPrcJtIsNull() {
            addCriterion("prc_jt is null");
            return (Criteria) this;
        }

        public Criteria andPrcJtIsNotNull() {
            addCriterion("prc_jt is not null");
            return (Criteria) this;
        }

        public Criteria andPrcJtEqualTo(Long value) {
            addCriterion("prc_jt =", value, "prcJt");
            return (Criteria) this;
        }

        public Criteria andPrcJtNotEqualTo(Long value) {
            addCriterion("prc_jt <>", value, "prcJt");
            return (Criteria) this;
        }

        public Criteria andPrcJtGreaterThan(Long value) {
            addCriterion("prc_jt >", value, "prcJt");
            return (Criteria) this;
        }

        public Criteria andPrcJtGreaterThanOrEqualTo(Long value) {
            addCriterion("prc_jt >=", value, "prcJt");
            return (Criteria) this;
        }

        public Criteria andPrcJtLessThan(Long value) {
            addCriterion("prc_jt <", value, "prcJt");
            return (Criteria) this;
        }

        public Criteria andPrcJtLessThanOrEqualTo(Long value) {
            addCriterion("prc_jt <=", value, "prcJt");
            return (Criteria) this;
        }

        public Criteria andPrcJtIn(List<Long> values) {
            addCriterion("prc_jt in", values, "prcJt");
            return (Criteria) this;
        }

        public Criteria andPrcJtNotIn(List<Long> values) {
            addCriterion("prc_jt not in", values, "prcJt");
            return (Criteria) this;
        }

        public Criteria andPrcJtBetween(Long value1, Long value2) {
            addCriterion("prc_jt between", value1, value2, "prcJt");
            return (Criteria) this;
        }

        public Criteria andPrcJtNotBetween(Long value1, Long value2) {
            addCriterion("prc_jt not between", value1, value2, "prcJt");
            return (Criteria) this;
        }

        public Criteria andPrcJrIsNull() {
            addCriterion("prc_jr is null");
            return (Criteria) this;
        }

        public Criteria andPrcJrIsNotNull() {
            addCriterion("prc_jr is not null");
            return (Criteria) this;
        }

        public Criteria andPrcJrEqualTo(String value) {
            addCriterion("prc_jr =", value, "prcJr");
            return (Criteria) this;
        }

        public Criteria andPrcJrNotEqualTo(String value) {
            addCriterion("prc_jr <>", value, "prcJr");
            return (Criteria) this;
        }

        public Criteria andPrcJrGreaterThan(String value) {
            addCriterion("prc_jr >", value, "prcJr");
            return (Criteria) this;
        }

        public Criteria andPrcJrGreaterThanOrEqualTo(String value) {
            addCriterion("prc_jr >=", value, "prcJr");
            return (Criteria) this;
        }

        public Criteria andPrcJrLessThan(String value) {
            addCriterion("prc_jr <", value, "prcJr");
            return (Criteria) this;
        }

        public Criteria andPrcJrLessThanOrEqualTo(String value) {
            addCriterion("prc_jr <=", value, "prcJr");
            return (Criteria) this;
        }

        public Criteria andPrcJrLike(String value) {
            addCriterion("prc_jr like", value, "prcJr");
            return (Criteria) this;
        }

        public Criteria andPrcJrNotLike(String value) {
            addCriterion("prc_jr not like", value, "prcJr");
            return (Criteria) this;
        }

        public Criteria andPrcJrIn(List<String> values) {
            addCriterion("prc_jr in", values, "prcJr");
            return (Criteria) this;
        }

        public Criteria andPrcJrNotIn(List<String> values) {
            addCriterion("prc_jr not in", values, "prcJr");
            return (Criteria) this;
        }

        public Criteria andPrcJrBetween(String value1, String value2) {
            addCriterion("prc_jr between", value1, value2, "prcJr");
            return (Criteria) this;
        }

        public Criteria andPrcJrNotBetween(String value1, String value2) {
            addCriterion("prc_jr not between", value1, value2, "prcJr");
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