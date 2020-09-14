package com.company;


import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile  {
    private final String FILENAME = "D:\\All.csv";
    private String type_ship;
    private String title_ship;
    private String title_manufacturer;
    private String country;
    private String displacement;
    private String launch_date;
    private String capitan;
    private String max_speed;
    private String military;

    public String getType_ship() {
        return type_ship;
    }

    public void setType_ship(String type_ship) {
        this.type_ship = type_ship;
    }
    public String getTitle_ship() {
        return title_ship;
    }

    public void setTitle_ship(String title_ship) {
        this.title_ship = title_ship;
    }

    public String getTitle_manufacturer() {
        return title_manufacturer;
    }

    public void setTitle_manufacturer(String title_manufacturer) {
        this.title_manufacturer = title_manufacturer;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDisplacement() {
        return displacement;
    }

    public void setDisplacement(String displacement) {
        this.displacement = displacement;
    }

    public String getLaunch_date() {
        return launch_date;
    }

    public void setLaunch_date(String launch_date) {
        this.launch_date = launch_date;
    }

    public String getCapitan() {
        return capitan;
    }

    public void setCapitan(String capitan) {
        this.capitan = capitan;
    }

    public String getMax_speed() {
        return max_speed;
    }

    public void setMax_speed(String max_speed) {
        this.max_speed = max_speed;
    }

    public String getMilitary() {
        return military;
    }

    public void setMilitary(String military) {
        this.military = military;
    }

    public void writeToFile() throws Exception {
        try {
            FileWriter writer = new FileWriter(FILENAME, true);
            writer.write("\r\n");
            writer.write(getType_ship()+";");
            writer.write(getTitle_ship()+";");
            writer.write(getTitle_manufacturer()+";");
            writer.write(getCountry()+";");
            writer.write(getDisplacement()+";");
            writer.write(getLaunch_date()+";");
            writer.write(getCapitan()+";");
            writer.write(getMax_speed()+";");
            writer.write(getMilitary()+";");
            writer.flush();
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }

    }
}
