public class ExtendPerson {
    private String name;
    private int age;
    private boolean IsMarried;
    public ExtendPerson()
    {
        this.name="null";
        this.age=0;
        this.IsMarried=false;
    }
    public ExtendPerson(String name,int age,boolean m)
    {
        this.name=name;
        this.age=age;
        this.IsMarried=m;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setMarried(boolean married) {
        IsMarried = married;
    }


    public void toString1()
    {
        System.out.println(name +" is "+age+" years old, and "+(IsMarried?"Married":"Not Married"));
        return;
    }
}