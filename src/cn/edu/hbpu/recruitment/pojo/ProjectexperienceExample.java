package cn.edu.hbpu.recruitment.pojo;

import java.util.ArrayList;
import java.util.List;

public class ProjectexperienceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectexperienceExample() {
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

        public Criteria andProjectexperienceidIsNull() {
            addCriterion("projectExperienceId is null");
            return (Criteria) this;
        }

        public Criteria andProjectexperienceidIsNotNull() {
            addCriterion("projectExperienceId is not null");
            return (Criteria) this;
        }

        public Criteria andProjectexperienceidEqualTo(Integer value) {
            addCriterion("projectExperienceId =", value, "projectexperienceid");
            return (Criteria) this;
        }

        public Criteria andProjectexperienceidNotEqualTo(Integer value) {
            addCriterion("projectExperienceId <>", value, "projectexperienceid");
            return (Criteria) this;
        }

        public Criteria andProjectexperienceidGreaterThan(Integer value) {
            addCriterion("projectExperienceId >", value, "projectexperienceid");
            return (Criteria) this;
        }

        public Criteria andProjectexperienceidGreaterThanOrEqualTo(Integer value) {
            addCriterion("projectExperienceId >=", value, "projectexperienceid");
            return (Criteria) this;
        }

        public Criteria andProjectexperienceidLessThan(Integer value) {
            addCriterion("projectExperienceId <", value, "projectexperienceid");
            return (Criteria) this;
        }

        public Criteria andProjectexperienceidLessThanOrEqualTo(Integer value) {
            addCriterion("projectExperienceId <=", value, "projectexperienceid");
            return (Criteria) this;
        }

        public Criteria andProjectexperienceidIn(List<Integer> values) {
            addCriterion("projectExperienceId in", values, "projectexperienceid");
            return (Criteria) this;
        }

        public Criteria andProjectexperienceidNotIn(List<Integer> values) {
            addCriterion("projectExperienceId not in", values, "projectexperienceid");
            return (Criteria) this;
        }

        public Criteria andProjectexperienceidBetween(Integer value1, Integer value2) {
            addCriterion("projectExperienceId between", value1, value2, "projectexperienceid");
            return (Criteria) this;
        }

        public Criteria andProjectexperienceidNotBetween(Integer value1, Integer value2) {
            addCriterion("projectExperienceId not between", value1, value2, "projectexperienceid");
            return (Criteria) this;
        }

        public Criteria andPersonidIsNull() {
            addCriterion("personId is null");
            return (Criteria) this;
        }

        public Criteria andPersonidIsNotNull() {
            addCriterion("personId is not null");
            return (Criteria) this;
        }

