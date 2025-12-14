package Linkedlist;

class node {
    int data;
    node next;
    node(int value){
        this.data = value;

    }
}

public class class1 {

    public static void main(String[] args) {
        node a = new node(2);
        node b = new node(4);
        a.next = b;
        node c = new node(6);
        b.next = c;

        System.out.println(a.next.data);
        System.out.println(c.data);
        
    }
    
}
