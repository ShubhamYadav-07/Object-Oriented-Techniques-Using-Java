import java.util.*;

class DeleteElement {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n, i, e, p = 0;
        System.out.println("Enter number of elements in the array");
        n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n - 1];
        System.out.println("Enter elements in the array");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter element to delete");
        e = sc.nextInt();
        for (i = 0; i < n; i++) {
            if (a[i] == e) {
                p = i;
            }
        }
        for (i = 0; i < p; i++) {
            b[i] = a[i];
        }
        for (i = p + 1; i < n; i++) {
            b[i - 1] = a[i];
        }
        System.out.println("Array after deletion");
        for (i = 0; i < n - 1; i++) {
            System.out.println(b[i]);
        }
        sc.close();
    }
}
