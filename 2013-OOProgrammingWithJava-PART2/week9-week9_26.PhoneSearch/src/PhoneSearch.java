
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Xorfos
 */
public class PhoneSearch {

    private Map<String, List<String>> phoneNumbers;
    private Map<String, List<String>> addresses;

    public PhoneSearch() {

        this.phoneNumbers = new HashMap<String, List<String>>();
        this.addresses = new HashMap<String, List<String>>();
    }

    public void addPhoneNumber(String person, String phoneNumber) {

        //add a phone number to an existing person
        //otherwise create a new entry and then add the phone number to that new entry
        if (this.phoneNumbers.containsKey(person)) {
            this.phoneNumbers.get(person).add(phoneNumber);
        } else {
            this.phoneNumbers.put(person, new ArrayList<String>());
            this.phoneNumbers.get(person).add(phoneNumber);
        }

    }

    public void findNumberByPerson(String person) {

        //if the person exists we loop through all their phone numbers and output them
        if (this.phoneNumbers.containsKey(person)) {

            for (String number : this.phoneNumbers.get(person)) {
                System.out.println(number);
            }
        } else {
            System.out.println("not found");
        }

    }

    public void findPersonByNumber(String number) {

        String person = "";

        //loop through all phone number entries
        for (Map.Entry<String, List<String>> entry : this.phoneNumbers.entrySet()) {

            List<String> numbers = entry.getValue();
            //if the number exists in the entry then find the person it belongs
            if (numbers.contains(number)) {
                person = entry.getKey();
            }

        }

        //if we found no one, then the person is not found, otherwise say who the person is
        if (person.isEmpty()) {
            System.out.println("not found");
        } else {
            System.out.println(person);
        }

    }

    public void addAddress(String person, String address) {

        //do the same thing we did in addPhoneNumber but for addresses
        if (this.addresses.containsKey(person)) {
            this.addresses.get(person).add(address);
        } else {
            this.addresses.put(person, new ArrayList<String>());
            this.addresses.get(person).add(address);
        }

    }

    public void findAddressByPerson(String person) {

        if (this.addresses.containsKey(person)) {

            for (String address : this.addresses.get(person)) {
                System.out.println(address);
            }
        } else {
            System.out.println("not found");
        }
    }

    public void delete(String person) {

        this.phoneNumbers.remove(person);
        this.addresses.remove(person);

    }

    public void filteredListing(String keyword) {

        Set<String> personList = new TreeSet<String>();

        if (keyword.isEmpty()) {

            for (Map.Entry<String, List<String>> entry : this.addresses.entrySet()) {

                personList.add(entry.getKey());
            }

        } else {

            for (Map.Entry<String, List<String>> entry : this.addresses.entrySet()) {

                List<String> addresses = entry.getValue();
                String person = entry.getKey();

                for (String address : addresses) {
                    if (address.contains(keyword)) {
                        personList.add(person);
                    }
                    
                }
                if (person.contains(keyword)) {
                    personList.add(person);
                }

            }
            
            for (Map.Entry<String, List<String>> entry : this.phoneNumbers.entrySet()) {

                List<String> phoneNumbers = entry.getValue();
                String person = entry.getKey();

                for (String phoneNumber : phoneNumbers) {
                    if (phoneNumber.contains(keyword)) {
                        personList.add(person);
                    }
                    
                }
                if (person.contains(keyword)) {
                    personList.add(person);
                }

            }

        }

        for (String person : personList) {
            System.out.println(person);
            System.out.print("address: ");
            this.findAddressByPerson(person);
            System.out.println("phone numbers: ");
            this.findNumberByPerson(person);
            System.out.println("");
        }

    }

}
