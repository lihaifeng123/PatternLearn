package test.lhf.pattern.composite;

import org.pattern.lhf.composite.Directory;
import org.pattern.lhf.composite.File;

public class Test {
    public static void main(String[] argv){
        try{
            System.out.println("Making root entries....");
            Directory rootdir=new Directory("root");
            Directory bindir=new Directory("bin");
            Directory tmpdir=new Directory("tmp");
            rootdir.add(bindir);
            rootdir.add(tmpdir);
            bindir.add(new File("vi",10000));
            bindir.add(new File("latex",12000));
            rootdir.printList();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
