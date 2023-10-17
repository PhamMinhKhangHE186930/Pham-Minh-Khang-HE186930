
import java.util.Scanner;


public class Vase extends Item{
    private int height;
    private String material;

    public Vase() {
        super();
        height=0;
        material="";
    }

    public Vase(int value, String creator, int height, String material) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public void input(){
        Scanner sc = new Scanner(System.in);
        super.input();
        do{
            try{
                System.out.print("Enter height: ");
                height = Integer.parseInt(sc.nextLine());
                if(height<0||height>2000) throw new Exception();
            }catch(Exception e){
                System.out.println("height must greatter than 0 and lower than 2000.");
            }
        }while(height<0||height>2000);
        do{
            try{
                System.out.print("Enter material: ");
                material = sc.nextLine();
                if(creator.isEmpty()) throw new Exception();
            }catch(Exception e){
                System.out.println("material cannot be empty.");
            }
        }while(material.isEmpty());
    }
    @Override
    public String toString(){
        return super.toString() + ", " + height + ", " + material;
    }
}
