
package DTO;


public class Colony extends Organiztion{

    protected String place;

    public Colony() {
        super();
    }

    public Colony(int size, String place) {
        super(size);
        this.place = place;
    }
    
    @Override
    public void communiateByTool() {
        System.out.println("the colony communucate by sound");
    }
    public void grow(){
        System.out.println("an annual cycle of growth that begins in spring");
    }
    public void reproduce(){
        System.out.println("Colony can reproduce itself through a process");
    }
    @Override
    public String toString(){
        return "the colony size is " + size + ", the colony's place is " + place;
    }
}
