public class ExtendLearn {
    public static void main(String[] args)
    {
        ExtendStudent stu1= new ExtendStudent();
        ExtendStudent stu2= new ExtendStudent(Integer.parseInt("00610"),"36");
        stu1.setAge(20);
        stu1.setName("CHANEL");
        stu2.toString1();
        stu1.toString1();





    }
    public static void Print(Object ob)
    {
        System.out.println(ob);
    }
}
