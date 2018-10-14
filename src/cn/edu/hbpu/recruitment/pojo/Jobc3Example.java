package cn.edu.hbpu.recruitment.pojo;

import java.util.ArrayList;
import java.util.List;

public class Jobc3Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Jobc3Example() {
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

        public Criteria andC3idIsNull() {
            addCriterion("c3Id is null");
            return (Criteria) this;
        }

        public Criteria andC3idIsNotNull() {
            addCriterion("c3Id is not null");
            return (Criteria) this;
        }

        public Criteria andC3idEqualTo(Integer value) {
            addCriterion("c3Id =", value, "c3id");
            return (Criteria) this;
        }

        public Criteria andC3idNotEqualTo(Integer value) {
            addCriterion("c3Id <>", value, "c3id");
            return (Criteria) this;
        }

        public Criteria andC3idGreaterThan(Integer value) {
            addCriterion("c3Id >", value, "c3id");
            return (Criteria) this;
        }

        public Criteria andC3idGreaterThanOrEqualTo(Integer value) {
            addCriterion("c3Id >=", value, "c3id");
            return (Criteria) this;
        }

        public Criteria andC3idLessThan(Integer value) {
            addCriterion("c3Id <", value, "c3id");
            return (Criteria) this;
        }

        public Criteria andC3idLessThanOrEqualTo(Integer value) {
            addCriterion("c3Id <=", value, "c3id");
            return (Criteria) this;
        }

        public Criteria andC3idIn(List<Integer> values) {
            addCriterion("c3Id in", values, "c3id");
            return (Criteria) this;
        }

        public Criteria andC3idNotIn(List<Integer> values) {
            addCriterion("c3Id not in", values, "c3id");
            return (Criteria) this;
        }

        public Criteria andC3idBetween(Integer value1, Integer value2) {
            addCriterion("c3Id between", value1, value2, "c3id");
            return (Criteria) this;
        }

        public Criteria andC3idNotBetween(Integer value1, Integer value2) {
            addCriterion("c3Id not between", value1, value2, "c3id");
            return (Criteria) this;
        }

        public Criteria andC2idIsNull() {
            addCriterion("c2Id is null");
            return (Criteria) this;
        }

        public Criteria andC2idIsNotNull() {
            addCriterion("c2Id is not null");
            return (Criteria) this;
        }

        public Criteria andC2idEqualTo(Integer value) {
            addCriterion("c2Id =", value, "c2id");
            return (Criteria) this;
        }

        public Criteria andC2idNotEqualTo(Integer value) {
            addCriterion("c2Id <>", value, "c2id");
            return (Criteria) this;
        }

        public Criteria andC2idGreaterThan(Integer value) {
            addCriterion("c2Id >", value, "c2id");
            return (Criteria) this;
        }

        public Criteria andC2idGreaterThanOrEqualTo(Integer value) {
            addCriterion("c2Id >=", value, "c2id");
            return (Criteria) this;
        }

        public Criteria andC2idLessThan(Integer value) {
            addCriterion("c2Id <", value, "c2id");
            return (Criteria) this;
        }

        public Criteria andC2idLessThanOrEqualTo(Integer value) {
            addCriterion("c2Id <=", value, "c2id");
            return (Criteria) this;
        }

        public Criteria andC2idIn(List<Integer> values) {
            addCriterion("c2Id in", values, "c2id");
            return (Criteria) this;
        }

        public Criteria andC2idNotIn(List<Integer> values) {
            addCriterion("c2Id not in", values, "c2id");
            return (Criteria) this;
        }

        public Criteria andC2idBetween(Integer value1, Integer value2) {
            addCriterion("c2Id between", value1, value2, "c2id");
            return (Criteria) this;
        }

        public Criteria andC2idNotBetween(Integer value1, Integer value2) {
            addCriterion("c2Id not between", value1, value2, "c2id");
            return (Criteria) this;
        }

        public Criteria andJobidIsNull() {
            addCriterion("jobId is null");
            return (Criteria) this;
        }

        public Criteria andJobidIsNotNull() {
            addCriterion("jobId is not null");
            return (Criteria) this;
        }

        public Criteria andJobidEqualTo(Integer value) {
            addCriterion("jobId =", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidNotEqualTo(Integer value) {
            addCriterion("jobId <>", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidGreaterThan(Integer value) {
            addCriterion("jobId >", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidGreaterThanOrEqualTo(Integer value) {
            addCriterion("jobId >=", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidLessThan(Integer value) {
            addCriterion("jobId <", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidLessThanOrEqualTo(Integer value) {
            addCriterion("jobId <=", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidIn(List<Integer> values) {
            addCriterion("jobId in", values, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidNotIn(List<Integer> values) {
            addCriterion("jobId not in", values, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidBetween(Integer value1, Integer value2) {
            addCriterion("jobId between", value1, value2, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidNotBetween(Integer value1, Integer value2) {
            addCriterion("jobId not between", value1, value2, "jobid");
            return (Criteria) this;
        }

        public Criteria andC3nameIsNull() {
            addCriterion("c3Name is null");
            return (Criteria) this;
        }

        public Criteria andC3nameIsNotNull() {
            addCriterion("c3Name is not null");
            return (Criteria) this;
        }

        public Criteria andC3nameEqualTo(String value) {
            addCriterion("c3Name =", value, "c3name");
            return (Criteria) this;
        }

        public Criteria andC3nameNotEqualTo(String value) {
            addCriterion("c3Name <>", value, "c3name");
            return (Criteria) this;
        }

        public Criteria andC3nameGreaterThan(String value) {
            addCriterion("c3Name >", value, "c3name");
            return (Criteria) this;
        }

        public Criteria andC3nameGreaterThanOrEqualTo(String value) {
            addCriterion("c3Name >=", value, "c3name");
            return (Criteria) this;
        }

        public Criteria andC3nameLessThan(String value) {
            addCriterion("c3Name <", value, "c3name");
            return (Criteria) this;
        }

        public Criteria andC3nameLessThanOrEqualTo(String value) {
            addCriterion("c3Name <=", value, "c3name");
            return (Criteria) this;
        }

        public Criteria andC3nameLike(String value) {
            addCriterion("c3Name like", value, "c3name");
            return (Criteria) this;
        }

        public Criteria andC3nameNotLike(String value) {
            addCriterion("c3Name not like", value, "c3name");
            return (Criteria) this;
        }

        public Criteria andC3nameIn(List<String> values) {
            addCriterion("c3Name in", values, "c3name");
            return (Criteria) this;
        }

        public Criteria andC3nameNotIn(List<String> values) {
            addCriterion("c3Name not in", values, "c3name");
            return (Criteria) this;
        }

        public Criteria andC3nameBetween(String value1, String value2) {
            addCriterion("c3Name between", value1, value2, "c3name");
            return (Criteria) this;
        }

        public Criteria andC3nameNotBetween(String value1, String value2) {
            addCriterion("c3Name not between", value1, value2, "c3name");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
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