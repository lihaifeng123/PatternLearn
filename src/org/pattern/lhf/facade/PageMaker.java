package org.pattern.lhf.facade;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PageMaker {
    private PageMaker(){

    }
    public static void makeWelcomePage(String mailaddr,String filename){
        try{
            Properties mailprop=Database.getProperties("maildata");
            String username=mailprop.getProperty(mailaddr);
            HtmlWriter writer=new HtmlWriter(new FileWriter(filename));
            writer.paragraph("Welcome to "+username+"'s page!");
            writer.paragraph(username+"欢迎来到"+username+"的主页面");
            writer.paragraph("wrait your mail");
            writer.mailto(mailaddr,username);
            writer.close();
            System.out.println(filename+" is created for "+mailaddr+"("+username+")");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
