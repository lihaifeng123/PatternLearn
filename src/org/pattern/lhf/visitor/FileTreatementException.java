package org.pattern.lhf.visitor;

public class FileTreatementException extends RuntimeException {
    public FileTreatementException(String msg){
        super(msg);
    }
    public FileTreatementException(){
        super();
    }
}
