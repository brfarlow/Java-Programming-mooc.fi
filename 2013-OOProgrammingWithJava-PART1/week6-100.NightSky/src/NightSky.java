/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Xorfos
 */

import java.util.Random;

public class NightSky {
    
    private double density = 0.1;
    private int width = 20;
    private int height = 10;
    private int stars = 0;
    
    public NightSky(double density){
        
        this.density = density;
    }
    
    public NightSky(int width, int height){
        
        this.width = width;
        this.height = height;
        
    }
    
    public NightSky(double density, int width, int height){
        
        this.density = density;
        this.width = width;
        this.height = height;
    }
    
    public void printLine(){
        
        Random star = new Random();
        
        for(int i = 0;i<this.width;i++){
           
            if(star.nextDouble()<=this.density){
                System.out.print("* ");
                this.stars++;
            }
            
        }
        System.out.println("");
    }
    
    public void print(){
        
        this.stars = 0;
        for(int i = 0;i<this.height;i++){
            this.printLine();
            
        }
    }
    
    public int starsInLastPrint(){
        
        return this.stars;
    }
    
}
