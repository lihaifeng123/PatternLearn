package org.pattern.lhf.interpreter;

import java.util.StringTokenizer;

public class Context {
    private StringTokenizer tokenizer;
    private String currentToken;
    public Context(String text){
        tokenizer=new StringTokenizer(text);
        nextToken();
    }
    public String nextToken(){
        if(tokenizer.hasMoreTokens()){
            currentToken=tokenizer.nextToken();
        }else {
            currentToken=null;
        }
        return currentToken;
    }
    public String getCurrentToken(){
        return currentToken;
    }
    public void skipToken(String token) throws ParseException{
        if(!token.equals(currentToken)){
            throw new ParseException("Warring:"+token+" is expected,but "+currentToken+" is found.");
        }
        nextToken();
    }
    public int currentNumber() throws ParseException{
        int num=0;
        try{
            num=Integer.parseInt(currentToken);
        }catch (NumberFormatException e){
            throw new ParseException("Warring:"+e);
        }
        return num;
    }
}
