package Control_Statement;

public class JumpStatement {
    public static void main(String[] args) {
        for (int i=1;i<=10;i++){
            if (i==5){
                break;
            }
            if (i==3){
                continue;
            }
            System.out.println(i);
        }
    }
}
