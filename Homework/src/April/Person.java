package April;

public class Person {
    private String name;
    private Person[] subordinate = new Person[10];
    private Person boss;
    static int count = 0;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Person[] getSubordinate() {
        return subordinate;
    }
    public void setSubordinate(Person[] subordinate) {
        this.subordinate = subordinate;
    }
    public Person getBoss() {
        return boss;
    }
    public void setBoss(Person boss) {
        this.boss = boss;
        boss.addSubordinate(this);
    }

    public Person(String name) {
        this.name = name;
    }

    public void addSubordinate(Person p)
    {
        Person[] people = getSubordinate();
        people[count] = p;
        count++;
    }

    public void PrintBoss()
    {
        System.out.println(getName()+"的管理者是"+getBoss());
    }
    public void PrintSub()
    {
        System.out.println(getName()+"管理的人有：");
        Person[] people = getSubordinate();
        for(int i = 0;i<count;i++)
        {
            System.out.println(people[i]);
        }
    }

    @Override
    public String toString() {
        return getName();
    }
}
