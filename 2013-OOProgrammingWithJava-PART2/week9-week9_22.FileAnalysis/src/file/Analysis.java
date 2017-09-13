/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Xorfos
 */
public class Analysis {
    
    private File file;
    private Scanner reader;
    
    public Analysis(File file){
        this.file = file;
    }
    
    public int lines() throws FileNotFoundException{
        
        int lines = 0;
        this.reader = new Scanner(file);
        
        while(reader.hasNextLine()){
            this.reader.nextLine();
            lines++;
        }

        return lines;
    }
    
    public int characters() throws FileNotFoundException{
        
        int characters = 0;
        this.reader = new Scanner(file);
        
        while(reader.hasNextLine()){
            
            String string = this.reader.nextLine();
            characters++;
            for(int i = 0; i < string.length();i++){
                characters++;
            }
            
        }
          
        return characters;
    }
    
    
}
