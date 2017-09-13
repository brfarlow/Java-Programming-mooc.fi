
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string
        int i = 0;
        int a = text.length();
        String character = "";
        String reverse = "";
        while(i < a){
            
            character = text.substring(a-i-1, a-i);
            reverse = reverse+character;
            
            i++;
          
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
