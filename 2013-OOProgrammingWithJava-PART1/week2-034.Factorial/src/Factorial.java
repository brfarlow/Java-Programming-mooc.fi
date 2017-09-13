import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        int x = Integer.parseInt(reader.nextLine());
        
        int y = 1;
        int z = 1;
        
        while(y <= x){
            
            z *= y;
            y++;
        }
        System.out.println(z);
    }
}
