public class CardSelect {
    public static void main(String[] args)
    {
        int count=0;
        boolean[] f = new boolean[4];
        while(true)
        {
            int randomNumber=(int)(1+Math.random()*52);//生成一个随机数
            int Suit=SelectSuit(randomNumber);
            f[Suit-1]=true;
            count++;
            if(f[0]&&f[1]&&f[2]&&f[3])break;//如果四种花色都有了
        }
        System.out.println("Number of picks : "+ count);//输出次数
    }

    public static int SelectSuit(int num)//
    {
        int value=num%13;//计算牌面
        if(value>1&&value<=10)
            System.out.print(value);
        else if(value==1)
            System.out.print("A");
        else if(value==11)
            System.out.print("Jack");
        else if(value==12)
            System.out.print("Queen");
        else
            System.out.print("King");
        System.out.print(" Of ");
        int Suit=0;//计算花色
        if(num>0&&num<=13)Suit=1;
        if(num>13&&num<=26)Suit=2;
        if(num>26&&num<=39)Suit=3;
        if(num>39&&num<=52)Suit=4;
        switch (Suit)
        {
            case 1 :{System.out.print("Spades\n");break;}
            case 2 :{System.out.print("Hearts\n");break;}
            case 3 :{System.out.print("Diamonds\n");break;}
            case 4 :{System.out.print("Clubs\n");break;}
        }
        return Suit;//将花色返回
    }
}
