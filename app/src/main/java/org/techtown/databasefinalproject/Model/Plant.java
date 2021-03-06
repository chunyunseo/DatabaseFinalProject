package org.techtown.databasefinalproject.Model;

import java.io.Serializable;

public class Plant implements Serializable {
    private String name = "";
    private String description= "";
    private String species= "";
    private String province= "";
    private String city ="";
    private String town= "";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
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