        public Criteria andPersonidEqualTo(Integer value) {
            addCriterion("personId =", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidNotEqualTo(Integer value) {
            addCriterion("personId <>", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidGreaterThan(Integer value) {
            addCriterion("personId >", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidGreaterThanOrEqualTo(Integer value) {
            addCriterion("personId >=", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidLessThan(Integer value) {
            addCriterion("personId <", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidLessThanOrEqualTo(Integer value) {
            addCriterion("personId <=", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidIn(List<Integer> values) {
            addCriterion("personId in", values, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidNotIn(List<Integer> values) {
            addCriterion("personId not in", values, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidBetween(Integer value1, Integer value2) {
            addCriterion("personId between", value1, value2, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidNotBetween(Integer value1, Integer value2) {
            addCriterion("personId not between", value1, value2, "personid");
            return (Criteria) this;
        }

        public Criteria andProjectnameIsNull() {
            addCriterion("projectName is null");
            return (Criteria) this;
        }

        public Criteria andProjectnameIsNotNull() {
            addCriterion("projectName is not null");
            return (Criteria) this;
        }

        public Criteria andProjectnameEqualTo(String value) {
            addCriterion("projectName =", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotEqualTo(String value) {
            addCriterion("projectName <>", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThan(String value) {
            addCriterion("projectName >", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThanOrEqualTo(String value) {
            addCriterion("projectName >=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThan(String value) {
            addCriterion("projectName <", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThanOrEqualTo(String value) {
            addCriterion("projectName <=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLike(String value) {
            addCriterion("projectName like", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotLike(String value) {
            addCriterion("projectName not like", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameIn(List<String> values) {
            addCriterion("projectName in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotIn(List<String> values) {
            addCriterion("projectName not in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameBetween(String value1, String value2) {
            addCriterion("projectName between", value1, value2, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotBetween(String value1, String value2) {
            addCriterion("projectName not between", value1, value2, "projectname");
            return (Criteria) this;
        }

        public Criteria andPostIsNull() {
            addCriterion("post is null");
            return (Criteria) this;
        }

        public Criteria andPostIsNotNull() {
            addCriterion("post is not null");
            return (Criteria) this;
        }

        public Criteria andPostEqualTo(String value) {
            addCriterion("post =", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotEqualTo(String value) {
            addCriterion("post <>", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostGreaterThan(String value) {
            addCriterion("post >", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostGreaterThanOrEqualTo(String value) {
            addCriterion("post >=", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLessThan(String value) {
            addCriterion("post <", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLessThanOrEqualTo(String value) {
            addCriterion("post <=", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLike(String value) {
            addCriterion("post like", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotLike(String value) {
            addCriterion("post not like", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostIn(List<String> values) {
            addCriterion("post in", values, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotIn(List<String> values) {
            addCriterion("post not in", values, "post");
            return (Criteria) this;
        }

        public Criteria andPostBetween(String value1, String value2) {
            addCriterion("post between", value1, value2, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotBetween(String value1, String value2) {
            addCriterion("post not between", value1, value2, "post");
            return (Criteria) this;
        }

        public Criteria andBeginyearIsNull() {
            addCriterion("beginYear is null");
            return (Criteria) this;
        }

        public Criteria andBeginyearIsNotNull() {
            addCriterion("beginYear is not null");
            return (Criteria) this;
        }

        public Criteria andBeginyearEqualTo(Integer value) {
            addCriterion("beginYear =", value, "beginyear");
            return (Criteria) this;
        }

        public Criteria andBeginyearNotEqualTo(Integer value) {
            addCriterion("beginYear <>", value, "beginyear");
            return (Criteria) this;
        }

        public Criteria andBeginyearGreaterThan(Integer value) {
            addCriterion("beginYear >", value, "beginyear");
            return (Criteria) this;
        }

        public Criteria andBeginyearGreaterThanOrEqualTo(Integer value) {
            addCriterion("beginYear >=", value, "beginyear");
            return (Criteria) this;
        }

        public Criteria andBeginyearLessThan(Integer value) {
            addCriterion("beginYear <", value, "beginyear");
            return (Criteria) this;
        }

        public Criteria andBeginyearLessThanOrEqualTo(Integer value) {
            addCriterion("beginYear <=", value, "beginyear");
            return (Criteria) this;
        }

        public Criteria andBeginyearIn(List<Integer> values) {
            addCriterion("beginYear in", values, "beginyear");
            return (Criteria) this;
        }

        public Criteria andBeginyearNotIn(List<Integer> values) {
            addCriterion("beginYear not in", values, "beginyear");
            return (Criteria) this;
        }

        public Criteria andBeginyearBetween(Integer value1, Integer value2) {
            addCriterion("beginYear between", value1, value2, "beginyear");
            return (Criteria) this;
        }

        public Criteria andBeginyearNotBetween(Integer value1, Integer value2) {
            addCriterion("beginYear not between", value1, value2, "beginyear");
            return (Criteria) this;
        }

        public Criteria andEndyearIsNull() {
            addCriterion("endYear is null");
            return (Criteria) this;
        }

        public Criteria andEndyearIsNotNull() {
            addCriterion("endYear is not null");
            return (Criteria) this;
        }

        public Criteria andEndyearEqualTo(Integer value) {
            addCriterion("endYear =", value, "endyear");
            return (Criteria) this;
        }

        public Criteria andEndyearNotEqualTo(Integer value) {
            addCriterion("endYear <>", value, "endyear");
            return (Criteria) this;
        }

        public Criteria andEndyearGreaterThan(Integer value) {
            addCriterion("endYear >", value, "endyear");
            return (Criteria) this;
        }

        public Criteria andEndyearGreaterThanOrEqualTo(Integer value) {
            addCriterion("endYear >=", value, "endyear");
            return (Criteria) this;
        }

        public Criteria andEndyearLessThan(Integer value) {
            addCriterion("endYear <", value, "endyear");
            return (Criteria) this;
        }

        public Criteria andEndyearLessThanOrEqualTo(Integer value) {
            addCriterion("endYear <=", value, "endyear");
            return (Criteria) this;
        }

        public Criteria andEndyearIn(List<Integer> values) {
            addCriterion("endYear in", values, "endyear");
            return (Criteria) this;
        }

        public Criteria andEndyearNotIn(List<Integer> values) {
            addCriterion("endYear not in", values, "endyear");
            return (Criteria) this;
        }

        public Criteria andEndyearBetween(Integer value1, Integer value2) {
            addCriterion("endYear between", value1, value2, "endyear");
            return (Criteria) this;
        }

        public Criteria andEndyearNotBetween(Integer value1, Integer value2) {
            addCriterion("endYear not between", value1, value2, "endyear");
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