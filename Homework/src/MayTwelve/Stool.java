package MayTwelve;

public class Stool {
    Cylinder cylinders1;
    Cylinder cylinders2;
    Cylinder cylinders3;

    public Stool(Cylinder cylinders1, Cylinder cylinders2, Cylinder cylinders3) {
        this.cylinders1 = cylinders1;
        this.cylinders2 = cylinders2;
        this.cylinders3 = cylinders3;
    }
    public double Vol()
    {
        return cylinders1.Vol()+cylinders2.Vol()+cylinders3.Vol();
    }
    public double Area()
    {
        return cylinders1.Area()+ cylinders2.Area()+ cylinders3.Area();
    }
}
