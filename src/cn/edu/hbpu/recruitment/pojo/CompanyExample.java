package cn.edu.hbpu.recruitment.pojo;

import java.util.ArrayList;
import java.util.List;

public class CompanyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompanyExample() {
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

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andPwdIsNull() {
            addCriterion("pwd is null");
            return (Criteria) this;
        }

        public Criteria andPwdIsNotNull() {
            addCriterion("pwd is not null");
            return (Criteria) this;
        }

        public Criteria andPwdEqualTo(String value) {
            addCriterion("pwd =", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotEqualTo(String value) {
            addCriterion("pwd <>", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdGreaterThan(String value) {
            addCriterion("pwd >", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdGreaterThanOrEqualTo(String value) {
            addCriterion("pwd >=", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLessThan(String value) {
            addCriterion("pwd <", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLessThanOrEqualTo(String value) {
            addCriterion("pwd <=", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLike(String value) {
            addCriterion("pwd like", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotLike(String value) {
            addCriterion("pwd not like", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdIn(List<String> values) {
            addCriterion("pwd in", values, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotIn(List<String> values) {
            addCriterion("pwd not in", values, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdBetween(String value1, String value2) {
            addCriterion("pwd between", value1, value2, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotBetween(String value1, String value2) {
            addCriterion("pwd not between", value1, value2, "pwd");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNull() {
            addCriterion("companyName is null");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNotNull() {
            addCriterion("companyName is not null");
            return (Criteria) this;
        }

        public Criteria andCompanynameEqualTo(String value) {
            addCriterion("companyName =", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotEqualTo(String value) {
            addCriterion("companyName <>", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThan(String value) {
            addCriterion("companyName >", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThanOrEqualTo(String value) {
            addCriterion("companyName >=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThan(String value) {
            addCriterion("companyName <", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThanOrEqualTo(String value) {
            addCriterion("companyName <=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLike(String value) {
            addCriterion("companyName like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotLike(String value) {
            addCriterion("companyName not like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameIn(List<String> values) {
            addCriterion("companyName in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotIn(List<String> values) {
            addCriterion("companyName not in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameBetween(String value1, String value2) {
            addCriterion("companyName between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotBetween(String value1, String value2) {
            addCriterion("companyName not between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanyshortnameIsNull() {
            addCriterion("companyShortName is null");
            return (Criteria) this;
        }

        public Criteria andCompanyshortnameIsNotNull() {
            addCriterion("companyShortName is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyshortnameEqualTo(String value) {
            addCriterion("companyShortName =", value, "companyshortname");
            return (Criteria) this;
        }

        public Criteria andCompanyshortnameNotEqualTo(String value) {
            addCriterion("companyShortName <>", value, "companyshortname");
            return (Criteria) this;
        }

        public Criteria andCompanyshortnameGreaterThan(String value) {
            addCriterion("companyShortName >", value, "companyshortname");
            return (Criteria) this;
        }

        public Criteria andCompanyshortnameGreaterThanOrEqualTo(String value) {
            addCriterion("companyShortName >=", value, "companyshortname");
            return (Criteria) this;
        }

        public Criteria andCompanyshortnameLessThan(String value) {
            addCriterion("companyShortName <", value, "companyshortname");
            return (Criteria) this;
        }

        public Criteria andCompanyshortnameLessThanOrEqualTo(String value) {
            addCriterion("companyShortName <=", value, "companyshortname");
            return (Criteria) this;
        }

        public Criteria andCompanyshortnameLike(String value) {
            addCriterion("companyShortName like", value, "companyshortname");
            return (Criteria) this;
        }

        public Criteria andCompanyshortnameNotLike(String value) {
            addCriterion("companyShortName not like", value, "companyshortname");
            return (Criteria) this;
        }

        public Criteria andCompanyshortnameIn(List<String> values) {
            addCriterion("companyShortName in", values, "companyshortname");
            return (Criteria) this;
        }

        public Criteria andCompanyshortnameNotIn(List<String> values) {
            addCriterion("companyShortName not in", values, "companyshortname");
            return (Criteria) this;
        }

        public Criteria andCompanyshortnameBetween(String value1, String value2) {
            addCriterion("companyShortName between", value1, value2, "companyshortname");
            return (Criteria) this;
        }

        public Criteria andCompanyshortnameNotBetween(String value1, String value2) {
            addCriterion("companyShortName not between", value1, value2, "companyshortname");
            return (Criteria) this;
        }

        public Criteria andCompanylogoIsNull() {
            addCriterion("companyLogo is null");
            return (Criteria) this;
        }

        public Criteria andCompanylogoIsNotNull() {
            addCriterion("companyLogo is not null");
            return (Criteria) this;
        }

        public Criteria andCompanylogoEqualTo(String value) {
            addCriterion("companyLogo =", value, "companylogo");
            return (Criteria) this;
        }

        public Criteria andCompanylogoNotEqualTo(String value) {
            addCriterion("companyLogo <>", value, "companylogo");
            return (Criteria) this;
        }

        public Criteria andCompanylogoGreaterThan(String value) {
            addCriterion("companyLogo >", value, "companylogo");
            return (Criteria) this;
        }

        public Criteria andCompanylogoGreaterThanOrEqualTo(String value) {
            addCriterion("companyLogo >=", value, "companylogo");
            return (Criteria) this;
        }

        public Criteria andCompanylogoLessThan(String value) {
            addCriterion("companyLogo <", value, "companylogo");
            return (Criteria) this;
        }

        public Criteria andCompanylogoLessThanOrEqualTo(String value) {
            addCriterion("companyLogo <=", value, "companylogo");
            return (Criteria) this;
        }

        public Criteria andCompanylogoLike(String value) {
            addCriterion("companyLogo like", value, "companylogo");
            return (Criteria) this;
        }

        public Criteria andCompanylogoNotLike(String value) {
            addCriterion("companyLogo not like", value, "companylogo");
            return (Criteria) this;
        }

        public Criteria andCompanylogoIn(List<String> values) {
            addCriterion("companyLogo in", values, "companylogo");
            return (Criteria) this;
        }

        public Criteria andCompanylogoNotIn(List<String> values) {
            addCriterion("companyLogo not in", values, "companylogo");
            return (Criteria) this;
        }

        public Criteria andCompanylogoBetween(String value1, String value2) {
            addCriterion("companyLogo between", value1, value2, "companylogo");
            return (Criteria) this;
        }

        public Criteria andCompanylogoNotBetween(String value1, String value2) {
            addCriterion("companyLogo not between", value1, value2, "companylogo");
            return (Criteria) this;
        }

        public Criteria andCompanywebsiteIsNull() {
            addCriterion("companyWebsite is null");
            return (Criteria) this;
        }

        public Criteria andCompanywebsiteIsNotNull() {
            addCriterion("companyWebsite is not null");
            return (Criteria) this;
        }

        public Criteria andCompanywebsiteEqualTo(String value) {
            addCriterion("companyWebsite =", value, "companywebsite");
            return (Criteria) this;
        }

        public Criteria andCompanywebsiteNotEqualTo(String value) {
            addCriterion("companyWebsite <>", value, "companywebsite");
            return (Criteria) this;
        }

        public Criteria andCompanywebsiteGreaterThan(String value) {
            addCriterion("companyWebsite >", value, "companywebsite");
            return (Criteria) this;
        }

        public Criteria andCompanywebsiteGreaterThanOrEqualTo(String value) {
            addCriterion("companyWebsite >=", value, "companywebsite");
            return (Criteria) this;
        }

        public Criteria andCompanywebsiteLessThan(String value) {
            addCriterion("companyWebsite <", value, "companywebsite");
            return (Criteria) this;
        }

        public Criteria andCompanywebsiteLessThanOrEqualTo(String value) {
            addCriterion("companyWebsite <=", value, "companywebsite");
            return (Criteria) this;
        }

        public Criteria andCompanywebsiteLike(String value) {
            addCriterion("companyWebsite like", value, "companywebsite");
            return (Criteria) this;
        }

        public Criteria andCompanywebsiteNotLike(String value) {
            addCriterion("companyWebsite not like", value, "companywebsite");
            return (Criteria) this;
        }

        public Criteria andCompanywebsiteIn(List<String> values) {
            addCriterion("companyWebsite in", values, "companywebsite");
            return (Criteria) this;
        }

        public Criteria andCompanywebsiteNotIn(List<String> values) {
            addCriterion("companyWebsite not in", values, "companywebsite");
            return (Criteria) this;
        }

        public Criteria andCompanywebsiteBetween(String value1, String value2) {
            addCriterion("companyWebsite between", value1, value2, "companywebsite");
            return (Criteria) this;
        }

        public Criteria andCompanywebsiteNotBetween(String value1, String value2) {
            addCriterion("companyWebsite not between", value1, value2, "companywebsite");
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

        public Criteria andIndustryIsNull() {
            addCriterion("industry is null");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNotNull() {
            addCriterion("industry is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryEqualTo(String value) {
            addCriterion("industry =", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotEqualTo(String value) {
            addCriterion("industry <>", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThan(String value) {
            addCriterion("industry >", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThanOrEqualTo(String value) {
            addCriterion("industry >=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThan(String value) {
            addCriterion("industry <", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThanOrEqualTo(String value) {
            addCriterion("industry <=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLike(String value) {
            addCriterion("industry like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotLike(String value) {
            addCriterion("industry not like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryIn(List<String> values) {
            addCriterion("industry in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotIn(List<String> values) {
            addCriterion("industry not in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryBetween(String value1, String value2) {
            addCriterion("industry between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotBetween(String value1, String value2) {
            addCriterion("industry not between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andCompanysizeIsNull() {
            addCriterion("companySize is null");
            return (Criteria) this;
        }

        public Criteria andCompanysizeIsNotNull() {
            addCriterion("companySize is not null");
            return (Criteria) this;
        }

        public Criteria andCompanysizeEqualTo(String value) {
            addCriterion("companySize =", value, "companysize");
            return (Criteria) this;
        }

        public Criteria andCompanysizeNotEqualTo(String value) {
            addCriterion("companySize <>", value, "companysize");
            return (Criteria) this;
        }

        public Criteria andCompanysizeGreaterThan(String value) {
            addCriterion("companySize >", value, "companysize");
            return (Criteria) this;
        }

        public Criteria andCompanysizeGreaterThanOrEqualTo(String value) {
            addCriterion("companySize >=", value, "companysize");
            return (Criteria) this;
        }

        public Criteria andCompanysizeLessThan(String value) {
            addCriterion("companySize <", value, "companysize");
            return (Criteria) this;
        }

        public Criteria andCompanysizeLessThanOrEqualTo(String value) {
            addCriterion("companySize <=", value, "companysize");
            return (Criteria) this;
        }

        public Criteria andCompanysizeLike(String value) {
            addCriterion("companySize like", value, "companysize");
            return (Criteria) this;
        }

        public Criteria andCompanysizeNotLike(String value) {
            addCriterion("companySize not like", value, "companysize");
            return (Criteria) this;
        }

        public Criteria andCompanysizeIn(List<String> values) {
            addCriterion("companySize in", values, "companysize");
            return (Criteria) this;
        }

        public Criteria andCompanysizeNotIn(List<String> values) {
            addCriterion("companySize not in", values, "companysize");
            return (Criteria) this;
        }

        public Criteria andCompanysizeBetween(String value1, String value2) {
            addCriterion("companySize between", value1, value2, "companysize");
            return (Criteria) this;
        }

        public Criteria andCompanysizeNotBetween(String value1, String value2) {
            addCriterion("companySize not between", value1, value2, "companysize");
            return (Criteria) this;
        }

        public Criteria andDevelopmentIsNull() {
            addCriterion("development is null");
            return (Criteria) this;
        }

        public Criteria andDevelopmentIsNotNull() {
            addCriterion("development is not null");
            return (Criteria) this;
        }

        public Criteria andDevelopmentEqualTo(String value) {
            addCriterion("development =", value, "development");
            return (Criteria) this;
        }

        public Criteria andDevelopmentNotEqualTo(String value) {
            addCriterion("development <>", value, "development");
            return (Criteria) this;
        }

        public Criteria andDevelopmentGreaterThan(String value) {
            addCriterion("development >", value, "development");
            return (Criteria) this;
        }

        public Criteria andDevelopmentGreaterThanOrEqualTo(String value) {
            addCriterion("development >=", value, "development");
            return (Criteria) this;
        }

        public Criteria andDevelopmentLessThan(String value) {
            addCriterion("development <", value, "development");
            return (Criteria) this;
        }

        public Criteria andDevelopmentLessThanOrEqualTo(String value) {
            addCriterion("development <=", value, "development");
            return (Criteria) this;
        }

        public Criteria andDevelopmentLike(String value) {
            addCriterion("development like", value, "development");
            return (Criteria) this;
        }

        public Criteria andDevelopmentNotLike(String value) {
            addCriterion("development not like", value, "development");
            return (Criteria) this;
        }

        public Criteria andDevelopmentIn(List<String> values) {
            addCriterion("development in", values, "development");
            return (Criteria) this;
        }

        public Criteria andDevelopmentNotIn(List<String> values) {
            addCriterion("development not in", values, "development");
            return (Criteria) this;
        }

        public Criteria andDevelopmentBetween(String value1, String value2) {
            addCriterion("development between", value1, value2, "development");
            return (Criteria) this;
        }

        public Criteria andDevelopmentNotBetween(String value1, String value2) {
            addCriterion("development not between", value1, value2, "development");
            return (Criteria) this;
        }

        public Criteria andCompanytagIsNull() {
            addCriterion("companyTag is null");
            return (Criteria) this;
        }

        public Criteria andCompanytagIsNotNull() {
            addCriterion("companyTag is not null");
            return (Criteria) this;
        }

        public Criteria andCompanytagEqualTo(String value) {
            addCriterion("companyTag =", value, "companytag");
            return (Criteria) this;
        }

        public Criteria andCompanytagNotEqualTo(String value) {
            addCriterion("companyTag <>", value, "companytag");
            return (Criteria) this;
        }

        public Criteria andCompanytagGreaterThan(String value) {
            addCriterion("companyTag >", value, "companytag");
            return (Criteria) this;
        }

        public Criteria andCompanytagGreaterThanOrEqualTo(String value) {
            addCriterion("companyTag >=", value, "companytag");
            return (Criteria) this;
        }

        public Criteria andCompanytagLessThan(String value) {
            addCriterion("companyTag <", value, "companytag");
            return (Criteria) this;
        }

        public Criteria andCompanytagLessThanOrEqualTo(String value) {
            addCriterion("companyTag <=", value, "companytag");
            return (Criteria) this;
        }

        public Criteria andCompanytagLike(String value) {
            addCriterion("companyTag like", value, "companytag");
            return (Criteria) this;
        }

        public Criteria andCompanytagNotLike(String value) {
            addCriterion("companyTag not like", value, "companytag");
            return (Criteria) this;
        }

        public Criteria andCompanytagIn(List<String> values) {
            addCriterion("companyTag in", values, "companytag");
            return (Criteria) this;
        }

        public Criteria andCompanytagNotIn(List<String> values) {
            addCriterion("companyTag not in", values, "companytag");
            return (Criteria) this;
        }

        public Criteria andCompanytagBetween(String value1, String value2) {
            addCriterion("companyTag between", value1, value2, "companytag");
            return (Criteria) this;
        }

        public Criteria andCompanytagNotBetween(String value1, String value2) {
            addCriterion("companyTag not between", value1, value2, "companytag");
            return (Criteria) this;
        }

        public Criteria andCompanyidimageIsNull() {
            addCriterion("CompanyIdImage is null");
            return (Criteria) this;
        }

        public Criteria andCompanyidimageIsNotNull() {
            addCriterion("CompanyIdImage is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyidimageEqualTo(String value) {
            addCriterion("CompanyIdImage =", value, "companyidimage");
            return (Criteria) this;
        }

        public Criteria andCompanyidimageNotEqualTo(String value) {
            addCriterion("CompanyIdImage <>", value, "companyidimage");
            return (Criteria) this;
        }

        public Criteria andCompanyidimageGreaterThan(String value) {
            addCriterion("CompanyIdImage >", value, "companyidimage");
            return (Criteria) this;
        }

        public Criteria andCompanyidimageGreaterThanOrEqualTo(String value) {
            addCriterion("CompanyIdImage >=", value, "companyidimage");
            return (Criteria) this;
        }

        public Criteria andCompanyidimageLessThan(String value) {
            addCriterion("CompanyIdImage <", value, "companyidimage");
            return (Criteria) this;
        }

        public Criteria andCompanyidimageLessThanOrEqualTo(String value) {
            addCriterion("CompanyIdImage <=", value, "companyidimage");
            return (Criteria) this;
        }

        public Criteria andCompanyidimageLike(String value) {
            addCriterion("CompanyIdImage like", value, "companyidimage");
            return (Criteria) this;
        }

        public Criteria andCompanyidimageNotLike(String value) {
            addCriterion("CompanyIdImage not like", value, "companyidimage");
            return (Criteria) this;
        }

        public Criteria andCompanyidimageIn(List<String> values) {
            addCriterion("CompanyIdImage in", values, "companyidimage");
            return (Criteria) this;
        }

        public Criteria andCompanyidimageNotIn(List<String> values) {
            addCriterion("CompanyIdImage not in", values, "companyidimage");
            return (Criteria) this;
        }

        public Criteria andCompanyidimageBetween(String value1, String value2) {
            addCriterion("CompanyIdImage between", value1, value2, "companyidimage");
            return (Criteria) this;
        }

        public Criteria andCompanyidimageNotBetween(String value1, String value2) {
            addCriterion("CompanyIdImage not between", value1, value2, "companyidimage");
            return (Criteria) this;
        }

        public Criteria andCeonameIsNull() {
            addCriterion("ceoName is null");
            return (Criteria) this;
        }

        public Criteria andCeonameIsNotNull() {
            addCriterion("ceoName is not null");
            return (Criteria) this;
        }

        public Criteria andCeonameEqualTo(String value) {
            addCriterion("ceoName =", value, "ceoname");
            return (Criteria) this;
        }

        public Criteria andCeonameNotEqualTo(String value) {
            addCriterion("ceoName <>", value, "ceoname");
            return (Criteria) this;
        }

        public Criteria andCeonameGreaterThan(String value) {
            addCriterion("ceoName >", value, "ceoname");
            return (Criteria) this;
        }

        public Criteria andCeonameGreaterThanOrEqualTo(String value) {
            addCriterion("ceoName >=", value, "ceoname");
            return (Criteria) this;
        }

        public Criteria andCeonameLessThan(String value) {
            addCriterion("ceoName <", value, "ceoname");
            return (Criteria) this;
        }

        public Criteria andCeonameLessThanOrEqualTo(String value) {
            addCriterion("ceoName <=", value, "ceoname");
            return (Criteria) this;
        }

        public Criteria andCeonameLike(String value) {
            addCriterion("ceoName like", value, "ceoname");
            return (Criteria) this;
        }

        public Criteria andCeonameNotLike(String value) {
            addCriterion("ceoName not like", value, "ceoname");
            return (Criteria) this;
        }

        public Criteria andCeonameIn(List<String> values) {
            addCriterion("ceoName in", values, "ceoname");
            return (Criteria) this;
        }

        public Criteria andCeonameNotIn(List<String> values) {
            addCriterion("ceoName not in", values, "ceoname");
            return (Criteria) this;
        }

        public Criteria andCeonameBetween(String value1, String value2) {
            addCriterion("ceoName between", value1, value2, "ceoname");
            return (Criteria) this;
        }

        public Criteria andCeonameNotBetween(String value1, String value2) {
            addCriterion("ceoName not between", value1, value2, "ceoname");
            return (Criteria) this;
        }

        public Criteria andCeointroducedIsNull() {
            addCriterion("ceoIntroduced is null");
            return (Criteria) this;
        }

        public Criteria andCeointroducedIsNotNull() {
            addCriterion("ceoIntroduced is not null");
            return (Criteria) this;
        }

        public Criteria andCeointroducedEqualTo(String value) {
            addCriterion("ceoIntroduced =", value, "ceointroduced");
            return (Criteria) this;
        }

        public Criteria andCeointroducedNotEqualTo(String value) {
            addCriterion("ceoIntroduced <>", value, "ceointroduced");
            return (Criteria) this;
        }

        public Criteria andCeointroducedGreaterThan(String value) {
            addCriterion("ceoIntroduced >", value, "ceointroduced");
            return (Criteria) this;
        }

        public Criteria andCeointroducedGreaterThanOrEqualTo(String value) {
            addCriterion("ceoIntroduced >=", value, "ceointroduced");
            return (Criteria) this;
        }

        public Criteria andCeointroducedLessThan(String value) {
            addCriterion("ceoIntroduced <", value, "ceointroduced");
            return (Criteria) this;
        }

        public Criteria andCeointroducedLessThanOrEqualTo(String value) {
            addCriterion("ceoIntroduced <=", value, "ceointroduced");
            return (Criteria) this;
        }

        public Criteria andCeointroducedLike(String value) {
            addCriterion("ceoIntroduced like", value, "ceointroduced");
            return (Criteria) this;
        }

        public Criteria andCeointroducedNotLike(String value) {
            addCriterion("ceoIntroduced not like", value, "ceointroduced");
            return (Criteria) this;
        }

        public Criteria andCeointroducedIn(List<String> values) {
            addCriterion("ceoIntroduced in", values, "ceointroduced");
            return (Criteria) this;
        }

        public Criteria andCeointroducedNotIn(List<String> values) {
            addCriterion("ceoIntroduced not in", values, "ceointroduced");
            return (Criteria) this;
        }

        public Criteria andCeointroducedBetween(String value1, String value2) {
            addCriterion("ceoIntroduced between", value1, value2, "ceointroduced");
            return (Criteria) this;
        }

        public Criteria andCeointroducedNotBetween(String value1, String value2) {
            addCriterion("ceoIntroduced not between", value1, value2, "ceointroduced");
            return (Criteria) this;
        }

        public Criteria andCeoimageIsNull() {
            addCriterion("ceoImage is null");
            return (Criteria) this;
        }

        public Criteria andCeoimageIsNotNull() {
            addCriterion("ceoImage is not null");
            return (Criteria) this;
        }

        public Criteria andCeoimageEqualTo(String value) {
            addCriterion("ceoImage =", value, "ceoimage");
            return (Criteria) this;
        }

        public Criteria andCeoimageNotEqualTo(String value) {
            addCriterion("ceoImage <>", value, "ceoimage");
            return (Criteria) this;
        }

        public Criteria andCeoimageGreaterThan(String value) {
            addCriterion("ceoImage >", value, "ceoimage");
            return (Criteria) this;
        }

        public Criteria andCeoimageGreaterThanOrEqualTo(String value) {
            addCriterion("ceoImage >=", value, "ceoimage");
            return (Criteria) this;
        }

        public Criteria andCeoimageLessThan(String value) {
            addCriterion("ceoImage <", value, "ceoimage");
            return (Criteria) this;
        }

        public Criteria andCeoimageLessThanOrEqualTo(String value) {
            addCriterion("ceoImage <=", value, "ceoimage");
            return (Criteria) this;
        }

        public Criteria andCeoimageLike(String value) {
            addCriterion("ceoImage like", value, "ceoimage");
            return (Criteria) this;
        }

        public Criteria andCeoimageNotLike(String value) {
            addCriterion("ceoImage not like", value, "ceoimage");
            return (Criteria) this;
        }

        public Criteria andCeoimageIn(List<String> values) {
            addCriterion("ceoImage in", values, "ceoimage");
            return (Criteria) this;
        }

        public Criteria andCeoimageNotIn(List<String> values) {
            addCriterion("ceoImage not in", values, "ceoimage");
            return (Criteria) this;
        }

        public Criteria andCeoimageBetween(String value1, String value2) {
            addCriterion("ceoImage between", value1, value2, "ceoimage");
            return (Criteria) this;
        }

        public Criteria andCeoimageNotBetween(String value1, String value2) {
            addCriterion("ceoImage not between", value1, value2, "ceoimage");
            return (Criteria) this;
        }

        public Criteria andProductimageIsNull() {
            addCriterion("productImage is null");
            return (Criteria) this;
        }

        public Criteria andProductimageIsNotNull() {
            addCriterion("productImage is not null");
            return (Criteria) this;
        }

        public Criteria andProductimageEqualTo(String value) {
            addCriterion("productImage =", value, "productimage");
            return (Criteria) this;
        }

        public Criteria andProductimageNotEqualTo(String value) {
            addCriterion("productImage <>", value, "productimage");
            return (Criteria) this;
        }

        public Criteria andProductimageGreaterThan(String value) {
            addCriterion("productImage >", value, "productimage");
            return (Criteria) this;
        }

        public Criteria andProductimageGreaterThanOrEqualTo(String value) {
            addCriterion("productImage >=", value, "productimage");
            return (Criteria) this;
        }

        public Criteria andProductimageLessThan(String value) {
            addCriterion("productImage <", value, "productimage");
            return (Criteria) this;
        }

        public Criteria andProductimageLessThanOrEqualTo(String value) {
            addCriterion("productImage <=", value, "productimage");
            return (Criteria) this;
        }

        public Criteria andProductimageLike(String value) {
            addCriterion("productImage like", value, "productimage");
            return (Criteria) this;
        }

        public Criteria andProductimageNotLike(String value) {
            addCriterion("productImage not like", value, "productimage");
            return (Criteria) this;
        }

        public Criteria andProductimageIn(List<String> values) {
            addCriterion("productImage in", values, "productimage");
            return (Criteria) this;
        }

        public Criteria andProductimageNotIn(List<String> values) {
            addCriterion("productImage not in", values, "productimage");
            return (Criteria) this;
        }

        public Criteria andProductimageBetween(String value1, String value2) {
            addCriterion("productImage between", value1, value2, "productimage");
            return (Criteria) this;
        }

        public Criteria andProductimageNotBetween(String value1, String value2) {
            addCriterion("productImage not between", value1, value2, "productimage");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNull() {
            addCriterion("productName is null");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNotNull() {
            addCriterion("productName is not null");
            return (Criteria) this;
        }

        public Criteria andProductnameEqualTo(String value) {
            addCriterion("productName =", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotEqualTo(String value) {
            addCriterion("productName <>", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThan(String value) {
            addCriterion("productName >", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThanOrEqualTo(String value) {
            addCriterion("productName >=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThan(String value) {
            addCriterion("productName <", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThanOrEqualTo(String value) {
            addCriterion("productName <=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLike(String value) {
            addCriterion("productName like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotLike(String value) {
            addCriterion("productName not like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameIn(List<String> values) {
            addCriterion("productName in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotIn(List<String> values) {
            addCriterion("productName not in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameBetween(String value1, String value2) {
            addCriterion("productName between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotBetween(String value1, String value2) {
            addCriterion("productName not between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andProducturlIsNull() {
            addCriterion("productUrl is null");
            return (Criteria) this;
        }

        public Criteria andProducturlIsNotNull() {
            addCriterion("productUrl is not null");
            return (Criteria) this;
        }

        public Criteria andProducturlEqualTo(String value) {
            addCriterion("productUrl =", value, "producturl");
            return (Criteria) this;
        }

        public Criteria andProducturlNotEqualTo(String value) {
            addCriterion("productUrl <>", value, "producturl");
            return (Criteria) this;
        }

        public Criteria andProducturlGreaterThan(String value) {
            addCriterion("productUrl >", value, "producturl");
            return (Criteria) this;
        }

        public Criteria andProducturlGreaterThanOrEqualTo(String value) {
            addCriterion("productUrl >=", value, "producturl");
            return (Criteria) this;
        }

        public Criteria andProducturlLessThan(String value) {
            addCriterion("productUrl <", value, "producturl");
            return (Criteria) this;
        }

        public Criteria andProducturlLessThanOrEqualTo(String value) {
            addCriterion("productUrl <=", value, "producturl");
            return (Criteria) this;
        }

        public Criteria andProducturlLike(String value) {
            addCriterion("productUrl like", value, "producturl");
            return (Criteria) this;
        }

        public Criteria andProducturlNotLike(String value) {
            addCriterion("productUrl not like", value, "producturl");
            return (Criteria) this;
        }

        public Criteria andProducturlIn(List<String> values) {
            addCriterion("productUrl in", values, "producturl");
            return (Criteria) this;
        }

        public Criteria andProducturlNotIn(List<String> values) {
            addCriterion("productUrl not in", values, "producturl");
            return (Criteria) this;
        }

        public Criteria andProducturlBetween(String value1, String value2) {
            addCriterion("productUrl between", value1, value2, "producturl");
            return (Criteria) this;
        }

        public Criteria andProducturlNotBetween(String value1, String value2) {
            addCriterion("productUrl not between", value1, value2, "producturl");
            return (Criteria) this;
        }

        public Criteria andProductintroductionIsNull() {
            addCriterion("productIntroduction is null");
            return (Criteria) this;
        }

        public Criteria andProductintroductionIsNotNull() {
            addCriterion("productIntroduction is not null");
            return (Criteria) this;
        }

        public Criteria andProductintroductionEqualTo(String value) {
            addCriterion("productIntroduction =", value, "productintroduction");
            return (Criteria) this;
        }

        public Criteria andProductintroductionNotEqualTo(String value) {
            addCriterion("productIntroduction <>", value, "productintroduction");
            return (Criteria) this;
        }

        public Criteria andProductintroductionGreaterThan(String value) {
            addCriterion("productIntroduction >", value, "productintroduction");
            return (Criteria) this;
        }

        public Criteria andProductintroductionGreaterThanOrEqualTo(String value) {
            addCriterion("productIntroduction >=", value, "productintroduction");
            return (Criteria) this;
        }

        public Criteria andProductintroductionLessThan(String value) {
            addCriterion("productIntroduction <", value, "productintroduction");
            return (Criteria) this;
        }

        public Criteria andProductintroductionLessThanOrEqualTo(String value) {
            addCriterion("productIntroduction <=", value, "productintroduction");
            return (Criteria) this;
        }

        public Criteria andProductintroductionLike(String value) {
            addCriterion("productIntroduction like", value, "productintroduction");
            return (Criteria) this;
        }

        public Criteria andProductintroductionNotLike(String value) {
            addCriterion("productIntroduction not like", value, "productintroduction");
            return (Criteria) this;
        }

        public Criteria andProductintroductionIn(List<String> values) {
            addCriterion("productIntroduction in", values, "productintroduction");
            return (Criteria) this;
        }

        public Criteria andProductintroductionNotIn(List<String> values) {
            addCriterion("productIntroduction not in", values, "productintroduction");
            return (Criteria) this;
        }

        public Criteria andProductintroductionBetween(String value1, String value2) {
            addCriterion("productIntroduction between", value1, value2, "productintroduction");
            return (Criteria) this;
        }

        public Criteria andProductintroductionNotBetween(String value1, String value2) {
            addCriterion("productIntroduction not between", value1, value2, "productintroduction");
            return (Criteria) this;
        }

        public Criteria andCompanyprofileIsNull() {
            addCriterion("CompanyProfile is null");
            return (Criteria) this;
        }

        public Criteria andCompanyprofileIsNotNull() {
            addCriterion("CompanyProfile is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyprofileEqualTo(String value) {
            addCriterion("CompanyProfile =", value, "companyprofile");
            return (Criteria) this;
        }

        public Criteria andCompanyprofileNotEqualTo(String value) {
            addCriterion("CompanyProfile <>", value, "companyprofile");
            return (Criteria) this;
        }

        public Criteria andCompanyprofileGreaterThan(String value) {
            addCriterion("CompanyProfile >", value, "companyprofile");
            return (Criteria) this;
        }

        public Criteria andCompanyprofileGreaterThanOrEqualTo(String value) {
            addCriterion("CompanyProfile >=", value, "companyprofile");
            return (Criteria) this;
        }

        public Criteria andCompanyprofileLessThan(String value) {
            addCriterion("CompanyProfile <", value, "companyprofile");
            return (Criteria) this;
        }

        public Criteria andCompanyprofileLessThanOrEqualTo(String value) {
            addCriterion("CompanyProfile <=", value, "companyprofile");
            return (Criteria) this;
        }

        public Criteria andCompanyprofileLike(String value) {
            addCriterion("CompanyProfile like", value, "companyprofile");
            return (Criteria) this;
        }

        public Criteria andCompanyprofileNotLike(String value) {
            addCriterion("CompanyProfile not like", value, "companyprofile");
            return (Criteria) this;
        }

        public Criteria andCompanyprofileIn(List<String> values) {
            addCriterion("CompanyProfile in", values, "companyprofile");
            return (Criteria) this;
        }

        public Criteria andCompanyprofileNotIn(List<String> values) {
            addCriterion("CompanyProfile not in", values, "companyprofile");
            return (Criteria) this;
        }

        public Criteria andCompanyprofileBetween(String value1, String value2) {
            addCriterion("CompanyProfile between", value1, value2, "companyprofile");
            return (Criteria) this;
        }

        public Criteria andCompanyprofileNotBetween(String value1, String value2) {
            addCriterion("CompanyProfile not between", value1, value2, "companyprofile");
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