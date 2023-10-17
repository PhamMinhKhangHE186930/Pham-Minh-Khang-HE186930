
public class Emp {
    String name;
    int age;
    double income;

    public Emp() {
    }

    public Emp(String name, int age, double income) {
        this.name = name;
        this.age = age;
        this.income = income;
    }
    @Override
    public String toString(){
        return "(" + name + ", " + age + ", " + income + ") ";
    }
}
