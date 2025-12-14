import java.util.PrimitiveIterator;

public class RecoursionBasic {
    public static void PrintDec(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        PrintDec(n - 1);
    }

    public static void PrintInc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        PrintInc(n - 1);
        System.out.print(n + " ");

    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int fnm1 = fact(n - 1);
        int fn = n * fact(n - 1);
        return fn;
    }

    public static int CalculateSum(int n) {
        if (n == 1) {
            return 1;
        }
        int Snm1 = CalculateSum(n - 1);
        int Sn = n + Snm1;
        return Sn;
    }

    public static boolean isSorted(int arr[], int i) {

        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }

        return isSorted(arr, i + 1);
    }

    public static int FirstOcuurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return FirstOcuurence(arr, key, i + 1);
    }

    public static int LastOccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = LastOccurence(arr, key, i + 1);

        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;

    }

    public static int Power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        // int xnm1 = Power(x, n - 1);
        // int xn = x * xnm1;
        // return xn;

        return x * Power(x, n - 1);
    }

    public static int tilingProblem(int n) { // ( 2 x n (floor size))

        // Base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // // kaam
        // // vertical choice
        // int fnm1 = tilingProblem(n - 1);

        // // Horizontal choice
        // int fnm2 = tilingProblem(n - 2);

        // int totWays = fnm1 + fnm2;
        // return totWays;
        return tilingProblem(n - 1) + tilingProblem(n - 2);
    }

    public static void removeDuplicates(String str, int idx, StringBuilder newstr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newstr);
            return;
        }

        // kaam
        char currchar = str.charAt(idx);
        if (map[currchar - 'a'] == true) {
            // Duplicates
            removeDuplicates(str, idx + 1, newstr, map);
        } else {
            map[currchar - 'a'] = true;
            removeDuplicates(str, idx + 1, newstr.append(currchar), map);
        }
    }

    public static int friendspairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        // // choice
        // // single
        // int fnm1 = friendspairing(n - 1);

        // // pair
        // int fnm2 = friendspairing(n - 2);
        // int pairways = (n - 1) * fnm2;

        // // totways
        // int totways = fnm1 + pairways;
        // return totways;
        return friendspairing(n - 1) + (n - 1) * friendspairing(n - 2);
    }

    public static void PrintBinString(int n, int lastplace, String str) {
        // base case
        if (n == 0) {
            System.out.println(str);
            return;
        }

        // kaam
        PrintBinString(n - 1, 0, str + "0");
        if (lastplace == 0) {
            PrintBinString(n - 1, 1, str + "1");
        }
    }

    public static void main(String args[]) {
        // int arr[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
        // System.out.println(Power(2, 10));
        // System.out.println(tilingProblem(10));
        // String str = "appnnacollege";
        // removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
        // System.out.println(tilingProblem(3));
        PrintBinString(3, 0, "");

    }
}