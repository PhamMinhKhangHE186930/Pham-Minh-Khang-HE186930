
import java.util.ArrayList;
import java.util.Vector;
import java.util.Scanner;

public class Menu extends Vector<String>{
    public Menu(){
        super();
    }
    void addMenuItem(String S){
        this.add(S);
    }
    int getUserChoice(){
//        for (int i = 0; i < options.size(); i++) {
//            System.out.println((i+1) + "_" + options.get(i));
//        }
        System.out.println("Choose 1...5: ");
//        Scanner sc = new Scanner(System.in);
//        return Integer.parseInt(sc.nextLine());
        Scanner sc = new Scanner(System.in);
        return Integer.parseInt(sc.nextLine());
    }
}
