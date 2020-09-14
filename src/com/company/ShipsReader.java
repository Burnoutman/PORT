package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

public class ShipsReader {
    private final String FILENAME = "D:\\ships.csv";
    private final String INSERT = "INSERT INTO ships (id,title_ship,displacement,launch_date,capitan,type_ship_id,manufacturer_id,max_speed,military) VALUE(?,?,?,?,?,?,?,?,?)";

    public void Insert() throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader(FILENAME));
        Connection connection = DbConnector.getConnection();
        String line;


        while ((line = reader.readLine()) != null) {

            try {
                PreparedStatement pr = connection.prepareStatement(INSERT);
                String[] str = line.split(";");
                pr.setInt(1, Integer.parseInt(str[0]));  //id
                pr.setString(2, str[1]);                 //title_ship
                pr.setInt(3, Integer.parseInt(str[2]));  //displacement
                pr.setDate(4, Date.valueOf(str[3]));     //launch_date
                pr.setString(5, str[4]);                 //capitan
                pr.setInt(6, Integer.parseInt(str[5])); //type_ship_id
                pr.setInt(7, Integer.parseInt(str[6])); //manufacturer_id
                pr.setInt(8, Integer.parseInt(str[7])); //max_speed
                pr.setBoolean(9, Boolean.parseBoolean((str[8])));
                pr.executeUpdate();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

    }
}
