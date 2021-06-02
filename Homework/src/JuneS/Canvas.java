package JuneS;

import java.util.ArrayList;


public class Canvas{

    private ArrayList<Shape> shapes = new ArrayList<>();
    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    public void addShape(Shape shape)
    {
        getShapes().add(shape);
    }
    public void removeShape(Shape shape)
    {
        getShapes().remove(shape);
    }

    public void clone(Shape shape)
    {

    }
    public Shape Max()
    {
        getShapes().sort(Shape::compareTo);
        return getShapes().get(0);
    }

}
