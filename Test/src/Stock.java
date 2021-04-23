import java.util.Formatter;
import java.util.Scanner;

public class Stock {
    private final String name;
    private final double PriceOfToday;
    private int ShareCount;
    private StockShare[] stockShare;
    static Scanner input = new Scanner(System.in);


    public void GetShare()
    {
        System.out.print("How many purchases do you make? ");
        ShareCount = input.nextInt();
        stockShare = new StockShare[ShareCount];
        for(int i = 1; i <= ShareCount ; i++)
        {
            System.out.print(i + ": How many shares, at what price per share? ");
            stockShare[i-1] = new StockShare(input.nextInt(),input.nextDouble());
        }
    }
    public double GetPriceToday()
    {
        System.out.print("What is today's price per share? ");
        return input.nextDouble();
    }

    public Stock() {
        name = "null";
        PriceOfToday = 0;
        ShareCount = 0;
        stockShare = null;
    }
    public Stock(String name) {
        this.name = name;
        GetShare();
        this.PriceOfToday = GetPriceToday();
    }


    public String getName() {
        return name;
    }
    public double getPriceOfToday() {
        return PriceOfToday;
    }
    public StockShare[] getStockShare() {
        return stockShare;
    }
    public int getShareCount() {
        return ShareCount;
    }



    public double ComputeProfit()
    {
        double sum = 0;
        StockShare[] share = getStockShare();
        for(int i = 0; i < getShareCount(); i++)
        {
            sum = sum + (getPriceOfToday()*share[i].getShareCount()-share[i].TotalCurrentValue());
        }
        return sum;
    }

    public static void Compare(Stock stock1,Stock stock2)
    {
        if(stock1.ComputeProfit()>stock2.ComputeProfit())
        {
            System.out.println(stock1.getName()+
                    " was more profitable than "+ stock2.getName());
        }
        else{
            System.out.println(stock2.getName()+
                    " was more profitable than "+ stock1.getName());
        }
    }
    public static String format(double value) {
        return new Formatter().format("%.2f", value).toString();
    }


}
