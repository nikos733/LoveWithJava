package JavaPanel;

import JavaPanel.PartsPanel.GamePanel;
import JavaPanel.PartsPanel.InfoPanel;

import javax.swing.*;
import java.awt.*;

public class GlobalPanel extends JFrame {
    private int BREDTH = 700;
    private int ALTITUDE = 500;
    private int BredthX = 400;
    private int AltitudeY = 180;
    private String PanelN = "Breathe Free Solider";
    private InfoPanel IPanel;
    private GamePanel GPanel;
    GlobalPanel() {
        SetupPanel();
        GPanel = new GamePanel();
        IPanel = new InfoPanel(this);
        add(GPanel);
        add(IPanel, BorderLayout.EAST);
        setVisible(true);
    }
    private void SetupPanel() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(BREDTH,ALTITUDE);
        setLocation(BredthX, AltitudeY);
        setTitle(PanelN);
    }
}
