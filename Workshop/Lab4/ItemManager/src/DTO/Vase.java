
package DTO;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Vase extends Item{
    private int height;
    private String material;

    public Vase() {
    }
    
    public Vase(int value, String creator, int height, String material) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    public void outputVase(){
        output();
        System.out.println("Height: " + height);
        System.out.println("Material: " + material);
    }
    public void inputVase(){
        Scanner sc = new Scanner(System.in);
        input();
        boolean cont = true;
        do{
            try{
                System.out.print("Enter material: ");
                String mat = sc.nextLine();
                if(mat.isEmpty()) throw new Exception();
                setMaterial(mat);
                cont = false;
            }catch(Exception e){
                System.out.println("material is empty");
            }
        }while(cont);
        boolean cont2 = true;
        do{
            try{
                System.out.print("Enter height: ");
                int hei = sc.nextInt(); sc.nextLine();
                if(hei<=0) throw new Exception();
                setHeight(hei);
                cont2 = false;
            }catch(Exception e){
                System.out.println("height must greater than 0");
            }
        }while(cont2);
    }
}
