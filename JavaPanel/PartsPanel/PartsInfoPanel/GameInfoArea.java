package JavaPanel.PartsPanel.PartsInfoPanel;

import javax.swing.*;
import java.awt.*;

public class GameInfoArea extends JPanel {
    private String BOMBSIZE = "BOMBS: ";
    private String LEVEL = "LEVEL: ";
    private String BATTLEFIELD = "WAR ZONE: ";
    private JLabel BOMB;
    private JLabel LEVELUP;
    private JLabel ZONE;
    public GameInfoArea() {
        setLayout(new GridLayout(4,1));
        setBorder(BorderFactory.createLineBorder(Color.GRAY));
        ZONE = new JLabel(BATTLEFIELD + "40:50");
        LEVELUP = new JLabel(LEVEL + "14");
        BOMB = new JLabel(BOMBSIZE + "10");
        add(new JLabel("BATTLE INFO", SwingConstants.CENTER));
        add(BOMB);
        add(LEVELUP);
        add(ZONE);
    }
}
