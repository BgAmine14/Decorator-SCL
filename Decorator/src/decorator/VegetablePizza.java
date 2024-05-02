/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package decorator;

/**
 *
 * @author Amine
 */
public class VegetablePizza extends PizzaDecorator {

    public VegetablePizza(Pizza pizza) {
        super(pizza);
        System.out.println("Adding Vegetables ....");
    }
    
    
    public String getDescription() {
        return pizza.getDescription() + "\n¤ Vegatables";
    }


 
    public double getCost() {
       return pizza.getCost() + 50.00;
    }
    
    
    
}
