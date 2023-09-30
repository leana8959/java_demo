package java_demo;

public class App {

    public static void main(String[] args) {

        Voiture voiture = new Voiture(50);
        System.out.println("Un véhicule");
        // Vruum vruum
        voiture.go();
        // Vitesse?
        System.out.println("La vitesse du véhicule est: " + voiture.speed);

        Vehicule voiture2 = new Voiture(50);
        voiture2.transport();
        Vehicule avion = new Avion();
        avion.transport();

        System.out.println("Une F1");
        F1 f1 = new F1(300);
        // Vruum vruum
        f1.go();
        f1.goVeryFast();
        // Vitesse?
        System.out.println("La vitesse de la F1 est: " + f1.speed);

    }

}
