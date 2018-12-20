package test.lhf.pattern.proxy;

import org.pattern.lhf.proxy.PrintProxy;
import org.pattern.lhf.proxy.Printable;

public class Test {
    public static void main(String[] args){
        Printable p=new PrintProxy("Alice");
        System.out.println("now name is :"+p.getPrinterName()+" .");
        p.setPrinterName("Bob");
        System.out.println("now name is :"+p.getPrinterName()+" .");
        p.print("Hello,world");
    }
}
