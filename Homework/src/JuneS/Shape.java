package JuneS;

import java.util.Date;

public abstract class Shape implements Comparable<Shape>,Cloneable {

    String color;
    Date createDate;

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
        this.createDate=new Date();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Shape shape = (Shape) this.clone();
        shape.createDate = (Date) this.createDate;
        return shape;
    }

    @Override
    public int compareTo(Shape o) {
        return Double.compare(this.getArea(), o.getArea());
    }

    public abstract double getArea();

    public abstract void draw();

}
