package com.androidnetworking.assandroidnetworking.modelCategory;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WpPostType {

    @SerializedName("href")
    @Expose
    private String href;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

}
