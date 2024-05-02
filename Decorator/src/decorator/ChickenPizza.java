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
public class ChickenPizza extends PizzaDecorator {

    public ChickenPizza(Pizza pizza) {
        super(pizza);
        System.out.println("Adding chicken ....");
    }
    
    public String getDescription() {
        return pizza.getDescription() + "\n¤ Chicken";
    }



 
    public double getCost() {
       return pizza.getCost() + 100.00;
    }
    
}
