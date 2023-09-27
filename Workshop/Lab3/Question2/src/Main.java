
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter label: ");
        String lb = sc.nextLine();
        
        System.out.print("Enter type: ");
        int tp = sc.nextInt();
        
        System.out.print("Enter step: ");
        int stp = sc.nextInt();
        sc.nextLine();
        
        Robot rb1 = new Robot(lb, tp);
        SpecRobot rb2 = new SpecRobot(lb, tp, stp);
        
        System.out.println("1. Test toString()");
        System.out.println("2. Test setData()");
        System.out.println("3. Test getValue()");
        System.out.print("Enter TC(1,2,3): ");
        int TC = sc.nextInt();
        System.out.println("OUTPUT");
        switch(TC){
            case 1:
                String s1 = rb1.toString();
                String s2 = rb2.toString();
                System.out.println(s1);
                System.out.println(s2);
                break;
            case 2:
                rb2.setData();
                String s3 = rb2.toString();
                System.out.println(s3);
                break;
            case 3:
                int v = rb2.getValue();
                System.out.println(v);
                break;
            default:
                return;
        }
    }
}
