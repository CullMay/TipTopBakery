/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breadtester;
import java.util.*;

/**
 *
 * @author cm0850068
 */
public class BreadTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        ArrayList<Samdwich> sandwhich=new ArrayList<Samdwich>();
        
        System.out.println(Bread.MOTTO);
        Bread bread1 = new Bread("Rye", 5);
        //bread1.printBread();
        
        Bread bread2 = new Bread("White", 25);
        //bread2.printBread();
        
        Bread bread3 = new Bread("Wheat", 15);
        //bread3.printBread();
        
        SandwichFilling fill1 = new SandwichFilling("Egg Salad", 56);
        //bread1.printBread();
        
        SandwichFilling fill2 = new SandwichFilling("Ham", 25);
        //bread2.printBread();
        
        SandwichFilling fill3 = new SandwichFilling("Ketchep", 15);
       // bread3.printBread();
        
        
        Samdwich sand1=new Samdwich(bread1, fill1);
        Samdwich sand2=new Samdwich(bread2, fill2);
        Samdwich sand3=new Samdwich(bread3, fill3);
        
        sandwhich.add(sand1);
        sandwhich.add(sand2);
        sandwhich.add(sand3);
        
        for (int i=0; i<sandwhich.size(); i++){
            Samdwich test = sandwhich.get(i);
            test.printObject();
        }
        
    }
    
    
}
