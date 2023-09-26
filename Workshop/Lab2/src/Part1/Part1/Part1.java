
package Part1;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Part1 {
    public static void main(String[] args) {
        boolean cont = true;
        do{
            try{
                int n;
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the number: ");
                n = sc.nextInt();
                if(n<1) throw new Exception();
                System.out.println("The number is " + n);
                cont = false;
            }
            catch(Exception e){
                System.out.println("The number is invalid");
                cont = true;
            }
        }while(cont);
    }
}
