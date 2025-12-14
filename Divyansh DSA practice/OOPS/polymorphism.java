public class polymorphism {
    public static void main(String arg[]) {
        calulater calc = new calulater();
        // System.out.println(calc.sum(2, 3));
        // System.out.println(calc.sum(1, 2, 2));
        // System.out.println(calc.sum((float) 2.5, (float) 2.5));

        Deer d = new Deer();
        d.eat();
    }

}

class Animal {
    void eat() {
        System.out.println(" eats anything ");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println(" Eats grass ");
    }
}

class calulater {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}
