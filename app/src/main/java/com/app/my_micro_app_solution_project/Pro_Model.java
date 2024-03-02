package com.app.my_micro_app_solution_project;

public class Pro_Model {
    String appname;
    String packagename;
    String applink;
    String applogo;
    String backgroung;

    public Pro_Model(String appname, String packagename, String applink, String applogo) {
        this.appname = appname;
        this.packagename = packagename;
        this.applink = applink;
        this.applogo = applogo;
        this.backgroung = backgroung;
    }

    public String getAppname() {
        return appname;
    }

    public void setAppname(String appname) {
        this.appname = appname;
    }

    public String getPackagename() {
        return packagename;
    }

    public void setPackagename(String packagename) {
        this.packagename = packagename;
    }

    public String getApplink() {
        return applink;
    }

    public void setApplink(String applink) {
        this.applink = applink;
    }

    public String getApplogo() {
        return applogo;
    }

    public void setApplogo(String applogo) {
        this.applogo = applogo;
    }

    public String getBackgroung() {
        return backgroung;
    }

    public void setBackgroung(String backgroung) {
        this.backgroung = backgroung;
    }

    @Override
    public String toString() {
        return "Pro_Model{" +
                "appname='" + appname + '\'' +
                ", packagename='" + packagename + '\'' +
                ", applink='" + applink + '\'' +
                ", applogo='" + applogo + '\'' +
                ", backgroung='" + backgroung + '\'' +
                '}';
    }
}
