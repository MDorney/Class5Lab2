/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

/**
 *
 * @author Doern
 */
public abstract class CaffeinatedBeverage extends Beverage {
    private int caffeineContent;
    //Honestly couldn't think of an appropriate property all caffeinated beverages share

    public int getCaffeineContent() {
        return caffeineContent;
    }
    
    public void setCaffeineContent(int caffeineContent) {
        if (caffeineContent > 0) {
            this.caffeineContent = caffeineContent;
        } else 
            throw new IllegalArgumentException("Not really a caffeinated beverage then is it?");
    }
    
}
