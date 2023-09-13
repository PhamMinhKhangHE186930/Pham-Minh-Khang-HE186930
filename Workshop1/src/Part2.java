
import java.util.Scanner;

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
