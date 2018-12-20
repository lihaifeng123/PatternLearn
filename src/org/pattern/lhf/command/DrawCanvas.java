package org.pattern.lhf.command;

import java.awt.*;

public class DrawCanvas extends Canvas implements Drawable {
    private Color color=Color.RED;

    private int radius=6;

    private MacroCommand history;

    public DrawCanvas(int width,int height,MacroCommand macroCommand){
        setSize(width,height);
        setBackground(Color.white);
        this.history=macroCommand;
    }

    public void paint(Graphics graphics){
        history.execute();
    }
    @Override
    public void draw(int x, int y) {
        Graphics graphics=getGraphics();
        graphics.setColor(color);
        graphics.fillOval(x-radius,y-radius,radius*2,radius*2);
    }
}
