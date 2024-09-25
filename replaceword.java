
/*
 * Q15~WAP to enter a string & replace every space in string with hyphen.
 */
import java.util.*;

public class replaceword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        String str1 = str.replace(" ", "-");
        System.out.println("String after replacing space with hyphen: " + str1);
        sc.close();
    }
}
