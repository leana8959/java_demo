package java_demo;

public class Voiture implements Vehicule {

    public int speed;

    public void go() {
        System.out.println("Vruum vruum");
    }

    // public Vehicule() {
    // System.out.println("creating object");
    // }

    public Voiture(int speed) {
        System.out.println("creating object and setting speed");
        this.speed = speed;
    }

    @Override
    public void transport() {
        go();
    }
}
