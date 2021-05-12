package MayTwelve;
public class PeopleTest {
    public static void main(String[] args) {
        ChinaPeople cp = new ChinaPeople();
        AmericanPeople ap = new AmericanPeople();
        BeijingPeople bp = new BeijingPeople();
        cp.speakHello();
        cp.averageHeight();
        cp.averageWeight();
        cp.Gongfu();
        ap.speakHello();
        ap.averageHeight();
        ap.averageWeight();
        ap.Boxing();
        bp.speakHello();
        bp.averageHeight();
        bp.averageWeight();
        bp.beijingOpera();

    }
}
