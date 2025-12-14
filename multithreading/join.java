class shop extends Thread{
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("run " + i);
        }

    }
}

class customer extends Thread{
    // shop obj;

    // customer(shop obj){
    //     this.obj = obj;
    // }

    shop s = new shop();
    public void run(){
        
        try {
            s.join();
        } catch (Exception e) {

        }

        for (int i = 0; i < 5; i++) {
            System.out.println("customer");
            
        }
            
        
    }

}

public class join {
    public static void main(String[] args) throws Exception {
        customer c = new customer();
        // shop sh = new shop();
        c.start();
        // sh.start();
        c.s.start();
        
    }
    
}
