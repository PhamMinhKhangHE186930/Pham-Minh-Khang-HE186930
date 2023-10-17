
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class antiqueShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do{
            System.out.println("1. add a new vase");
            System.out.println("2. add a new statue");
            System.out.println("3. add a new painting");
            System.out.println("4. display all items");
            System.out.println("5. find the items by the creator ");
            System.out.println("6. update the item by its index");
            System.out.println("7. remove the item by its index");
            System.out.println("8. display the list of vase items ");
            System.out.println("9. sorts items in ascending order based on their values ");
            System.out.println("10. exit");
            System.out.println("input your choice:");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    Item tmp = new Vase();
                    ItemList obj = new ItemList();
                    tmp.input();
                    if(obj.addItem(tmp)){
                        System.out.println("added");
                    }
                    break;
                case 2:
                    Item tmp2 = new Statue();
                    ItemList obj2 = new ItemList();
                    tmp2.input();
                    if(obj2.addItem(tmp2)){
                        System.out.println("added");
                    }
                    break;
                case 3:
                    Item tmp3 = new Painting();
                    ItemList obj3 = new ItemList();
                    tmp3.input();
                    if(obj3.addItem(tmp3)){
                        System.out.println("added");
                    }
                    break;
                case 4:
                    ItemList obj4 = new ItemList();
                    obj4.displayAll();
                    break;
                }
            }while(choice<=9);
    }
}
