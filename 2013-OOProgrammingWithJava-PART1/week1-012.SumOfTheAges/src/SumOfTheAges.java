
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        System.out.print("Type your age: ");
        int age = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type your name: ");
        String name2 = reader.nextLine();
        System.out.print("Type your age: ");
        int age2 = Integer.parseInt(reader.nextLine());
        
        int ageTotal = age + age2;
        System.out.println(name + " and " + name2 + " are " + ageTotal + " years old in total.");
    }
}
