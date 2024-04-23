package Q2022.B.Q2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HealthRecords extends JFrame {
    Records records[];

    HealthRecords() {
        records = new Records[2];
        records[0] = new Referrals();
        records[1] = new Vaccinations();
        JButton butR = new JButton("Referrals");
        JButton butV = new JButton("Vaccinations");
        // Begin of code to be added
        butR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                records[0].letterDetails();
            }
        });
        butV.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                records[1].letterDetails();
            }
        });
        // End of code to be added
        JPanel panel = new JPanel();
        panel.add(butR, BorderLayout.WEST);
        panel.add(butV, BorderLayout.EAST);
        GridBagLayout gbl = new GridBagLayout();
        setLayout(gbl);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbl.setConstraints(panel, gbc);
        add(panel);
        setSize(400, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}

