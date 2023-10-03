
package DTO;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Item {
    int value;
    String creator;

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
                String cre = sc.nextLine();
                if(cre.isEmpty()) throw new Exception();
                setCreator(cre);
                cont = false;
            }catch(Exception e){
                System.out.println("creator is empty");
            }
        }while(cont);
        boolean cont2 = true;
        do{
            try{
                System.out.print("Enter value: ");
                int val = sc.nextInt(); sc.nextLine();
                if(val<=0) throw new Exception();
                setValue(val);
                cont2 = false;
            }catch(Exception e){
                System.out.println("creator must greater than 0");
            }
        }while(cont2);
    }
}
