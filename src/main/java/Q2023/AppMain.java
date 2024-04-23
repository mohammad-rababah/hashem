package Q2023;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ShapeSelectionFrame extends JFrame {
    Color col = Color.red;

    public void createComponents() {
        JButton but = new JButton("Change Colour");
        ShapeDisplayPanel panel = new ShapeDisplayPanel(this);
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(but);
        // Begin of code to be added
        but.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                col = Color.BLUE;
                panel.repaint();
            }
        });
        // End of code to be added
        add(buttonPanel, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class ShapeDisplayPanel extends JPanel {
    ShapeSelectionFrame theApp;

    ShapeDisplayPanel(ShapeSelectionFrame app) {
        theApp = app;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(theApp.col);
        g.fillOval(60, 60, 100, 100);
    }
}

public class AppMain {
    public static void main(String[] args) {
        ShapeSelectionFrame frame = new ShapeSelectionFrame();
        frame.createComponents();
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}