package net.rabhi;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class ObservableImpl implements Obsevable {
    private int etat = 0 ;
    private List<Observer> observers = new ArrayList<Observer>();
    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(this.etat);
        }
    }
    public int getEtat() {return etat;}
    public void setEtat(int etat) {this.etat = etat; notifyObservers();}
}
