package org.pattern.lhf.command;

import java.awt.Point;

public class DrawCommand implements Command {
    protected Drawable drawable;

    private Point point;

    public DrawCommand(Drawable drawable,Point point){
        this.drawable=drawable;
        this.point=point;
    }

    @Override
    public void execute() {
        drawable.draw(point.x,point.y);
    }
}
