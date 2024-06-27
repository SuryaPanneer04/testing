package Arrays_Examples;

import java.util.Arrays;

public class ArrayLength {
    public static void main(String[] args) {
          int [] number={10,20,30,40};
          int lenght= number.length;
        System.out.println("The length of array is:"+lenght);
        int sum = Arrays.stream(number).sum();
        System.out.println(sum);
    }
    }
