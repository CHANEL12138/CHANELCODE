package JuneS;

public class Circle extends Shape{
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*getRadius()*getRadius();
    }

    @Override
    public void draw() {
        System.out.print("正在画一个圆.......");
    }

    @Override
    public String toString() {
        return "Circle [radius="+getRadius()+", getCreatedDate()= " +getCreateDate()+
                "getColor()="+getColor()+"]";
    }
}
