
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Xorfos
 */
public class TextUserInterface {
    
    private Scanner reader;
    private Participants participants;
    
    public TextUserInterface(){
        
        this.participants = new Participants();
        this.reader = new Scanner(System.in);
    }
    
    public void start(){
        
        //start the program and add some skiers to the participant's list.
            System.out.println("Kumpula ski jumping week\n");
            System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
            
            
            while(true){
  
                System.out.println("  Participant name: ");                
                String participant = reader.nextLine();
                if(participant.isEmpty()){
                    break;
                }
                Skier skier = new Skier(participant);
                this.participants.addParticipants(skier);
            }
            
            System.out.println("");
            System.out.println("The tournament begins!\n");           
            
            //begin the jumping phase
            int round = 1;
            while(true){
                System.out.print("Write \"jump\" to jump; otherwise you quit: ");
                String input = reader.nextLine();
                if(input.equals("jump")){
                    System.out.println("");
                    System.out.println("Round: "+round);
                    System.out.println("");
                    participants.sort();
                    participants.reverse();
                    System.out.println("Jumping order:");
                    participants.printOrder();
                    System.out.println("");
                    System.out.println("Results of round "+ round);
                    participants.play();
                    System.out.println("");
                    round++;
                }else{
                    System.out.println("");
                    System.out.println("Thanks!\n");
                    break;
                }
            }
            
            
            //print out the results
            participants.sort();
            System.out.println("Tournament results: ");
            participants.printResults();
            
            
    }
    
    
    
}
