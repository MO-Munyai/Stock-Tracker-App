/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helperObjs;

/**
 *
 * @author user
 */
public class StockDetails {
    private String stockName;
    private double zarVal;
    private String market;
    private double percSplit;

    public StockDetails(String stockName, double zarVal, String market, double percSplit) {
        this.stockName = stockName;
        this.zarVal = zarVal;
        this.market = market;
        this.percSplit = percSplit;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public double getZarVal() {
        return zarVal;
    }

    public void setZarVal(double zarVal) {
        this.zarVal = zarVal;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public double getPercSplit() {
        return percSplit;
    }

    public void setPercSplit(double percSplit) {
        this.percSplit = percSplit;
    }
    
    @Override
    public String toString(){
    return "Stock Name: " + stockName 
            + "\nZAR Value : R" + zarVal
            + "\nIt is in the " + market.toUpperCase() + " market"
            + "\nIt was allocated " + percSplit + "% \n";  
    }
}
