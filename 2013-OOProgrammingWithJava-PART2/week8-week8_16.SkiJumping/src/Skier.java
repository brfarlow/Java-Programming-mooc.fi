
import java.util.ArrayList;
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
public class Skier implements Comparable<Skier> {
    
    private String name;
    private int score;
    private List<Integer> jumps;
    
    public Skier(String name){
        this.name = name;
        this.score = 0;
        this.jumps = new ArrayList<Integer>();
    }
    
    public String getName(){
        return this.name;
    }
    
    public void addPoints(int points){
        this.score += points;
    }
    
    public void addJump(int jump){
        this.jumps.add(jump);
    }

    @Override
    public int compareTo(Skier skier) {
        return skier.score - this.score;
    }
    
    public String toString(){
        return this.name+" ("+this.score+" points)";
    }
    
    public void printJumpLengths(){
        String formattedString = this.jumps.toString().replace("[", "").replace(",", " m,").replace("]", " m");
        System.out.print("            jump lengths: " + formattedString);
        
    }
   
    
}
