
import java.util.InputMismatchException;
import java.util.Scanner;


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
    @Override
    public void input(){
        Scanner sc = new Scanner(System.in);
        super.input();
        boolean loop = true;
        do{
            try{
                System.out.print("Enter height: ");
                height = Integer.parseInt(sc.nextLine());
                if(height<0||height>2000) throw new Exception();
            }catch(Exception e){
                System.out.println("height must greatter than 0 and lower than 2000.");
            }
        }while(height<0||height>1000);
        do{
            try{
                System.out.print("Enter material: ");
                width = Integer.parseInt(sc.nextLine());
                if(width<0||width>3000) throw new Exception();
            }catch(Exception e){
                System.out.println("weight must greatter than 0 and lower than 3000.");
            }
        }while(width<0||width>3000);
        while(loop){
            try{
                System.out.print("Enter whehter painting is water colour (true/false): ");
                isWatercolour = sc.nextBoolean();
                loop=false;
            }catch(InputMismatchException e){
                System.out.println("water colour is false");
                e.printStackTrace();
                sc.nextLine();
                loop=true;
            }
        }
        loop=true;
        while(loop){
            try{
                System.out.print("Enter whehter painting is framed (true/false): ");
                isFramed = sc.nextBoolean();
                loop=false;
            }catch(InputMismatchException e){
                System.out.println("framed is false");
                e.printStackTrace();
                sc.nextLine();
                loop=true;
            }
        }
    }
    @Override
    public String toString(){
        return super.toString() + ", " + height + ", " + width + ", " + isWatercolour + ", " + isFramed;
    }
}
