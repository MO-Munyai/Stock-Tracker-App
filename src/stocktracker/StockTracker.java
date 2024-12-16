/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stocktracker;

import helperObjs.PercDisplay;
import helperObjs.StockDetails;
import helperObjs.finalStock;
import helperObjs.newStock;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class StockTracker {

    /**
     * @param args the command line arguments
     */
    
    //public void newStock(){}
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        //entering and saving stocks
        List <StockDetails> portfolio = new ArrayList<>();
        boolean contEnt = true;
        
        System.out.println("Welcome To The Stock Tracker App: "
                + "\nOn this app you will be able to enter the portfolio you want to improve \n"
                + "It will allow you to enter stocks that you want to invest in and the period and investment amount.");
        
        String stockName = "";
        double zarVal = 0;
        String market = "";
        double percSplit = 0;
        double fullPerc = 100.0;
        double initial = 0;
        
        while(fullPerc !=0){
            //enter details
            System.out.println("Enter stock name: ");
            stockName = scan.nextLine(); 
            System.out.println("Enter nationality of the market (Z(AR)/U(SD)/A(UD)/G(BP)/E(UR): ");
            market = scan.nextLine();
            scan.nextLine(); 
            System.out.println("Enter cureent value owned in ZAR: ");
            zarVal= scan.nextDouble();   
            scan.nextLine(); 
            System.out.println("Enter % to be allocated to the share: ");
            percSplit= scan.nextDouble();
            scan.nextLine(); 
            
            // add stock into portfolio
            portfolio.add(new StockDetails(stockName,zarVal,market,percSplit));
            
            //control the loop and its values
            fullPerc-=percSplit;
            initial+=zarVal;
            
            stockName = "";
            zarVal = 0;
            market = "";
            percSplit = 0;
        }
        
        for(StockDetails stock: portfolio){ 
            System.out.println(stock);
        }
        System.out.println("Initial Value of the portfolio is : R" + initial + "\n");
        System.out.println("\n----------------------------------------------------------------------------------------------------");
        //Display inital Holdings and their value and percantage split
        List<newStock> stocks = new ArrayList<>();
        double iPerc = 0;
        String n = "";
        double iVal = 0;
        for(int i =0; i < portfolio.size();i++){
            if(portfolio.get(i).getZarVal() > 0){
                n = portfolio.get(i).getStockName();
                iVal = portfolio.get(i).getZarVal();
                iPerc = iVal/initial*100;
                
                stocks.add(new newStock(n,iVal,iPerc));
            }
        }
        
        stocks.sort((s1, s2) -> Double.compare(s2.getPercent(), s1.getPercent()));
        System.out.println("Initial Holdings Split: \n");
        for(newStock stock: stocks){
            System.out.println(stock);
        }
        
        System.out.println("\n----------------------------------------------------------------------------------------------------\n");
        //contributions must be shared by all the stocks and allocated by the stock split alloacted (percSplit)
        //the name and symbol of the market (market)
        List<finalStock> fPort = new ArrayList<>();
        
        System.out.println("Enter investment period in months: ");
        int period = scan.nextInt();
        System.out.println("Enter amount that will be deposited and distributed based on the stock split monthly");
        double deopisit = scan.nextDouble();
        String sName = "";
        double zVal = 0;
        double total = 0;
        String mNation = "";
        double mValue = 0;
        
        scan.nextLine();
        
        for(int m = 0; m< portfolio.size();m++){
            //unpack and re-build stock details into new object
            //name
            sName = portfolio.get(m).getStockName();
            //value in rands at the end of the period (initial  + (period * (deposit*splitAllocation%))
            zVal = portfolio.get(m).getZarVal() + (period * (deopisit * portfolio.get(m).getPercSplit()/100));
            total+=zVal;
            //market
            switch (portfolio.get(m).getMarket().toLowerCase()) {
                
                case "z":
                    mNation = "ZAR/South Africa";
                    mValue = zVal;
                break;                
                case "u":
                    mNation = "USD/United States";
                    mValue = zVal/18.20;
                break;
                case "a":
                    mNation = "AUD/Australia";
                    mValue = zVal/11.80;
                break;
                case "g":
                    mNation = "GBP/Britain";
                    mValue = zVal/22.80;
                break;
                case "e":
                    mNation = "EUR/Europe";
                    mValue = zVal/19.00;
                break;
                default:
                    System.out.println("Invalid");
                break;
            }
            fPort.add(new finalStock(sName,zVal,mNation,mValue,portfolio.get(m).getPercSplit()));            
    }
        
        //for(int j = 0)
        //put the % part in seperate for loop
        List<PercDisplay> display = new ArrayList<>();
        double finalPerc = 0;
        for(int o = 0; o < fPort.size();o++){
            finalPerc = (fPort.get(o).getZarVal()/total)*100;
            display.add(new PercDisplay(finalPerc,fPort.get(o)));          
        }
        
        display.sort((s1, s2) -> Double.compare(s2.getPercentage(), s1.getPercentage()));
        System.out.println("\n----------------------------------------------------------------------------------------------------\n");
        
        System.out.println("Holdings after "+ period + " months with be worth a total of R +" + total + "\n");
        for(PercDisplay fStock: display){
            System.out.println(fStock);
        }         
        //at the end display all the holdings (stockName), their value at the beginning of the period and at the end of the period(zarVal)
        //the name and symbol of the market (market)
        // their stock split(percSplit) and what % of the portfolio is the stock(iPerc)
        //and display from highest iPerc to lowest
        
        
    }       
} 