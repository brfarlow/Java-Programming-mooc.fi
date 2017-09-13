
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        Scanner input = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();
        
        while(true){
        
            
            System.out.print("name: ");
            String name = input.nextLine();
            
            if(name.isEmpty()){
                break;
            }
            
            System.out.print("studentnumber: ");
            String studentNumber = input.nextLine();
            
            Student student = new Student(name, studentNumber);
            list.add(student);
        
 
    }
    
        for(Student stud : list){
            
            System.out.println(stud.toString());
        }
        
        
        
        System.out.print("Give search term: ");
        String search = input.nextLine();
        
        for(Student stud : list){
        
            
            
            if(stud.getName().contains(search)){
                System.out.println("Result: ");
                System.out.println(stud.toString());
                
            }
            
    }
        
        
        
    }
}