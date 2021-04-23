import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("First stock's symbol:");
        Stock stock1 = new Stock(input.next());
        System.out.println("Net profit or loss:$" + Stock.format(stock1.ComputeProfit()));


        System.out.print("Second stock's symbol:");
        Stock stock2 = new Stock(input.next());
        System.out.println("Net profit or loss:$" + Stock.format(stock2.ComputeProfit()));

        Stock.Compare(stock1,stock2);


    }
}
