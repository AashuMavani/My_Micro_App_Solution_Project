
package com.app.my_micro_app_solution_project;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Datum {

    @SerializedName("app_name")
    @Expose
    private String app_name;
    @SerializedName("package_name")
    @Expose
    private String package_name;
    @SerializedName("app_link")
    @Expose
    private String app_link;
    @SerializedName("app_logo")
    @Expose
    private String app_logo;
    @SerializedName("backgroung")
    @Expose
    private String backgroung;
    @SerializedName("posters")
    @Expose
    private List<Poster> posters;

    public String getApp_name() {
        return app_name;
    }

    public void setApp_name(String app_name) {
        this.app_name = app_name;
    }

    public String getPackage_name() {
        return package_name;
    }

    public void setPackage_name(String package_name) {
        this.package_name = package_name;
    }

    public String getApp_link() {
        return app_link;
    }

    public void setApp_link(String app_link) {
        this.app_link = app_link;
    }

    public String getApp_logo() {
        return app_logo;
    }

    public void setApp_logo(String app_logo) {
        this.app_logo = app_logo;
    }

    public String getBackgroung() {
        return backgroung;
    }

    public void setBackgroung(String backgroung) {
        this.backgroung = backgroung;
    }

    public List<Poster> getPosters() {
        return posters;
    }

    public void setPosters(List<Poster> posters) {
        this.posters = posters;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Datum.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("app_name");
        sb.append('=');
        sb.append(((this.app_name == null)?"<null>":this.app_name));
        sb.append(',');
        sb.append("package_name");
        sb.append('=');
        sb.append(((this.package_name == null)?"<null>":this.package_name));
        sb.append(',');
        sb.append("app_link");
        sb.append('=');
        sb.append(((this.app_link == null)?"<null>":this.app_link));
        sb.append(',');
        sb.append("app_logo");
        sb.append('=');
        sb.append(((this.app_logo == null)?"<null>":this.app_logo));
        sb.append(',');
        sb.append("backgroung");
        sb.append('=');
        sb.append(((this.backgroung == null)?"<null>":this.backgroung));
        sb.append(',');
        sb.append("posters");
        sb.append('=');
        sb.append(((this.posters == null)?"<null>":this.posters));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
