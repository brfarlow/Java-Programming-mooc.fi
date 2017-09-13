/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.logic;

import java.util.ArrayList;
import java.util.List;
import moving.domain.Box;
import moving.domain.Thing;

/**
 *
 * @author Xorfos
 */
public class Packer {
    
    private int boxesVolume;
    
    public Packer(int boxesVolume){
        //determines the largest volume box that can be used
        this.boxesVolume = boxesVolume;
    }
    
    public List<Box> packThings(List<Thing> things){
        
        List<Box> boxes = new ArrayList<Box>();
        
        Box box = new Box(this.boxesVolume);
        
        for(Thing thing : things){
            
            //add things to the box created above until it's full
            if(!box.addThing(thing)){
                boxes.add(box);
                //turn the full box into an empty box
                box = new Box(this.boxesVolume);
                //add the current thing to the box
                box.addThing(thing);
            }
        }
        //Once the loop ends we have a box with a lone Thing in it
        //Add that box to the List.
        boxes.add(box);
        
        return boxes;
    }
}
