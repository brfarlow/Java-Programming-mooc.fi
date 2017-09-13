/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;

/**
 *
 * @author Xorfos
 */
public class EndsWithQuestionOrExclamationMark implements Criterion {
    
    public EndsWithQuestionOrExclamationMark(){
        
    }

    @Override
    public boolean complies(String line) {
        
        if(line.isEmpty()){
            return false;
        }
        
        if(line.substring(line.length()-1).equals("!") || line.substring(line.length()-1).equals("?")){
           return true;
        }
        return false;
    }
    
}
