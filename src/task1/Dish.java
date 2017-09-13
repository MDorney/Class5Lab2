/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

/**
 *
 * @author Doern
 */
public class Dish {
    private boolean fragile;
    private String status;
    
    public Dish(boolean fragile) {
        setFragile(fragile);
        status = "clean";
    }
    
    public void use() {
        setStatus("dirty");
    }
    
    public boolean isFragile() {
        return fragile;
    }

    public void setFragile(boolean fragile) {
        this.fragile = fragile;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if (!status.isEmpty()) {
        this.status = status;
        } else throw new IllegalArgumentException("The dish must have a status");
    }
    
    
}
