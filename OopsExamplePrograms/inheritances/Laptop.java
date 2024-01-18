package OopsExamplePrograms.inheritances;

public class Laptop extends Desktop{
    public Laptop(){
        System.out.println("Charging");
    }
    public Laptop(String brand){
        super(brand);
        System.out.println(brand);
    }
    public static void main(String[] args) {
        Laptop laptop=new Laptop();
        Laptop laptop1=new Laptop("dell");

    }
}
