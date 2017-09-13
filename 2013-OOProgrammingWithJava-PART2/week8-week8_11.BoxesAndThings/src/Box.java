
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
public class Box implements ToBeStored {

    
    private double maxWeight;
    private ArrayList<ToBeStored> storage;
    
    public Box(double maxWeight){
        
        
        this.maxWeight = maxWeight;
        this.storage = new ArrayList<ToBeStored>();
    }
    
    public void add(ToBeStored item){
        
        if(this.weight() + item.weight() <= maxWeight){
            this.storage.add(item);
        }    
    }
    
    
    @Override
    public double weight() {
        
        double weight = 0;
        
        for(ToBeStored item : storage){
            weight+=item.weight();
        }
        
        return weight;
    }
    
    @Override
    public String toString(){
        return "Box: "+this.storage.size()+" things, total weight "+this.weight()+" kg";
    }
}
