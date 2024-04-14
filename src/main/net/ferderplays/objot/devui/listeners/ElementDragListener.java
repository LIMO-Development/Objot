package net.ferderplays.objot.devui.listeners;

import java.awt.Point;
import java.awt.event.*;

import net.ferderplays.objot.devui.Window;

public class ElementDragListener extends MouseAdapter {

    public Window window;
    public Point mouse_down_point = null;

    public ElementDragListener(Window window) {
        this.window = window;
    }

    public void mouseReleased(MouseEvent e) {
        mouse_down_point = e.getLocationOnScreen();
        window.setBounds(mouse_down_point.x, mouse_down_point.y, window.getWidth(), window.getHeight());
        mouse_down_point = null;
    }

    public void mousePressed(MouseEvent e) {
        mouse_down_point = e.getLocationOnScreen();
        window.setBounds(mouse_down_point.x, mouse_down_point.y, window.getWidth(), window.getHeight());
        mouse_down_point = null;
    }

    public void mouseDragged(MouseEvent e) {
        Point current_position = e.getLocationOnScreen();
        window.setBounds(current_position.x, current_position.y, window.getWidth(), window.getHeight());
        current_position = null;
    }
}