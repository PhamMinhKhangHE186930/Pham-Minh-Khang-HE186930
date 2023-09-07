/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

public class Encapsulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating instance of the encapsulated class  
        Car car = new Car();
          
        // setting value in the name member  
        car.setName("Honda");
          
        // getting value of the name member  
        System.out.println(car.getName());
    }
    
}
