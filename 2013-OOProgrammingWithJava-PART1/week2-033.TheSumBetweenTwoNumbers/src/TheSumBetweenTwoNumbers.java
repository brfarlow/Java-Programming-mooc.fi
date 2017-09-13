
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("First: ");
        int first = Integer.parseInt(reader.nextLine());
        System.out.print("Second: ");
        int second = Integer.parseInt(reader.nextLine());
        
        int x = 0;
        
        while(first <= second){
            x += first;
            first++;
        }
        System.out.println(x);
    }
}
