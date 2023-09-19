
import java.util.Arrays;
import java.util.Scanner;


public class Main2 {

    public static int[] inputArr(){
        Scanner sc = new Scanner(System.in);
        int a[];
        System.out.print("Enter number of array: ");
        int n = sc.nextInt();
        sc.nextLine();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter the a[%d]: ", i+1);
            boolean cont = true;
            do{
                try{
                    a[i] = Integer.parseInt(sc.nextLine());
                    cont = false;
                }
                catch(Exception e){
                    System.out.println("Invalid value, please input again: ");
                }
            }while(cont==true);
        }
        return a;
    }
    public static void main(String[] args) {
        int a[];
        a = inputArr();
        System.out.println("all element in array:");
        for (int i : a) {
            System.out.print( i + " ");
        }
        System.out.println("All element in descending order:");
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            for (int j=i+1; j < a.length; j++) {
                int temp=0;
                if(a[i]<a[j]){
                    temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            System.out.print( a[i] + " ");
        }
        System.out.println("All elements in sort: ");
        System.out.println();
        Arrays.sort(a);
        for (int i : a) {
            System.out.print( i + " ");
        }
        System.out.println();
        System.out.println("max value:" + a[a.length-1]);
    }
}
