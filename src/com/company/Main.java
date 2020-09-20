package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
        TypeShipReader typeShipReader = new TypeShipReader();
        ManufacturerReader manufacturerReader = new ManufacturerReader();
        ShipsReader shipsReader = new ShipsReader();
        ReaderDataBase aw = new ReaderDataBase();


        typeShipReader.Insert();
        manufacturerReader.Insert();
        shipsReader.Insert();
        aw.readerDataBase();
    }

}

