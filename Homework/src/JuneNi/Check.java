package JuneNi;

public class Check {

    public static void main(String[] args) {
        Machine  machine = new  Machine ();
        Goods[] goods = {new Goods("苹果"),new Goods("炸药"),new Goods("西服"),
                new Goods("硫酸"),new Goods("手表"),new Goods("硫磺")};
        //对物品的Danger属性赋初值
        for(int i =0 ; i<goods.length;i++){
            if(i%2 == 0){
                goods[i].setIsDanger(false);
            }else{
                goods[i].setIsDanger(true);
            }
        }
        for(Goods goods1:goods)
        {
            //遍历goods里所有的物品，调用Machine检查这些物品。
        try {
            machine.checkBag(goods1);
            System.out.println(goods1.getName()+"检查通过");
        }catch (DangerException e)
            {
                System.out.println(e.getMessage());
                System.out.println(goods1.getName()+"被禁止!");
            }
        }
        //如果物品是安全的，就输出 “goods[i].getName()+"检查通过"

        //如果物品是危险品，先输出  异常的message信息（调用异常对象的getMessage方法）

        // 再输出goods[i].getName()+"被禁止"

        //补充完整代码

    }
}