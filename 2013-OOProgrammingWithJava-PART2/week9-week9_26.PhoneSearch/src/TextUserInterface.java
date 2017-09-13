
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
    private PhoneSearch database;

    public TextUserInterface() {

        this.database = new PhoneSearch();
    }

    public void phoneSearch() {

        //list out all available commands on their own line
        System.out.println("phone search");
        System.out.println("available operations:");
        System.out.println("1 add a number");
        System.out.println("2 search for a number");
        System.out.println("3 search for a person by phone number");
        System.out.println("4 add an address");
        System.out.println("5 search for personal information");
        System.out.println("6 delete personal information");
        System.out.println("7 filtered listing");
        System.out.println("x quit");

        //begin a loop to accept input and perform functions until the user quits
        this.reader = new Scanner(System.in);

        while (true) {

            System.out.println("");
            System.out.print("command: ");
            String command = reader.nextLine();

            //switch statement not supported for strings so lots of if else if
            if (command.equals("1")) {
                this.addNumber();
                
            } else if (command.equals("2")) {
                this.searchForNumber();

            } else if (command.equals("3")) {
                this.searchForPersonByNumber();

            } else if (command.equals("4")) {
                this.addAddress();

            } else if (command.equals("5")) {
                this.searchPersonalInfo();

            } else if (command.equals("6")) {
                this.delete();

            } else if (command.equals("7")) {
                this.filteredListing();
                
            } else if (command.equals("x")) {
                break;
            }

        }
    }

    private void addNumber() {
        System.out.print("whose number: ");
        String person = reader.nextLine();
        System.out.print("number: ");
        String number = reader.nextLine();

        this.database.addPhoneNumber(person, number);

    }

    private void searchForNumber() {
        System.out.print("whose number: ");
        String person = reader.nextLine();

        this.database.findNumberByPerson(person);
    }

    private void searchForPersonByNumber() {
        System.out.print("number: ");
        String number = reader.nextLine();

        this.database.findPersonByNumber(number);
    }

    private void addAddress() {
        System.out.print("whose address: ");
        String person = reader.nextLine();
        System.out.print("street: ");
        String street = reader.nextLine();
        System.out.print("city: ");
        String city = reader.nextLine();
        
        this.database.addAddress(person, street + " " + city);
    }

    private void searchPersonalInfo() {
        System.out.print("whose information: ");
        String person = reader.nextLine();
        System.out.print("address: ");
        this.database.findAddressByPerson(person);
        System.out.println("phone numbers: ");
        this.database.findNumberByPerson(person);
        
    }

    private void delete() {
        System.out.print("whose information: ");
        String person = reader.nextLine();
        this.database.delete(person);
    }

    private void filteredListing() {
        System.out.print("keyword (if empty, all listed: ");
        String keyword = reader.nextLine();
        this.database.filteredListing(keyword);
    }
    
    

}
