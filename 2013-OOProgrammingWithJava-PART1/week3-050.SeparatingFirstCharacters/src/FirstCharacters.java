import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type your name: ");
        
        String name = reader.nextLine();
        
        int i = 0;
        int x= 1;
        
        while(i < name.length()){
            
            if(name.length() < 3){
            break;
            }else if(i > 2){
                break;
            }
            
            System.out.println(x+"."+ " character: "+name.charAt(i));
            i++;
            x++;
            
        }
    }
}
