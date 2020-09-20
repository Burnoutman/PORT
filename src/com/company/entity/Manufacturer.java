package com.company.entity;

public class Manufacturer {

    private final String FILENAME = "manufacturer.csv";
    private final String INSERT = "INSERT INTO manufacturer (id,title_manufacturer,country) VALUE(?,?,?)";

    private int id;
    private String titleManufacturer;
    private String country;

    public String getFILENAME() {
        return FILENAME;
    }

    public String getINSERT() {
        return INSERT;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitleManufacturer() {
        return titleManufacturer;
    }

    public void setTitleManufacturer(String titleManufacturer) {
        this.titleManufacturer = titleManufacturer;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
