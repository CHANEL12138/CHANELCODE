package Mayeight;

public class StockTest {
    public static void main(String[] args) {
        DividendStock ds = new DividendStock("ABCD");
        ds.purchase(20,3);
        ds.purchase(30,3);
        ds.payDividend(2.5);
        double profit = ds.getProfit(3.5);
        System.out.println(profit);

        DividendStock ds2 = new DividendStock("EFGH");
        ds2.purchase(10,5);
        ds2.purchase(30,3);
        ds2.payDividend(1);
        double profit1 = ds2.getProfit(1);
        System.out.println(profit1);
    }
}
