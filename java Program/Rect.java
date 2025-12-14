class Rect {
    private int l, b;

    public void setval(int l, int b) { 
        this.l = l; 
        this.b = b;  
    }

    public void area() {
        int a = l * b;
        System.out.println("Area is " + a);
    }




    public static void main(String[] args) {
        Rect r1 = new Rect();
        r1.setval(5, 7);
        r1.area();
    }
}
