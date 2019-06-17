package ejerciciocaesarcipher;


public class DividentStock extends Stock{
    protected double dividends;
    
    public DividentStock(String symbol, double totalCost, double currentPrice, int totalShares, double dividends){
        super(symbol, totalCost, currentPrice, totalShares);
        this.dividends = dividends;
    }
    
    @Override
    public double getMarketValue () {
        return (super.getMarketValue() + dividends);
    }
    
    @Override
    public String toString(){
        return symbol + "  " + totalCost + "  " + currentPrice + "  " + totalShares + "  " + dividends;
    }
}
