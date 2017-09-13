/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Xorfos
 */
public class AtLeastOne implements Criterion{
    
    private ArrayList<Criterion> criterions;
    
    public AtLeastOne(Criterion... criterion){
        
        criterions = new ArrayList<Criterion>();
        criterions.addAll(Arrays.asList(criterion));
    }

    @Override
    public boolean complies(String line) {
        
        for(Criterion criterion : this.criterions){
            if(criterion.complies(line)){
                return true;
            }
        }
        return false;
    }
    
}
