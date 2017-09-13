
import java.util.ArrayList;

public class AverageOfNumbers {

    // Copy here the method sum from previous assignment
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        
        for(int lists : list){
            sum += lists;
        }
       
        return sum;
    }
    

    public static double average(ArrayList<Integer> list) {
        // write code here
        int denominator;
        
        if(list.size() > 0){
            denominator = list.size();
        }else{
            denominator = 1;
        }
        
        
        int sumOf = sum(list);
        
        double average = (double)sumOf/denominator;
        
        return average;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + average(list));
    }
}