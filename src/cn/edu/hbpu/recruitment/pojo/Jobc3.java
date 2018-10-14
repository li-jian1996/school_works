package cn.edu.hbpu.recruitment.pojo;

public class Jobc3 {
    private Integer c3id;

    private Integer c2id;

 

    private String c3name;

    private Integer state;

    public Integer getC3id() {
        return c3id;
    }

    public void setC3id(Integer c3id) {
        this.c3id = c3id;
    }

    public Integer getC2id() {
        return c2id;
    }

    public void setC2id(Integer c2id) {
        this.c2id = c2id;
    }

   

    

    public String getC3name() {
        return c3name;
    }

    public void setC3name(String c3name) {
        this.c3name = c3name == null ? null : c3name.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}