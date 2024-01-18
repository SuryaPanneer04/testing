package OopsExamplePrograms;

public class Child extends Parent {
   void display(){
       System.out.println("Name is :"+name);
       System.out.println("RollNo is :"+rollno);
       System.out.println("Address is:"+address);

   }
    public static void main(String[] args) {
        Child ob=new Child();
        ob.getStudent();
        ob.getAddress();
        ob.display();
    }
}
