package com.company;
import com.company.entity.TypeShip;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class TypeShipReader {

    public void Insert() throws Exception {

        TypeShip typeShip= new TypeShip();

        BufferedReader reader = new BufferedReader(new FileReader(typeShip.getFILENAME()));
        Connection connection = DbConnector.getConnection();
        String line;
        while ((line = reader.readLine()) != null) {

            try {
                PreparedStatement pr = connection.prepareStatement(typeShip.getINSERT());
                String[] str=line.split(";");
                typeShip.setId(Integer.parseInt(str[0]));
                typeShip.setTypeShip(str[1]);

                pr.setInt(1, typeShip.getId());
                pr.setString(2, typeShip.getTypeShip());
                pr.executeUpdate();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

    }

}
