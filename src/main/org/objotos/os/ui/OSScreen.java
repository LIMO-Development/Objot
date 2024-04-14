package org.objotos.os.ui;

import java.awt.*;
import java.awt.image.*;

import javax.swing.*;

import org.objotos.os.ui.OSWindow.OSFrame;

public class OSScreen extends JPanel {

    public BufferedImage background_image;
    public net.ferderplays.objot.devui.Window window = new net.ferderplays.objot.devui.Window(800, 800);

    public OSScreen(BufferedImage backgroundImage, OSFrame parent) {
        background_image = backgroundImage;

        //this is the frontend of the panel
        setLayout(null);

        // this is the backend of the panel
        add(new Taskbar(parent, this));
    }

    // the image background;
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Image bgImage = background_image.getScaledInstance(getSize().width, getSize().height, Image.SCALE_SMOOTH);
    
        g.drawImage(bgImage, 0, 0, this);
    }
}
