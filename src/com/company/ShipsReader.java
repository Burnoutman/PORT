package com.company;
import com.company.entity.Ships;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.time.LocalDate;

public class ShipsReader {

    public void Insert() throws Exception {

        Ships ships =new Ships();

        BufferedReader reader = new BufferedReader(new FileReader(ships.getFILENAME()));
        Connection connection = DbConnector.getConnection();
        String line;

        while ((line = reader.readLine()) != null) {

            try {
                PreparedStatement pr = connection.prepareStatement(ships.getINSERT());
                String[] str = line.split(";");
                ships.setId(Integer.parseInt(str[0]));
                ships.setTitleShip(str[1]);
                ships.setDisplacement(Integer.parseInt(str[2]));
                ships.setLaunchDate(LocalDate.parse(str[3]));
                ships.setCapitan(str[4]);
                ships.setTypeShipId(Integer.parseInt(str[5]));
                ships.setManufacturerId(Integer.parseInt(str[6]));
                ships.setMaxSpeed(Integer.parseInt(str[7]));
                ships.setMilitary(Boolean.parseBoolean((str[8])));

                pr.setInt(1, ships.getId());  //id
                pr.setString(2, ships.getTitleShip());   //title_ship
                pr.setInt(3, ships.getDisplacement());  //displacement
                pr.setDate(4, Date.valueOf(ships.getLaunchDate()));     //launch_date
                pr.setString(5, ships.getCapitan());                 //capitan
                pr.setInt(6, ships.getTypeShipId()); //type_ship_id
                pr.setInt(7, ships.getManufacturerId()); //manufacturer_id
                pr.setInt(8, ships.getMaxSpeed()); //max_speed
                pr.setBoolean(9, ships.isMilitary());
                pr.executeUpdate();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

    }
}
