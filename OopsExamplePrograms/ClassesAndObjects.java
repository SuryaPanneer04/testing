package OopsExamplePrograms;

public class ClassesAndObjects {
    String name;
    int rollno;
         public void Sample(){
             this.name="Surya";
             this.rollno=97;
             System.out.println(name);
             System.out.println(rollno);
         }

    public static void main(String[] args) {
        ClassesAndObjects ob=new ClassesAndObjects();//object created
        ob.Sample();//call the Methods
    }
}
