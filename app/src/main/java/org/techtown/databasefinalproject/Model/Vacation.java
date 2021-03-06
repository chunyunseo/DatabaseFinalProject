package org.techtown.databasefinalproject.Model;

import java.io.Serializable;

public class Vacation implements Serializable {
    private String spotName;
    private String phoneNumber;
    private String description;
    private String province;
    private String town;
    private String city;

    public String getSpotName() {
        return spotName;
    }

    public void setSpotName(String spotName) {
        this.spotName = spotName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLocation() {
        return province + " " + town + " " + city;
    }

    public void setLocation(Location location) {
        this.city = location.getCity();
        this.town = location.getTown();
        this.province = location.getProvince();
    }
}
