package org.pattern.lhf.visitor;

import java.util.Iterator;

public class ListVisitor extends Visitor {
    private String currentDir="";

    @Override
    public void Visit(File file) {
        System.out.println(currentDir+"/"+file);
    }

    @Override
    public void Visit(Directory directory) {
        System.out.println(currentDir+"/"+directory);
        String savedir=currentDir;
        currentDir=currentDir+"/"+directory.getName();
        Iterator iterator=directory.iterator();
        while (iterator.hasNext()){
            Entry entry=(Entry)iterator.next();
            entry.accept(this);
        }
        currentDir=savedir;
    }
}
