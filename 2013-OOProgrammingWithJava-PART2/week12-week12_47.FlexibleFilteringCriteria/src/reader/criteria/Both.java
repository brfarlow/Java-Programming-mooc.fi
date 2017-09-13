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
public class Both implements Criterion {
    
    private Criterion critOne;
    private Criterion critTwo;
    
    public Both(Criterion one, Criterion two){
        this.critOne = one;
        this.critTwo = two;
    }

    @Override
    public boolean complies(String line) {
        return critOne.complies(line) && critTwo.complies(line);
    }
}
