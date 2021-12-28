package JavaPanel.PartsPanel.PartsInfoPanel;

import javax.swing.*;
import java.awt.*;

public class SoliderInfoArea extends JPanel {
    private String HP = "HEALTH: ";
    private String STR = "STR: ";
    private String POS = "POSITION: ";
    private JLabel SoliderHP;
    private JLabel SoliderSTR;
    private JLabel SoliderPOS;
    public SoliderInfoArea() {
        setLayout(new GridLayout(4, 1));
        setBorder(BorderFactory.createLineBorder(Color.GRAY));
        SoliderHP = new JLabel(HP + "♥ 200");
        SoliderSTR = new JLabel(STR + "☠ 150");
        SoliderPOS = new JLabel(POS + "43:12");
        add(new JLabel("SOLIDER BOARD", SwingConstants.CENTER));
        add(SoliderHP);
        add(SoliderSTR);
        add(SoliderPOS);
    }
}
