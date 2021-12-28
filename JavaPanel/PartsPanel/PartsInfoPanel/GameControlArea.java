package JavaPanel.PartsPanel.PartsInfoPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameControlArea extends JPanel {
    private JButton NewBattle;
    private JButton ExitBattle;
    private int ALL_OK = 0;
    public GameControlArea() {
        setLayout(new GridLayout(3, 1));
        setBorder(BorderFactory.createLineBorder(Color.GRAY));
        NewBattle = new JButton("START BATTLE");
        ExitBattle = new JButton("EXIT BATTLE");
        NewBattle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(ALL_OK);
            }
        });
        add(new JLabel("BATTLE CONTROL", SwingConstants.CENTER));
        add(NewBattle);
        add(ExitBattle);
    }
}
