
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Xorfos
 */
public class Suitcase {
    
    private ArrayList<Thing> things = new ArrayList();
    private int maxWeight;
    private int totalWeight;
    
    
    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
        this.totalWeight = 0;
    }
    
    public void addThing(Thing thing){
        
        if(thing.getWeight()+totalWeight > maxWeight){
            
        }else{
            this.things.add(thing);
            totalWeight += thing.getWeight();
        }
    }
    
    @Override
    public String toString(){
        if(this.things.isEmpty()){
            return "empty ("+this.totalWeight+" kg)";
        }
        else if(this.things.size()==1){
        return this.things.size()+" thing ("+this.totalWeight+" kg)";
        }
        else
        {
          return this.things.size()+" things ("+this.totalWeight+" kg)";  
        }
        
    }
    
    public void printThings(){
        
        for(Thing thing: things){
            System.out.println(thing.toString());    
        }        
    }
    
    public int totalWeight(){
        return this.totalWeight;
    }
    
    public Thing heaviestThing(){
        if(this.things.size()>0)
        {
            Thing heaviest = this.things.get(0);
        
        for(Thing thing : this.things){
    
            if(thing.getWeight() > heaviest.getWeight()){
                heaviest = thing;
            }
            
        }
        
        return heaviest;
            
        }
        return null;
    }
    
    
}
