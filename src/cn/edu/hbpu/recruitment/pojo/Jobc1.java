package cn.edu.hbpu.recruitment.pojo;

public class Jobc1 {
    private Integer c1id;

    private String c1name;

    private Integer state;

    public Integer getC1id() {
        return c1id;
    }

    public void setC1id(Integer c1id) {
        this.c1id = c1id;
    }

    public String getC1name() {
        return c1name;
    }

    public void setC1name(String c1name) {
        this.c1name = c1name == null ? null : c1name.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}