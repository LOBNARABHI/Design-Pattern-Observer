package net.rabhi;

public class ObserverImpl1 implements Observer{
    @Override
    public void update(int a) {
        System.out.println("je suis le 1ere observateur j'ai reçu l valeur c'est : "+ a);
    }
}
