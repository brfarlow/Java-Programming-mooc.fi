package wormgame.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;
import wormgame.Direction;
import wormgame.domain.Apple;
import wormgame.domain.Worm;
import wormgame.gui.Updatable;

public class WormGame extends Timer implements ActionListener {

    private int width;
    private int height;
    private boolean continues;
    private Updatable updatable;
    private Worm worm;
    private Apple apple;

    public WormGame(int width, int height) {
        super(1000, null);

        this.width = width;
        this.height = height;
        this.continues = true;

        addActionListener(this);
        setInitialDelay(2000);
        
        this.worm = new Worm(width/2, height/2, Direction.DOWN);
        this.addApple();
        

    }


    public boolean continues() {
        return continues;
    }

    public void setUpdatable(Updatable updatable) {
        this.updatable = updatable;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
    
    public Worm getWorm(){
        return this.worm;
    }
    
    public void setWorm(Worm worm){
        this.worm = worm;
    }
    
    public Apple getApple(){
        return this.apple;
    }
    
    public void setApple(Apple apple){
        this.apple = apple;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        //leave if continues is not set
        if (!continues) {
            return;
        }
        
        //first move the worm
        this.worm.move();
        
        //check if the worm runs into an apple
        if(worm.runsInto(apple)){
            worm.grow(); //grow the worm if it eats an apple
            this.addApple(); //destory the old apple and make a new one
        }
        
        if(worm.getX() < 0 || worm.getX() == width){
            continues = false;
        }
        
        if(worm.getY() < 0 || worm.getY() == height){
            continues = false;
        }
        
        if(worm.runsIntoItself()){
            continues = false; //end the game if the worm runs into itself
        }
        
        
        //update the interface
        updatable.update();
        //game speeds up as the worm gets longer
        this.setDelay(1000/worm.getLength());
    }
    
    private void addApple(){
        Random random = new Random();
        
        apple = new Apple(random.nextInt(width),random.nextInt(height));
        
        while(worm.runsInto(apple)){
            apple = new Apple(random.nextInt(width),random.nextInt(height));
        }
        
    }

}
