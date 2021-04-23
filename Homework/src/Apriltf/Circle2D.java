package Apriltf;

public class Circle2D {
    private Point p;
    private double radius;

    public Circle2D() {
        this(0,0,1);
    }

    public Circle2D(double x,double y, double radius) {
        p = new Point(x,y);
        this.radius = radius;
    }

    public Point getP() {
        return p;
    }
    public void setP(Point p) {
        this.p = p;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*getRadius()*getRadius();
    }
    public double getPerimeter(){
        return 2*Math.PI*getRadius();
    }
    public double distance(Point p){
        return p.distance(getP());
    }
    public boolean contains(double x,double y){
        Point p1 = new Point(x,y);
        return p1.distance(getP()) < getRadius();
    }
    public boolean contains(Point p1){
        return p1.distance(getP()) < getRadius();
    }
    public boolean contains(Circle2D circle)
    {
        return circle.getP().distance(getP())<Math.abs(circle.getRadius()-getRadius());
    }
    public boolean overlaps(Circle2D circle){
        return getP().getX()==circle.getP().getX()&&
                getP().getY()==circle.getP().getY()&&
                getRadius()==circle.getRadius();
    }


}
