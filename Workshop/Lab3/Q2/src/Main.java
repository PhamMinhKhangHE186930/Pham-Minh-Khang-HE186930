
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String xMaker; int xPrice, xType; int tc;
        System.out.println();
        System.out.print("Enter maker: ");
        xMaker = sc.nextLine();
        System.out.print("Enter price: ");
        xPrice = sc.nextInt(); sc.nextLine();
        System.out.print("Enter type: ");
        xType = sc.nextInt(); sc.nextLine();
        System.out.println("1. Test toString()");
        System.out.println("2. Test setData()");
        System.out.println("3. Test getValue()");
        
        System.out.print("Enter TC (1,2,3): ");
        tc = sc.nextInt(); sc.nextLine();
        System.out.println("OUTPUT:");
        switch(tc){
            case 1:{
                Car a11 = new Car(xMaker, xPrice);
                System.out.println(a11);
                SpecCar a12 = new SpecCar(xMaker, xPrice, xType);
                System.out.println(a12);
                break;
            }
            case 2:
                SpecCar b2 = new SpecCar(xMaker, xPrice, xType);
                b2.setData();
                String v2 = b2.getMaker();
                int k2 = b2.getPrice();
                System.out.printf("%s, %d\n", v2, k2);
                break;
            case 3:
                SpecCar b3 = new SpecCar(xMaker, xPrice, xType);
                int v3 = b3.getValue();
                System.out.printf("%d\n", v3);
                break;
            default:
                break;
        }
        System.out.println();
    }
}
