
import java.util.ArrayList;

public class MyList {
    ArrayList<Emp> t;

    MyList() {
        this.t = new ArrayList<>();
    }
    void clear(){
        t.clear();
    }
    boolean isEmpty(){
        return(t.isEmpty());
    }
    void add(Emp x){
        t.add(x);
    }
    void addMany(String[] a, int[] b, double[] c){
        int n, i; n=a.length;
        for (i = 0; i < n; i++) {
            add(new Emp(a[i], b[i], c[i]));
        }
    }
    void display(){
        Emp x;
        for (int i = 0; i < t.size(); i++) {
            x = t.get(i);
            System.out.println(x);
        }
    }
}
