
package DTO;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Statue extends Item{
    private int weight;
    private String colour;

    public Statue() {
    }
    
    public Statue(int value, String creator, int weight, String colour) {
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    public void outputStatue(){
        output();
        System.out.println("Weight: " + weight);
        System.out.println("Colour: " + colour);
    }
    public void inputStatue(){
        Scanner sc = new Scanner(System.in);
        input();
        boolean cont = true;
        do{
            try{
                System.out.print("Enter colour: ");
                String col = sc.nextLine();
                if(col.isEmpty()) throw new Exception();
                setColour(col);
                cont = false;
            }catch(Exception e){
                System.out.println("Colour is empty");
            }
        }while(cont);
        boolean cont2 = true;
        do{
            try{
                System.out.print("Enter weight: ");
                int wei = sc.nextInt(); sc.nextLine();
                if(wei<=0) throw new Exception();
                setWeight(wei);
                cont2 = false;
            }catch(Exception e){
                System.out.println("weight must greater than 0");
            }
        }while(cont2);
    }
}
