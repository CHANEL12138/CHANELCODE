package MayTwelve;

public class BeijingPeople extends ChinaPeople{
    @Override
    public void speakHello() {
        System.out.println("您好，吃了吗？");
    }

    @Override
    public void averageHeight() {
        System.out.println("北京人的平均身高是 :167.0厘米");
    }

    @Override
    public void averageWeight() {
        System.out.println("北京人的平均体重是 :68.5公斤");
    }
    public void beijingOpera()
    {
        System.out.println("京剧术语");
    }
}
