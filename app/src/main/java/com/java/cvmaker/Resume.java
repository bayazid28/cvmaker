package com.java.cvmaker;

public class Resume {
    private String pname;
    private String paddress;
    private String pemail;
    private String pphone;
    private String pwebsite;

    public Resume(){}

    public Resume(String pname, String paddress, String pemail, String pphone, String pwebsite) {
        this.pname = pname;
        this.paddress = paddress;
        this.pemail = pemail;
        this.pphone = pphone;
        this.pwebsite = pwebsite;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPaddress() {
        return paddress;
    }

    public void setPaddress(String paddress) {
        this.paddress = paddress;
    }

    public String getPemail() {
        return pemail;
    }

    public void setPemail(String pemail) {
        this.pemail = pemail;
    }

    public String getPphone() {
        return pphone;
    }

    public void setPphone(String pphone) {
        this.pphone = pphone;
    }

    public String getPwebsite() {
        return pwebsite;
    }

    public void setPwebsite(String pwebsite) {
        this.pwebsite = pwebsite;
    }
}
