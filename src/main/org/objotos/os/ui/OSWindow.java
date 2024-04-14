package org.objotos.os.ui;

import javax.swing.*;

import org.objotos.os.Settings;

import java.awt.*;

public class OSWindow  {

    public Settings settings = new Settings(null);
    public OSFrame window = new OSFrame();

    public OSWindow() {
        window.setAlwaysOnTop(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setExtendedState(JFrame.MAXIMIZED_BOTH);
        window.setUndecorated(true);
        window.show();
        window.add(new OSScreen(settings.background_image, window));
    }

    public class OSFrame extends JFrame {
        public void turnOSOff() {
            this.dispose();
        }
    }
}