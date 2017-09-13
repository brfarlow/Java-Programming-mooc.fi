/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Xorfos
 */
public class WordInspection {
    
    private File file;
    private Scanner reader;
    
    public WordInspection(File file){
        this.file = file;
    }
    
    public int wordCount() throws FileNotFoundException{
        
        int count = 0;
        this.reader = new Scanner(file, "UTF-8");
        
        while(reader.hasNextLine()){
            reader.nextLine();
            count++;
        }
        
        return count;
    }
    
    public List<String> wordsContainingZ() throws FileNotFoundException{
        
        List<String> words = new ArrayList<String>();
        this.reader = new Scanner(file, "UTF-8");
        
        while(reader.hasNextLine()){
            
            String string = reader.nextLine();
            if(string.contains("z")){
                words.add(string);
            }
            
        }
        
        
        return words;
    }
    
    public List<String> wordsEndingInL() throws FileNotFoundException{
        
        List<String> words = new ArrayList<String>();
        this.reader = new Scanner(file, "UTF-8");
        
        while(reader.hasNextLine()){
            
            String string = reader.nextLine();
            
            if(string.length() > 0){
                
                if(string.substring(string.length()-1).contains("l")){
                    words.add(string);
                }    
                
            }
            
            
        }
       
        return words;
    }
    
    public List<String> palindromes() throws FileNotFoundException{
        List<String> words = new ArrayList<String>();
        this.reader = new Scanner(file, "UTF-8");
        
        while(reader.hasNextLine()){
            
            String string = reader.nextLine();
            String reverse = new StringBuilder(string).reverse().toString();
            if(string.equals(reverse)){
                words.add(string);
            }
            
        }
      
        return words;
    }
    
    public List<String> wordsWhichContainAllVowels() throws FileNotFoundException{
        
        List<String> words = new ArrayList<String>();
        this.reader = new Scanner(file, "UTF-8");
        
        while(reader.hasNextLine()){
            
            String string = reader.nextLine();
            
            if(string.contains("a") && string.contains("e") && string.contains("i") && string.contains("o") && string.contains("u") && string.contains("y")
                    && string.contains("ä") && string.contains("ö")){
                words.add(string); 
            }
            
        }
        
        return words;
    }
    
}
