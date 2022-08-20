import java.util.Scanner;

public class First {
    static String reverseString(String s){
        String reverse = "";
        if (s.isEmpty()){
            return "";
        }
        for (int i = s.length()-1; i >= 0; i--) {
            reverse += s.charAt(i);
        }
        return reverse;
    }
    public static void main(String[] args) {
        System.out.println("hyy my name is sunny");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String s = sc.next();
        System.out.println("Reverse string is:"+reverseString(s));
    }
}
