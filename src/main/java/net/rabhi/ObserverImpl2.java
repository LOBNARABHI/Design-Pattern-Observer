package net.rabhi;

public class ObserverImpl2 implements Observer{
    @Override
    public void update(int a ) {
        System.out.println("je suis la 2eme implementation d'observateur j'ai reçu la valeur c'est :  "+ a);
    }
}
