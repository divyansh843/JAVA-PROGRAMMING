public class power {
    public static int Optimizepower(int a, int n) {

        if (n == 0) {
            return 1;
        }
        int halfpower = Optimizepower(a, n / 2);
        int halfpowersq = halfpower * halfpower;
        // int halfpowersq = Optimizepower(a, n / 2) * Optimizepower(a, n / 2);

        // n is odd
        if (n % 2 != 0) {
            halfpowersq = a * halfpowersq;
        }
        return halfpowersq;
    }

    public static void main(String args[]) {
        int a = 2;
        int n = 10;
        System.out.println(Optimizepower(a, n));

    }

}
