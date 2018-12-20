package org.pattern.lhf.mediator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends Frame implements ActionListener,Mediator {
    private ColleageCheckbox checkGuest;
    private ColleageCheckbox checkLogin;
    private ColleageTextField textUser;
    private ColleageTextField textPass;
    private ColleageButton buttonOk;
    private ColleageButton buttonCancel;

    public LoginFrame(String title){
        super(title);
        setBackground(Color.lightGray);
        setLayout(new GridLayout(4,2));
        createColleagues();
        add(checkGuest);
        add(checkLogin);
        add(textUser);
        add(textPass);
        add(buttonOk);
        add(buttonCancel);
        colleagueChanged();
        pack();
        show();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        System.exit(0);
    }


    @Override
    public void createColleagues() {
        CheckboxGroup g=new CheckboxGroup();
        checkGuest=new ColleageCheckbox("Gest",g,true);
        checkLogin=new ColleageCheckbox("Login",g,true);

        textUser=new ColleageTextField("",10);
        textPass=new ColleageTextField("",10);
        textPass.setEchoChar('*');
        buttonOk=new ColleageButton("OK");
        buttonCancel=new ColleageButton("Cancel");

        checkLogin.setMediator(this);
        checkGuest.setMediator(this);

        textUser.setMediator(this);
        textPass.setMediator(this);

        buttonCancel.setMediator(this);
        buttonOk.setMediator(this);

        checkGuest.addItemListener(checkGuest);
        checkLogin.addItemListener(checkLogin);

        textPass.addTextListener(textPass);
        textUser.addTextListener(textUser);

        buttonOk.addActionListener(this);
        buttonCancel.addActionListener(this);

    }

    private void userpassChanged(){
        if(textUser.getText().length()>0){
            textPass.setColleagueEnable(true);
            if(textPass.getText().length()>0){
                buttonOk.setColleagueEnable(true);
            }else{
                buttonOk.setColleagueEnable(false);
            }
        }else{
            textPass.setColleagueEnable(false);
            buttonOk.setColleagueEnable(false);
        }
    }

    @Override
    public void colleagueChanged() {
        if(checkGuest.getState()){
            textUser.setColleagueEnable(false);
            textPass.setColleagueEnable(false);
            buttonOk.setColleagueEnable(true);
        }else{
            textUser.setColleagueEnable(true);
            userpassChanged();
        }
    }
}
