package org.example.standard.collection.properties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesEx {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("timeout", "30");
        properties.setProperty("language", "한글");

        try {
            properties.store(new FileOutputStream("output.txt"), "Properties Example");
            properties.storeToXML(new FileOutputStream("output.xml"), "Properties Example");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
