package com.company.entity;

import java.time.LocalDate;

public class Ships {

    private final String FILENAME = "ships.csv";
    private final String INSERT = "INSERT INTO ships (id,title_ship,displacement,launch_date,capitan,type_ship_id,manufacturer_id,max_speed,military) VALUE(?,?,?,?,?,?,?,?,?)";

    private int id;
    private String titleShip;
    private int displacement;
    private LocalDate launchDate;
    private String capitan;
    private int typeShipId;
    private int manufacturerId;
    private int maxSpeed;
    private boolean military;

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

    public String getTitleShip() {
        return titleShip;
    }

    public void setTitleShip(String titleShip) {
        this.titleShip = titleShip;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public LocalDate getLaunchDate() {
        return launchDate;
    }

    public void setLaunchDate(LocalDate launchDate) {
        this.launchDate = launchDate;
    }

    public String getCapitan() {
        return capitan;
    }

    public void setCapitan(String capitan) {
        this.capitan = capitan;
    }

    public int getTypeShipId() {
        return typeShipId;
    }

    public void setTypeShipId(int typeShipId) {
        this.typeShipId = typeShipId;
    }

    public int getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(int manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public boolean isMilitary() {
        return military;
    }

    public void setMilitary(boolean military) {
        this.military = military;
    }
}
