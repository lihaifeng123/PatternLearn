package test.lhf.pattern.interpreter;

import org.pattern.lhf.interpreter.Context;
import org.pattern.lhf.interpreter.Node;
import org.pattern.lhf.interpreter.ProgramNode;

import java.io.BufferedReader;
import java.io.FileReader;

public class Test {
    public static void main(String[] args){
        try{
            BufferedReader reader=new BufferedReader(new FileReader("program.txt"));
            String text;
            while ((text=reader.readLine())!=null){
                System.out.println("text=\""+text+"\"");
                Node node=new ProgramNode();
                node.parse(new Context(text));
                System.out.println("node="+node);
            }
            reader.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
