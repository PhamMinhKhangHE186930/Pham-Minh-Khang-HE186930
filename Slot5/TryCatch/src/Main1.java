
import java.util.Scanner;


public class Main1 {
    public static int inputInt() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter whole number: ");
        int n = Integer.parseInt(sc.nextLine());
        if(n<10 || n>50) throw new Exception();
        return n;
    }
    public static void main(String[] args) {
        boolean cont=true;
        int n=0;
        do{
            try{
                n = inputInt();
                cont = false;
            }
            catch(Exception e){
                System.out.println("Required integer!");
            }
        }while(cont==true);
        System.out.print("number:" + n);
    }
}
