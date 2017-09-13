
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write test code here
        Scanner reader = new Scanner(System.in);
        System.out.print("Give a string: ");
        String string = reader.nextLine();

        System.out.println(clockTime(string));
    }

    public static boolean isAWeekDay(String string) {

        if (string.matches("mon|tue|wed|thu|fri|sat|sun")) {
            return true;
        }

        return false;
    }

    public static boolean allVowels(String string) {

        if (string.matches("(a|i|e|o|u|ä|ö)+")) {
            return true;
        }

        return false;
    }

    public static boolean clockTime(String string) {

        if (string.matches("[0-9]{2}:[0-9]{2}:[0-9]{2}")) {

            String[] parts = string.split(":");
            Integer hh = Integer.parseInt(parts[0]);
            Integer mm = Integer.parseInt(parts[1]);
            Integer ss = Integer.parseInt(parts[2]);
            
            if(hh == 24){
                if(mm > 0 || ss > 0){
                    return false;
                }
            }

            if (hh <= 24 && mm <= 60 && ss <= 60) {
                return true;
            }
        }

        return false;
    }
}
