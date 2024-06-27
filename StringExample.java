public class StringExample {
    public static void main(String[] args) {
        String str1="surya";
        String str2="ROLEX";
        System.out.println("str1 value is:"+str1);
        System.out.println("str2 value is:"+str2);
        System.out.println(str1.toUpperCase());
        System.out.println(str2.toLowerCase());
        System.out.println(str1.concat(str2));
        System.out.println(str1.length());
        System.out.println(str2.replace("ROLEX", "Panneer"));
        System.out.println(str1.substring(0, 3));
        System.out.println(str1.equals(str2));
    }
}
