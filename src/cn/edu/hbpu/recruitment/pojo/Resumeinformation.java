package cn.edu.hbpu.recruitment.pojo;

import java.io.Serializable;

public class Resumeinformation  implements Serializable{
    private Integer resumeid;

    private Integer personid;

    private String city;

    private Integer worktype;

    private String expectedposition;

    private String expectedsalary;

    private String schoolname;

    private String professional;

    private String beginyear;

    private String endyear;

    private String selfdescription;

    private String workurl;

    private String explanatorytext;

    private String resumeattachments;

    public Integer getResumeid() {
        return resumeid;
    }

    public void setResumeid(Integer resumeid) {
        this.resumeid = resumeid;
    }

    public Integer getPersonid() {
        return personid;
    }

    public void setPersonid(Integer personid) {
        this.personid = personid;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public Integer getWorktype() {
        return worktype;
    }

    public void setWorktype(Integer worktype) {
        this.worktype = worktype;
    }

    public String getExpectedposition() {
        return expectedposition;
    }

    public void setExpectedposition(String expectedposition) {
        this.expectedposition = expectedposition == null ? null : expectedposition.trim();
    }

    public String getExpectedsalary() {
        return expectedsalary;
    }

    public void setExpectedsalary(String expectedsalary) {
        this.expectedsalary = expectedsalary == null ? null : expectedsalary.trim();
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname == null ? null : schoolname.trim();
    }

    public String getProfessional() {
        return professional;
    }

    public void setProfessional(String professional) {
        this.professional = professional == null ? null : professional.trim();
    }

    public String getBeginyear() {
        return beginyear;
    }

    public void setBeginyear(String beginyear) {
        this.beginyear = beginyear == null ? null : beginyear.trim();
    }

    public String getEndyear() {
        return endyear;
    }

    public void setEndyear(String endyear) {
        this.endyear = endyear == null ? null : endyear.trim();
    }

    public String getSelfdescription() {
        return selfdescription;
    }

    public void setSelfdescription(String selfdescription) {
        this.selfdescription = selfdescription == null ? null : selfdescription.trim();
    }

    public String getWorkurl() {
        return workurl;
    }

    public void setWorkurl(String workurl) {
        this.workurl = workurl == null ? null : workurl.trim();
    }

    public String getExplanatorytext() {
        return explanatorytext;
    }

    public void setExplanatorytext(String explanatorytext) {
        this.explanatorytext = explanatorytext == null ? null : explanatorytext.trim();
    }

    public String getResumeattachments() {
        return resumeattachments;
    }

    public void setResumeattachments(String resumeattachments) {
        this.resumeattachments = resumeattachments == null ? null : resumeattachments.trim();
    }

	@Override
	public String toString() {
		return "Resumeinformation [beginyear=" + beginyear + ", city=" + city
				+ ", endyear=" + endyear + ", expectedposition="
				+ expectedposition + ", expectedsalary=" + expectedsalary
				+ ", explanatorytext=" + explanatorytext + ", personid="
				+ personid + ", professional=" + professional
				+ ", resumeattachments=" + resumeattachments + ", resumeid="
				+ resumeid + ", schoolname=" + schoolname
				+ ", selfdescription=" + selfdescription + ", worktype="
				+ worktype + ", workurl=" + workurl + "]";
	}
    
}