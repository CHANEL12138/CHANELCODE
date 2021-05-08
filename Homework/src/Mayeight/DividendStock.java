package Mayeight;

public class DividendStock extends Stock{
    private double dividents;

    public DividendStock(String theSymbol) {
        super(theSymbol);
        this.dividents = 0;
    }

    public double getDividents() {
        return dividents;
    }


    public void payDividend(double amountPerShare)
    {
        this.dividents = amountPerShare*super.getTotalShares();
    }

    @Override
    public double getProfit(double currentPrice) {
        return super.getProfit(currentPrice)+getDividents();
    }
}
