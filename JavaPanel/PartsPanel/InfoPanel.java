package JavaPanel.PartsPanel;

import JavaPanel.GlobalPanel;
import JavaPanel.PartsPanel.PartsInfoPanel.GameControlArea;
import JavaPanel.PartsPanel.PartsInfoPanel.GameInfoArea;
import JavaPanel.PartsPanel.PartsInfoPanel.SoliderControlArea;
import JavaPanel.PartsPanel.PartsInfoPanel.SoliderInfoArea;

import javax.swing.*;
import java.awt.*;

public class InfoPanel extends JPanel {
    private GameControlArea GCA;
    private GameInfoArea GIA;
    private SoliderControlArea SCA;
    private SoliderInfoArea SIA;
    private JTextArea LOG;
    private JScrollPane SCROLL;
    private GlobalPanel GP;
    public InfoPanel(GlobalPanel GP) {
        this.GP = GP;
        PreparePanel();
        CreateParts();
        PrepareLogs();
        add(GCA);
        add(GIA);
        add(SCA);
        add(SIA);
        add(SCROLL);
    }
    private void PreparePanel() {
        setBorder(BorderFactory.createLineBorder(Color.GRAY));
        setLayout(new GridLayout(5, 1));
    }
    private void CreateParts() {
        GCA = new GameControlArea();
        GIA = new GameInfoArea();
        SCA = new SoliderControlArea();
        SIA = new SoliderInfoArea();
    }
    private void PrepareLogs(){
        LOG = new JTextArea();
        SCROLL = new JScrollPane(LOG);
    }
}
