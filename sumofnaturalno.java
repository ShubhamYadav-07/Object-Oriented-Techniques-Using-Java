import java.util.*;

public class sumofnaturalno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the number n: ");
        int n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            sum += i;
        }
        System.out.println("The sum of " + n + " natural no. is : " + sum);
        sc.close();
    }

}
