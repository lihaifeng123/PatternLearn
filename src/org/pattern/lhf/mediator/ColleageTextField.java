package org.pattern.lhf.mediator;

import java.awt.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class ColleageTextField extends TextField implements TextListener,Colleage {
    private Mediator mediator;

    public ColleageTextField(String text,int colnums){
        super(text,colnums);
    }
    @Override
    public void textValueChanged(TextEvent e) {
        mediator.colleagueChanged();
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator=mediator;
    }

    @Override
    public void setColleagueEnable(boolean enable) {
        setEnabled(enable);
        setBackground(enable?Color.white:Color.lightGray);
    }
}
