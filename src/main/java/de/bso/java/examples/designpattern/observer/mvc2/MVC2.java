package de.bso.java.examples.designpattern.observer.mvc2;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;

public class MVC2 implements Runnable {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new MVC2());
    }

    @Override
    public void run() {
        new MVCController(new MVCModel("Hello, world!"), new MVCView());
    }
}

class MVCView {

    JLabel label;

    public JButton button;
    public JFrame frame;

    public MVCView() {
        init();
    }

    private void init() {
        label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBorder(new EmptyBorder(10, 10, 10, 10));

        button = new JButton("Klick");

        frame = new JFrame("MVC");
        frame.setSize(160, 100);

        frame.add(label, BorderLayout.NORTH);
        frame.add(button, BorderLayout.CENTER);

        frame.setLocationRelativeTo(null);
    }

    public void update(MVCModel model) {
        label.setText(model.getText());
    }
}

class MVCController implements ActionListener {

    private MVCView view;
    private MVCModel model;

    private int count = 0;

    public MVCController(MVCModel model, MVCView view) {
        this.model = model;
        this.view = view;
        
        view.update(model);

        view.button.addActionListener(this);
        view.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        view.frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        if (count < 3) {
            model.decorateWith("{", "}");
        } else if (count == 3) {
            model.setText(" - ENDE - ");
        } else {
            System.exit(0);
        }
        view.update(model);
    }
}

class MVCModel {
    private String text;

    public MVCModel() {
        text = "???";
    }
    
    public MVCModel(String string) {
        text = string;
    }

    public void setText(String string) {
        text = string;
    }

    public String getText() {
        return text;
    }

    public void decorateWith(String s, String t) {
        text = s + text + t;
    }
}