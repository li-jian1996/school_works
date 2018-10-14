package cn.edu.hbpu.recruitment.pojo;

import java.util.Date;

public class Person {
    private Integer personid;

    private String username;

    private String sex;

    private Integer age;

    private Integer education;

    private Integer aftereducation;

    private String tel;

    private String email;

    private String pwd;

    private String headimage;

    private Integer status;

    private Date registeredtime;

    private Integer state;

    public Integer getPersonid() {
        return personid;
    }

    

	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getSex() {
		return sex;
	}



	public void setSex(String sex) {
		this.sex = sex;
	}



	public Integer getAge() {
		return age;
	}



	public void setAge(Integer age) {
		this.age = age;
	}



	public Integer getEducation() {
		return education;
	}



	public void setEducation(Integer education) {
		this.education = education;
	}



	public Integer getAftereducation() {
		return aftereducation;
	}



	public void setAftereducation(Integer aftereducation) {
		this.aftereducation = aftereducation;
	}



	public String getTel() {
		return tel;
	}



	public void setTel(String tel) {
		this.tel = tel;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPwd() {
		return pwd;
	}



	public void setPwd(String pwd) {
		this.pwd = pwd;
	}



	public String getHeadimage() {
		return headimage;
	}



	public void setHeadimage(String headimage) {
		this.headimage = headimage;
	}



	public Integer getStatus() {
		return status;
	}



	public void setStatus(Integer status) {
		this.status = status;
	}



	public Date getRegisteredtime() {
		return registeredtime;
	}



	public void setRegisteredtime(Date registeredtime) {
		this.registeredtime = registeredtime;
	}



	public Integer getState() {
		return state;
	}



	public void setState(Integer state) {
		this.state = state;
	}



	public void setPersonid(Integer personid) {
		this.personid = personid;
	}



	@Override
	public String toString() {
		return "Person [aftereducation=" + aftereducation + ", age=" + age
				+ ", education=" + education + ", email=" + email
				+ ", headimage=" + headimage + ", personid=" + personid
				+ ", pwd=" + pwd + ", registeredtime=" + registeredtime
				+ ", sex=" + sex + ", state=" + state + ", status=" + status
				+ ", tel=" + tel + ", username=" + username + "]";
	}
    
}