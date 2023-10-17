
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException{
        String[] a = {"Hoa", "La", "Canh", "Cay", "Goc", "Re"};
        int[] b = {22, 21, 24, 19, 18, 20};
        double[] c = {500, 700, 400, 200, 600, 550};
        MyList u = new MyList();
        u.addMany(a, b, c);
        String fname = "emp.txt";
        u.loadFile(fname);
        System.out.println("Test sorting by age and name");
        System.out.println("Before sorting:");
        u.display();
        System.out.println("After sorting:");
        u.sortByAgeName();
        u.display();
        System.out.println();
    }
}
