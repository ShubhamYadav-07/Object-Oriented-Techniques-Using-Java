import java.util.*;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, num3;
        String name = "";
        System.out.println("Enter the name: ");
        name = sc.next();
        System.out.println("Enter three subject marks: ");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        num3 = sc.nextDouble();
        double total = num1 + num2 + num3;
        double avg = total / 3;
        System.out.println("The name is : " + name);
        System.out.println("The total marks is : " + total);
        System.out.println("The average is : " + avg);
        sc.close();
    }
}
