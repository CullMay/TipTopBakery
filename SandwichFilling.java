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
public class SandwichFilling {
    private String fillingType;
    private double calPerServ;

    public String getFillingType() {
        return fillingType;
    }

    public double getCalPerServ() {
        return calPerServ;
    }
    
    public SandwichFilling(String fType, double CaPS){
        this.fillingType=fType;
        this.calPerServ=CaPS;
        //System.out.printf("Bread filling: %s\n ", fillingType);
       // System.out.printf("Calories per Serving: %s\n", calPerServ);
    }

   
    
    
    
    
    
    
}
