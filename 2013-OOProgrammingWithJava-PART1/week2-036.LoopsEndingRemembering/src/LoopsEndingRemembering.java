import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        
        int x = 0;
        int y = 0;
        double average = 0;
        int even = 0;
        int odd = 0;
        
        while(true){
            System.out.print("Type numbers: ");
            int number = Integer.parseInt(reader.nextLine());
            
            
            if(number == -1){
                System.out.println("Thank you and see you later!");
                break;
            }
            
            if(number%2 == 0){
                even++;
            }else{
                odd++;
            }
            
            y++;
            x += number;
            average = (double)x/y;
            
                    
        }

        System.out.println("The sum is "+ x);
        System.out.println("How many numbers: " + y);
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}
