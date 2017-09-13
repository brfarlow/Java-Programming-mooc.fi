/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Collection;

/**
 *
 * @author Xorfos
 */
public class Barn {
    
    private final BulkTank tank;
    private MilkingRobot milkingRobot;
    
    public Barn(BulkTank tank){
        this.tank = tank;
    }
    
    public BulkTank getBulkTank(){
        return this.tank;
    }
    
    public void installMilkingRobot(MilkingRobot milkingRobot){
        
        this.milkingRobot = milkingRobot;
        this.milkingRobot.setBulkTank(this.tank);
        
    }
    
    public void takeCareOf(Cow cow) throws IllegalStateException{
        if(this.milkingRobot == null){
            throw new IllegalStateException("There is no milking robot");
        }
        this.milkingRobot.milk(cow);
    }
    
    public void takeCareOf(Collection<Cow> cows) throws IllegalStateException{
        
        if(this.milkingRobot == null){
            throw new IllegalStateException("There is no milking robot");
        }
        
        for(Cow cow : cows){
            this.milkingRobot.milk(cow);
        }
    }
    
    public String toString(){
        return this.tank.toString();
    }
}
