
public class Robot {
    private String label;
    private int type;

    public Robot() {
    }
    
    public Robot(String label, int type) {
        this.label = label;
        this.type = type;
    }

    public String getLabel() {
        return label;
    }

    public int getType() {
        return type;
    }

    public void setLabel(String label) {
        this.label = label;
    }
    
    public String toString(){
        return getLabel() + ", " + getType();
    }
}
