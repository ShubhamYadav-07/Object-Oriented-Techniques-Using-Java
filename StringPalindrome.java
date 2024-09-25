
/*
 * Q13~WAP to enter a string & check it is palindrome or not. Example: MOM,DAD,MALAYALAM.
 */
import java.util.*;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        String rev = new StringBuilder(str).reverse().toString();
        if (str.equals(rev)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
        sc.close();
    }
}