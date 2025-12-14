public class Inheritence {
    public static void main(String args[]) {
        Dog shera = new Dog();
        shera.eat();
        shera.legs = 4;
        System.out.println(shera.legs);
    }

}

// base class
class Animal {
    String color;

    void eat() {
        System.out.println("eat");
    }

    void breathe() {
        System.out.println(" breathes");
    }
}

// derived class / subclass
// class Fish extends Animal {
// int fins;

// void swim() {
// System.out.println("swim in water");
// }

// }
class Mammal extends Animal {
    int legs;
}

class Dog extends Mammal {
    String breed;
}
