package cn.edu.hbpu.recruitment.pojo;

import java.util.ArrayList;
import java.util.List;

public class ResumeinformationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResumeinformationExample() {
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

        public Criteria andResumeidIsNull() {
            addCriterion("resumeId is null");
            return (Criteria) this;
        }

        public Criteria andResumeidIsNotNull() {
            addCriterion("resumeId is not null");
            return (Criteria) this;
        }

        public Criteria andResumeidEqualTo(Integer value) {
            addCriterion("resumeId =", value, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidNotEqualTo(Integer value) {
            addCriterion("resumeId <>", value, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidGreaterThan(Integer value) {
            addCriterion("resumeId >", value, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("resumeId >=", value, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidLessThan(Integer value) {
            addCriterion("resumeId <", value, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidLessThanOrEqualTo(Integer value) {
            addCriterion("resumeId <=", value, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidIn(List<Integer> values) {
            addCriterion("resumeId in", values, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidNotIn(List<Integer> values) {
            addCriterion("resumeId not in", values, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidBetween(Integer value1, Integer value2) {
            addCriterion("resumeId between", value1, value2, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidNotBetween(Integer value1, Integer value2) {
            addCriterion("resumeId not between", value1, value2, "resumeid");
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

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andWorktypeIsNull() {
            addCriterion("workType is null");
            return (Criteria) this;
        }

        public Criteria andWorktypeIsNotNull() {
            addCriterion("workType is not null");
            return (Criteria) this;
        }

        public Criteria andWorktypeEqualTo(Integer value) {
            addCriterion("workType =", value, "worktype");
            return (Criteria) this;
        }

        public Criteria andWorktypeNotEqualTo(Integer value) {
            addCriterion("workType <>", value, "worktype");
            return (Criteria) this;
        }

        public Criteria andWorktypeGreaterThan(Integer value) {
            addCriterion("workType >", value, "worktype");
            return (Criteria) this;
        }

        public Criteria andWorktypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("workType >=", value, "worktype");
            return (Criteria) this;
        }

        public Criteria andWorktypeLessThan(Integer value) {
            addCriterion("workType <", value, "worktype");
            return (Criteria) this;
        }

        public Criteria andWorktypeLessThanOrEqualTo(Integer value) {
            addCriterion("workType <=", value, "worktype");
            return (Criteria) this;
        }

        public Criteria andWorktypeIn(List<Integer> values) {
            addCriterion("workType in", values, "worktype");
            return (Criteria) this;
        }

        public Criteria andWorktypeNotIn(List<Integer> values) {
            addCriterion("workType not in", values, "worktype");
            return (Criteria) this;
        }

        public Criteria andWorktypeBetween(Integer value1, Integer value2) {
            addCriterion("workType between", value1, value2, "worktype");
            return (Criteria) this;
        }

        public Criteria andWorktypeNotBetween(Integer value1, Integer value2) {
            addCriterion("workType not between", value1, value2, "worktype");
            return (Criteria) this;
        }

        public Criteria andExpectedpositionIsNull() {
            addCriterion("expectedPosition is null");
            return (Criteria) this;
        }

        public Criteria andExpectedpositionIsNotNull() {
            addCriterion("expectedPosition is not null");
            return (Criteria) this;
        }

        public Criteria andExpectedpositionEqualTo(String value) {
            addCriterion("expectedPosition =", value, "expectedposition");
            return (Criteria) this;
        }

        public Criteria andExpectedpositionNotEqualTo(String value) {
            addCriterion("expectedPosition <>", value, "expectedposition");
            return (Criteria) this;
        }

        public Criteria andExpectedpositionGreaterThan(String value) {
            addCriterion("expectedPosition >", value, "expectedposition");
            return (Criteria) this;
        }

        public Criteria andExpectedpositionGreaterThanOrEqualTo(String value) {
            addCriterion("expectedPosition >=", value, "expectedposition");
            return (Criteria) this;
        }

        public Criteria andExpectedpositionLessThan(String value) {
            addCriterion("expectedPosition <", value, "expectedposition");
            return (Criteria) this;
        }

        public Criteria andExpectedpositionLessThanOrEqualTo(String value) {
            addCriterion("expectedPosition <=", value, "expectedposition");
            return (Criteria) this;
        }

        public Criteria andExpectedpositionLike(String value) {
            addCriterion("expectedPosition like", value, "expectedposition");
            return (Criteria) this;
        }

        public Criteria andExpectedpositionNotLike(String value) {
            addCriterion("expectedPosition not like", value, "expectedposition");
            return (Criteria) this;
        }

        public Criteria andExpectedpositionIn(List<String> values) {
            addCriterion("expectedPosition in", values, "expectedposition");
            return (Criteria) this;
        }

        public Criteria andExpectedpositionNotIn(List<String> values) {
            addCriterion("expectedPosition not in", values, "expectedposition");
            return (Criteria) this;
        }

        public Criteria andExpectedpositionBetween(String value1, String value2) {
            addCriterion("expectedPosition between", value1, value2, "expectedposition");
            return (Criteria) this;
        }

        public Criteria andExpectedpositionNotBetween(String value1, String value2) {
            addCriterion("expectedPosition not between", value1, value2, "expectedposition");
            return (Criteria) this;
        }

        public Criteria andExpectedsalaryIsNull() {
            addCriterion("expectedSalary is null");
            return (Criteria) this;
        }

        public Criteria andExpectedsalaryIsNotNull() {
            addCriterion("expectedSalary is not null");
            return (Criteria) this;
        }

        public Criteria andExpectedsalaryEqualTo(String value) {
            addCriterion("expectedSalary =", value, "expectedsalary");
            return (Criteria) this;
        }

        public Criteria andExpectedsalaryNotEqualTo(String value) {
            addCriterion("expectedSalary <>", value, "expectedsalary");
            return (Criteria) this;
        }

        public Criteria andExpectedsalaryGreaterThan(String value) {
            addCriterion("expectedSalary >", value, "expectedsalary");
            return (Criteria) this;
        }

        public Criteria andExpectedsalaryGreaterThanOrEqualTo(String value) {
            addCriterion("expectedSalary >=", value, "expectedsalary");
            return (Criteria) this;
        }

        public Criteria andExpectedsalaryLessThan(String value) {
            addCriterion("expectedSalary <", value, "expectedsalary");
            return (Criteria) this;
        }

        public Criteria andExpectedsalaryLessThanOrEqualTo(String value) {
            addCriterion("expectedSalary <=", value, "expectedsalary");
            return (Criteria) this;
        }

        public Criteria andExpectedsalaryLike(String value) {
            addCriterion("expectedSalary like", value, "expectedsalary");
            return (Criteria) this;
        }

        public Criteria andExpectedsalaryNotLike(String value) {
            addCriterion("expectedSalary not like", value, "expectedsalary");
            return (Criteria) this;
        }

        public Criteria andExpectedsalaryIn(List<String> values) {
            addCriterion("expectedSalary in", values, "expectedsalary");
            return (Criteria) this;
        }

        public Criteria andExpectedsalaryNotIn(List<String> values) {
            addCriterion("expectedSalary not in", values, "expectedsalary");
            return (Criteria) this;
        }

        public Criteria andExpectedsalaryBetween(String value1, String value2) {
            addCriterion("expectedSalary between", value1, value2, "expectedsalary");
            return (Criteria) this;
        }

        public Criteria andExpectedsalaryNotBetween(String value1, String value2) {
            addCriterion("expectedSalary not between", value1, value2, "expectedsalary");
            return (Criteria) this;
        }

        public Criteria andSchoolnameIsNull() {
            addCriterion("schoolName is null");
            return (Criteria) this;
        }

        public Criteria andSchoolnameIsNotNull() {
            addCriterion("schoolName is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolnameEqualTo(String value) {
            addCriterion("schoolName =", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameNotEqualTo(String value) {
            addCriterion("schoolName <>", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameGreaterThan(String value) {
            addCriterion("schoolName >", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameGreaterThanOrEqualTo(String value) {
            addCriterion("schoolName >=", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameLessThan(String value) {
            addCriterion("schoolName <", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameLessThanOrEqualTo(String value) {
            addCriterion("schoolName <=", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameLike(String value) {
            addCriterion("schoolName like", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameNotLike(String value) {
            addCriterion("schoolName not like", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameIn(List<String> values) {
            addCriterion("schoolName in", values, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameNotIn(List<String> values) {
            addCriterion("schoolName not in", values, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameBetween(String value1, String value2) {
            addCriterion("schoolName between", value1, value2, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameNotBetween(String value1, String value2) {
            addCriterion("schoolName not between", value1, value2, "schoolname");
            return (Criteria) this;
        }

        public Criteria andProfessionalIsNull() {
            addCriterion("professional is null");
            return (Criteria) this;
        }

        public Criteria andProfessionalIsNotNull() {
            addCriterion("professional is not null");
            return (Criteria) this;
        }

        public Criteria andProfessionalEqualTo(String value) {
            addCriterion("professional =", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalNotEqualTo(String value) {
            addCriterion("professional <>", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalGreaterThan(String value) {
            addCriterion("professional >", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalGreaterThanOrEqualTo(String value) {
            addCriterion("professional >=", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalLessThan(String value) {
            addCriterion("professional <", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalLessThanOrEqualTo(String value) {
            addCriterion("professional <=", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalLike(String value) {
            addCriterion("professional like", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalNotLike(String value) {
            addCriterion("professional not like", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalIn(List<String> values) {
            addCriterion("professional in", values, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalNotIn(List<String> values) {
            addCriterion("professional not in", values, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalBetween(String value1, String value2) {
            addCriterion("professional between", value1, value2, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalNotBetween(String value1, String value2) {
            addCriterion("professional not between", value1, value2, "professional");
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

        public Criteria andBeginyearEqualTo(String value) {
            addCriterion("beginYear =", value, "beginyear");
            return (Criteria) this;
        }

        public Criteria andBeginyearNotEqualTo(String value) {
            addCriterion("beginYear <>", value, "beginyear");
            return (Criteria) this;
        }

        public Criteria andBeginyearGreaterThan(String value) {
            addCriterion("beginYear >", value, "beginyear");
            return (Criteria) this;
        }

        public Criteria andBeginyearGreaterThanOrEqualTo(String value) {
            addCriterion("beginYear >=", value, "beginyear");
            return (Criteria) this;
        }

        public Criteria andBeginyearLessThan(String value) {
            addCriterion("beginYear <", value, "beginyear");
            return (Criteria) this;
        }

        public Criteria andBeginyearLessThanOrEqualTo(String value) {
            addCriterion("beginYear <=", value, "beginyear");
            return (Criteria) this;
        }

        public Criteria andBeginyearLike(String value) {
            addCriterion("beginYear like", value, "beginyear");
            return (Criteria) this;
        }

        public Criteria andBeginyearNotLike(String value) {
            addCriterion("beginYear not like", value, "beginyear");
            return (Criteria) this;
        }

        public Criteria andBeginyearIn(List<String> values) {
            addCriterion("beginYear in", values, "beginyear");
            return (Criteria) this;
        }

        public Criteria andBeginyearNotIn(List<String> values) {
            addCriterion("beginYear not in", values, "beginyear");
            return (Criteria) this;
        }

        public Criteria andBeginyearBetween(String value1, String value2) {
            addCriterion("beginYear between", value1, value2, "beginyear");
            return (Criteria) this;
        }

        public Criteria andBeginyearNotBetween(String value1, String value2) {
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

        public Criteria andEndyearEqualTo(String value) {
            addCriterion("endYear =", value, "endyear");
            return (Criteria) this;
        }

        public Criteria andEndyearNotEqualTo(String value) {
            addCriterion("endYear <>", value, "endyear");
            return (Criteria) this;
        }

        public Criteria andEndyearGreaterThan(String value) {
            addCriterion("endYear >", value, "endyear");
            return (Criteria) this;
        }

        public Criteria andEndyearGreaterThanOrEqualTo(String value) {
            addCriterion("endYear >=", value, "endyear");
            return (Criteria) this;
        }

        public Criteria andEndyearLessThan(String value) {
            addCriterion("endYear <", value, "endyear");
            return (Criteria) this;
        }

        public Criteria andEndyearLessThanOrEqualTo(String value) {
            addCriterion("endYear <=", value, "endyear");
            return (Criteria) this;
        }

        public Criteria andEndyearLike(String value) {
            addCriterion("endYear like", value, "endyear");
            return (Criteria) this;
        }

        public Criteria andEndyearNotLike(String value) {
            addCriterion("endYear not like", value, "endyear");
            return (Criteria) this;
        }

        public Criteria andEndyearIn(List<String> values) {
            addCriterion("endYear in", values, "endyear");
            return (Criteria) this;
        }

        public Criteria andEndyearNotIn(List<String> values) {
            addCriterion("endYear not in", values, "endyear");
            return (Criteria) this;
        }

        public Criteria andEndyearBetween(String value1, String value2) {
            addCriterion("endYear between", value1, value2, "endyear");
            return (Criteria) this;
        }

        public Criteria andEndyearNotBetween(String value1, String value2) {
            addCriterion("endYear not between", value1, value2, "endyear");
            return (Criteria) this;
        }

        public Criteria andSelfdescriptionIsNull() {
            addCriterion("selfDescription is null");
            return (Criteria) this;
        }

        public Criteria andSelfdescriptionIsNotNull() {
            addCriterion("selfDescription is not null");
            return (Criteria) this;
        }

        public Criteria andSelfdescriptionEqualTo(String value) {
            addCriterion("selfDescription =", value, "selfdescription");
            return (Criteria) this;
        }

        public Criteria andSelfdescriptionNotEqualTo(String value) {
            addCriterion("selfDescription <>", value, "selfdescription");
            return (Criteria) this;
        }

        public Criteria andSelfdescriptionGreaterThan(String value) {
            addCriterion("selfDescription >", value, "selfdescription");
            return (Criteria) this;
        }

        public Criteria andSelfdescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("selfDescription >=", value, "selfdescription");
            return (Criteria) this;
        }

        public Criteria andSelfdescriptionLessThan(String value) {
            addCriterion("selfDescription <", value, "selfdescription");
            return (Criteria) this;
        }

        public Criteria andSelfdescriptionLessThanOrEqualTo(String value) {
            addCriterion("selfDescription <=", value, "selfdescription");
            return (Criteria) this;
        }

        public Criteria andSelfdescriptionLike(String value) {
            addCriterion("selfDescription like", value, "selfdescription");
            return (Criteria) this;
        }

        public Criteria andSelfdescriptionNotLike(String value) {
            addCriterion("selfDescription not like", value, "selfdescription");
            return (Criteria) this;
        }

        public Criteria andSelfdescriptionIn(List<String> values) {
            addCriterion("selfDescription in", values, "selfdescription");
            return (Criteria) this;
        }

        public Criteria andSelfdescriptionNotIn(List<String> values) {
            addCriterion("selfDescription not in", values, "selfdescription");
            return (Criteria) this;
        }

        public Criteria andSelfdescriptionBetween(String value1, String value2) {
            addCriterion("selfDescription between", value1, value2, "selfdescription");
            return (Criteria) this;
        }

        public Criteria andSelfdescriptionNotBetween(String value1, String value2) {
            addCriterion("selfDescription not between", value1, value2, "selfdescription");
            return (Criteria) this;
        }

        public Criteria andWorkurlIsNull() {
            addCriterion("workUrl is null");
            return (Criteria) this;
        }

        public Criteria andWorkurlIsNotNull() {
            addCriterion("workUrl is not null");
            return (Criteria) this;
        }

        public Criteria andWorkurlEqualTo(String value) {
            addCriterion("workUrl =", value, "workurl");
            return (Criteria) this;
        }

        public Criteria andWorkurlNotEqualTo(String value) {
            addCriterion("workUrl <>", value, "workurl");
            return (Criteria) this;
        }

        public Criteria andWorkurlGreaterThan(String value) {
            addCriterion("workUrl >", value, "workurl");
            return (Criteria) this;
        }

        public Criteria andWorkurlGreaterThanOrEqualTo(String value) {
            addCriterion("workUrl >=", value, "workurl");
            return (Criteria) this;
        }

        public Criteria andWorkurlLessThan(String value) {
            addCriterion("workUrl <", value, "workurl");
            return (Criteria) this;
        }

        public Criteria andWorkurlLessThanOrEqualTo(String value) {
            addCriterion("workUrl <=", value, "workurl");
            return (Criteria) this;
        }

        public Criteria andWorkurlLike(String value) {
            addCriterion("workUrl like", value, "workurl");
            return (Criteria) this;
        }

        public Criteria andWorkurlNotLike(String value) {
            addCriterion("workUrl not like", value, "workurl");
            return (Criteria) this;
        }

        public Criteria andWorkurlIn(List<String> values) {
            addCriterion("workUrl in", values, "workurl");
            return (Criteria) this;
        }

        public Criteria andWorkurlNotIn(List<String> values) {
            addCriterion("workUrl not in", values, "workurl");
            return (Criteria) this;
        }

        public Criteria andWorkurlBetween(String value1, String value2) {
            addCriterion("workUrl between", value1, value2, "workurl");
            return (Criteria) this;
        }

        public Criteria andWorkurlNotBetween(String value1, String value2) {
            addCriterion("workUrl not between", value1, value2, "workurl");
            return (Criteria) this;
        }

        public Criteria andExplanatorytextIsNull() {
            addCriterion("explanatoryText is null");
            return (Criteria) this;
        }

        public Criteria andExplanatorytextIsNotNull() {
            addCriterion("explanatoryText is not null");
            return (Criteria) this;
        }

        public Criteria andExplanatorytextEqualTo(String value) {
            addCriterion("explanatoryText =", value, "explanatorytext");
            return (Criteria) this;
        }

        public Criteria andExplanatorytextNotEqualTo(String value) {
            addCriterion("explanatoryText <>", value, "explanatorytext");
            return (Criteria) this;
        }

        public Criteria andExplanatorytextGreaterThan(String value) {
            addCriterion("explanatoryText >", value, "explanatorytext");
            return (Criteria) this;
        }

        public Criteria andExplanatorytextGreaterThanOrEqualTo(String value) {
            addCriterion("explanatoryText >=", value, "explanatorytext");
            return (Criteria) this;
        }

        public Criteria andExplanatorytextLessThan(String value) {
            addCriterion("explanatoryText <", value, "explanatorytext");
            return (Criteria) this;
        }

        public Criteria andExplanatorytextLessThanOrEqualTo(String value) {
            addCriterion("explanatoryText <=", value, "explanatorytext");
            return (Criteria) this;
        }

        public Criteria andExplanatorytextLike(String value) {
            addCriterion("explanatoryText like", value, "explanatorytext");
            return (Criteria) this;
        }

        public Criteria andExplanatorytextNotLike(String value) {
            addCriterion("explanatoryText not like", value, "explanatorytext");
            return (Criteria) this;
        }

        public Criteria andExplanatorytextIn(List<String> values) {
            addCriterion("explanatoryText in", values, "explanatorytext");
            return (Criteria) this;
        }

        public Criteria andExplanatorytextNotIn(List<String> values) {
            addCriterion("explanatoryText not in", values, "explanatorytext");
            return (Criteria) this;
        }

        public Criteria andExplanatorytextBetween(String value1, String value2) {
            addCriterion("explanatoryText between", value1, value2, "explanatorytext");
            return (Criteria) this;
        }

        public Criteria andExplanatorytextNotBetween(String value1, String value2) {
            addCriterion("explanatoryText not between", value1, value2, "explanatorytext");
            return (Criteria) this;
        }

        public Criteria andResumeattachmentsIsNull() {
            addCriterion("resumeAttachments is null");
            return (Criteria) this;
        }

        public Criteria andResumeattachmentsIsNotNull() {
            addCriterion("resumeAttachments is not null");
            return (Criteria) this;
        }

        public Criteria andResumeattachmentsEqualTo(String value) {
            addCriterion("resumeAttachments =", value, "resumeattachments");
            return (Criteria) this;
        }

        public Criteria andResumeattachmentsNotEqualTo(String value) {
            addCriterion("resumeAttachments <>", value, "resumeattachments");
            return (Criteria) this;
        }

        public Criteria andResumeattachmentsGreaterThan(String value) {
            addCriterion("resumeAttachments >", value, "resumeattachments");
            return (Criteria) this;
        }

        public Criteria andResumeattachmentsGreaterThanOrEqualTo(String value) {
            addCriterion("resumeAttachments >=", value, "resumeattachments");
            return (Criteria) this;
        }

        public Criteria andResumeattachmentsLessThan(String value) {
            addCriterion("resumeAttachments <", value, "resumeattachments");
            return (Criteria) this;
        }

        public Criteria andResumeattachmentsLessThanOrEqualTo(String value) {
            addCriterion("resumeAttachments <=", value, "resumeattachments");
            return (Criteria) this;
        }

        public Criteria andResumeattachmentsLike(String value) {
            addCriterion("resumeAttachments like", value, "resumeattachments");
            return (Criteria) this;
        }

        public Criteria andResumeattachmentsNotLike(String value) {
            addCriterion("resumeAttachments not like", value, "resumeattachments");
            return (Criteria) this;
        }

        public Criteria andResumeattachmentsIn(List<String> values) {
            addCriterion("resumeAttachments in", values, "resumeattachments");
            return (Criteria) this;
        }

        public Criteria andResumeattachmentsNotIn(List<String> values) {
            addCriterion("resumeAttachments not in", values, "resumeattachments");
            return (Criteria) this;
        }

        public Criteria andResumeattachmentsBetween(String value1, String value2) {
            addCriterion("resumeAttachments between", value1, value2, "resumeattachments");
            return (Criteria) this;
        }

        public Criteria andResumeattachmentsNotBetween(String value1, String value2) {
            addCriterion("resumeAttachments not between", value1, value2, "resumeattachments");
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