/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

/**
 *
 * @author Doern
 */
public interface Chemical {
    
    public abstract void react();
    
    public abstract void reactWith(Chemical reagent);
    
}
