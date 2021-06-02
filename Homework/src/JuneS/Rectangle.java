package JuneS;

public class Rectangle extends Shape{
    private double Long;
    private double Width;


    public Rectangle(String color, double aLong, double width) {
        super(color);
        Long = aLong;
        Width = width;
    }

    public double getLong() {
        return Long;
    }
    public void setLong(double aLong) {
        Long = aLong;
    }
    public double getWidth() {
        return Width;
    }
    public void setWidth(double width) {
        Width = width;
    }

    @Override
    public double getArea() {
        return getLong()*getWidth();
    }

    @Override
    public void draw() {
        System.out.println("正在画一个长方形.........");
    }


}
