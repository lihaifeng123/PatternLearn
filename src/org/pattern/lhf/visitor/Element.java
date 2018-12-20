package org.pattern.lhf.visitor;

public interface Element {
    public abstract void accept(Visitor visitor);
}
