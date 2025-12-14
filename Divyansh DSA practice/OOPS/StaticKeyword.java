public class StaticKeyword {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.schoolname = " P G College";

        Student s2 = new Student();
        System.out.println(s2.schoolname);

    }

}

class Student {

    static int returnpercentage(int maths, int phy, int chem) {
        return (maths + phy + chem) / 3;
    }

    String name;
    int roll;

    static String schoolname;

    void setname(String name) {
        this.name = name;
    }

    String getname() {
        return this.name;
    }
}
