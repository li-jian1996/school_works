package cn.edu.hbpu.recruitment.pojo;

import java.util.Date;

public class Job {
    private Integer jobid;

    private Integer companyid;

    private Integer c3id;

    private String departments;

    private Integer worktype;

    private Integer education;

    private String jobtemptation;

    private String jobdescribe;

    private String jobaddress;

    private String jobemail;

    private Integer salarybegin;

    private Integer salaryend;

    private String jobcity;

    private String jobexperience;

    private Date begintime;

    private Date endtime;

    private Integer hits;

    private Integer state;

    public Integer getJobid() {
        return jobid;
    }

    public void setJobid(Integer jobid) {
        this.jobid = jobid;
    }

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    public Integer getC3id() {
        return c3id;
    }

    public void setC3id(Integer c3id) {
        this.c3id = c3id;
    }

    public String getDepartments() {
        return departments;
    }

    public void setDepartments(String departments) {
        this.departments = departments == null ? null : departments.trim();
    }

    public Integer getWorktype() {
        return worktype;
    }

    public void setWorktype(Integer worktype) {
        this.worktype = worktype;
    }

    public Integer getEducation() {
        return education;
    }

    public void setEducation(Integer education) {
        this.education = education;
    }

    public String getJobtemptation() {
        return jobtemptation;
    }

    public void setJobtemptation(String jobtemptation) {
        this.jobtemptation = jobtemptation == null ? null : jobtemptation.trim();
    }

    public String getJobdescribe() {
        return jobdescribe;
    }

    public void setJobdescribe(String jobdescribe) {
        this.jobdescribe = jobdescribe == null ? null : jobdescribe.trim();
    }

    public String getJobaddress() {
        return jobaddress;
    }

    public void setJobaddress(String jobaddress) {
        this.jobaddress = jobaddress == null ? null : jobaddress.trim();
    }

    public String getJobemail() {
        return jobemail;
    }

    public void setJobemail(String jobemail) {
        this.jobemail = jobemail == null ? null : jobemail.trim();
    }

    public Integer getSalarybegin() {
        return salarybegin;
    }

    public void setSalarybegin(Integer salarybegin) {
        this.salarybegin = salarybegin;
    }

    public Integer getSalaryend() {
        return salaryend;
    }

    public void setSalaryend(Integer salaryend) {
        this.salaryend = salaryend;
    }

    public String getJobcity() {
        return jobcity;
    }

    public void setJobcity(String jobcity) {
        this.jobcity = jobcity == null ? null : jobcity.trim();
    }

    public String getJobexperience() {
        return jobexperience;
    }

    public void setJobexperience(String jobexperience) {
        this.jobexperience = jobexperience == null ? null : jobexperience.trim();
    }

    public Date getBegintime() {
        return begintime;
    }

    public void setBegintime(Date begintime) {
        this.begintime = begintime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Integer getHits() {
        return hits;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

	@Override
	public String toString() {
		return "Job [begintime=" + begintime + ", c3id=" + c3id
				+ ", companyid=" + companyid + ", departments=" + departments
				+ ", education=" + education + ", endtime=" + endtime
				+ ", hits=" + hits + ", jobaddress=" + jobaddress
				+ ", jobcity=" + jobcity + ", jobdescribe=" + jobdescribe
				+ ", jobemail=" + jobemail + ", jobexperience=" + jobexperience
				+ ", jobid=" + jobid + ", jobtemptation=" + jobtemptation
				+ ", salarybegin=" + salarybegin + ", salaryend=" + salaryend
				+ ", state=" + state + ", worktype=" + worktype + "]";
	}
    
}