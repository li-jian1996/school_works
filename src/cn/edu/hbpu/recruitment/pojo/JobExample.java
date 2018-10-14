package cn.edu.hbpu.recruitment.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JobExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JobExample() {
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

        public Criteria andCompanyidIsNull() {
            addCriterion("companyId is null");
            return (Criteria) this;
        }

        public Criteria andCompanyidIsNotNull() {
            addCriterion("companyId is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyidEqualTo(Integer value) {
            addCriterion("companyId =", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotEqualTo(Integer value) {
            addCriterion("companyId <>", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThan(Integer value) {
            addCriterion("companyId >", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("companyId >=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThan(Integer value) {
            addCriterion("companyId <", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThanOrEqualTo(Integer value) {
            addCriterion("companyId <=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidIn(List<Integer> values) {
            addCriterion("companyId in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotIn(List<Integer> values) {
            addCriterion("companyId not in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidBetween(Integer value1, Integer value2) {
            addCriterion("companyId between", value1, value2, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotBetween(Integer value1, Integer value2) {
            addCriterion("companyId not between", value1, value2, "companyid");
            return (Criteria) this;
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
            addCriterion("job.c3Id =", value, "c3id");
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
            addCriterion(" job.c3Id in", values, "c3id");
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

        public Criteria andDepartmentsIsNull() {
            addCriterion("departments is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentsIsNotNull() {
            addCriterion("departments is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentsEqualTo(String value) {
            addCriterion("departments =", value, "departments");
            return (Criteria) this;
        }

        public Criteria andDepartmentsNotEqualTo(String value) {
            addCriterion("departments <>", value, "departments");
            return (Criteria) this;
        }

        public Criteria andDepartmentsGreaterThan(String value) {
            addCriterion("departments >", value, "departments");
            return (Criteria) this;
        }

        public Criteria andDepartmentsGreaterThanOrEqualTo(String value) {
            addCriterion("departments >=", value, "departments");
            return (Criteria) this;
        }

        public Criteria andDepartmentsLessThan(String value) {
            addCriterion("departments <", value, "departments");
            return (Criteria) this;
        }

        public Criteria andDepartmentsLessThanOrEqualTo(String value) {
            addCriterion("departments <=", value, "departments");
            return (Criteria) this;
        }

        public Criteria andDepartmentsLike(String value) {
            addCriterion("departments like", value, "departments");
            return (Criteria) this;
        }

        public Criteria andDepartmentsNotLike(String value) {
            addCriterion("departments not like", value, "departments");
            return (Criteria) this;
        }

        public Criteria andDepartmentsIn(List<String> values) {
            addCriterion("departments in", values, "departments");
            return (Criteria) this;
        }

        public Criteria andDepartmentsNotIn(List<String> values) {
            addCriterion("departments not in", values, "departments");
            return (Criteria) this;
        }

        public Criteria andDepartmentsBetween(String value1, String value2) {
            addCriterion("departments between", value1, value2, "departments");
            return (Criteria) this;
        }

        public Criteria andDepartmentsNotBetween(String value1, String value2) {
            addCriterion("departments not between", value1, value2, "departments");
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

        public Criteria andEducationIsNull() {
            addCriterion("education is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("education is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(Integer value) {
            addCriterion("education =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(Integer value) {
            addCriterion("education <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(Integer value) {
            addCriterion("education >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(Integer value) {
            addCriterion("education >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(Integer value) {
            addCriterion("education <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(Integer value) {
            addCriterion("education <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<Integer> values) {
            addCriterion("education in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<Integer> values) {
            addCriterion("education not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(Integer value1, Integer value2) {
            addCriterion("education between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(Integer value1, Integer value2) {
            addCriterion("education not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andJobtemptationIsNull() {
            addCriterion("jobTemptation is null");
            return (Criteria) this;
        }

        public Criteria andJobtemptationIsNotNull() {
            addCriterion("jobTemptation is not null");
            return (Criteria) this;
        }

        public Criteria andJobtemptationEqualTo(String value) {
            addCriterion("jobTemptation =", value, "jobtemptation");
            return (Criteria) this;
        }

        public Criteria andJobtemptationNotEqualTo(String value) {
            addCriterion("jobTemptation <>", value, "jobtemptation");
            return (Criteria) this;
        }

        public Criteria andJobtemptationGreaterThan(String value) {
            addCriterion("jobTemptation >", value, "jobtemptation");
            return (Criteria) this;
        }

        public Criteria andJobtemptationGreaterThanOrEqualTo(String value) {
            addCriterion("jobTemptation >=", value, "jobtemptation");
            return (Criteria) this;
        }

        public Criteria andJobtemptationLessThan(String value) {
            addCriterion("jobTemptation <", value, "jobtemptation");
            return (Criteria) this;
        }

        public Criteria andJobtemptationLessThanOrEqualTo(String value) {
            addCriterion("jobTemptation <=", value, "jobtemptation");
            return (Criteria) this;
        }

        public Criteria andJobtemptationLike(String value) {
            addCriterion("jobTemptation like", value, "jobtemptation");
            return (Criteria) this;
        }

        public Criteria andJobtemptationNotLike(String value) {
            addCriterion("jobTemptation not like", value, "jobtemptation");
            return (Criteria) this;
        }

        public Criteria andJobtemptationIn(List<String> values) {
            addCriterion("jobTemptation in", values, "jobtemptation");
            return (Criteria) this;
        }

        public Criteria andJobtemptationNotIn(List<String> values) {
            addCriterion("jobTemptation not in", values, "jobtemptation");
            return (Criteria) this;
        }

        public Criteria andJobtemptationBetween(String value1, String value2) {
            addCriterion("jobTemptation between", value1, value2, "jobtemptation");
            return (Criteria) this;
        }

        public Criteria andJobtemptationNotBetween(String value1, String value2) {
            addCriterion("jobTemptation not between", value1, value2, "jobtemptation");
            return (Criteria) this;
        }

        public Criteria andJobdescribeIsNull() {
            addCriterion("jobDescribe is null");
            return (Criteria) this;
        }

        public Criteria andJobdescribeIsNotNull() {
            addCriterion("jobDescribe is not null");
            return (Criteria) this;
        }

        public Criteria andJobdescribeEqualTo(String value) {
            addCriterion("jobDescribe =", value, "jobdescribe");
            return (Criteria) this;
        }

        public Criteria andJobdescribeNotEqualTo(String value) {
            addCriterion("jobDescribe <>", value, "jobdescribe");
            return (Criteria) this;
        }

        public Criteria andJobdescribeGreaterThan(String value) {
            addCriterion("jobDescribe >", value, "jobdescribe");
            return (Criteria) this;
        }

        public Criteria andJobdescribeGreaterThanOrEqualTo(String value) {
            addCriterion("jobDescribe >=", value, "jobdescribe");
            return (Criteria) this;
        }

        public Criteria andJobdescribeLessThan(String value) {
            addCriterion("jobDescribe <", value, "jobdescribe");
            return (Criteria) this;
        }

        public Criteria andJobdescribeLessThanOrEqualTo(String value) {
            addCriterion("jobDescribe <=", value, "jobdescribe");
            return (Criteria) this;
        }

        public Criteria andJobdescribeLike(String value) {
            addCriterion("jobDescribe like", value, "jobdescribe");
            return (Criteria) this;
        }

        public Criteria andJobdescribeNotLike(String value) {
            addCriterion("jobDescribe not like", value, "jobdescribe");
            return (Criteria) this;
        }

        public Criteria andJobdescribeIn(List<String> values) {
            addCriterion("jobDescribe in", values, "jobdescribe");
            return (Criteria) this;
        }

        public Criteria andJobdescribeNotIn(List<String> values) {
            addCriterion("jobDescribe not in", values, "jobdescribe");
            return (Criteria) this;
        }

        public Criteria andJobdescribeBetween(String value1, String value2) {
            addCriterion("jobDescribe between", value1, value2, "jobdescribe");
            return (Criteria) this;
        }

        public Criteria andJobdescribeNotBetween(String value1, String value2) {
            addCriterion("jobDescribe not between", value1, value2, "jobdescribe");
            return (Criteria) this;
        }

        public Criteria andJobaddressIsNull() {
            addCriterion("jobAddress is null");
            return (Criteria) this;
        }

        public Criteria andJobaddressIsNotNull() {
            addCriterion("jobAddress is not null");
            return (Criteria) this;
        }

        public Criteria andJobaddressEqualTo(String value) {
            addCriterion("jobAddress =", value, "jobaddress");
            return (Criteria) this;
        }

        public Criteria andJobaddressNotEqualTo(String value) {
            addCriterion("jobAddress <>", value, "jobaddress");
            return (Criteria) this;
        }

        public Criteria andJobaddressGreaterThan(String value) {
            addCriterion("jobAddress >", value, "jobaddress");
            return (Criteria) this;
        }

        public Criteria andJobaddressGreaterThanOrEqualTo(String value) {
            addCriterion("jobAddress >=", value, "jobaddress");
            return (Criteria) this;
        }

        public Criteria andJobaddressLessThan(String value) {
            addCriterion("jobAddress <", value, "jobaddress");
            return (Criteria) this;
        }

        public Criteria andJobaddressLessThanOrEqualTo(String value) {
            addCriterion("jobAddress <=", value, "jobaddress");
            return (Criteria) this;
        }

        public Criteria andJobaddressLike(String value) {
            addCriterion("jobAddress like", value, "jobaddress");
            return (Criteria) this;
        }

        public Criteria andJobaddressNotLike(String value) {
            addCriterion("jobAddress not like", value, "jobaddress");
            return (Criteria) this;
        }

        public Criteria andJobaddressIn(List<String> values) {
            addCriterion("jobAddress in", values, "jobaddress");
            return (Criteria) this;
        }

        public Criteria andJobaddressNotIn(List<String> values) {
            addCriterion("jobAddress not in", values, "jobaddress");
            return (Criteria) this;
        }

        public Criteria andJobaddressBetween(String value1, String value2) {
            addCriterion("jobAddress between", value1, value2, "jobaddress");
            return (Criteria) this;
        }

        public Criteria andJobaddressNotBetween(String value1, String value2) {
            addCriterion("jobAddress not between", value1, value2, "jobaddress");
            return (Criteria) this;
        }

        public Criteria andJobemailIsNull() {
            addCriterion("jobEmail is null");
            return (Criteria) this;
        }

        public Criteria andJobemailIsNotNull() {
            addCriterion("jobEmail is not null");
            return (Criteria) this;
        }

        public Criteria andJobemailEqualTo(String value) {
            addCriterion("jobEmail =", value, "jobemail");
            return (Criteria) this;
        }

        public Criteria andJobemailNotEqualTo(String value) {
            addCriterion("jobEmail <>", value, "jobemail");
            return (Criteria) this;
        }

        public Criteria andJobemailGreaterThan(String value) {
            addCriterion("jobEmail >", value, "jobemail");
            return (Criteria) this;
        }

        public Criteria andJobemailGreaterThanOrEqualTo(String value) {
            addCriterion("jobEmail >=", value, "jobemail");
            return (Criteria) this;
        }

        public Criteria andJobemailLessThan(String value) {
            addCriterion("jobEmail <", value, "jobemail");
            return (Criteria) this;
        }

        public Criteria andJobemailLessThanOrEqualTo(String value) {
            addCriterion("jobEmail <=", value, "jobemail");
            return (Criteria) this;
        }

        public Criteria andJobemailLike(String value) {
            addCriterion("jobEmail like", value, "jobemail");
            return (Criteria) this;
        }

        public Criteria andJobemailNotLike(String value) {
            addCriterion("jobEmail not like", value, "jobemail");
            return (Criteria) this;
        }

        public Criteria andJobemailIn(List<String> values) {
            addCriterion("jobEmail in", values, "jobemail");
            return (Criteria) this;
        }

        public Criteria andJobemailNotIn(List<String> values) {
            addCriterion("jobEmail not in", values, "jobemail");
            return (Criteria) this;
        }

        public Criteria andJobemailBetween(String value1, String value2) {
            addCriterion("jobEmail between", value1, value2, "jobemail");
            return (Criteria) this;
        }

        public Criteria andJobemailNotBetween(String value1, String value2) {
            addCriterion("jobEmail not between", value1, value2, "jobemail");
            return (Criteria) this;
        }

        public Criteria andSalarybeginIsNull() {
            addCriterion("salaryBegin is null");
            return (Criteria) this;
        }

        public Criteria andSalarybeginIsNotNull() {
            addCriterion("salaryBegin is not null");
            return (Criteria) this;
        }

        public Criteria andSalarybeginEqualTo(Integer value) {
            addCriterion("salaryBegin =", value, "salarybegin");
            return (Criteria) this;
        }

        public Criteria andSalarybeginNotEqualTo(Integer value) {
            addCriterion("salaryBegin <>", value, "salarybegin");
            return (Criteria) this;
        }

        public Criteria andSalarybeginGreaterThan(Integer value) {
            addCriterion("salaryBegin >", value, "salarybegin");
            return (Criteria) this;
        }

        public Criteria andSalarybeginGreaterThanOrEqualTo(Integer value) {
            addCriterion("salaryBegin >=", value, "salarybegin");
            return (Criteria) this;
        }

        public Criteria andSalarybeginLessThan(Integer value) {
            addCriterion("salaryBegin <", value, "salarybegin");
            return (Criteria) this;
        }

        public Criteria andSalarybeginLessThanOrEqualTo(Integer value) {
            addCriterion("salaryBegin <=", value, "salarybegin");
            return (Criteria) this;
        }

        public Criteria andSalarybeginIn(List<Integer> values) {
            addCriterion("salaryBegin in", values, "salarybegin");
            return (Criteria) this;
        }

        public Criteria andSalarybeginNotIn(List<Integer> values) {
            addCriterion("salaryBegin not in", values, "salarybegin");
            return (Criteria) this;
        }

        public Criteria andSalarybeginBetween(Integer value1, Integer value2) {
            addCriterion("salaryBegin between", value1, value2, "salarybegin");
            return (Criteria) this;
        }

        public Criteria andSalarybeginNotBetween(Integer value1, Integer value2) {
            addCriterion("salaryBegin not between", value1, value2, "salarybegin");
            return (Criteria) this;
        }

        public Criteria andSalaryendIsNull() {
            addCriterion("salaryEnd is null");
            return (Criteria) this;
        }

        public Criteria andSalaryendIsNotNull() {
            addCriterion("salaryEnd is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryendEqualTo(Integer value) {
            addCriterion("salaryEnd =", value, "salaryend");
            return (Criteria) this;
        }

        public Criteria andSalaryendNotEqualTo(Integer value) {
            addCriterion("salaryEnd <>", value, "salaryend");
            return (Criteria) this;
        }

        public Criteria andSalaryendGreaterThan(Integer value) {
            addCriterion("salaryEnd >", value, "salaryend");
            return (Criteria) this;
        }

        public Criteria andSalaryendGreaterThanOrEqualTo(Integer value) {
            addCriterion("salaryEnd >=", value, "salaryend");
            return (Criteria) this;
        }

        public Criteria andSalaryendLessThan(Integer value) {
            addCriterion("salaryEnd <", value, "salaryend");
            return (Criteria) this;
        }

        public Criteria andSalaryendLessThanOrEqualTo(Integer value) {
            addCriterion("salaryEnd <=", value, "salaryend");
            return (Criteria) this;
        }

        public Criteria andSalaryendIn(List<Integer> values) {
            addCriterion("salaryEnd in", values, "salaryend");
            return (Criteria) this;
        }

        public Criteria andSalaryendNotIn(List<Integer> values) {
            addCriterion("salaryEnd not in", values, "salaryend");
            return (Criteria) this;
        }

        public Criteria andSalaryendBetween(Integer value1, Integer value2) {
            addCriterion("salaryEnd between", value1, value2, "salaryend");
            return (Criteria) this;
        }

        public Criteria andSalaryendNotBetween(Integer value1, Integer value2) {
            addCriterion("salaryEnd not between", value1, value2, "salaryend");
            return (Criteria) this;
        }

        public Criteria andJobcityIsNull() {
            addCriterion("jobCity is null");
            return (Criteria) this;
        }

        public Criteria andJobcityIsNotNull() {
            addCriterion("jobCity is not null");
            return (Criteria) this;
        }

        public Criteria andJobcityEqualTo(String value) {
            addCriterion("jobCity =", value, "jobcity");
            return (Criteria) this;
        }

        public Criteria andJobcityNotEqualTo(String value) {
            addCriterion("jobCity <>", value, "jobcity");
            return (Criteria) this;
        }

        public Criteria andJobcityGreaterThan(String value) {
            addCriterion("jobCity >", value, "jobcity");
            return (Criteria) this;
        }

        public Criteria andJobcityGreaterThanOrEqualTo(String value) {
            addCriterion("jobCity >=", value, "jobcity");
            return (Criteria) this;
        }

        public Criteria andJobcityLessThan(String value) {
            addCriterion("jobCity <", value, "jobcity");
            return (Criteria) this;
        }

        public Criteria andJobcityLessThanOrEqualTo(String value) {
            addCriterion("jobCity <=", value, "jobcity");
            return (Criteria) this;
        }

        public Criteria andJobcityLike(String value) {
            addCriterion("jobCity like", value, "jobcity");
            return (Criteria) this;
        }

        public Criteria andJobcityNotLike(String value) {
            addCriterion("jobCity not like", value, "jobcity");
            return (Criteria) this;
        }

        public Criteria andJobcityIn(List<String> values) {
            addCriterion("jobCity in", values, "jobcity");
            return (Criteria) this;
        }

        public Criteria andJobcityNotIn(List<String> values) {
            addCriterion("jobCity not in", values, "jobcity");
            return (Criteria) this;
        }

        public Criteria andJobcityBetween(String value1, String value2) {
            addCriterion("jobCity between", value1, value2, "jobcity");
            return (Criteria) this;
        }

        public Criteria andJobcityNotBetween(String value1, String value2) {
            addCriterion("jobCity not between", value1, value2, "jobcity");
            return (Criteria) this;
        }

        public Criteria andJobexperienceIsNull() {
            addCriterion("JobexpErience is null");
            return (Criteria) this;
        }

        public Criteria andJobexperienceIsNotNull() {
            addCriterion("JobexpErience is not null");
            return (Criteria) this;
        }

        public Criteria andJobexperienceEqualTo(String value) {
            addCriterion("JobexpErience =", value, "jobexperience");
            return (Criteria) this;
        }

        public Criteria andJobexperienceNotEqualTo(String value) {
            addCriterion("JobexpErience <>", value, "jobexperience");
            return (Criteria) this;
        }

        public Criteria andJobexperienceGreaterThan(String value) {
            addCriterion("JobexpErience >", value, "jobexperience");
            return (Criteria) this;
        }

        public Criteria andJobexperienceGreaterThanOrEqualTo(String value) {
            addCriterion("JobexpErience >=", value, "jobexperience");
            return (Criteria) this;
        }

        public Criteria andJobexperienceLessThan(String value) {
            addCriterion("JobexpErience <", value, "jobexperience");
            return (Criteria) this;
        }

        public Criteria andJobexperienceLessThanOrEqualTo(String value) {
            addCriterion("JobexpErience <=", value, "jobexperience");
            return (Criteria) this;
        }

        public Criteria andJobexperienceLike(String value) {
            addCriterion("JobexpErience like", value, "jobexperience");
            return (Criteria) this;
        }

        public Criteria andJobexperienceNotLike(String value) {
            addCriterion("JobexpErience not like", value, "jobexperience");
            return (Criteria) this;
        }

        public Criteria andJobexperienceIn(List<String> values) {
            addCriterion("JobexpErience in", values, "jobexperience");
            return (Criteria) this;
        }

        public Criteria andJobexperienceNotIn(List<String> values) {
            addCriterion("JobexpErience not in", values, "jobexperience");
            return (Criteria) this;
        }

        public Criteria andJobexperienceBetween(String value1, String value2) {
            addCriterion("JobexpErience between", value1, value2, "jobexperience");
            return (Criteria) this;
        }

        public Criteria andJobexperienceNotBetween(String value1, String value2) {
            addCriterion("JobexpErience not between", value1, value2, "jobexperience");
            return (Criteria) this;
        }

        public Criteria andBegintimeIsNull() {
            addCriterion("beginTime is null");
            return (Criteria) this;
        }

        public Criteria andBegintimeIsNotNull() {
            addCriterion("beginTime is not null");
            return (Criteria) this;
        }

        public Criteria andBegintimeEqualTo(Date value) {
            addCriterion("beginTime =", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotEqualTo(Date value) {
            addCriterion("beginTime <>", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeGreaterThan(Date value) {
            addCriterion("beginTime >", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("beginTime >=", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeLessThan(Date value) {
            addCriterion("beginTime <", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeLessThanOrEqualTo(Date value) {
            addCriterion("beginTime <=", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeIn(List<Date> values) {
            addCriterion("beginTime in", values, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotIn(List<Date> values) {
            addCriterion("beginTime not in", values, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeBetween(Date value1, Date value2) {
            addCriterion("beginTime between", value1, value2, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotBetween(Date value1, Date value2) {
            addCriterion("beginTime not between", value1, value2, "begintime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endTime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("endTime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("endTime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("endTime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("endTime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("endTime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("endTime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("endTime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("endTime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("endTime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("endTime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andHitsIsNull() {
            addCriterion("hits is null");
            return (Criteria) this;
        }

        public Criteria andHitsIsNotNull() {
            addCriterion("hits is not null");
            return (Criteria) this;
        }

        public Criteria andHitsEqualTo(Integer value) {
            addCriterion("hits =", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsNotEqualTo(Integer value) {
            addCriterion("hits <>", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsGreaterThan(Integer value) {
            addCriterion("hits >", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsGreaterThanOrEqualTo(Integer value) {
            addCriterion("hits >=", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsLessThan(Integer value) {
            addCriterion("hits <", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsLessThanOrEqualTo(Integer value) {
            addCriterion("hits <=", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsIn(List<Integer> values) {
            addCriterion("hits in", values, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsNotIn(List<Integer> values) {
            addCriterion("hits not in", values, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsBetween(Integer value1, Integer value2) {
            addCriterion("hits between", value1, value2, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsNotBetween(Integer value1, Integer value2) {
            addCriterion("hits not between", value1, value2, "hits");
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