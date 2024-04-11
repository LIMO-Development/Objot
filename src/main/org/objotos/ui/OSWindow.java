package org.objotos.ui;

import javax.swing.*;
import java.awt.*;

public class OSWindow  {

    public OSFrame window = new OSFrame();

    public OSWindow() {
        window.setAlwaysOnTop(true);
        window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
        window.setExtendedState(window.MAXIMIZED_BOTH);
        window.setUndecorated(true);
        window.show();
        window.setLayout(new BorderLayout());
        window.add(new Taskbar(window));
    }

    

    public class OSFrame extends JFrame {
        public void turnOSOff() {
            this.disable();
        }
    }
}