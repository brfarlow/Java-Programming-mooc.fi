/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import gameoflife.GameOfLifeBoard;
import java.util.Random;

/**
 *
 * @author Xorfos
 */
public class PersonalBoard extends GameOfLifeBoard {

    public PersonalBoard(int width, int height) {
        super(width, height);
    }

    @Override
    public void initiateRandomCells(double probabilityForEachCell) {
        Random random = new Random();

        //Loop through every coordinate in the playing board
        //Set the cell to alive based on the probability passed as the argument
        //If the random generator gives a probability less than what was passed in the cell is alive
        //i.e., the random number will always be less than "1" so all cells are alive if 1 is passed in
        //Conversely all cells are dead if 0 is passed in.
        for (int x = 0; x <= super.getWidth(); x++) {

            for (int y = 0; y <= super.getWidth(); y++) {

                double probability = random.nextDouble();

                if (probability <= probabilityForEachCell) {
                    turnToLiving(x, y);
                }

            }
        }

    }

    @Override
    public boolean isAlive(int x, int y) {
        if (validCoordinates(x, y)) {
            return getBoard()[x][y];
        } else {
            return false;
        }
    }

    @Override
    public void turnToLiving(int x, int y) {

        if (validCoordinates(x, y)) {
            getBoard()[x][y] = true;
        }

    }

    @Override
    public void turnToDead(int x, int y) {
        if (validCoordinates(x, y)) {
            getBoard()[x][y] = false;
        }
    }

    @Override
    public int getNumberOfLivingNeighbours(int x, int y) {

        int totalLiving = 0;

        //loop through all cells surrounding the cell coords that was passed in as an argument
        //validate to make sure that the cells exist on the board and aren't out of bounds and isn't the current cell
        //if the cell is alive increase the totaLiving
        for (int i = x - 1; i <= x + 1; i++) {

            for (int z = y - 1; z <= y + 1; z++) {

                if (i == x && z == y) {
                    continue;
                }

                if (validCoordinates(i, z)) {
                    if (isAlive(i, z)) {
                        totalLiving++;
                    }
                }

            }
        }
        return totalLiving;
    }

    @Override
    public void manageCell(int x, int y, int livingNeighbours) {

        //if the cell is alive at the start find out whether it lives or dies
        if (isAlive(x, y)) {
            if (livingNeighbours < 2) {//if a cell has less than two living neighbours it dies
                turnToDead(x, y);
            } else if (livingNeighbours == 2 || livingNeighbours == 3) { //if the cell has two or three living neighbours it stays alive this turn
                turnToLiving(x, y);
            } else if (livingNeighbours > 3) { //the cell dies if it has over 3 neighbours
                turnToDead(x, y);
            }

        } else if (livingNeighbours == 3) { //if the cell is dead and has three living neighbours it becomes alive
            turnToLiving(x, y);
        }

    }

    private boolean validCoordinates(int x, int y) {
        //checks to make sure that the x and y given are within the board
        return (x >= 0 && x < super.getWidth() && y >= 0 && y < super.getHeight());
    }

}
