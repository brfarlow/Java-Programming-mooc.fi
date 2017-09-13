
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
    
    private Scanner reader = new Scanner(System.in);
    private Dictionary dictionary = new Dictionary();
    
    
    public TextUserInterface(Scanner reader, Dictionary dictionary){
        
        this.reader = reader;
        this.dictionary = dictionary;
        
    }
    
    public void start(){
    
        System.out.println("Statement: ");
        System.out.println("add - adds a word pair to the dictionary");
        System.out.println("translate - asks a word and prints its translation");
        System.out.println("quit - quit the text user interface");
        
        while(true){
            System.out.print("Statement: ");
            String input = reader.nextLine();
            System.out.println("");
            
            if(input.equals("quit")){
                System.out.println("Cheers!");
                break;
            }
            else if(input.equals("add")){
                
                System.out.print("In Finnish: ");
                String finnish = reader.nextLine();
                System.out.print("Translation: ");
                String translation = reader.nextLine();
                
                this.dictionary.add(finnish, translation);
                        
            }
            else if(input.equals("translate")){
                
                System.out.print("Give a word: ");
                String translate = reader.nextLine();
                
                System.out.println(this.dictionary.translate(translate));
                
                
            }
            else{
                System.out.println("Unknown statement");
            }
            
            
        }
        
        
    }
    
    
    
}
