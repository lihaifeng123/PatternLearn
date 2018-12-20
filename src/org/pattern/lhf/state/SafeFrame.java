package org.pattern.lhf.state;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SafeFrame extends JFrame implements ActionListener,Context {
    private TextField textClock=new TextField(60);
    private TextArea textScreen=new TextArea(10,60);
    private  Button buttonUse=new Button("使用金库");
    private Button buttonAlarm=new Button("按下金铃");
    private Button buttonPhone=new Button("正常通话");
    private Button buttonExit=new Button("结束");

    private  State state=DayState.getInstance();
    public SafeFrame(String title){
        super(title);
        setBackground(Color.lightGray);
        setLayout(new BorderLayout());
        add(textClock,BorderLayout.NORTH);
        textClock.setEnabled(false);
        add(textScreen,BorderLayout.CENTER);
        textScreen.setEnabled(false);
        Panel panel=new Panel();
        panel.add(buttonUse);
        panel.add(buttonAlarm);
        panel.add(buttonPhone);
        panel.add(buttonExit);
        add(panel,BorderLayout.SOUTH);
        pack();
        show();
        buttonAlarm.addActionListener(this);
        buttonUse.addActionListener(this);
        buttonPhone.addActionListener(this);
        buttonExit.addActionListener(this);


    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        if(e.getSource()==buttonUse){
            state.doUse(this);
        }else if(e.getSource()==buttonAlarm){
            state.doAlarm(this);
        }else if(e.getSource()==buttonPhone){
            state.doPhone(this);
        }else if(e.getSource()==buttonExit){
            System.exit(0);
        }else{
            System.out.println("?");
        }
    }

    @Override
    public void setClock(int hour) {
        String clockStrirng="现在时间是";
        if(hour<10){
            clockStrirng+="0"+hour+":00";
        }else{
            clockStrirng+=hour+":00";
        }
        System.out.println(clockStrirng);
        textClock.setText(clockStrirng);
        state.doClock(this,hour);
    }

    @Override
    public void changeState(State state) {
        System.out.println("从 "+this.state+"状态变成了 "+state+"状态");
        this.state=state;

    }

    @Override
    public void callSecurityCenter(String msg) {
        textScreen.append("call! "+msg+"\n");
    }

    @Override
    public void recordLog(String msg) {
        textScreen.append("record...."+msg+"\n");
    }
}
