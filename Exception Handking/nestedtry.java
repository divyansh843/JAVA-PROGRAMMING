public class nestedtry {

    public static void main(String[] args) {
        
        // try {
        //     try {
        //         System.out.println(10/0);
        //     } catch (ArithmeticException e) {
        //         System.out.println("handle...");
        //     }
        //     System.out.println("rama".charAt(5));
        // } catch (Exception e) {
        //     System.out.println("handle string wala excepiton...");
        // }

        try {
            System.out.println(10/0);
        } catch (Exception e) {
            try {
                System.out.println("rama".charAt(5));
            } catch (StringIndexOutOfBoundsException e1) {
                System.out.println(e1);
            }
        }
    }
    
}
