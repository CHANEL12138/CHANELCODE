public class ExtendStudent extends ExtendPerson
{
    private int stuNumber;
    private StringBuffer Class=new StringBuffer();
    public ExtendStudent()
    {
        super("NULL",0,false);
        stuNumber=0;
        Class.append("NULL");
    }
    public ExtendStudent(int stuNumber,String Class) {
        super("NULL",0,false);
        this.Class.append(Class);
        this.stuNumber = stuNumber;
    }
    public int getStuNumber() {
        return stuNumber;
    }
    public StringBuffer getClass1() {
        return Class;
    }
    public void setClass(StringBuffer aClass) {
        Class = aClass;
    }
    public void setStuNumber(int stuNumber) {
        this.stuNumber = stuNumber;
    }
    public void toString1()
    {
        super.toString1();
        System.out.println(" The stu Number is "+stuNumber+" and class is " +Class);
    }

}
