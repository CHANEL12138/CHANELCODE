package Mayeight;

public class Staff extends Employee{
    String title;

    public Staff(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                '}';
    }
}
