package com.sd.aGameOfYut;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class YutGameDemoMain implements ActionListener {

  JButton button1;
  JButton button2;
  JButton button3;
  
  public static void main(String[] args) {
    
    YutGameDemoMain gui = new YutGameDemoMain();
    gui.go();
  }
  
  public void go() {
  
    JFrame frame = new JFrame();
    
    button1 = new JButton("Dice Game Start");
    Font bigFont = new Font("serif", Font.BOLD, 28);
    
    frame.getContentPane().add(BorderLayout.SOUTH, button1);
    
    button1.addActionListener(this);
    
    JPanel panel = new JPanel();
    JTextField field1 = new JTextField(10);
    JTextField field2 = new JTextField(10);
    JLabel label1 = new JLabel("Input Player1's name");
    button2 = new JButton("Submit");
    JLabel label2 = new JLabel("Input Player2's name");
    button3 = new JButton("Submit");

    frame.getContentPane().add(BorderLayout.CENTER, panel);
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
    
    field1.setText("");
    field2.setText("");  
    field1.selectAll();
    field1.requestFocus();
    field2.selectAll();
    field2.requestFocus();
    panel.add(label1);
    panel.add(field1);
    panel.add(button2);
    panel.add(label2);
    panel.add(field2);
    panel.add(button3);
    
    
    frame.setSize(400,400);
    frame.setVisible(true);
  }
  
  public void actionPerformed(ActionEvent event) {
    button1.setText("a Game of Yut is start");
    button2.setText("OK");
    button3.setText("OK");
  }
   
}