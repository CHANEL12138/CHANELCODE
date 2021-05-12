package MayTwelve;

public class AmericanPeople extends People{
    @Override
    public void speakHello() {
        System.out.println("How do you do");
    }

    @Override
    public void averageHeight() {
        System.out.println("American average height :188.0 cm");
    }

    @Override
    public void averageWeight() {
        System.out.println("American average height :80.23 kg");
    }
    public void Boxing()
    {
        System.out.println("straight punch  Dash Ground Straight");
    }
}
