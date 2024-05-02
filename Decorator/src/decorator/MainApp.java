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
public class MainApp {
      public static void main(String args[]) {
          
          PlainPizza pp = new PlainPizza();
          System.out.println("Description : \n" + pp.getDescription() + "\nCost : " + pp.getCost() +" DZD");
          
          System.out.println("\n#######################################################################\n");
          
          ChickenPizza cp = new ChickenPizza(pp);
          System.out.println("Description : \n" + cp.getDescription() + " \nCost : " + cp.getCost() +" DZD");
     
          
          System.out.println("\n#######################################################################\n");
          
          VegetablePizza vp = new VegetablePizza(pp);
          System.out.println("Description : \n" + vp.getDescription() + " \nCost : " + vp.getCost() + " DZD");
     
     
       }
}
