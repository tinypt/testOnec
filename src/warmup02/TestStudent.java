package warmup02;
// 1. declare an array variable consisting of 3 Student objects
// 2. print all students object to the console using "for" and "foreach" style

public class TestStudent {

    public static void main(String[] args) {

        Student[] st = new Student[3];
        st[0] = new Student("TINY");
        st[1] = new Student();
        st[1].setName("HONG");
        st[2] = new Student("BEW");

        for (Student room : st) {
            System.out.println(room);
        }
        System.out.println("\n------------------------------\n");
        for (int i = 0; i < st.length; i++) {
            System.out.println(st[i]);
        }

    }
}
