package JuneS;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException{
        //创建c1圆的对象
        Circle c1 = new Circle("yellow",1.0);
        //创建c2圆的对象
        Circle c2 = new Circle("white",2.0);
        //创建r1矩形的对象
        Rectangle r1 = new Rectangle("pick", 3, 4);
        //创建r2矩形的对象
        Rectangle r2 = new Rectangle("black", 2, 5);

        //创建c画布的对象
        Canvas c = new Canvas();
        //在画布上加入并绘制c1,c2,r1和r2
        c.addShape(c1);
        c.addShape(c2);
        c.addShape(r1);
        c.addShape(r2);

        System.out.println();
        //在画布上删除c1对象
        c.removeShape(c1);
        c.printAllShapes();

        System.out.println();
        //复制r1对象赋值给r3并加入在画布中
        try {
            Thread.sleep(65000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Rectangle r3 =(Rectangle)(r1.clone());

        c.addShape(r3);
        //修改r1对象的属性
        r1.setColor("green");
        r1.setLong(20);
        r1.setWidth(10);
        // 注意r3和r1输出结果的不同，长，宽和日期
        c.printAllShapes();

        System.out.println();
        //求所有形状中面积最大的并打印其信息
        Shape p = c.Max();
        System.out.println(p.toString());
    }
}
