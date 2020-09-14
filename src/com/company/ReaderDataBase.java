package com.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ReaderDataBase {
    private final String SELECT = "SELECT ts.type_ship,sh.title_ship, mf.title_manufacturer,mf.country,displacement," +
            "launch_date,capitan,max_speed,military FROM ships sh INNER JOIN " +
            "manufacturer mf ON sh.manufacturer_id=mf.id INNER JOIN type_ship ts ON sh.type_ship_id=ts.id;";


    public void readerDataBase() {
        WriteToFile wtf = new WriteToFile();
        Connection connection = DbConnector.getConnection();
        ArrayList<String> list = new ArrayList<>();
        try (
                PreparedStatement statement = connection.prepareStatement(SELECT);
                ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                list.add(resultSet.getString("type_ship"));
                list.add(resultSet.getString("title_ship"));
                list.add(resultSet.getString("title_manufacturer"));
                list.add(resultSet.getString("country"));
                list.add(resultSet.getString("displacement"));
                list.add(resultSet.getString("launch_date"));
                list.add(resultSet.getString("capitan"));
                list.add(resultSet.getString("max_speed"));
                if (resultSet.getString("military").equals("1")) {
                    list.add("Да");
                } else {
                    list.add("Нет");
                }
                list.add("\r\n");

            }
            resultSet.close();
            for (int i = 0; i < list.size(); i++) {
                wtf.setPort(list.get(i));
                wtf.writeToFile();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
