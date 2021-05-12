
public class Mooc5_6 {
    public static void main(String[] args){
        Person p1 = new Person("小明");
        Person p2 = new Person("小红");
        Person p3 = new Person("小黄");
        Person p4 = new Person("小蓝");
        Administrator a1 = new Administrator(p1);
        a1.addPerson(p2);
        a1.addPerson(p3);
        a1.addPerson(p4);
        a1.displayPerson();
        p2.dislplayAdministrator();
        p3.dislplayAdministrator();
        p4.dislplayAdministrator();

    }
}
class Administrator{
    private String name;
    private Person[] person = new Person[10];
    private int numberOfPerson = 0;
    Administrator(Person p){
        this.name = p.getName();
    }
    public String getName(){
        return name;
    }
    public void addPerson(Person p){
        if(numberOfPerson<10){
            person[numberOfPerson] = p;
            p.setAdministrator(this);
            numberOfPerson++;
        }
    }
    public void displayPerson(){
        System.out.print(this.getName()+"管理的是：");
        for(int i=0;i<numberOfPerson;i++)
            System.out.print(person[i].getName()+" ");
        System.out.println();
    }
}
class Person{
    private String name;
    private String administrator;
    Person(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAdministrator(Administrator a){
        this.administrator = a.getName();
    }
    public void dislplayAdministrator(){
        System.out.println(this.getName()+"的管理者是"+administrator);
    }
}
