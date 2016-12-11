package com.sd.gui;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;

public class ClacAreaGUIMain {
  public static void main(String[] args) {
    JFrame f=new JFrame();
    FPanel panel=new JPanel(new GridLayout(3,2));
    f.getContentPane().add(panel);
    JLable lable1=new JLable("반지름");
    JLable lable2=new JLable("면적");
    JTextField radiusTf1=new JTextField(10);
    JTextField areaTf2=new JTextField(10);
    JButton b1=new JButton("계산");
    JButton b2=new JButton("취소");
    panel.add(label1);
    panel.add(radiusTf1);
    panel.add(label2);
    panel.add(areaTf2);
    panel.add(b1);
    panel.add(b2);
    f.apck();
    f.setVisible(true);
  }
}