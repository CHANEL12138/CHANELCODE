public class ClassLearn {
    public static void main(String[] args)
    {
        ClassLearn c=new ClassLearn(20);
        ClassLearn c1=new ClassLearn();
        System.out.println(c.radius +" "+ c1.radius);
        System.out.println(ClassLearn.getNumber()+" "+ ClassLearn.Number);
        PrintClassname(c);
    }
    static int Number;
    static int getNumber()
    {
        return Number;
    }
    double radius;
    ClassLearn()
    {
        radius=1;
        Number++;
    }
    ClassLearn(double r)
    {
        this.radius=r;
        Number++;
    }

    public static void setNumber(int number) {
        Number = number;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    static void PrintClassname(Object obj)
    {
        System.out.println("The Object class is " +obj.getClass().getName());
    }
}
