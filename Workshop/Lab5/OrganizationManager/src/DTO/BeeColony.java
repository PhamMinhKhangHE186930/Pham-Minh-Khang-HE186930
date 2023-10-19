
package DTO;

public class BeeColony extends Colony implements Role{
    String type;

    public BeeColony() {
        super();
    }

    public BeeColony(int size, String place, String type) {
        super(size, place);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    @Override
    public String toString(){
        return "the colony's type is " + getType() + ", size is about " + size + ", and the place is " + place;
    }
    
    @Override
    public void createWorker() {
        System.out.println("Worker bees perform all the work of the bees");
    }
    
}
