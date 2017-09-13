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
public class Coffee extends CaffeinatedBeverage {
    private boolean hasCream;
    private boolean hasSugar;
    
    @Override
    public void drink() {
        System.out.println("You feel alive again.");
    }
    
    public boolean isHasCream() {
        return hasCream;
    }

    public void setHasCream(boolean hasCream) {
        this.hasCream = hasCream;
    }

    public boolean isHasSugar() {
        return hasSugar;
    }

    public void setHasSugar(boolean hasSugar) {
        this.hasSugar = hasSugar;
    }
    
    
    
}
