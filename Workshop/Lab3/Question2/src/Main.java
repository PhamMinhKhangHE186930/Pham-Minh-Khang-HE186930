
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
        
        System.out.println("1. Test toString()");
        System.out.println("2. Test setData()");
        System.out.println("3. Test getValue()");
        System.out.print("Enter TC(1,2,3): ");
        int TC = sc.nextInt();
        System.out.println("OUTPUT");
        switch(TC){
            case 1:
                Robot a11 = new Robot(lb, tp);
                SpecRobot a12 = new SpecRobot(lb, tp, stp);
                System.out.println(a11);
                System.out.println(a12);
                break;
            case 2:
                SpecRobot b2 = new SpecRobot(lb, tp, stp);
                b2.setData();
                String s3 = b2.getLabel();
                int s4 = b2.getType();
                System.out.printf("%s, %d\n", s3, s4);
                break;
            case 3:
                SpecRobot b3 = new SpecRobot(lb, tp, stp);
                int v = b3.getValue();
                System.out.println(v);
                break;
            default:
                return;
        }
    }
}
