/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Xorfos
 */
public class MaxWeightBox extends Box {
    
    private int maxWeight;
    private Collection<Thing> things;
    
    public MaxWeightBox(int maxWeight) throws IllegalArgumentException{
        
        if(maxWeight < 0){
            throw new IllegalArgumentException("Weight can't be under 0");
        }
        
        this.maxWeight = maxWeight;
        this.things = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
        if(thing.getWeight()+this.calculateWeight() <= maxWeight){
            things.add(thing);
        }
    }
    
    public int calculateWeight(){
        int weight = 0;
        for(Thing thing : things){
            weight += thing.getWeight();
        }
        return weight;
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        
        for(Thing t : this.things){
            if(t.equals(thing)){
                return true;
            }
        }
        
        return false;
    }
    
}
