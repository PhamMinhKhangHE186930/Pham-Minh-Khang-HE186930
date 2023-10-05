
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
        boolean cont = true;
        input();
        do{
            try{
                System.out.print("Enter colour: ");
                colour = sc.nextLine();
                if(colour.isEmpty()) throw new Exception();
                cont = false;
            }catch(Exception e){
                System.out.println("Colour is empty");
                cont = true;
            }
        }while(cont);
        cont = true;
        do{
            try{
                System.out.print("Enter weight: ");
                weight = Integer.parseInt(sc.nextLine());
                if(weight<=0) throw new Exception();
                cont = false;
            }catch(Exception e){
                System.out.println("weight must greater than 0");
                cont = true;
            }
        }while(cont);
    }
}
