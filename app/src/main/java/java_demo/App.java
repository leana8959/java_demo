package java_demo;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class App {

    public static void main(String[] args) {

        Voiture v = new Voiture(50);
        System.out.println("Un véhicule");
        // Vruum vruum
        v.go();
        // Vitesse?
        System.out.println("La vitesse du véhicule est: " + v.speed);

        System.out.println("Une F1");
        F1 f = new F1(300);
        // Vruum vruum
        f.go();
        // Vitesse?
        System.out.println("La vitesse de la F1 est: " + f.speed);

        // v.goVeryFast(); // Not ok, doesn't exist.
        f.goVeryFast();

        // Explication des listes
        // // int     : primitif
        // // Integer : objet
        // List<Integer> arrayList = new ArrayList<>();
        // arrayList.add(0);
        // List<Integer> linkedList = new LinkedList<>();
        // linkedList.add(0);
    }

}
