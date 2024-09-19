import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int temp = num;
        int digit = 0;
        int sum = 0;
        while (temp > 0) {
            digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }
        if (sum == num) {
            System.out.println(num + " is an armstrong number.");
        } else {
            System.out.println(num + " is not an armstrong.");
        }
        sc.close();
    }
}
