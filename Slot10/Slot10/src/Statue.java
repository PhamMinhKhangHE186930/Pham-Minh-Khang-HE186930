
import java.util.Scanner;


public class Statue extends Item{
    private int weight;
    private String colour;

    public Statue() {
        super();
        weight = 0;
        colour = "";
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
    @Override
    public void input(){
        Scanner sc = new Scanner(System.in);
        super.input();
        do{
            try{
                System.out.print("Enter weight: ");
                weight = Integer.parseInt(sc.nextLine());
                if(weight<0||weight>1000) throw new Exception();
            }catch(Exception e){
                System.out.println("weight must greatter than 0 and lower than 1000.");
            }
        }while(weight<0||weight>1000);
        do{
            try{
                System.out.print("Enter material: ");
                colour = sc.nextLine();
                if(creator.isEmpty()) throw new Exception();
            }catch(Exception e){
                System.out.println("colour cannot be empty.");
            }
        }while(colour.isEmpty());
    }
    @Override
    public String toString(){
        return super.toString() + ", " + weight + ", " + colour;
    }
}
