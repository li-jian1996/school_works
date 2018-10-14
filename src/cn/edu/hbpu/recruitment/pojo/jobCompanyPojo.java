package cn.edu.hbpu.recruitment.pojo;

public class jobCompanyPojo extends Job {
	private String companyName;   //公司name
    private String industry;  //行业领域
    private String development;
    private String companySize;
    private String companyTag;
    private String c3Name;
    private String ceoName;
	public String getCeoName() {
		return ceoName;
	}
	public void setCeoName(String ceoName) {
		this.ceoName = ceoName;
	}
	public String getC3Name() {
		return c3Name;
	}
	public void setC3Name(String c3name) {
		this.c3Name = c3name;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	public String getDevelopment() {
		return development;
	}
	public void setDevelopment(String development) {
		this.development = development;
	}
	public String getCompanySize() {
		return companySize;
	}
	public void setCompanySize(String companysize) {
		this.companySize = companysize;
	}
	public String getCompanyTag() {
		return companyTag;
	}
	public void setCompanyTag(String companytag) {
		this.companyTag = companytag;
	}
	@Override
	public String toString() {
		return "jobCompanyPojo [companyName=" + companyName + ", companysize="
				+ companySize + ", companytag=" + companyTag + ", development="
				+ development + ", industry=" + industry + "]";
	}
    
}
