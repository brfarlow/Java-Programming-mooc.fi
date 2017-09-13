/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Xorfos
 */
public class PersonalDuplicateRemover implements DuplicateRemover {
    
    private int numDuplicates;
    private List<String> characterStrings;

    public PersonalDuplicateRemover(){
        
        this.characterStrings = new ArrayList<String>();
        this.numDuplicates = 0;
    }
    
    
    @Override
    public void add(String characterString) {
        
        if(this.characterStrings.contains(characterString)){
        
            this.numDuplicates++;        
        }else{
            this.characterStrings.add(characterString);
        }
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return this.numDuplicates;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        
        Set<String> unique = new HashSet<String>();
        
        for(String string : this.characterStrings){
            unique.add(string);
        }
        
        return unique;
    }

    @Override
    public void empty() {
        this.characterStrings = new ArrayList<String>();
        this.numDuplicates = 0;
    }
    
}
