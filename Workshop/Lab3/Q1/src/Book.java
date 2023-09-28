/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thang
 */
public class Book {
    protected String Title;
    protected int Price;

    public Book() {
        super();
    }

    public Book(String Title, int Price) {
        super();
        this.Title = Title;
        this.Price = Price;
    }
    

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }
    
}