import java.util.*;

public class sumof2oddno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the num1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the num2: ");
        int num2 = sc.nextInt();
        for (int i = num1; i <= num2; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("the sum of odd no. between num1 and num2 is : " + sum);
        sc.close();
    }
}
