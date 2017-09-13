/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

/**
 *
 * @author Xorfos
 */
public class MilkingRobot {
    
    private BulkTank tank;
    
    public MilkingRobot(){
    }
    
    public BulkTank getBulkTank(){
        
        return this.tank;
    }
    
    public void setBulkTank(BulkTank tank){
        this.tank = tank;
    }
    
    public void milk(Milkable milkable) throws IllegalStateException{
        
        //throw an error if there's no tank
        //else milk the milkable and fill the connected tank
        if(this.tank == null){
            throw new IllegalStateException("There is no tank connected");
        }

        this.tank.addToTank(milkable.milk());
        
    }
    
}
