import java.util.*;

public class factorial {
    public static void getFactorial(int num) {
        int fact = 1;
        for (int i = 1; i < num; i++) {
            fact += fact * i;
        }
        System.out.println("The factorial of " + num + " is : " + fact);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        getFactorial(num);
        sc.close();
    }
}
