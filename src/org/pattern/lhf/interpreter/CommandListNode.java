package org.pattern.lhf.interpreter;

import java.util.ArrayList;

public class CommandListNode extends Node {
    private ArrayList list=new ArrayList();
    @Override
    public void parse(Context context) throws ParseException {
        while (true){
            if(context.getCurrentToken()==null){
                throw new ParseException("Missing End");
            }else if(context.getCurrentToken().equals("end")){
                context.skipToken("end");
                break;
            }else{
                Node commandNode=new CommandNode();
                commandNode.parse(context);
                list.add(commandNode);
            }
        }
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
