package test.lhf.pattern.command;

import org.pattern.lhf.command.Command;
import org.pattern.lhf.command.DrawCanvas;
import org.pattern.lhf.command.DrawCommand;
import org.pattern.lhf.command.MacroCommand;

import javax.swing.*;
import java.awt.event.*;

public class Test extends JFrame implements ActionListener,MouseMotionListener,WindowListener {

    private MacroCommand macroCommand=new MacroCommand();

    private DrawCanvas canvas=new DrawCanvas(400,400,macroCommand);

    private JButton button=new JButton("Clear");

    private JButton undo=new JButton("Undo");

    public Test(String title){
        super(title);

        this.addWindowListener(this);
        canvas.addMouseMotionListener(this);
        button.addActionListener(this);
        undo.addActionListener(this);

        Box buttonBox=new Box(BoxLayout.X_AXIS);
        buttonBox.add(button);
        buttonBox.add(undo);

        Box mainBox=new Box(BoxLayout.Y_AXIS);
        mainBox.add(buttonBox);
        mainBox.add(canvas);

        getContentPane().add(mainBox);

        pack();
        show();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            macroCommand.clear();
            canvas.repaint();
        }else if(e.getSource()==undo){
            macroCommand.undo();;
            canvas.repaint();
        }
    }



    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Command cmd=new DrawCommand(canvas,e.getPoint());
        macroCommand.append(cmd);
        cmd.execute();
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
    public static void main(String[] args){
        new Test("Command Pattern Sample");
    }
}
