package net.ferderplays.objot.devui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.event.*;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

import javax.swing.*;

public class Window extends JPanel {

    public int corner_radius = 25;
    public String title = "App";
    public JPanel titlebar = new JPanel(), contentbar = new JPanel();
    public JLabel title_string = new JLabel(title), exit_button = new JLabel("X");
    public Font title_font = new Font(Font.MONOSPACED, Font.ITALIC, 25);

    public Window(int width, int height) {
        // this the frontend
        setSize(width, height);
        setLayout(new BorderLayout());

        titlebar.setFont(title_font);
        titlebar.setBackground(Color.GREEN);

        title_string.setForeground(Color.WHITE);
        exit_button.setForeground(Color.WHITE);

        contentbar.setSize(width, height - 50);

        // this is the backend
        addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                setLocation(e.getX(), e.getY());
            }

            @Override
            public void mouseMoved(MouseEvent e) {
            }
        });
        exit_button.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                hide();
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
        add(titlebar, BorderLayout.NORTH);
        add(contentbar, BorderLayout.CENTER);
        titlebar.add(title_string);
        titlebar.add(exit_button);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void addComponent(Component component) {
        contentbar.add(component);
    }
}
