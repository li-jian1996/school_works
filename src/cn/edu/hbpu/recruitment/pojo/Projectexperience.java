package cn.edu.hbpu.recruitment.pojo;

public class Projectexperience {
    private Integer projectexperienceid;

    private Integer personid;

    private String projectname;

    private String post;

    private Integer beginyear;

    private Integer endyear;

    public Integer getProjectexperienceid() {
        return projectexperienceid;
    }

    public void setProjectexperienceid(Integer projectexperienceid) {
        this.projectexperienceid = projectexperienceid;
    }

    public Integer getPersonid() {
        return personid;
    }

    public void setPersonid(Integer personid) {
        this.personid = personid;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname == null ? null : projectname.trim();
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post == null ? null : post.trim();
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