
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
        return super.toString() + ", " + step;
    }
    
    public void setData() {
        super.setLabel(super.getLabel().substring(0, 1) + step + super.getLabel().substring(1));
    }

    public int getValue() {
//        char[] arr = getLabel().toCharArray();
//        boolean q=true;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]=='A'){
//                q=true;
//                break;
//            }
//            q=false;
//        }
        if(getLabel().contains("A") && getType() < 3){
            return step;
        }else {
            return step + 2;
        }
    }
}
