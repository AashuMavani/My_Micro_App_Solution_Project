
package com.app.my_micro_app_solution_project;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Arr_interial {

    @SerializedName("interial_ad")
    @Expose
    private String interial_ad;

    public String getInterial_ad() {
        return interial_ad;
    }

    public void setInterial_ad(String interial_ad) {
        this.interial_ad = interial_ad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Arr_interial.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("interial_ad");
        sb.append('=');
        sb.append(((this.interial_ad == null)?"<null>":this.interial_ad));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
