package ejerciciocaesarcipher;

import java.util.ArrayList;

public class Company {
    private String name;
    
    private ArrayList<Stock> stocks;
    private ArrayList<DividentStock> dividentStocks;
    private ArrayList<Cash> cash;
    private ArrayList<MutualFund> mutualFunds;
    
    public Company (String name) {
        this.name = name;
        
        stocks = new ArrayList<Stock>();
        dividentStocks = new ArrayList<DividentStock>();
        cash = new ArrayList<Cash>();
        mutualFunds = new ArrayList<MutualFund>();
    }
    
    public double getStocksAndDividentsValue() {
        double totalValue = 0;
        
        if (stocks.size() > 0){
            for (Stock stock : stocks) {
                if(stock.getSymbol().equals("GOOGLE") || stock.getSymbol().equals("SAMSUNG"))
                    totalValue += stock.getMarketValue();
            }
        }
        
        if (dividentStocks.size() > 0){
            for (DividentStock dividentStock : dividentStocks) {
                if(dividentStock.getSymbol().equals("GOOGLE") || dividentStock.getSymbol().equals("SAMSUNG"))
                    totalValue += dividentStock.getMarketValue();
            }
        }
        
        return totalValue;
    }
    
    public double getAssetsTotalValue() {
        double totalValue = 0;
        
        if (stocks.size() > 0) 
            for (Stock stock : stocks) 
                totalValue += stock.getMarketValue();
        
        if (dividentStocks.size() > 0)
            for (DividentStock dividentStock : dividentStocks) 
                totalValue += dividentStock.getMarketValue();
            
        if (cash.size() > 0)
            for (Cash _cash : cash) 
                totalValue += _cash.getMarketValue();
        
        if (mutualFunds.size() > 0)
            for (MutualFund mutualFund : mutualFunds) 
                totalValue += mutualFund.getMarketValue();
        
        return totalValue;
    }
    
    public double getAssetsTotalProfit() {
        double totalProfit = 0;
        
        if (stocks.size() > 0) 
            for (Stock stock : stocks) 
                totalProfit += stock.getProfit();
        
        if (dividentStocks.size() > 0)
            for (DividentStock dividentStock : dividentStocks) 
                totalProfit += dividentStock.getProfit();
            
        if (cash.size() > 0)
            for (Cash _cash : cash) 
                totalProfit += _cash.getProfit();
        
        if (mutualFunds.size() > 0)
            for (MutualFund mutualFund : mutualFunds) 
                totalProfit += mutualFund.getProfit();
        
        return totalProfit;
    }
    
    public void addStock(Stock stock) {
        stocks.add(stock);
    }
    
    public void addDividentStock(DividentStock dividentStock) {
        dividentStocks.add(dividentStock);
    }
    
    public void addCash(Cash cash) {
        this.cash.add(cash);
    }
    
    public void addMutualFund(MutualFund mutualFund) {
        mutualFunds.add(mutualFund);
    }

    public ArrayList<Stock> getStocks() {
        return stocks;
    }

    public ArrayList<DividentStock> getDividentStocks() {
        return dividentStocks;
    }

    public ArrayList<Cash> getCash() {
        return cash;
    }

    public ArrayList<MutualFund> getMutualFunds() {
        return mutualFunds;
    }
    
    @Override
    public String toString(){
        String s = "";
        
        s += name + ":\n";
        
        if (stocks.size() > 0) {
            s += "\nStocks:\n";
            for (Stock stock : stocks) {
                s += stock;
                s += '\n';
            }
        }

        if (dividentStocks.size() > 0){
            s += "\nDivident Stocks:\n";
            for (DividentStock dividentStock : dividentStocks) {
                s += dividentStock;
                s += '\n';
            }
        }
    
        if (cash.size() > 0) {
            s += "\nCash:\n";
            for (Cash _cash : cash) {
                s += _cash.getAmount();
                s += '\n';
            }
        }

        if (mutualFunds.size() > 0) {
            s += "\nMutual Funds:\n";
            for (MutualFund mutualFund : mutualFunds) {
                s += mutualFund;
                s += '\n';
            }
        }
        
        return s;
    }
}
