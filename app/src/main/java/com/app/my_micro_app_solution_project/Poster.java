
package com.app.my_micro_app_solution_project;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Poster {

    @SerializedName("poster_link")
    @Expose
    private String poster_link;

    public String getPoster_link() {
        return poster_link;
    }

    public void setPoster_link(String poster_link) {
        this.poster_link = poster_link;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Poster.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("poster_link");
        sb.append('=');
        sb.append(((this.poster_link == null)?"<null>":this.poster_link));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
