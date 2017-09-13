import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        // write code here
        String reverse = reverse(text);
        
        return reverse.equals(text);
    }
    
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
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
