package com.company.entity;

public class TypeShip {

    private final String FILENAME = "type_ship.csv";
    private final String INSERT = "INSERT INTO type_ship (id,type_ship) VALUE(?,?)";

    private int id;
    private String typeShip;

    public String getTypeShip() {
        return typeShip;
    }

    public void setTypeShip(String typeShip) {
        this.typeShip = typeShip;
    }

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
}
