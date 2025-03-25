package de.bso.java.examples.designpattern.observer.mvc3;

import java.awt.event.ActionListener;

public interface KompassControllerInterface extends ActionListener {
    public void addView(KompassView view);
}