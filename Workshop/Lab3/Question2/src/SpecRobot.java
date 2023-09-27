
public class SpecRobot extends Robot{
    private int step;

    public SpecRobot() {
        super();
    }

    public SpecRobot(String label, int type, int step) {
        super(label, type);
        this.step = step;
    }

    @Override
    public String toString(){
        return getLabel() + ", " + getType() + ", " + step;
    }
    
    public void setData() {
        super.setLabel(super.getLabel().substring(0, 1) + step + super.getLabel().substring(1));
    }

    public int getValue() {
        String name = "A";
        int a;
        if(getLabel().contains(name) && getType() < 3){
            a = step;
        }else {
            a = step + 2;
        }
        return a;
    }
}
