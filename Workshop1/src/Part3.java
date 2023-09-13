
import java.util.Scanner;


public class Part3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] name = new String[1];
        System.out.println("Enter names: ");
        for (int i = 0; i < name.length; i++) {
            name[i] = sc.nextLine();
            char[] charname = name[i].toCharArray();
            boolean space = true;
            for (int j = 0; j < charname.length; j++) {
                if(Character.isLetter(charname[j])){
                    if(space){
                        charname[j] = Character.toUpperCase(charname[j]);
                        space = false;
                    }
                }
                else{
                    space = true;
                }
            }
            name[i] = String.valueOf(charname);
        }
        for (String name1 : name) {
            System.out.println(name1);
        }
    }
}
