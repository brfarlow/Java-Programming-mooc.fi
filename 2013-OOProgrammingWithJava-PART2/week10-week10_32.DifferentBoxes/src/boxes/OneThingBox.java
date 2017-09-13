/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

/**
 *
 * @author Xorfos
 */
public class OneThingBox extends Box {
    
    private Thing onlyThing;
    
    public OneThingBox(){
        
    }

    @Override
    public void add(Thing thing) {
        //only add if it doesn't exist. Never change it.
        if(this.onlyThing == null){
            this.onlyThing = thing;
        }
       
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        if(this.onlyThing == null){
            return false;
        }
        return this.onlyThing.equals(thing);
    }
    
    
}
