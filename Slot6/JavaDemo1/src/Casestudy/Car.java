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
public class Car {
    private String Color;
        private int EnginePower;
        private boolean Convertible;
        private boolean parkingBrake;

        public Car() {
            Color="";
            EnginePower=0;
            Convertible=false;
            parkingBrake=false;
        }

        public Car(String Color, int EnginePower, boolean Convertible, boolean parkingBrake) {
            this.Color = Color;
            this.EnginePower = EnginePower;
            this.Convertible = Convertible;
            this.parkingBrake = parkingBrake;
        }
        
        public void pressStartButton(){
            
        }
        public void pressAcceleratorButton(){
            
        }

        public String getColor() {
            return Color;
        }

        public void setColor(String Color) {
            this.Color = Color;
        }

        public int getEnginePower() {
            return EnginePower;
        }

        public void setEnginePower(int EnginePower) {
            this.EnginePower = EnginePower;
        }

        public boolean isConvertible() {
            return Convertible;
        }

        public void setConvertible(boolean Convertible) {
            this.Convertible = Convertible;
        }
        
}
