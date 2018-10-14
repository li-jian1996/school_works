package cn.edu.hbpu.recruitment.pojo;

public class Workexperience {
    private Integer workexperienceid;

    private Integer personid;

    private String companyname;

    private String positionname;

    private Integer beginyear;

    private Integer endyear;

    public Integer getWorkexperienceid() {
        return workexperienceid;
    }

    public void setWorkexperienceid(Integer workexperienceid) {
        this.workexperienceid = workexperienceid;
    }

    public Integer getPersonid() {
        return personid;
    }

    public void setPersonid(Integer personid) {
        this.personid = personid;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    public String getPositionname() {
        return positionname;
    }

    public void setPositionname(String positionname) {
        this.positionname = positionname == null ? null : positionname.trim();
    }

    public Integer getBeginyear() {
        return beginyear;
    }

    public void setBeginyear(Integer beginyear) {
        this.beginyear = beginyear;
    }

    public Integer getEndyear() {
        return endyear;
    }

    public void setEndyear(Integer endyear) {
        this.endyear = endyear;
    }
}