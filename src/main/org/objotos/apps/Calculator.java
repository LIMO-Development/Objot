package org.objotos.apps;

import java.awt.Color;

import javax.swing.*;

import net.ferderplays.objot.devui.Window;

public class Calculator extends Window {

    public int operation;
    public JPanel outputbar = new JPanel();

    public Calculator() {
        super(500, 500);
    
        // frontend
        setTitle("Calculator");
        outputbar.setBackground(new Color(150, 150, 150));
        outputbar.setSize(getWidth() - 100, 50);
        
        // backend
        addComponent(outputbar);
    }
}
