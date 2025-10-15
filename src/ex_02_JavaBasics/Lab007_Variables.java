package ex_02_JavaBasics;

public class Lab007_Variables {
    public static void main(String[] args) {
        // byte age = 128; // Out of range.
        int age = 128;
        age = age+1;
        System.out.println("Before reassignment => " +age);
        age = 76;
        System.out.println("After reassignment => "+age);
    }
}
