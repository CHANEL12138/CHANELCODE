public class StockShare {
    private double PriceOfPurchase;
    private double ShareCount;

    public StockShare(int shareCount,double priceOfPurchase) {
        PriceOfPurchase = priceOfPurchase;
        ShareCount = shareCount;
    }
    public double getPriceOfPurchase() {
        return PriceOfPurchase;
    }
    public double getShareCount() {
        return ShareCount;
    }




    public double TotalCurrentValue()
    {
        return getPriceOfPurchase()*getShareCount();
    }

    @Override
    public String toString() {
        return "You purchased " + ShareCount+ "shares and " +
                "The price when you purchased is "+PriceOfPurchase ;
    }
}
