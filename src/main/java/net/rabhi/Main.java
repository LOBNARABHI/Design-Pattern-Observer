package net.rabhi;

public class Main {
    public static void main(String[] args) {
        ObservableImpl observable = new ObservableImpl();
        observable.setEtat(10);
        ObserverImpl1 observer1 = new ObserverImpl1();
        ObserverImpl2 observer2 = new ObserverImpl2();
        observable.addObserver(observer1);
        observable.addObserver(observer2);
        observable.setEtat(10);

    }
}