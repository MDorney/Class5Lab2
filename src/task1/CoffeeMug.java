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
public class CoffeeMug extends Cup {
    private boolean hasHandle;
    private boolean isInsulated;

    public CoffeeMug(boolean hasHandle, boolean isInsulated, boolean fragile, int volume) {
        super(fragile, volume);
        this.hasHandle = hasHandle;
        this.isInsulated = isInsulated;
    }
    
    
    
    @Override
    public void use() {
        setStatus("Piping hot");
    }
    
    public boolean isHasHandle() {
        return hasHandle;
    }

    public void setHasHandle(boolean hasHandle) {
        this.hasHandle = hasHandle;
    }

    public boolean isIsInsulated() {
        return isInsulated;
    }

    public void setIsInsulated(boolean isInsulated) {
        this.isInsulated = isInsulated;
    }
    
    
}
