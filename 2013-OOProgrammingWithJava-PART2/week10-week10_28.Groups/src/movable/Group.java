/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Xorfos
 */
public class Group implements Movable {
    
    private List<Movable> orgGroup;
    
    public Group(){
        this.orgGroup = new ArrayList<Movable>();
    }
    
    @Override
    public String toString(){
        
        String string = "";
        for(Movable item : this.orgGroup){
            string += item.toString();
            string += "\n";
        }
        return string;
    }
    
    public void addToGroup(Movable movable){
        
        if(movable != null){
            orgGroup.add(movable);
        }
    }
    
    
    @Override
    public void move(int dx, int dy) {
        for(Movable item : this.orgGroup){
            item.move(dx, dy);
        }
    }
    
}
