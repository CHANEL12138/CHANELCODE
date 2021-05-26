public class HelloMaven {
    public static void main(String[] args) {
        HelloMaven helloMaven = new HelloMaven();
        int res = helloMaven.add(10,20);
        System.out.println(res+"Hello Maven");
    }
    public int add(int a,int b)
    {
        return a+b;
    }
}
