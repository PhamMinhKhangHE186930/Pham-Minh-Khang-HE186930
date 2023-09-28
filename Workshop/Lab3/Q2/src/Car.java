/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class Car {
    protected String maker;
    protected int price;

    public Car() {
        super();
    }

    public Car(String maker, int price) {
        super();
        this.maker = maker;
        this.price = price;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
    @Override
    public String toString(){
        return maker + ", " + price;
    }
}
