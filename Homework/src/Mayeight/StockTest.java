package Mayeight;

public class StockTest {
    public static void main(String[] args) {
        DividendStock ds = new DividendStock("ABCD");
        ds.purchase(20,30);
        ds.purchase(30,30);
        ds.payDividend(2.5);
        double profit = ds.getProfit(1);
        System.out.println(profit);
    }
}
