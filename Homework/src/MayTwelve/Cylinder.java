package MayTwelve;

public class Cylinder {
    double radius;
    double height;
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    public double Vol()
    {
        return radius*radius*height*Math.PI;
    }
    public double Area()
    {
        return 2*Math.PI*radius*radius+
                2*Math.PI*radius*height;
    }
}
