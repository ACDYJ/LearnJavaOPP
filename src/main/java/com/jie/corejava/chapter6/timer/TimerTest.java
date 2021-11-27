package com.jie.corejava.chapter6.timer;

import javax.swing.*;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
public class TimerTest {
    public static void main(String[] args) {

        ActionListener listener=new TimePrinter();
        Timer t=new Timer(1000,listener);
        t.start();
        JOptionPane.showMessageDialog(null,"Quit program?");
        System.exit(0);

    }
}

class TimePrinter implements ActionListener{

    public void actionPerformed(ActionEvent e) {
        System.out.println("At the tone the time is"+new Date());
        Toolkit.getDefaultToolkit().beep();
    }
}