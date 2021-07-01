package JuneS;

import java.util.Date;

public abstract class Shape implements java.lang.Comparable<Shape>,Cloneable {

    String color;
    Date createDate;

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
        this.createDate=new Date();
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public Date getCreateDate() {
        return createDate;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Shape shape = (Shape) super.clone();
        shape.createDate = new Date();
        return shape;
    }

    @Override
    public int compareTo(Shape o) {
        return Double.compare(o.getArea(),this.getArea());
    }

    public abstract double getArea();

    public abstract void draw();

}
