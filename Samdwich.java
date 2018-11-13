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
public class Samdwich {
    private double totalCal;
    private Bread hBread;
    private SandwichFilling hFilling;
    
    public Samdwich(Bread bread5, SandwichFilling fillings){
        this.totalCal= TotalCal(bread5.getCalories(), fillings.getCalPerServ());
        this.hBread=bread5;
        this.hFilling=fillings;
    }
    
    public double TotalCal(double calories, double calPerServ){
    double total=(2*calories)+ calPerServ;
    return total;
}
    
    public void printObject(){
        System.out.printf("Bread Type: %s\n",hBread.getBreadType());
        System.out.printf("Calories for Bread: %s\n",hBread.getCalories());
        System.out.printf("Filling: %s\n", hFilling.getFillingType());
        System.out.printf("Calories for Filling: %s\n", hFilling.getCalPerServ());
        System.out.printf("Total Calories: %s\n", totalCal);
        System.out.println("*************************************************");
        
        
        
    }
    
}