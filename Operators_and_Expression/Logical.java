package Operators_and_Expression;

public class Logical {
    public static void main(String[] args) {
        int a=10,b=20,c=30;

        //AND operator
        if(a>b && b>c){
            System.out.println("b is between a & b");
        }
        //OR operator
        else if (a<b || b<c) {
            System.out.println("a is lessthan b and b is lessthan c");
        }
        else if (!(a==c)){
            System.out.println("a is not equal to c");
        }
        else{
            System.out.println("default....");
        }
    }
}
