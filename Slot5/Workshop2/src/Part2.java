
import java.util.Scanner;


public class Part2 {
    public static void main(String[] args) {
        boolean cont = false;
        do{
            try{
                String s = "";
                String pattern = "Pham";
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the string:");
                s = sc.nextLine();
                if(!s.matches(pattern)) throw new Exception();
                System.out.println("The string is: " + s);
                cont = false;
                System.out.println(cont);
            }
            catch(Exception e){
                System.out.println("The string is invalid");
                cont = true;
            }
        }while(cont);
    }
}
