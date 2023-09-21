/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Casestudy;

/**
 *
 * @author ADMIN
 */

public class Case {
    public static void main(String[] args) {
        Car c=new Car();
        c.pressStartButton();
        c.pressAcceleratorButton();
        
        Car c2=new Car();
        c2.pressAcceleratorButton();
        
        Car c3=new Car("red", 100, true, true);
        c3.pressAcceleratorButton();
        c3.setColor("black");
        System.out.println("Colour of c3:" + c3.getColor());
    }
}
