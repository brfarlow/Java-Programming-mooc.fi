
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        
        int x = 0;
        int y = 0;
        
        while (x <= number){
            
            int result = (int)Math.pow(2, x);
            y += result;
            x++;
            
        }
        System.out.println(y);
    }
}
