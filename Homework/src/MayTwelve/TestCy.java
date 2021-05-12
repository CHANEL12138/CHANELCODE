package MayTwelve;

public class TestCy {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder(3.0,1);
        Cylinder c2= new Cylinder(1.5,5);
        Cylinder c3= new Cylinder(4.0,1);
        Stool stool = new Stool(c1,c2,c3);
        System.out.println("Area is "+stool.Area());
        System.out.println("Vol is " +stool.Vol());
    }
}
