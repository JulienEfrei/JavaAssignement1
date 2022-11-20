package com.company;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;




public class Main extends JFrame implements ActionListener {
    JFrame f=new JFrame();

    JTextField text = new JTextField();
    JButton b=new JButton("submit");


    ButtonGroup bg=new ButtonGroup();
    JRadioButton r1=new JRadioButton("Autosum");
    JRadioButton r2=new JRadioButton("Average");
    JRadioButton r3=new JRadioButton("Max");
    JRadioButton r4=new JRadioButton("Min");


    public void main(String[] args) {
        f.setVisible(true);

        f.setSize(400,500);
        text.setBounds(60,100,340, 30);
        b.setBounds(60,150,100, 40);
        r1.setBounds(60,200,100, 30);
        r2.setBounds(60,250,100, 30);
        r3.setBounds(60,300,100, 30);
        r4.setBounds(60,350,100, 30);

        r1.setActionCommand("Autosum");
        r2.setActionCommand("Average");
        r3.setActionCommand("Max");
        r4.setActionCommand("Min");


        JLabel l1=new JLabel("Enter the numbers");

        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        bg.add(r4);

        f.add(b);
        f.add(text);
        f.add(r1);
        f.add(r2);
        f.add(r3);
        f.add(r4);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        if(s.equals("submit")){
            String[] firstArray = text.getText().trim().split("\\s* \\s*");
            int[] numbers = Arrays.stream(firstArray).mapToInt(Integer::parseInt).toArray();
            Excel excel = new Excel(bg.getSelection().getActionCommand(), numbers);
        }
    }
}
