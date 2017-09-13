/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.gui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import wormgame.domain.Apple;
import wormgame.domain.Piece;
import wormgame.domain.Worm;
import wormgame.game.WormGame;

/**
 *
 * @author Xorfos
 */
public class DrawingBoard extends JPanel implements Updatable {
    
    private WormGame game;
    private int pieceLength;
    
    public DrawingBoard(WormGame game, int pieceLength){
        super.setBackground(Color.GRAY);
        this.game = game;
        this.pieceLength = pieceLength;
    }
    
    @Override
    protected void paintComponent(Graphics graphics) {        
        super.paintComponent(graphics);
        
        Worm worm = game.getWorm();
        graphics.setColor(Color.BLACK);
        for(Piece piece : worm.getPieces()){
            graphics.fill3DRect(piece.getX()*pieceLength, piece.getY()*pieceLength, pieceLength, pieceLength, true);
        }
        
        Apple apple = game.getApple();
        graphics.setColor(Color.RED);
        graphics.fillOval(apple.getX()*pieceLength, apple.getY()*pieceLength, pieceLength, pieceLength);
        

    }

    @Override
    public void update() {
        this.repaint();
    }
}
