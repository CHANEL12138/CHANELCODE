package Mayeight;

public class Employee extends Person{
    String office;
    double salary;

    public Employee(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}
