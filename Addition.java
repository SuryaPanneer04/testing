import java.util.Scanner;

public class Addition {
    void display(String name,int age,String address){
        System.out.println(name);
    }
    public static void main(String[] args) {
        String name;
        int age;
        String address;
        Scanner demo=new Scanner(System.in);
        System.out.println("Enter your name:");
        name= demo.next();
        System.out.println("Enter your age:");
        age= demo.nextInt();
        System.out.println("Enter your address:");
        address= demo.next();
        Addition ob=new Addition();
        ob.display(name,age,address);

    }
}
