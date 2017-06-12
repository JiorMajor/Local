package com.chanpyaeaung.local.experiences.presentation.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Chan Pyae Aung on 5/5/17.
 */

public class LocationModel {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("lat")
    @Expose
    private Integer lat;
    @SerializedName("lgt")
    @Expose
    private Integer lgt;
    @SerializedName("type")
    @Expose
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLat() {
        return lat;
    }

    public void setLat(Integer lat) {
        this.lat = lat;
    }

    public Integer getLgt() {
        return lgt;
    }

    public void setLgt(Integer lgt) {
        this.lgt = lgt;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
