
import java.util.Scanner;

public class AgeCheck {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("How old are you? ");
        int x = Integer.parseInt(reader.nextLine());
        
        if(x >= 0 && x <= 120){
            System.out.println("OK");
        }else{
            System.out.println("Impossible!");
        }
    }
}
