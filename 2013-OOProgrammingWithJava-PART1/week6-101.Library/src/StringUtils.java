/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Xorfos
 */
public class StringUtils {
    
    public static boolean included(String word, String search){
        
        
        if(word == null || search == null){
            return false;
        }
        
        String lowerWord = word.trim().toLowerCase();
        String lowerSearch = search.trim().toLowerCase();
        
        return lowerWord.contains(lowerSearch);
    }
    
}
