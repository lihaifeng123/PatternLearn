package org.pattern.lhf.facade;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Database {
    static String path="F:\\javacode\\Learn\\UML\\src\\org\\pattern\\lhf\\facade\\";
    private Database(){

    }
    public static Properties getProperties(String dbname){
        String filename=path+dbname+".txt";
        Properties properties=new Properties();
        try{
            properties.load(new FileInputStream(filename));
        }catch (IOException e){
            e.printStackTrace();
        }
        return properties;
    }
}
