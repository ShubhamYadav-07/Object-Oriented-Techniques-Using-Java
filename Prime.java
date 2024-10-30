import java.util.*;

public class Prime {
    public static int isPrime(int num) {
        int ctr = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                ctr = 0;
            } else {
                ctr = 1;
            }
        }
        return ctr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int num = sc.nextInt();
        int result = isPrime(num);
        if (result == 1) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
        sc.close();
    }
}
