import java.util.Scanner;

public class UpperTriangleProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        long product = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = i; j < cols; j++) {
                product *= matrix[i][j];
            }
        }

        System.out.println("Product of upper triangle: " + product);
        sc.close();
    }
}