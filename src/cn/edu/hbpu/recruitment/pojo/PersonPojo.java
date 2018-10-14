package cn.edu.hbpu.recruitment.pojo;

import java.util.Date;

public class PersonPojo extends Person {
	String jobC3name;
	Date deliverytime;
	private String companyname;
	private String positionname;
	private String schoolname;
	public Integer jobid;
	
	
	public Integer getJobid() {
		return jobid;
	}

	public void setJobid(Integer jobid) {
		this.jobid = jobid;
	}

	public Date getDeliverytime() {
		return deliverytime;
	}

	public void setDeliverytime(Date deliverytime) {
		this.deliverytime = deliverytime;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getPositionname() {
		return positionname;
	}

	public void setPositionname(String positionname) {
		this.positionname = positionname;
	}

	public String getSchoolname() {
		return schoolname;
	}

	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}

	public String getJobC3name() {
		return jobC3name;
	}

	public void setJobC3name(String jobC3name) {
		this.jobC3name = jobC3name;
	}
	
}
