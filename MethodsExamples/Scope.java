package MethodsExamples;

public class Scope {
    public static void main(String[] args) {
        int x=10;
        if (x>5){
            int y=20;
            System.out.println("x is greater than 5");
            System.out.println("y value:"+y);
        }
        System.out.println("x value:"+x);
       // System.out.println("y value:"+y);////compile-time error as y is not in scope outside the if statement

    }
}


