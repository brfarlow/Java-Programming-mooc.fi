
import java.io.File;
import java.io.FileNotFoundException;
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
public class Printer {
    
    private Scanner reader;
    private File fileName;
    
    public Printer(String fileName) throws Exception{
        this.fileName = new File(fileName);
    }
    
    public void printLinesWhichContain(String word) throws FileNotFoundException{

        this.reader = new Scanner(this.fileName);
        String string = "";
        
        if(word.isEmpty()){
            
            while(this.reader.hasNextLine()){
                
                String line = reader.nextLine();
                string += line;
                string += "\n";
                
            }
        }else{
            
            while(this.reader.hasNextLine()){
                
                String line = this.reader.nextLine();
                if(line.contains(word)){
                    string += line;
                    string += "\n";
                
                }
            
            }
        }
        
        
        System.out.print(string);
        
    }
}
