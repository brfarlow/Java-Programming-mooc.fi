/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Xorfos
 */
public class BoundedCounter {
    
    private int value = 0;
    private int upperLimit = 0;
    
    public BoundedCounter(int upperLimit){
        
        this.upperLimit = upperLimit;
        
    }
    
    public void next(){
        
        this.value++;
        if(this.value > this.upperLimit){
            this.value = 0;
        }
        
    }
    
    public int getValue(){
        
        return this.value;
    }
    
    public void setValue(int value){
        
        if(value >= 0 && value <= upperLimit){
            this.value = value;
        }
    }
    
    public String toString(){
        
        
        if(value < 10){
            return "0"+value;
        }
        
        return ""+this.value;
    }
    
}
