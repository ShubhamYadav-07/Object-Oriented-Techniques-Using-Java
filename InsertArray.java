import java.util.*;

class InsertArray {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n, i, e, p;
        System.out.println("Enter number of elements in the array");
        n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n + 1];
        System.out.println("Enter elements in the array");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter element to insert");
        e = sc.nextInt();
        System.out.println("Enter position to insert");
        p = sc.nextInt();
        if (p < 1 || p > n + 1) {
            System.out.println("Invalid position");
            return;
        }
        for (i = 0; i < p - 1; i++) {
            b[i] = a[i];
        }
        b[p - 1] = e;
        for (i = p; i <= n; i++) {
            b[i] = a[i - 1];
        }
        System.out.println("Array after insertion");
        for (i = 0; i < n + 1; i++) {
            System.out.println(b[i]);
        }
        sc.close();
    }
}
