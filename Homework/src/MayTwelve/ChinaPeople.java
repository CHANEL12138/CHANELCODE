package MayTwelve;

public class ChinaPeople extends People{
    @Override
    public void speakHello() {
        System.out.println("你好");
    }

    @Override
    public void averageHeight() {
        System.out.println("中国人的平均身高是 :173.0厘米");
    }

    @Override
    public void averageWeight() {
        System.out.println("“中国人的平均体重是 :67.34公斤");
    }
    public void Gongfu()
    {
        System.out.println("坐如钟，站如松，睡如弓");
    }
}
