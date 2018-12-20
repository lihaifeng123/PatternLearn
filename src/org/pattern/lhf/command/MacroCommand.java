package org.pattern.lhf.command;

import java.util.Iterator;
import java.util.Stack;

public class MacroCommand implements Command {
    private Stack command=new Stack();

    @Override
    public void execute() {
        Iterator iterator=command.iterator();
        while (iterator.hasNext()){
            ((Command)iterator.next()).execute();
        }
    }

    public void append(Command cmd){
        if(cmd!=null){
            command.push(cmd);
        }
    }
    public void undo(){
        if(!command.empty()){
            command.pop();
        }
    }
    public void clear(){
        command.clear();
    }
}
