
import java.util.Scanner;


public class Item {
    protected int value;
    protected String creator;

    public Item() {
        value=0;
        creator="";
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
    public void input(){
        Scanner sc = new Scanner(System.in);
        do{
            try{
                System.out.print("Enter value: ");
                value = Integer.parseInt(sc.nextLine());
                if(value<0) throw new Exception();
            }catch(Exception e){
                System.out.println("value must greatter than 0.");
            }
        }while(value<0);
        do{
            try{
                System.out.print("Enter creator: ");
                creator = sc.nextLine();
                if(creator.isEmpty()) throw new Exception();
            }catch(Exception e){
                System.out.println("creator cannot be empty.");
            }
        }while(creator.isEmpty());
    }
    @Override
    public String toString(){
        return creator + ", " + value;
    }
}
