
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Xorfos
 */
public class Hand implements Comparable<Hand> {
    
    private ArrayList<Card> hand;
    
    public Hand(){
    this.hand = new ArrayList<Card>();
    }
    
    public void add(Card card){
        
        this.hand.add(card);
    }
    
    public void print(){

        for(Card card : this.hand){
            System.out.println(card.toString());
        }
    }
    
    public void sort(){
        
        Collections.sort(this.hand);
        
    }
    
    @Override
    public int compareTo(Hand hand){
        
        //sum up the value of this.hand
        int handValue = 0;
        for(Card card : this.hand){
            handValue+=card.getValue();
        }
        
        int otherHandValue = 0;
        for(Card card : hand.hand){
            otherHandValue+=card.getValue();
        }
        
        return handValue - otherHandValue;
    }

    public void sortAgainstSuit(){
        
        Collections.sort(this.hand,new SortAgainstSuitAndValue());
        
    }
    
}
