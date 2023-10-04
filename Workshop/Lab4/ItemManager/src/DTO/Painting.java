
package DTO;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Painting extends Item{
    private int height;
    private int width;
    private boolean isWatercolour;
    private boolean isFramed;

    public Painting() {
    }
    
    public Painting(int value, String creator, int height, int width, boolean isWatercolour, boolean isFramed) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isIsWatercolour() {
        return isWatercolour;
    }

    public void setIsWatercolour(boolean isWatercolour) {
        this.isWatercolour = isWatercolour;
    }

    public boolean isIsFramed() {
        return isFramed;
    }

    public void setIsFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }
    public void outputPaiting(){
        output();
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("IsWatercolour: " + isWatercolour);
        System.out.println("IsFramed: " + isFramed);
    }
    public void inputPaiting(){
        Scanner sc = new Scanner(System.in);
        input();
        do{
            try{
                System.out.print("Enter height: ");
                height = Integer.parseInt(sc.nextLine());
                if(height<=0) throw new Exception();
            }catch(Exception e){
                System.out.println("height must greater than 0");
            }
        }while(height<=0);
        do{
            try{
                System.out.print("Enter width: ");
                width = Integer.parseInt(sc.nextLine());
                if(width<=0) throw new Exception();
                setWidth(width);
            }catch(Exception e){
                System.out.println("width must greater than 0");
            }
        }while(width<=0);
        boolean cont1 = true;
        do{
            try{
                System.out.print("Enter Watercolour: ");
                isWatercolour = sc.nextBoolean();
                if(isWatercolour!=true||isWatercolour!=false) throw new Exception();
                cont1 = false;
            }catch(Exception e){
                System.out.println("watercolour must be true or false");
            }
        }while(cont1);
        boolean cont2 = true;
        do{
            try{
                System.out.print("Enter Framed: ");
                isFramed = sc.nextBoolean();
                if(isFramed!=true||isFramed!=false) throw new Exception();
                cont2 = false;
            }catch(Exception e){
                System.out.println("width must greater than 0");
            }
        }while(cont2);
    }
}
