package MayTS;

public abstract class Window {
    private double width;
    private double height;
    public double getWidth(){
        return width;
    }
    public double getHeight()
    {
        return height;
    }
    public void setWidth(double w)
    {
        this.width=w;
    }
    public void setHeight(double w)
    {
        this.height=w;
    }
    public abstract String getMaterial();
}
