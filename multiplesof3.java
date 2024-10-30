import java.util.*;

public class multiplesof3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println("The sum of " + num + " multiples of 3 is: " + sum);
        sc.close();
    }
}
