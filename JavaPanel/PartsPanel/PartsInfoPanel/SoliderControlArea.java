package JavaPanel.PartsPanel.PartsInfoPanel;

import javax.swing.*;
import java.awt.*;

public class SoliderControlArea extends JPanel {
    private JButton UP;
    private JButton LEFT;
    private JButton RIGHT;
    private JButton DOWN;
    public SoliderControlArea() {
        setLayout(new GridLayout(2 , 3));
        setBorder(BorderFactory.createLineBorder(Color.GRAY));
        UP = new JButton("↑");
        LEFT = new JButton("←");
        RIGHT = new JButton("→");
        DOWN = new JButton("↓");
        add(new JPanel());
        add(UP);
        add(new JPanel());
        add(LEFT);
        add(DOWN);
        add(RIGHT);
    }
}
