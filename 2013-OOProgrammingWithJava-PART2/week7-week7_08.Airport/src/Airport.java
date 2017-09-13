import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
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
public class Airport {
    
    private Scanner reader;
    private HashMap<String, Integer> airplanes = new HashMap<String,Integer>();
    private ArrayList<String> flights = new ArrayList<String>();
    
    public Airport(){
        
        this.reader = new Scanner(System.in);
    }

    
    
    public void printPlane(String ID){
        
       
        if(this.airplanes.containsKey(ID)){
            
            System.out.print(ID+" ("+this.airplanes.get(ID)+" ppl)");
        }
        
        
    }
    
    public void printAirplanes(){
        
        for(Map.Entry<String, Integer> entry : this.airplanes.entrySet()){
            
            String key = entry.getKey();
            Integer value = entry.getValue();
            
            System.out.println(key+" ("+value+" ppl)");
            
        }
        
        
    }
    
    public void printFlights(){
        
        for(String flight : this.flights){
            
            System.out.println(flight);
        }
        
    }
    
    
    public void startAirport(){
        
        //start the airport panel
        airportPanel();
        //start the flight services
        flightService();
          
              
    }
    
    
    public void airportPanel(){
        
        System.out.println("Airport panel");
        System.out.println("--------------------\n");        
        
        
        while(true){
            
            System.out.println("Choose operation: ");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            String input = reader.nextLine();
            
            if(input.equals("1")){
                //add an airplane to the airport
                System.out.print("Give plane ID: ");
                String planeID = reader.nextLine();
                
                System.out.print("Give plane capacity: ");
                int planeCapacity = Integer.parseInt(reader.nextLine());
                
                airplanes.put(planeID, planeCapacity);    
                System.out.println("");
            }
            else if(input.equals("2")){
                //add a flight to the airport
                System.out.print("Give plane ID: ");
                String planeID = reader.nextLine();
                
                    if(this.airplanes.containsKey(planeID)){
                        
                        System.out.print("Give departure airport code: ");
                        String depCode = reader.nextLine();
                        
                        System.out.print("Give destination airport code: ");
                        String desCode = reader.nextLine();
                        
                        this.flights.add(planeID+" ("+this.airplanes.get(planeID)+" ppl)"+" ("+depCode+"-"+desCode+")");
                        
                    }
                System.out.println("");
                
            }
            else if(input.equals("x")){
                //quit the airport panel
                System.out.println("");
                break;
            }        
        }   
    }
    
    
    public void flightService(){
        
        System.out.println("Flight service");
        System.out.println("--------------------\n");        
        
        
        while(true){
            
            System.out.println("Choose operation: ");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");
            String input = reader.nextLine();
            
            if(input.equals("1")){
                //displays all planes
               
                this.printAirplanes();
                System.out.println("");
                
            }
            else if(input.equals("2")){
                //displays all flights
                this.printFlights();
                System.out.println("");
                
            }
            else if(input.equals("3")){
               
               System.out.print("Give plane ID: ");
               String plane = reader.nextLine();
               this.printPlane(plane);
                System.out.println("");
                
            }
            else if(input.equals("x")){
                //quits the program
                
                break;
            }        
        }
        
        
    }
    
    
    
}