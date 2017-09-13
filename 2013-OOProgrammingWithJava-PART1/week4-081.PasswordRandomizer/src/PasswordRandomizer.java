import java.util.Random;
import java.util.ArrayList;

public class PasswordRandomizer {
    // Define the variables
    private int value;
    private Random random = new Random();
    private String password = "";
    private String tempPass = "";
    private final int length;
   
    public PasswordRandomizer(int length) {  
            this.length = length;
            this.value = this.random.nextInt(26);
            this.password += "abcdefghijklmnopqrstuvwxyz".charAt(value);
       
       
    }
       
    public String createPassword() {
        // write code that returns a randomized password
            for (int i = 0; i < this.length; i++) {
                this.value = this.random.nextInt(26);
                this.tempPass += "abcdefghijklmnopqrstuvwxyz".charAt(value);
            }
            this.password = this.tempPass;
            this.tempPass = "";
            return this.password;
   
    }
    
}
