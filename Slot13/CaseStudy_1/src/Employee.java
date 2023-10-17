
import java.lang.Comparable;

public class Employee implements Comparable{
    private String code;
    private String name;
    private int salary;

    public Employee() {
    }

    public Employee(String code, String name, int salary) {
        this.code = code;
        this.name = name;
        this.salary = salary;
    }
    
    public void print(){
        System.out.println("");
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Object emp) {
        return this.getCode().compareTo(((Employee)emp).getCode());
    }
}
