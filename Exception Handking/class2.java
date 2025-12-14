public class class2{

    void m1(){
        m2();
    }

    void m2(){
        try {
            System.out.println("ram".charAt(5));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception { 
        class2 c = new class2();
        c.m1();


    } 
}