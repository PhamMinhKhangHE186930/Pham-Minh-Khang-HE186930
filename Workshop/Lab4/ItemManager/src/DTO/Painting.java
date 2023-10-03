
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
        boolean cont = true;
        do{
            try{
                System.out.print("Enter height: ");
                int hei = sc.nextInt(); sc.nextLine();
                if(hei<=0) throw new Exception();
                setHeight(hei);
                cont = false;
            }catch(Exception e){
                System.out.println("height must greater than 0");
            }
        }while(cont);
        boolean cont2 = true;
        do{
            try{
                System.out.print("Enter width: ");
                int wid = sc.nextInt(); sc.nextLine();
                if(wid<=0) throw new Exception();
                setWidth(wid);
                cont2 = false;
            }catch(Exception e){
                System.out.println("width must greater than 0");
            }
        }while(cont2);
        boolean cont3 = true;
        do{
            try{
                System.out.print("Enter Watercolour: ");
                boolean wc = sc.nextBoolean();
                if(wc!=true||wc!=false) throw new Exception();
                setIsWatercolour(wc);
                cont2 = false;
            }catch(Exception e){
                System.out.println("watercolour must be true or false");
            }
        }while(cont3);
        boolean cont4 = true;
        do{
            try{
                System.out.print("Enter Framed: ");
                boolean fr = sc.nextBoolean();
                if(fr!=true||fr!=false) throw new Exception();
                setIsFramed(fr);
                cont2 = false;
            }catch(Exception e){
                System.out.println("width must greater than 0");
            }
        }while(cont4);
    }
}
