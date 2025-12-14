import java.util.*;

import javax.sql.rowset.spi.SyncResolver;

public class abstraction {
    public static void main(String args[]) {
        Mustang M = new Mustang();
        // Animal -> Horse -> Mustang

    }

}

abstract class Animal {
    String color;

    Animal() {
        System.out.println("Animal constructor is called");
    }

    void eat() {
        System.out.println(" animal eats ");
    }

    abstract void walk();

}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse constructor is called");
    }

    void changecolor() {
        color = " Dark brown";

    }

    void walk() {
        System.out.println(" walks on 4 legs ");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang constructor is called");
    }
}

class Chicken extends Animal {
    void changecolor() {
        color = "yellow";

    }

    void walk() {
        System.out.println(" walks on 2 legs ");
    }
}
