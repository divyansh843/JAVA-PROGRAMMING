public class multiplecatch {

    public static void main(String[] args) {
         try { 
            int a = 10 / 0;          // ArithmeticException 
            String s = null; 
            System.out.println(s.length()); // NullPointerException 
 
        } catch (ArithmeticException e) { 
            System.out.println("Divide by zero error"); 
 
        } catch (NullPointerException e) { 
            System.out.println("Null value ka error"); 
 
        } catch (Exception e) { 
            System.out.println("General exception"); 
        }
    }
    
}
