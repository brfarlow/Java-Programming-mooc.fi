
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Xorfos
 */
public class BirdDatabase {
    
    
    private ArrayList<Bird> birds = new ArrayList();
    
    public BirdDatabase(){
        
    }
    
    public void add(Bird newBird){
        
        this.birds.add(newBird);
        
    }

    public void stats(){
        
        for(Bird bird: birds){
            System.out.println(bird.toString());
        }
        
    }
    
    public void show(String shownBird){
        
        for(Bird bird : this.birds){
            
            if(shownBird.equals(bird.getName())){
                System.out.println(bird.toString());
            }
            
        }
        
    }
    
    public void observe(String observedBird){
        
        boolean hasBeenObserved = false;
        for (Bird bird : this.birds) {
            if (bird.getName().contains(observedBird)) {
                bird.observation();
                hasBeenObserved = true;
            }
        }
        if (!hasBeenObserved) {
            System.out.println("Is not a bird!");
        }
    }
    
}
