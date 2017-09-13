
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        String name = reader.nextLine();
        
        int i = 0;
        int x= 1;
        
        while(i < name.length()){
            
            
            
            System.out.println(x+"."+ " character: "+name.charAt(i));
            i++;
            x++;
            
        }
    }
}
