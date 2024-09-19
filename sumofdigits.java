import java.util.*;

public class sumofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int digit = 0;
        int temp = num;
        int sum = 0;
        while (temp > 0) {
            digit = temp % 10;
            temp /= 10;
            sum += digit;
        }
        System.out.println("The sum of digits is: " + sum);
        sc.close();
    }
}
