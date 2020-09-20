package com.company;
import com.company.entity.Manufacturer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;


public class ManufacturerReader {

    public void Insert() throws Exception {

        Manufacturer manufacturer =new Manufacturer();

        BufferedReader reader = new BufferedReader(new FileReader(manufacturer.getFILENAME()));
        Connection connection = DbConnector.getConnection();
        String line;

        while ((line = reader.readLine()) != null) {

            try {
                PreparedStatement pr = connection.prepareStatement(manufacturer.getINSERT());
                String[] str = line.split(";");
                manufacturer.setId(Integer.parseInt(str[0]));
                manufacturer.setTitleManufacturer(str[1]);
                manufacturer.setCountry(str[2]);

                pr.setInt(1, manufacturer.getId());
                pr.setString(2, manufacturer.getTitleManufacturer());
                pr.setString(3, manufacturer.getCountry());
                pr.executeUpdate();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

    }


}
