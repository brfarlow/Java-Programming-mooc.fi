/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import wormgame.Direction;

/**
 *
 * @author Xorfos
 */
public class Worm {

    private int x;
    private int y;
    private Direction direction;
    private List<Piece> pieces;
    private boolean grow;
    private Piece tail;

    public Worm(int originalX, int originalY, Direction originalDirection) {

        this.x = originalX;
        this.y = originalY;
        this.direction = originalDirection;

        this.pieces = new ArrayList<Piece>();
        this.pieces.add((new Piece(originalX, originalY)));
        tail = new Piece(originalX, originalY);
        this.grow = false;

    }

    public Direction getDirection() {
        return this.direction;
    }

    public void setDirection(Direction dir) {
        this.direction = dir;
    }

    public int getLength() {
        return this.pieces.size();
    }

    public List<Piece> getPieces() {
        return this.pieces;
    }
    
    public int getX(){
        return this.x;
    }
    
    public int getY(){
        return this.y;
    }

    public void move() {

        if (grow || this.pieces.size()<3) {
            tail = pieces.get(0);         
            this.pieces.add(0, tail);
            grow = false;
        }
        
        switch (direction) {
            case LEFT:
                x--;
                this.pieces.add(new Piece(x, y));
                break;
            case RIGHT:
                x++;
                this.pieces.add(new Piece(x, y));
                break;
            case UP:
                y--;
                this.pieces.add(new Piece(x, y));
                break;
            case DOWN:
                y++;
                this.pieces.add(new Piece(x, y));
                break;
            default:
                break;
        }

        this.pieces.remove(0);

    }

    public void grow() {
        grow = true;
    }

    public boolean runsInto(Piece piece) {
        
        for(Piece p : pieces){
            if(p.getX() == piece.getX() && p.getY() == piece.getY()){
                return true;
            }
            
        }
        return false;
    }

    public boolean runsIntoItself() {
        
        Piece head = pieces.get(pieces.size()-1);
        for(Piece piece: this.pieces.subList(0, pieces.size()-1)){
            if( head.getX() == piece.getX() && head.getY() == piece.getY()){
                return true;
            }
        }
        return false;
    }

}
