package com.chanpyaeaung.local.experiences.presentation.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.Streams;

import java.util.List;

/**
 * Created by Chan Pyae Aung on 5/5/17.
 */

public class ExperienceModel {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("tagline")
    @Expose
    private String tagline;
    @SerializedName("host")
    @Expose
    private String host;
    @SerializedName("price")
    @Expose
    private Double price;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("price_display")
    @Expose
    private String priceDisplay;
    @SerializedName("reviews")
    @Expose
    private Integer reviews;
    @SerializedName("ratings")
    @Expose
    private Integer ratings;
    @SerializedName("locations")
    @Expose
    private List<LocationModel> locations = null;
    @SerializedName("photo_url")
    @Expose
    private String photoUrl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getPriceDisplay() {
        return priceDisplay;
    }

    public void setPriceDisplay(String priceDisplay) {
        this.priceDisplay = priceDisplay;
    }

    public Integer getReviews() {
        return reviews;
    }

    public void setReviews(Integer reviews) {
        this.reviews = reviews;
    }

    public Integer getRatings() {
        return ratings;
    }

    public void setRatings(Integer ratings) {
        this.ratings = ratings;
    }

    public List<LocationModel> getLocations() {
        return locations;
    }

    public void setLocations(List<LocationModel> locations) {
        this.locations = locations;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}
