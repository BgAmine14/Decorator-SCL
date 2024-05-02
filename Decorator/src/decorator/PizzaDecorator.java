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
public abstract class PizzaDecorator implements Pizza{
    protected Pizza pizza ;
    
    public PizzaDecorator ( Pizza pizza){
            this.pizza = pizza;
    }
    
    
   
      public String getDescription() {
        return pizza.getDescription();
    }


 
    public double getCost() {
       return pizza.getCost();
    }
}
