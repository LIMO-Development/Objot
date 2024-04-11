package org.objotos.ui;

import java.awt.Color;
import java.awt.event.*;

import javax.swing.*;

import org.objotos.ui.OSWindow.OSFrame;

public class Taskbar extends JPanel {

    public JLabel turnOffBtn;

    public Taskbar(OSFrame parent) {
        turnOffBtn = new JLabel("X");
        int tbWidth = (int)parent.getSize().getWidth();

        // this will manage the taskbar frontend
        this.setBackground(Color.lightGray);
        this.setSize(tbWidth, 100);

        // this is the actual backend
        turnOffBtn.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                parent.turnOSOff();
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
            }
        });
        this.add(turnOffBtn);
    }
}
