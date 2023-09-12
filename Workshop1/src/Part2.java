
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
public class Part2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number 1:");
        float a = sc.nextFloat();
        System.out.print("Input the number 2:");
        float b = sc.nextFloat();
        sc.nextLine();
        System.out.print("Input the operator(+-*/):");
        String op = sc.nextLine();
        switch(op){
            case "+":
                System.out.printf("the result of %.2f+%.2f=%.2f", a, b, (a+b));
                break;
            case "-":
                System.out.printf("the result of %.2f-%.2f=%.2f", a, b, (a-b));
                break;
            case "*":
                System.out.printf("the result of %.2f*%.2f=%.2f", a, b, (a*b));
                break;
            case "/":
                System.out.printf("the result of %.2f/%.2f=%.2f", a, b, (a/b));
                break;
        }
    }
}
