package de.bso.java.examples.designpattern.observer.mvc;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class MVC {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MVCView();
            }
        });
    }
}

class MVCView {
    
    JLabel label;
    
    public MVCView() {
        init();
    }
    
    private void init() {
        label = new JLabel(" ");
        label.setHorizontalAlignment(JLabel.CENTER);
        JButton button = new JButton("klick");
        button.addActionListener(new MVCController(this));
        JFrame frame = new JFrame("MVC");
        frame.add(label, BorderLayout.NORTH);
        frame.add(button, BorderLayout.CENTER);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    public void setText(String s) {
        label.setText(s);
    }
}

class MVCController implements ActionListener {
    
    private MVCView view;
    private MVCModel model;
    
    public MVCController(MVCView view) {
        this.view = view;
        this.model = new MVCModel();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        view.setText(model.getText());
    }
}

class MVCModel {
    private String text = "Hallo Welt!";
    
    public String getText() {
        return text;
    }
}