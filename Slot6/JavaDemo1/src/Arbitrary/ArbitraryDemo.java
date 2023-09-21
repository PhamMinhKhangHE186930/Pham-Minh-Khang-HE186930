/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbitrary;

/**
 *
 * @author ADMIN
 */
public class ArbitraryDemo {

    public double sum(double... a){
        double S = 0;
        for (double x : a) {
            S+=x;
        }
        return S;
    }
    public String concate(String... b){
        String S="";
        for (String x : b) {
            S+=x + " ";
        }
        return S;
    }
    
    public static void main(String[] args) {
        ArbitraryDemo obj = new ArbitraryDemo();
        double total = obj.sum(5.4, 3.2, 9.08, 4);
        System.out.println(total);
        String line = obj.concate("I", "love", "you");
        System.out.println(line);
    }
}
