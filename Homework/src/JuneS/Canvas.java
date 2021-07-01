package JuneS;

import java.util.ArrayList;
import java.util.Collections;


public class Canvas{

    private ArrayList<Shape> shapes = new ArrayList<>();
    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    public void addShape(Shape shape)
    {
        getShapes().add(shape);
        shape.draw();
        System.out.println(shape);
    }
    public void removeShape(Shape shape)
    {
        getShapes().remove(shape);
        System.out.print("正在删除");
        System.out.println(shape);
    }


    public Shape Max()
    {
        Collections.sort(getShapes());
        return getShapes().get(0);
    }

    public double getArea()
    {
        double sum = 0;
        for(Shape s:getShapes())
        {
            sum+=s.getArea();
            System.out.println(s);
        }
        return sum;
    }

    public void printAllShapes() {
        for(Shape s:getShapes())
        {
            System.out.println(s);
        }
    }

}
