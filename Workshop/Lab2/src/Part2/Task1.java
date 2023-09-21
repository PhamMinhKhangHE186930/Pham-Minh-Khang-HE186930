/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        boolean cont = false;
        do{
            try{
                String s;
                String pattern = "SE1863";
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the string:");
                s = sc.nextLine();
                if(!s.matches(pattern)) throw new Exception();
                System.out.println("The string is: " + s);
                cont = false;
            }
            catch(Exception e){
                System.out.println("The string is invalid");
                cont = true;
            }
        }while(cont);
    }
}
