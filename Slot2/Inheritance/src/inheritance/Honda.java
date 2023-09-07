/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author ADMIN
 */
public class Honda extends Car {
    // the Honda subclass adds one more field
    public Boolean alloyWheel;
  
    // the Honda subclass has one constructor
    public Honda(String wheelStatus, int noOfWheels, int alloyWheel)
    {
        // invoking super-class(Car) constructor
        super(wheelStatus, noOfWheels);
        alloyWheel = alloyWheel;
    }
  
    // the Honda subclass adds one more method
    public void setAlloyWheel(Boolean alloyWheel)
    {
        alloyWheel = alloyWheel;
    }
  
    // overriding toString() method of Car to print more
    // info
    @Override public String toString()
    {
        return (super.toString() + "\nCar alloy wheel "
                + alloyWheel);
    }
}
