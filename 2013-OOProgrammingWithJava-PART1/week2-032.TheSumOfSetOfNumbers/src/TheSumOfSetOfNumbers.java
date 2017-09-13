
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Until what? ");
        int sum = Integer.parseInt(reader.nextLine());
        
        int x = 1;
        int y = 0;
     
        while(x <= sum)
        {
            y += x;
            x++;
            
        }
        System.out.println(y);
    }
}
