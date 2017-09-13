
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Xorfos
 */
public class Dictionary {
    
    private HashMap<String, String> words = new HashMap<String, String>();
    
    public Dictionary(){
        
    }
    
    public String translate(String word){
        
        if(this.words.containsKey(word)){
            return this.words.get(word);
        }
                
        return null;
    }
    
    public void add(String word, String translation){
        
        this.words.put(word, translation);
    }
    
    public int amountOfWords(){
        
        return this.words.size();
    }
    
    public ArrayList<String> translationList(){
        
        ArrayList<String> translations = new ArrayList<String>();
        
        for(String key : words.keySet()){
            
            translations.add(key+ " = "+words.get(key));
            
        }
        
        return translations;
    }
    
}
