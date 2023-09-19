
import java.util.Scanner;

public class Par1 {
    public static void main(String[] args) {
        int matrix[][];
        int rows;
        int cols;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num of rows:");
        rows = sc.nextInt();
        System.out.print("Enter num of columns:");
        cols = sc.nextInt();
        
        matrix = new int[rows][cols];
        
        System.out.println("Enter the matrix");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("m[%d][%d]=", i, j);
                matrix[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Matrix inputted:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.format("%3d", matrix[i][j]);
            }
            System.out.println();
        }
        
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println("Sum:" + sum);
        
        float avg = (float) sum/(rows*cols);
        System.out.println("Average of a= " + avg);
    }
}
