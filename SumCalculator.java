import java.util.*;

public class SumCalculator {
    public static void Sum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("Sum of 2 integers is: " + sum);
    }

    public static void Sum(float num1, float num2) {
        float sum = num1 + num2;
        System.out.println("Sum of 2 floats is: " + sum);
    }

    public static void Sum(long num1, long num2) {
        long sum = num1 + num2;
        System.out.println("Sum of 2 long is: " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        Sum(num1, num2);
        System.out.println("Enter two float numbers: ");
        float num3 = sc.nextFloat();
        float num4 = sc.nextFloat();
        Sum(num3, num4);
        long num5 = sc.nextLong();
        long num6 = sc.nextLong();
        Sum(num5, num6);
        sc.close();

    }
}
