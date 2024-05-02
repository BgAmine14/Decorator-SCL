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
public class PlainPizza  implements Pizza{

    @Override
    public String getDescription() {
        return "¤ plain Pizza ";
    }

    @Override
    public double getCost() {
       return 100.00;
    }
    
}
