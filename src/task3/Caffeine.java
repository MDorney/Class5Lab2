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
public class Caffeine implements Drug {

    @Override
    public void ingest() {
        System.out.println("You feel Alive again"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void affectBrain() {
        System.out.println("You are more alert and focused");; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void react() {
        System.out.println("Caffeine is stable in natural environments");; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void reactWith(Chemical reagent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
