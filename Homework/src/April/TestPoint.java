package April;
public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point(0,0);
        Point p2 = new Point(10,30.5);
        p1.translate(3,5);
        System.out.println(p1.getX()+p1.getY());
        System.out.println(Point.distance(0,0,10,30.5));

    }
}
