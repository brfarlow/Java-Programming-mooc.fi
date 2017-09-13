
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Xorfos
 */
public class VehicleRegister {
    
    private HashMap<RegistrationPlate, String> owners;
    
    public VehicleRegister(){
        this.owners = new HashMap<RegistrationPlate, String>();
    }
    
    
    public boolean add(RegistrationPlate plate, String owner){
        
        if(owners.containsKey(plate) || plate == null || owner == null){
            return false;
        }else{
            
            owners.put(plate, owner);
            return true;
            
        }
    }
    
    public String get(RegistrationPlate plate){
        
        if(plate == null){
            return null;
        }
        
        if(this.owners.containsKey(plate)){
            return this.owners.get(plate);
        }

        return null;
    }
    
    public boolean delete(RegistrationPlate plate){
        
        if(this.owners.containsKey(plate)){
            
            this.owners.remove(plate);
            return true;
        }
        
        return false;
    }
    
    public void printRegistrationPlates(){
        
        for(Map.Entry<RegistrationPlate, String> plates : this.owners.entrySet()){
            
            System.out.println(plates.getKey());
        }
    }
    
    public void printOwners(){
        
        ArrayList<String> owner = new ArrayList<String>();
        
        for(RegistrationPlate plates : this.owners.keySet()){
            
            String ownersName = owners.get(plates);
            
            if(!owner.contains(ownersName)){
                owner.add(ownersName);
            }
        }
        
        for(String name : owner){
            System.out.println(name);
        }
        
    }
    
}
