
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean cont = true;
        String s1="";
        do{
            try{
                String pa = "[a-zA-Z]{3}\\d+";
                System.out.print("Enter designer: ");
                s1 = sc.nextLine();
                if(!s1.matches(pa)) throw new Exception();
                cont = false;
            }catch(Exception e){
                cont = true;
            }
        }while(cont);
        
        
        System.out.print("Enter power: ");
        int a1 = sc.nextInt();
        
        Engine e = new Engine(s1, a1);
        
        System.out.println("1. Test getDesigner()");
        System.out.println("2. Test setPower()");
        System.out.print("Enter TC(1 or 2): ");
        int TC = sc.nextInt(); sc.nextLine();
        
        if(TC==2){
            System.out.print("Enter new power: ");
            a1 = sc.nextInt();
            e.setPower(a1);
        }
        switch(TC){
            case 1:
                System.out.println("OUTPUT");
                String u = e.getDesigner();
                System.out.printf("%s\r\n", u);
                break;
            case 2:
                int v = e.getPower();
                System.out.println("OUTPUT");
                System.out.println(v);
                break;
            default:
                return;
        }
    }
}
