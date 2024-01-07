package MethodsExamples;

public class MethodParameter {
    static void mymethod(int a,int b) {
        int c = a + b;
        System.out.println("Addition value is:"+c);
    }
    public static void main(String[] args) {
         mymethod(10,10);
         mymethod(20,45);
         mymethod(76,24);
    }
}
