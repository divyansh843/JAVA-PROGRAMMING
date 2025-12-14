package multithreading;

    class MyThread extends Thread { 
    public void run() { 
        for(int i = 1; i <= 5; i++) { 
            System.out.println(Thread.currentThread().getName()); 
            System.out.println(Thread.currentThread().getPriority());
            
        } 
        
    } 
} 
 
public class yeild {
    public static void main(String[] args) { 
        MyThread t = new MyThread(); 
        t.setPriority(10);
        t.start(); 
        
 
        for(int i = 1; i <= 5; i++) { 
            System.out.println("Main");
            Thread.yield();  
        } 

        
    } 
} 
