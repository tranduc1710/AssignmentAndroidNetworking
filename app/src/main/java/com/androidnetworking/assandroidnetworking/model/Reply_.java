package com.androidnetworking.assandroidnetworking.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Reply_ implements Serializable {

    @SerializedName("embeddable")
    @Expose
    private Boolean embeddable;
    @SerializedName("href")
    @Expose
    private String href;

    public Boolean getEmbeddable() {
        return embeddable;
    }

    public void setEmbeddable(Boolean embeddable) {
        this.embeddable = embeddable;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

}
