
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class MyCar implements ICar{

    @Override
    public int f1(List<Car> t) {
        double sum =0;
        for (int i = 0; i<t.size(); i++) {
            sum += t.get(i).getRate();
        }
        return (int)sum/t.size();
    }

    @Override
    public void f2(List<Car> t) {
        int min = t.get(0).getRate();
        int indexMin = 0;
        int max = t.get(0).getRate();
        int indexMax = 0;
        for (int i = 1; i < t.size(); i++) {
            if(min>t.get(i).getRate()){
                min = t.get(i).getRate();
                indexMin = i;
            }
        }
        for (int i = 1; i < t.size(); i++) {
            if(max<t.get(i).getRate()){
                max = t.get(i).getRate();
                indexMax = i;
            }
        }
        Car carTemp = t.get(indexMin);
        t.set(indexMin, t.get(indexMax));
        t.set(indexMax, carTemp);
    }

    @Override
    public void f3(List<Car> t) {
        Comparator<Car> comparator = new Comparator<Car>() {
            @Override
            public int compare(Car t, Car t1) {
                int alphabet = t.getMaker().compareToIgnoreCase(t1.getMaker());
                
                if(alphabet == 0){
                    if(t.getRate()>t1.getRate()){
                        return -1;
                    }else if(t.getRate() == t1.getRate()){
                        return 0;
                    }else{
                        return 1;
                    }
                }else{
                    return alphabet;
                }
            }
        };
        Collections.sort(t, comparator);
    }
    
}
