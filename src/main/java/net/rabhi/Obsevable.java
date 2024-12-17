package net.rabhi;

public interface Obsevable {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
