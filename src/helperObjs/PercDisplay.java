/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helperObjs;

/**
 *
 * @author user
 */
public class PercDisplay {
    private double percentage;
    private finalStock stock;

    public PercDisplay(double percentage, finalStock stock) {
        this.percentage = percentage;
        this.stock = stock;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public finalStock getStock() {
        return stock;
    }

    public void setStock(finalStock stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return stock + "\nThis share is worth " + percentage + "% of the portfolio\n";
    }
    
    
}
