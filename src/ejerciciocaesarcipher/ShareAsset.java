package ejerciciocaesarcipher;


public abstract class ShareAsset implements Asset{
    protected String symbol;
    protected double totalCost;
    protected double currentPrice;
    
    public ShareAsset(String symbol, double totalCost, double currentPrice) {
        this.symbol = symbol;
        this.totalCost = totalCost;
        this.currentPrice = currentPrice;
    }
    
    public String getSymbol() {
        return symbol;
    }
}
