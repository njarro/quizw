package ejerciciocaesarcipher;


public class Stock extends ShareAsset {
    
    protected int totalShares;

    public Stock(String symbol, double totalCost, double currentPrice, int totalShares) {
        super(symbol, totalCost, currentPrice);
        this.totalShares = totalShares;
    }
    
    @Override
    public double getMarketValue(){
        return (totalShares * currentPrice);
    }
    
    @Override
    public double getProfit(){
        return ((totalShares * currentPrice) - totalCost);
    }
    
    @Override
    public String toString(){
        return symbol + "  " + totalCost + "  " + currentPrice + "  " + totalShares; 
    }
}
