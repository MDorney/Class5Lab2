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
public class Cup extends Dish {
    private int volume;
    private boolean hasLid;

    public Cup(boolean fragile, int volume) {
        super(fragile);
        setVolume(volume);
    }
    
    @Override
    public void use() {
        setStatus("full");
    }
    
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume > 0) {
        this.volume = volume;
        } else throw new IllegalArgumentException("That isn't how a cup works");
    }

    public boolean isHasLid() {
        return hasLid;
    }

    public void setHasLid(boolean hasLid) {
        this.hasLid = hasLid;
    }
    
    
    
}
