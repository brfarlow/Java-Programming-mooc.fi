
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        // program your solution here. Do not touch the above lines!
        int guesses = 0;
        while(true){
            System.out.println("Guess a number: ");
            int number = Integer.parseInt(reader.nextLine());
            guesses++;
            
            if(number < numberDrawn){
                System.out.println("The number is greater, guesses made: " +guesses);
            }else if (number > numberDrawn){
                System.out.println("The number is lesser, guesses made: "+guesses);
            }else{
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
        }
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
