package org.pattern.lhf.mediator;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class ColleageCheckbox extends Checkbox implements ItemListener,Colleage {
    private Mediator mediator;
    public ColleageCheckbox(String caption,CheckboxGroup group,boolean state){
        super(caption,group,state);
    }


    @Override
    public void setMediator(Mediator mediator) {
        this.mediator=mediator;
    }

    @Override
    public void setColleagueEnable(boolean enable) {
        setEnabled(enable);
        //setBackground(enable?Color.white:Color.lightGray);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        mediator.colleagueChanged();
    }
}
