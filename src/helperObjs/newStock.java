/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helperObjs;

/**
 *
 * @author user
 */
public class newStock {
    private String name;
    private double value;
    private double percent;
    
    public newStock(String name, double value, double percent){
        this.name = name;
        this.value = value;
        this.percent = percent;
    } 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }
    
    
    @Override
    public String toString(){
        return "Stock {Name= '" + name + "' , Value= R" + value + " , Percentage= "+ percent + "%}";
    }
}
 