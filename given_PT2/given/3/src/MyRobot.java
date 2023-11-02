
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class MyRobot implements IRobot{

    @Override
    public int f1(List<Robot> t) {
        int sum = 0;
        for (int i = 0; i < t.size(); i++) {
            if(!t.get(i).getLabel().contains("A")&&!t.get(i).getLabel().contains("B")){
                sum += t.get(i).getStep();
            }
        }
        return sum;
    }

    public int firstMax(List<Robot> t){
        int max = t.get(0).getStep();
        int index = 0;
        for (int i = 1; i < t.size(); i++) {
            if(max<t.get(i).getStep()){
                max = t.get(i).getStep();
                index = i;
            }
        }
        return index;
    }
    @Override
    public void f2(List<Robot> t) {
        int id = firstMax(t);
        t.remove(id);
    }

    @Override
    public void f3(List<Robot> t) {
        int id_1 = 0;
        int id_2 = 0;
        for (int i = 0; i < t.size()-1; i++) {
            for (int j = i+1; j < t.size(); j++) {
                if(t.get(i).getStep()==t.get(j).getStep()){
                    id_1 = i;
                    id_2 = j;
                }
            }
        }
        for (int i = id_1; i < id_2; i++) {
            if(t.get(i).getStep()>t.get(i+1).getStep()){
                Collections.swap(t, i, i+1);
            }
        }
    }
    
}
