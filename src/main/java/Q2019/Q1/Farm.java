package Q2019.Q1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Farm extends JFrame {
    Animal stock[];

    public Farm() {
        stock = new Animal[2];
        stock[0] = new Goat();
        stock[1] = new Duck();
        JButton butM = new JButton("Goat!");
        JButton butC = new JButton("Duck!");
        // added code
        butM.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stock[0].makeNoise();
            }
        });
        butC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stock[1].makeNoise();
            }
        });
        // end of added code
        JPanel panel = new JPanel();
        panel.add(butM, BorderLayout.WEST);
        panel.add(butC, BorderLayout.EAST);
        GridBagLayout gbl = new GridBagLayout();
        setLayout(gbl);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbl.setConstraints(panel, gbc);
        add(panel);
        setSize(200, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {
        Farm z = new Farm();
    }
}

abstract class Animal {
    String noise;

    abstract void makeNoise();
}

class Goat extends Animal {
    public Goat() {
        noise = "maaa!";
    }

    void makeNoise() {
        System.out.println("Goat goes " + noise);
    }
}

class Duck extends Animal {
    public Duck() {
        noise = "quack!";
    }

    void makeNoise() {
        System.out.println("Duck goes " + noise);
    }
}