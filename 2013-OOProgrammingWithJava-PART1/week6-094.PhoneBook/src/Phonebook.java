
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Xorfos
 */
public class Phonebook {
    
    private ArrayList<Person> persons;
    
    
    public Phonebook(){
        
        this.persons = new ArrayList<Person>();
    }
    
    public void add(String name, String number){
        
        Person newPerson = new Person(name, number);        
        persons.add(newPerson);
              
    }
    
    public void printAll(){
        
        for(Person person : persons){
            
            System.out.println(person.toString());
        }
        
    }
    
    
    public String searchNumber(String name){
        
        String number = "number not known";
        
        for(Person person : persons){
            
            if(person.getName().equals(name)){
                number = person.getNumber();
            }
            
        }
        
        
        return number;
    }
}
