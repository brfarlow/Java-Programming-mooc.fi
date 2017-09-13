
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user.
        System.out.print("Type a number: ");
        double number = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        double number2 = Integer.parseInt(reader.nextLine());
        double sum = number / number2;
        System.out.println("Division: " + number + " / " + number2 + " = " + sum);
    }
}
