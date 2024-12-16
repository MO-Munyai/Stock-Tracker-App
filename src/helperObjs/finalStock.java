/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helperObjs;

/**
 *
 * @author user
 */
public class finalStock {
    private String sName;
    private double zarVal;
    private String mNation;
    private double mValue;
    private String sign;
    private double percSplit;
    public finalStock(String sName, double zarVal, String mNation, double mValue, double percSplit) {
        this.sName = sName;
        this.zarVal = zarVal;
        this.mNation = mNation;
        this.mValue = mValue;
        this.percSplit = percSplit;
        mNation = mNation.toLowerCase();
        char letter = mNation.charAt(0);
         sign = "";
            switch (letter) {               
                case 'z':
                    sign = "R";
                break;                
                case 'u':
                    sign = "$";
                break;
                case 'a':
                    sign = "A$";
                break;
                case 'g':
                    sign = "G&";
                break;
                case 'e':
                    sign = "E&";
                break;
                default:
                break;                               
}       
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public double getZarVal() {
        return zarVal;
    }

    public void setZarVal(double zarVal) {
        this.zarVal = zarVal;
    }

    public String getmNation() {
        return mNation;
    }

    public void setmNation(String mNation) {
        this.mNation = mNation;
    }

    public double getmValue() {
        return mValue;
    }

    public void setmValue(double mValue) {
        this.mValue = mValue;
    }

    public double getPercSplit() {
        return percSplit;
    }

    public void setPercSplit(double percSplit) {
        this.percSplit = percSplit;
    }
    
     
    @Override
    public String toString() {
        return "Stock Name: " + sName 
            + "\nZAR Value : R" + zarVal
            + "\nIt is in the " + mNation + " market"
            + "\nIt is worth " + sign + mValue + "\n"
            + "\nIt was allocated " + percSplit + "% \n";
    }
    
    
}
