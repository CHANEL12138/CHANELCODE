package Apriltf;

public class Point {
    private double x = 0;
    private double y = 0;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point() {
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }



    public void setLocation(double newx,double newy)
    {
        setX(newx);
        setY(newy);
    }
    public double distanceFromOrigin()
    {
        return Math.sqrt(getX()*getX()+getY()*getY());
    }
    public void translate(int dx, int dy)
    {
        setX(getX()+dx);
        setY(getY()+dy);
    }
    public static double distance(double x1,double y1,double x2,double y2){
        return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
    }
    public double distance(Point p1, Point p2)
    {
        return p1.distance(p2);
    }
    public double distance(Point p)
    {
        return Math.sqrt((this.getX()-p.getX())*(this.getX()-p.getX())-
                (this.getY()-p.getY())*(this.getY()-p.getY()));
    }
}
