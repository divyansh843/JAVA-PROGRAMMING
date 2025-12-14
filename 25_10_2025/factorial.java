public class factorial{

    static String reverse(String name){
        String rev = "";
        for (int i = name.length() - 1; i >= 0 ; i--){
            rev += name.charAt(i);

        }


     return rev;
    }

    static int fact(int n){
        for(int j = 1; j <= n; j++){
            
            int fact = 1;
            for (int i = 1; i <= j; i++) {
            fact = fact*i;
            }
        System.out.println("factorial of " + j + " is " + fact);

        } 
        
    return 0;
    }

    public static void main (String[] args){
        factorial.fact(5);
        System.out.println(factorial.reverse("Divyansh"));
        

    }
}