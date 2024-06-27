package MethodsExamples;

public class MethodOverloading {
    static void method(String name, int rollno) {
        System.out.println(name);
        System.out.println(rollno);
    }

    static void method(int age, long mobileNo) {
        System.out.println(age);
        System.out.println(mobileNo);
    }
    public static void main(String[] args) {
       method("Surya",97);
       method(19,9384292322l);


    }
}
