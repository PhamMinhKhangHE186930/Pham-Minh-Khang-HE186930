
import java.util.Scanner;


public class Part3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();
        String name[] = new String[n];
        System.out.println("Enter names: ");
        for (int i = 0; i < name.length; i++) {
            name[i] = sc.nextLine();
        }
        for (String x : name) {
            Scanner scsb = new Scanner(x);
            while(scsb.hasNext()){
                String word = scsb.next();
                String firstLetter = word.substring(0, 1).toUpperCase();
                String restOfWord = word.substring(1);
                System.out.print(firstLetter + restOfWord + " ");
            }
            System.out.println(x);
        }
    }
}
