package ejerciciocaesarcipher;


public class Cash implements Asset{
    private double amount;
    
    public Cash(double amount) {
        this.amount = amount;
    }
    
    @Override
    public double getMarketValue(){
        return amount;
    }
    
    @Override
    public double getProfit() {
        return 0;
    }

    public double getAmount() {
        return amount;
    }
}
