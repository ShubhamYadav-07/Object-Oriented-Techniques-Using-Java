
/*
 * Q14~WAP to enter two string & find the string with greater length.
 */
import java.util.*;

public class GreaterString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.println("Enter second string: ");
        String str2 = sc.nextLine();
        if (str1.length() > str2.length()) {
            System.out.println("String with greater length is: " + str1);
        } else if (str2.length() > str1.length()) {
            System.out.println("String with greater length is: " + str2);
        } else {
            System.out.println("Both strings have equal length");
        }
        sc.close();
    }
}
