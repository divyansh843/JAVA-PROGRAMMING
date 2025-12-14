public class class1 {

    public static void main(String[] args) {
        int a = 10; 
        int b = 0; 
 
        try { 
            int c = a / b;  
            System.out.println(c); 
        } catch (Exception err) { 
            
            err.printStackTrace();
           
        } 
 
        System.out.println("Program end"); 
    }
    
}
