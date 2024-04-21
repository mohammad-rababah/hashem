package Q2022.B.Q2;

import javax.swing.*;
import java.awt.*;

public class HealthRecords extends JFrame {
    Records records[];

    HealthRecords() {
        records = new Records[2]; // size of array is 2
        records[0] = new Referrals();
        records[1] = new Vaccinations();
        JButton butR = new JButton("Referrals");
        JButton butV = new JButton("Vaccinations");
        JPanel panel = new JPanel();
        panel.add(butR, BorderLayout.WEST);
        panel.add(butV, BorderLayout.EAST);
//        GridBagLayout gbl = new GridBagLayout();
//        setLayout(gbl);
//        GridBagConstraints gbc = new GridBagConstraints();
//        gbc.gridx = 1;
//        gbc.gridy = 1;
//        gbl.setConstraints(panel, gbc);
        add(butR, BorderLayout.EAST);
        add(butV, BorderLayout.WEST);
        setSize(400, 200);
        panel.setSize(400, 200);
        panel.setBackground(Color.RED);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}

