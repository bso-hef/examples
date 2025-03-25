package de.bso.java.examples.designpattern.observer.mvc3;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Observable;

public class SteuerkursWindowView extends KompassView {
    Label steuerkursLabel;

    public SteuerkursWindowView(KompassModel kompassModel, KompassControllerInterface controller) {
        super(kompassModel, controller);
        Frame frame = new Frame("Kompass GUI");

        Button btnMinusFuenfGrad = new Button("-5 Grad");
        btnMinusFuenfGrad.addActionListener(controller);
        btnMinusFuenfGrad.setActionCommand("-5");
        frame.add("North", btnMinusFuenfGrad);

        steuerkursLabel = new Label();
        steuerkursLabel.setAlignment(Label.CENTER);
        frame.add("Center", steuerkursLabel);

        Button btnPlusFuenfGrad = new Button("+5 Grad");
        btnPlusFuenfGrad.addActionListener(controller);
        btnPlusFuenfGrad.setActionCommand("+5");
        frame.add("South", btnPlusFuenfGrad);

        frame.addWindowListener(new CloseListener());

        frame.setSize(200, 200);
        frame.setLocation(100, 100);
        frame.setVisible(true);
    }

    public void update(Observable obs, Object obj) {
        steuerkursLabel.setText("Steuerkurs: " + getKompassModel().getSteuerkurs()+
                "\n Aktueller Kurs: " + getKompassModel().getKompasskurs());

    }

    public void zeigeKurskorrektur(int kursKorrektur) {
        //Tue nichts hier, die grafische Anzeige unterstützt diese Funktion nicht
    }

    public static class CloseListener extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            e.getWindow().setVisible(false);
            System.exit(0);
        }
    }
}