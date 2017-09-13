/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Xorfos
 */
public class Box implements Thing {
    
    private int maxCapacity;
    private List<Thing> things;
  
    
    public Box(int maximumCapacity){
        this.maxCapacity = maximumCapacity;
        this.things = new ArrayList<Thing>();
    }
    
    public boolean addThing(Thing thing){
        
        if(this.getVolume()+thing.getVolume() <= maxCapacity){
            this.things.add(thing);
            return true;
        }
        
        return false;
    }

    
    @Override
    public int getVolume() {
        int volume = 0;
        for(Thing thing : things){
            volume += thing.getVolume();
        }
        return volume;
    }
    
    public String toString(){
        String boxContents = "";
        for(Thing thing : things){
            boxContents += thing.toString();
            boxContents += " ";
        }
       
        return boxContents;
    }
}
