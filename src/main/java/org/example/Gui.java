package org.example;

import javax.swing.*;
import java.awt.*;

public class Gui extends JFrame {

    public Gui() {
        // 1,2,3 buttons


        GridBagLayout gridLayout = new GridBagLayout();
        // grid constrains
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridy = 0;

        JTextField textField = new JTextField(20);
        gridLayout.setConstraints(textField, gridBagConstraints);


        gridBagConstraints.gridy = 1;


        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");

        JPanel panle = new JPanel();
        panle.add(button1);
        panle.add(button2);
        panle.add(button3);

        gridLayout.setConstraints(panle, gridBagConstraints);


//        add(panle);

        // 4,5,6 buttons
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");

        JPanel panle2 = new JPanel();
        panle2.add(button4);
        panle2.add(button5);
        panle2.add(button6);
        gridBagConstraints.gridy = 2;
        gridLayout.setConstraints(panle2, gridBagConstraints);
        setLayout(gridLayout);
        setSize(400, 200);
        button1.addActionListener(e -> {
            textField.setText("1");
        });
        button2.addActionListener(e -> {
            textField.setText("2");
        });
        button3.addActionListener(e -> {
            textField.setText("3");
        });
        add(textField);
        add(panle);
        add(panle2);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        checkDouble(2);
    }
    void checkDouble(double x){

    }
    public static void main(String[] args) {
        new Gui();
    }
}
