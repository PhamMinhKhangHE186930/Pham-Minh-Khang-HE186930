
package DTO;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Item {
    protected int value;
    protected String creator;

    public Item() {
    }

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
    
    public void output(){
        System.out.println("Creator: " + creator);
        System.out.println("value: " + value);
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        boolean cont = true;
        do{
            try{
                System.out.print("Enter creator: ");
                creator = sc.nextLine();
                if(creator.isEmpty()) throw new Exception();
                cont = false;
            }catch(Exception e){
                System.out.println("creator is empty");
                cont = true;
            }
        }while(cont);
        cont = true;
        do{
            try{
                System.out.print("Enter value: ");
                value = Integer.parseInt(sc.nextLine());
                if(value<=0) throw new Exception();
                cont = false;
            }catch(Exception e){
                System.out.println("creator must greater than 0");
                cont = true;
            }
        }while(cont);
    }
}
