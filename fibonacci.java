import java.util.*;

public class fibonacci {

    public static void getFibonacci(int num) {
        int f1 = 0;
        int f2 = 1;
        System.out.print("0 ");
        System.out.print("1 ");
        for (int i = 0; i < num - 2; i++) {
            int f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
            System.out.print(f3 + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        getFibonacci(num);
        sc.close();
    }
}
