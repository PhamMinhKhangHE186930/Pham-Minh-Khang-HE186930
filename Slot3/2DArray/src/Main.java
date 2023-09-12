
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int a[][];
        int b[][];
        int c[][];
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số hàng của a: ");
        int m = sc.nextInt();
        System.out.print("Nhập số cột của a = hàng của b: ");
        int n = sc.nextInt();
        System.out.print("Nhập số cột của b: ");
        int p = sc.nextInt();
        a = new int[m][n];
        b = new int[n][p];
        c = new int[m][p];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Nhập phần tử a[%d][%d]: ", (i+1), (j+1));
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                System.out.printf("Nhập phần tử b[%d][%d]: ", (i+1), (j+1));
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("a[%d][%d]:%d ", (i+1), (j+1), a[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                System.out.printf("b[%d][%d]:%d ", (i+1), (j+1), b[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                c[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    c[i][j] += a[i][k]*b[k][j];
                }
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
