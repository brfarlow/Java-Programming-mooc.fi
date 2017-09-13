/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Random;

/**
 *
 * @author Xorfos
 */
public class Cow implements Milkable, Alive {
    
    private double udderCapacity;
    private double amount;
    private Random random;
    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
    private String name;
    
    public Cow(){
        random = new Random();
        this.udderCapacity = random.nextInt(26)+15;
        this.name = NAMES[random.nextInt(30)];
    }
    
    public Cow(String name){
        random = new Random();
        this.udderCapacity = random.nextInt(26)+15;
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public double getCapacity(){
        return this.udderCapacity;
    }
    
    public double getAmount(){
        return amount;
    }
    
    public String toString(){
        return this.name+" "+this.amount+"/"+this.udderCapacity;
    }

    @Override
    public double milk() {
        double milk = amount;
        amount = 0;
        return milk;
    }

    @Override
    public void liveHour() {
        //cows generate 0.7 - 2 liters milk every hour
        random = new Random();
        double milkMade = Math.ceil((0.7+1.3 * random.nextDouble()));
        
        
        
        if(amount + milkMade > this.udderCapacity){
            amount = this.udderCapacity;
        }else{
            amount += milkMade;
        }
    }
}
