package com.company;


import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile  {
    private final String FILENAME = "All.csv";
    private String port;

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public void writeToFile() throws Exception {
        try {
            FileWriter writer = new FileWriter(FILENAME, true);
            writer.write(getPort());
            writer.append(";");
            writer.flush();
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }

    }
}
