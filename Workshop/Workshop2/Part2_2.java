
package Part2;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Part2_2 {
    public String inputString() throws Exception{
        String pattern="SE\\d{3}";
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.print("input string:");
        s=sc.nextLine();
        if(!s.matches(pattern)) throw new Exception();
        return s;
    }
    public static void main(String[] args) {
        Task2 obj=new Task2();
        boolean cont=false;
        do{
            try{
                String s=obj.inputString();
                System.out.println("the string is " + s);
                cont=false;
            }
            catch(Exception e){
                System.out.println("The string is invalid");
                cont=true;
            }
        }while(cont);
    }
}

