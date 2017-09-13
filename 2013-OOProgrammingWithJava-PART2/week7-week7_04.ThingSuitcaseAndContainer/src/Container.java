
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
public class Container {
    
    private int maxWeight;
    private int totalWeight;
    private ArrayList<Suitcase> suitcases = new ArrayList();
    
    public Container(int maxWeight){
        this.maxWeight = maxWeight;
        this.totalWeight = 0;
    }
    
    public void addSuitcase(Suitcase suitcase){
        if(totalWeight+suitcase.totalWeight() > this.maxWeight){
            
        }else{
            this.suitcases.add(suitcase);
            totalWeight += suitcase.totalWeight();
        }
                
    }
 
    @Override
    public String toString(){
        return this.suitcases.size()+" suitcases ("+this.totalWeight+" kg)";
    }
    
    public void printThings(){
        for(Suitcase suitcase : suitcases){
            suitcase.printThings();
        }
    }
    
}
