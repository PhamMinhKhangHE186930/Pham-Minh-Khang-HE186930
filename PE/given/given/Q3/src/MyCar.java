
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class MyCar implements ICar{

    @Override
    public int f1(List<Car> t) {
        int avg = 0;
        for (int i = 0; i < t.size(); i++) {
            avg += t.get(i).getRate();
        }
        return avg/t.size();
    }

    public int firstMax(List<Car> t){
        int max = t.get(0).getRate();
        int maxid = 0;
        for (int i = 1; i < t.size(); i++) {
            if(max < t.get(i).getRate()){
                max = t.get(i).getRate();
                maxid = i;
            }
        }
        return maxid;
    }
    
    public int firstMin(List<Car> t){
        int min = t.get(0).getRate();
        int minid = 0;
        for (int i = 1; i < t.size(); i++) {
            if(min > t.get(i).getRate()){
                min = t.get(i).getRate();
                minid = i;
            }
        }
        return minid;
    }
    @Override
    public void f2(List<Car> t) {
        int maxid = firstMax(t);
        int minid = firstMin(t);
        Collections.swap(t, minid, maxid);
    }

    @Override
    public void f3(List<Car> t) {
        Comparator<Car> comparator = new Comparator<Car>() {
            @Override
            public int compare(Car t1, Car t2) {
                if(!t1.getMaker().equalsIgnoreCase(t2.getMaker())){
                    return t1.getMaker().compareToIgnoreCase(t2.getMaker());
                }else if(t1.getRate()<t2.getRate()){
                    return 1;
                }else{
                    return -1;
                }
            }
        };
        Collections.sort(t, comparator);
    }
    
}
