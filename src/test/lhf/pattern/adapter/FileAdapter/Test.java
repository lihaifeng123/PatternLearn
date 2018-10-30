package test.lhf.pattern.adapter.FileAdapter;

import org.pattern.lhf.adapter.FileAdapter.FileIO;
import org.pattern.lhf.adapter.FileAdapter.FileProperties;

import java.io.IOException;

public class Test {
    public static void main(String[] args){
        FileIO fileIO=new FileProperties();
        try{
            fileIO.readFromFile("F:\\javacode\\Learn\\UML\\src\\org\\pattern\\lhf\\adapter\\FileAdapter\\file.txt");
            fileIO.setValue("name","lihaifeng");
            fileIO.setValue("work","computer");
            fileIO.writeToFile("F:\\javacode\\Learn\\UML\\src\\org\\pattern\\lhf\\adapter\\FileAdapter\\file.txt");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
