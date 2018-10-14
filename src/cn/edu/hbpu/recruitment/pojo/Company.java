package cn.edu.hbpu.recruitment.pojo;

public class Company {
    private Integer companyid;

    private String email;

    private String pwd;

    private String companyname;

    private String companyshortname;

    private String companylogo;

    private String companywebsite;

    private String city;

    private String industry;

    private String companysize;

    private String development;

    private String companytag;

    private String companyidimage;

    private String ceoname;

    private String ceointroduced;

    private String ceoimage;

    private String productimage;

    private String productname;

    private String producturl;

    private String productintroduction;

    private String companyprofile;

    private Integer state;

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    public String getCompanyshortname() {
        return companyshortname;
    }

    public void setCompanyshortname(String companyshortname) {
        this.companyshortname = companyshortname == null ? null : companyshortname.trim();
    }

    public String getCompanylogo() {
        return companylogo;
    }

    public void setCompanylogo(String companylogo) {
        this.companylogo = companylogo == null ? null : companylogo.trim();
    }

    public String getCompanywebsite() {
        return companywebsite;
    }

    public void setCompanywebsite(String companywebsite) {
        this.companywebsite = companywebsite == null ? null : companywebsite.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry == null ? null : industry.trim();
    }

    public String getCompanysize() {
        return companysize;
    }

    public void setCompanysize(String companysize) {
        this.companysize = companysize == null ? null : companysize.trim();
    }

    public String getDevelopment() {
        return development;
    }

    public void setDevelopment(String development) {
        this.development = development == null ? null : development.trim();
    }

    public String getCompanytag() {
        return companytag;
    }

    public void setCompanytag(String companytag) {
        this.companytag = companytag == null ? null : companytag.trim();
    }

    public String getCompanyidimage() {
        return companyidimage;
    }

    public void setCompanyidimage(String companyidimage) {
        this.companyidimage = companyidimage == null ? null : companyidimage.trim();
    }

    public String getCeoname() {
        return ceoname;
    }

    public void setCeoname(String ceoname) {
        this.ceoname = ceoname == null ? null : ceoname.trim();
    }

    public String getCeointroduced() {
        return ceointroduced;
    }

    public void setCeointroduced(String ceointroduced) {
        this.ceointroduced = ceointroduced == null ? null : ceointroduced.trim();
    }

    public String getCeoimage() {
        return ceoimage;
    }

    public void setCeoimage(String ceoimage) {
        this.ceoimage = ceoimage == null ? null : ceoimage.trim();
    }

    public String getProductimage() {
        return productimage;
    }

    public void setProductimage(String productimage) {
        this.productimage = productimage == null ? null : productimage.trim();
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public String getProducturl() {
        return producturl;
    }

    public void setProducturl(String producturl) {
        this.producturl = producturl == null ? null : producturl.trim();
    }

    public String getProductintroduction() {
        return productintroduction;
    }

    public void setProductintroduction(String productintroduction) {
        this.productintroduction = productintroduction == null ? null : productintroduction.trim();
    }

    public String getCompanyprofile() {
        return companyprofile;
    }

    public void setCompanyprofile(String companyprofile) {
        this.companyprofile = companyprofile == null ? null : companyprofile.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

	@Override
	public String toString() {
		return "Company [ceoimage=" + ceoimage + ", ceointroduced="
				+ ceointroduced + ", ceoname=" + ceoname + ", city=" + city
				+ ", companyid=" + companyid + ", companyidimage="
				+ companyidimage + ", companylogo=" + companylogo
				+ ", companyname=" + companyname + ", companyprofile="
				+ companyprofile + ", companyshortname=" + companyshortname
				+ ", companysize=" + companysize + ", companytag=" + companytag
				+ ", companywebsite=" + companywebsite + ", development="
				+ development + ", email=" + email + ", industry=" + industry
				+ ", productimage=" + productimage + ", productintroduction="
				+ productintroduction + ", productname=" + productname
				+ ", producturl=" + producturl + ", pwd=" + pwd + ", state="
				+ state + "]";
	}
    
}