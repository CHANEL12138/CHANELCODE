package JuneNi;

public class Machine {

    public void checkBag(Goods goods) throws DangerException{
        //如果物品是危险品，那么就抛出DangerException的对象
        //该对象的messge字符串的内容是 goods.getName()+"是危险品！"
        if(goods.isDanger())
        {
            throw new DangerException(goods.getName()+"是危险品！");
        }
    }
}
