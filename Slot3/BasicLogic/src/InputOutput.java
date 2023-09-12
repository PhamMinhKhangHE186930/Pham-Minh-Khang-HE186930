
import java.util.Scanner;


/**
 *
 * @author ADMIN
 */
public class InputOutput {
    public static void main(String[] args) {
        int a[];
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        n = Integer.parseInt(sc.nextLine());
        a = new int[n];
        for(int i = 0; i<n; i++){
            System.out.print("Nhập phần tử thứ: " + (i+1) + "/" + n);
            a[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.print("Nhập giá trị");
        for (int i = 0; i < n; i++) {
            System.out.format("%3d", a[i]);
        }
        int s=0;
        for(int i:a){
            s+=i;
        }
        System.out.println("\nSum: " + s);
    }
}
