
package GUI;

import DTO.Item;
import DTO.Painting;
import DTO.Statue;
import DTO.Vase;
import java.awt.Menu;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class AntiqueShop {
    public static void main(String[] args) {
        String[] options = {"Create a Vase","Creat a Statue", "Create a Painting", "díplay the item"};
        Item item = null;
        int choice=0;
        Scanner sc = new Scanner(System.in);
        do{
//            System.out.println("1. Create a Vase:");
//            System.out.println("2. Create a Statue:");
//            System.out.println("3. Create a Painting:");
//            System.out.println("4. Display the Item:");
//            System.out.print("Input a choice:");
            choice = GUI.Menu.getChoice(options);
            switch(choice){
                case 1:
                    item = new Vase();
                    ((Vase)item).inputVase();
                    break;
                case 2:
                    item = new Statue();
                    ((Statue)item).inputStatue();
                    break;
                case 3:
                    item = new Painting();
                    ((Painting)item).inputPaiting();
                    break;
                case 4:
                    if(item!=null){
                        if(item instanceof Vase) ((Vase)item).outputVase();
                        else if(item instanceof Statue) ((Statue)item).outputStatue();
                        else if(item instanceof Painting) ((Painting)item).outputPaiting();
                    }else{
                        System.out.println("you need to creat an object");
                    }
                    break;
                    
            }
        }while(choice<=4);
    }
}
