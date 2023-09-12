
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a[];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num of array:");
        int n = sc.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i+1) + "/" + n + ":");
            a[i] = sc.nextInt();
        }
        System.out.print("Array a: ");
        for (int i = 0; i < n; i++) {
            System.out.format("%3d", a[i]);
        }
        float s=0;
        for (int i = 0; i < n; i++) {
            s+=a[i];
        }
        
        System.out.println("\nAverage of a= " + (s/n));
        float min = Math.abs(s/n-a[0]);
        int j = 0;
        for (int i = 1; i < n; i++) {
            if(min>Math.abs((s/n-a[i]))){
                min=Math.abs((s/n-a[i]));
                j=i;
            }
        }
        System.out.println("So gan avg nhat: " + a[j]);
    }
}
