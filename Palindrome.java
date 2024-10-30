import java.util.*;

public class Palindrome {
    public static void isPalindrome(int num) {
        int temp = num, digit = 0, rev = 0;

        while (temp > 0) {
            digit = temp % 10;
            temp /= 10;
            rev = (rev * 10) + digit;
        }
        if (rev == num) {
            System.out.println(num + " is palindrome.");
        } else {
            System.out.println(num + " is not palindrome.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        isPalindrome(num);
        sc.close();
    }
}
