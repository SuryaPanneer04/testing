package Control_Statement;

import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value:");
        int num=scanner.nextInt();
        if(num%2==0)
            System.out.println("Even number");
        else
            System.out.println("Odd number");
    }
}
