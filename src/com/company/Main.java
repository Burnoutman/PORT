package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
        TypeShipReader tS = new TypeShipReader();
        ManufacturerReader mr = new ManufacturerReader();
        ShipsReader sr = new ShipsReader();
        ReaderDataBase aw = new ReaderDataBase();


        aw.readerDataBase();
        sr.Insert();
        mr.Insert();
        tS.Insert();
    }

}

