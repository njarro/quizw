package ejerciciocaesarcipher;


public class MutualFund extends ShareAsset{
    protected double totalShares;
    
    public MutualFund(String symbol, double totalCost, double currentPrice, double totalShares){
        super(symbol, totalCost, currentPrice);
        this.totalShares = totalShares;
    }
    
    @Override
    public double getMarketValue() {
        return (totalShares * currentPrice);
    }
    
    @Override
    public double getProfit(){
        return ((totalShares * currentPrice) - totalCost);
    }
    
    @Override
    public String toString(){
        return symbol + " " + totalCost + " " + currentPrice + " " + totalShares;
    }
    
}
