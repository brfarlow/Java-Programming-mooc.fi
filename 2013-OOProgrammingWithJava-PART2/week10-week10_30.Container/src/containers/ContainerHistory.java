/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

import java.util.ArrayList;

/**
 *
 * @author Xorfos
 */
public class ContainerHistory {
    
    private ArrayList<Double> history;
    
    public ContainerHistory(){
        
        this.history = new ArrayList<Double>();
    }
    
    public void add(double situation){
        this.history.add(situation);
    }
    
    public void reset(){
        this.history.clear();
    }
    
    @Override
    public String toString(){
        return this.history.toString();
    }
    
    public double maxValue(){
        
        
        
        if(this.history.isEmpty()){
            return 0;
        }
        
        double maxValue = this.history.get(0);
        for(double value : this.history){
            if(value > maxValue){
                maxValue = value;
            }
        }
        
        return maxValue;
    }
    
    public double minValue(){
        
        
        
        if(this.history.isEmpty()){
            return 0;
        }
        
        double minValue = this.history.get(0);
        for(double value : this.history){
            if(value < minValue){
                minValue = value;
            }
        }
        
        return minValue;
    }
    
    public double average(){
        
        double numerator = 0;
        
        if(this.history.isEmpty()){
            return 0;
        }
        
        for(double value : this.history){
            numerator += value;
        }
        
        return numerator/this.history.size();
    }
    
    public double greatestFluctuation(){
        double greatestFluctuation = 0;
        
        if(this.history.isEmpty() || this.history.size() == 1){
            return 0;
        }
        
        for(int i = 1; i <= this.history.size()-1;i++){
            
            double currentFluctuation = Math.abs(history.get(i)-history.get(i-1));
            
            if(currentFluctuation > greatestFluctuation){
                greatestFluctuation = currentFluctuation;
            }
            
        }
        
        
        return greatestFluctuation;
    }
    
    public double variance(){
        
        if(this.history.isEmpty() || this.history.size() == 1){
            return 0;
        }
        
        double numerator = 0;
        
        for(double value : this.history){
            
            numerator += Math.pow(value-this.average(), 2);
        }
        
        return numerator/(this.history.size()-1);
    }
}
