
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Xorfos
 */
public class Participants {
    
    private List<Skier> participants;
    private Random random = new Random();
    
    public Participants(){
        this.participants = new ArrayList<Skier>();
    }
    
    public void addParticipants(Skier participant){        
       this.participants.add(participant);        
    }
    
    public void sort(){
        
        Collections.sort(this.participants);
    }
    
    public void reverse(){
        Collections.reverse(this.participants);
    }
    
    public void printOrder(){
        for(int i = 0;i<this.participants.size();i++){
            int counter = i +1;
            System.out.println("  " +counter + ". " + this.participants.get(i));
        }
    }
    
    public void play(){
        
        for(Skier skier : this.participants){
            
            int jumpLength = random.nextInt(120-60+1)+60;
            skier.addJump(jumpLength);
            List<Integer> evaluation = new ArrayList<Integer>();
            for(int i = 0;i<5;i++){
                int eval = random.nextInt(20-10+1)+10;
                evaluation.add(eval);
            }
            System.out.println("  " + skier.getName());
            System.out.println("    length: " + jumpLength);
            System.out.println("    judge votes: " + evaluation);
            Collections.sort(evaluation);
            evaluation.remove(0);
            evaluation.remove(evaluation.size()-1);
            int evalSum = 0;
            for(int i : evaluation){
                evalSum += i;
            }
        
            int score = jumpLength+evalSum;
            skier.addPoints(score);
            
        }
        
    }
    
    public void print(){
        for(Skier skier : this.participants){
            System.out.println(skier);
        }
    }
    
    public void printResults(){
        
        System.out.println("Position    Name");
        int i = 1;
        for(Skier skier : this.participants){
            System.out.println(i + "           " + skier);
            skier.printJumpLengths();
            i++;
            System.out.println("");
        }
        
    }
    
}
