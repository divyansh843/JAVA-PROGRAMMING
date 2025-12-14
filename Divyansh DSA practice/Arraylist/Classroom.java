import java.util.ArrayList;

public class Classroom {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        // add operetion
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);

        // // get operetion
        // int element = list.get(2);
        // System.out.println(element);

        // // delete operetion
        // list.remove(2);
        // System.out.println(list);

        // set operetion
        // list.set(2, 12);
        // System.out.println(list);

        // contains
        System.out.println(list.contains(2));
        System.out.println(list.contains(4));

        // print the Arraylist element
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

}
