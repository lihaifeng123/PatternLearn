package test.lhf.pattern.visitor;

//import org.pattern.lhf.builder.Director;
import org.pattern.lhf.visitor.Directory;
import org.pattern.lhf.visitor.File;
import org.pattern.lhf.visitor.FileTreatementException;
import org.pattern.lhf.visitor.ListVisitor;

public class Test {
    public static void main(String[] args){
        try{
            System.out.println("Marking Root enteries....");
            Directory root=new Directory("root");
            Directory bindir=new Directory("bin");
            Directory tmpdir=new Directory("tmp");

            root.add(bindir);
            root.add(tmpdir);

            bindir.add(new File("vi",2000));
            bindir.add(new File("latex",30000));

            root.accept(new ListVisitor());
        }catch (FileTreatementException e){
            e.printStackTrace();
        }
    }
}
