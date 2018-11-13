/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breadtester;

/**
 *
 * @author cm0850068
 */
public class Bread {
    private String breadType;
    private double calories;
    public final static String MOTTO="The staff of Life";

    public String getBreadType() {
        return breadType;
    }

    public double getCalories() {
        return calories;
    }
    
    
    
    public Bread (String bType, double CPS){
        this.breadType= bType;
        this.calories=CPS;
        
    }
    
    public void printBread(){
        System.out.printf("Bread Type: %s\n", breadType);
        System.out.printf("Calories: %s\n", calories);
        
        
    }
    
}
