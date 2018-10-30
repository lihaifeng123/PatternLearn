package test.lhf.pattern.builder;

import org.pattern.lhf.builder.Director;
import org.pattern.lhf.builder.HTMLBuilder;
import org.pattern.lhf.builder.TextBuilder;

public class Test {
    public static void main(String[] args){
        TextBuilder textBuilder=new TextBuilder();
        Director director=new Director(textBuilder);
        director.construct();;
        String result=textBuilder.getResult();
        System.out.println(result);

        HTMLBuilder builder=new HTMLBuilder();
        Director director1=new Director(builder);
        director1.construct();
        result=builder.getResult();
        System.out.println(result);
    }
}
