package org.sherwoodhs.ui;;

import org.sherwoodhs.AdvGame;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class MapPanel extends JPanel {
    public static final MapPanel mapPanel = new MapPanel();
    ImageIcon img = AdvGame.getInstance().getCurrentSituation().prevImg();
    ImageIcon scaledImg = new ImageIcon(img.getImage().getScaledInstance(220, 220, Image.SCALE_DEFAULT));
    JLabel label = new JLabel(scaledImg, JLabel.CENTER);

    private MapPanel() {
        super();
        setPreferredSize(new Dimension(250, 250));
        setBorder(new TitledBorder("Map"));

        add(label);
    }

    public void updateImg(){
        try {
            img = AdvGame.getInstance().getCurrentSituation().prevImg();
            scaledImg = new ImageIcon(img.getImage().getScaledInstance(220, 220, Image.SCALE_DEFAULT));

            scaledImg.getImage().flush();
            label.setIcon(scaledImg);
        } catch (NullPointerException e){

        }
    }
}
