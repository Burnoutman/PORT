package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;


public class ManufacturerReader {
    private final String FILENAME = "D:\\manufacturer.csv";
    private final String INSERT = "INSERT INTO manufacturer (id,title_manufacturer,country) VALUE(?,?,?)";

    public void Insert() throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader(FILENAME));
        Connection connection = DbConnector.getConnection();
        String line;


        while ((line = reader.readLine()) != null) {

            try {
                PreparedStatement pr = connection.prepareStatement(INSERT);
                String[] str = line.split(";");
                pr.setInt(1, Integer.parseInt(str[0]));
                pr.setString(2, str[1]);
                pr.setString(3, str[2]);
                pr.executeUpdate();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

    }


}
