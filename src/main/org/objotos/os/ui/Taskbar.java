package org.objotos.os.ui;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.*;

import javax.swing.*;

import org.objotos.apps.Calculator;
import org.objotos.os.ui.OSWindow.OSFrame;

import net.ferderplays.objot.devui.Window;
import net.ferderplays.objot.devui.listeners.ElementDragListener;

public class Taskbar extends JPanel {

    public JLabel turnOffBtn, calcBtn;

    public Taskbar(OSFrame parent, OSScreen screen) {
        turnOffBtn = new JLabel("X");
        calcBtn = new JLabel("Calculator");
        int tbWidth = (int)Toolkit.getDefaultToolkit().getScreenSize().width;
        int tbHeight = (int)Toolkit.getDefaultToolkit().getScreenSize().height;

        // this is the taskbar frontend
        setBackground(Color.lightGray);
        setBounds(0, tbHeight - 50, tbWidth, 50);

        turnOffBtn.setSize(50, 50);
        turnOffBtn.setVerticalAlignment(JLabel.CENTER);
        turnOffBtn.setHorizontalAlignment(JLabel.CENTER);

        // this is the actual backend
        turnOffBtn.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                parent.turnOSOff();
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
        calcBtn.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                screen.add(new Calculator());
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
            
        });
        this.add(turnOffBtn);
        this.add(calcBtn);
    }
}
