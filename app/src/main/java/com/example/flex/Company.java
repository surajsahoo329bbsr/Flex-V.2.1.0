package com.example.flex;

import androidx.annotation.NonNull;

public class Company {

    private int imageId;
    private String company;
    private String timings;
    private String address;

    Company(int imageId, String company, String timings, String address) {
        this.imageId = imageId;
        this.company = company;
        this.timings = timings;
        this.address = address;
    }

    int getImageId() {
        return imageId;
    }
    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }

    String getTimings()
    {
        return timings;
    }

    public void setTimings(String timings)
    {
        this.timings = timings;
    }

    String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    @NonNull
    @Override
    public String toString() {
        return company+ "\n"+timings+"\n" + address;
    }
}