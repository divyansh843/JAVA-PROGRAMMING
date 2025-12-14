public class Classroom {
    public static void ChangeArr(int arr[], int i, int val) {
        // base case
        if (i == arr.length) {
            PrintArr(arr);
            return;
        }
        // recoursion
        arr[i] = val;
        ChangeArr(arr, i + 1, val + 1);
        arr[i] = arr[i] - 2;
    }

    public static void PrintArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void findSubsets(String str, String ans, int i) {
        // base case
        if (i == str.length()) {
            System.out.println(ans);
            return;
        }
        // yes choice
        findSubsets(str, ans + str.charAt(i), i + 1);
        // no choice
        findSubsets(str, ans, i + 1);
    }

    public static void main(String args[]) {
        // int arr[] = new int[5];
        // ChangeArr(arr, 0, 1);
        // PrintArr(arr);
        String str = "abc";
        findSubsets(str, "", 0);

    }

}
