public class Stock {
    String symbol;//一个名为symbol的字符串数据域表示股票代码
    String name;//一个名为name的字符串数据域表示股票名字
    double previousClosingPrice;//一个名为previousClosingPrice的double类型数据域，它存储的是前一日的股票值
    double currentPrice;//一个名为currentPrice的double类型数据域，它存储的是当时的股票值
    Stock(String symbol,String name)//一个创建一只有特定代码和名字的股票的构造方法
    {
        this.symbol=symbol;
        this.name=name;
    }
    double getPreviousClosingPrice()
    {
        return previousClosingPrice;
    }//一个名为getPreviousClosingPrice()的方法，返回前一日的股票值
    double getCurrentPrice(){return currentPrice;}//一个名为getCurrentPrice()的方法，返回当时的股票值
    double getChangePercent()
    {
        return (currentPrice - previousClosingPrice) / previousClosingPrice;
    }//一个名为getChangePercent()的方法
    void setCurrentPrice(double newCurrentPrice)
    {
        this.currentPrice=newCurrentPrice;
    }//一个名为setCurrentPrice(double newCurrentPrice)方法，为股票设置一个新的当天的股票值
    public void setPreviousClosingPrice(double newPreviousClosingPrice)//一个名为public void setPreviousClosingPrice(double newPreviousClosingPrice) 方法，为股票设置一个新的前一日的股票值
    {
        this.previousClosingPrice=newPreviousClosingPrice;
    }
    public static void main(String[] args)//主函数测试
    {
        Stock s = new Stock("ORCL","Oracle Corporation");
        s.setPreviousClosingPrice(34.5);
        s.setCurrentPrice(34.35);
        System.out.println(s.getChangePercent()*100+"%");
    }
}
