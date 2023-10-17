
import java.util.*;

class A implements Comparable{
    String name;
    int sal;

    public A() {
    }

    public A(String name, int sal) {
        this.name = name;
        this.sal = sal;
    }
    public boolean equals(Object x){
        A y = (A) x;
        return(sal==y.sal);
    }

    @Override
    public int compareTo(Object x) {
        A y = (A) x;
        if(sal<y.sal){
            return(-1);
        }else if(sal==y.sal){
            return 0;
        }else{
            return 1;
        }
    }
    public String toString(){
        return name + " " + sal;
    }
}

class MySet extends TreeSet{
    public boolean isEmpty(){
        return super.isEmpty();
    }
    void add(A x){
        super.add(x);
    }
    void addMany(String[] a, int[] p, int n){
        A x;
        for (int i = 0; i < n; i++) {
            x = new A(a[i], p[i]);
            add(x);
        }
    }
    void display(){
        System.out.println("The elements of the list");
        Iterator h = iterator();
        while(h.hasNext()){
            System.out.println(h.next());
        }
    }
}
        
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int sal;
        int choice;
        MySet t = new MySet();
        do{
            System.out.println("1. Enter name and sal");
            System.out.println("2. List name and sal");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt(); sc.nextLine();
            switch(choice){
                case 1:
                    System.out.print("Enter name: ");
                    name = sc.nextLine();
                    System.out.print("Enter sal: ");
                    sal = sc.nextInt(); sc.nextLine();
                    A x = new A(name, sal);
                    t.add(x);
                    System.out.println();
                    break;
                case 2:
                    if(t.isEmpty()){
                        System.out.println("The set is empty, please enter name and sal");
                    }else{
                        t.display();
                    }
                    System.out.println();
                    break;
                default:
                    break;
            }
        }while(choice>0||choice<=2);
    }
}
