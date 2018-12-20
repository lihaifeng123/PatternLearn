package org.pattern.lhf.mediator;

import java.awt.*;

public class ColleageButton extends Button implements Colleage {
    private Mediator mediator;
    public ColleageButton(String caption){
        super(caption);
    }
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator=mediator;
    }

    @Override
    public void setColleagueEnable(boolean enable) {
        setEnabled(enable);
    }
}
