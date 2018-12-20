package org.pattern.lhf.interpreter;

public abstract class Node {
    public abstract void parse(Context context) throws ParseException;
}
