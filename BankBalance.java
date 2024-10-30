import java.util.*;

public class BankBalance {
    public static void checkBal(int amt) {
        if (amt > 1000) {
            System.out.println("Balance is sufficient.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amt;
        System.out.println("Enter the amount : ");
        amt = sc.nextInt();
        checkBal(amt);
        sc.close();
    }
}
