
/*Q8~WAP in Java to enter 2 matrices and find their sum and difference 
A[5 2 3]+B[5 2 11]=C[10 4 14]
 [1 2 3]  [4 5 6]=  [5 7 9] */
import java.util.*;

public class SumOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and columns of first matrix: ");
        int rows1 = sc.nextInt();
        int cols1 = sc.nextInt();
        int arr1[][] = new int[rows1][cols1];
        System.out.println("Enter the rows and columns of second matrix: ");
        int rows2 = sc.nextInt();
        int cols2 = sc.nextInt();
        int arr2[][] = new int[rows2][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                System.out.print("Enter the element of first matrix at position [" + i + "][" + j + "]");
                arr1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print("Enter the element of second matrix at position [" + i + "][" + j + "]");
                arr2[i][j] = sc.nextInt();
            }
        }
        if (rows1 != rows2 || cols1 != cols2) {
            System.out.println("Matrices are not of same size");
        } else {
            int sum[][] = new int[rows1][cols1];
            int diff[][] = new int[rows1][cols1];
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols1; j++) {
                    sum[i][j] = arr1[i][j] + arr2[i][j];
                    diff[i][j] = arr1[i][j] - arr2[i][j];
                }
            }
            System.out.println("Sum of array is: ");
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols1; j++) {
                    System.out.print(sum[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("\nDifference of array is: ");
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols1; j++) {
                    System.out.print(diff[i][j] + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
