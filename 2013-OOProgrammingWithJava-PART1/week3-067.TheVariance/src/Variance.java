import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        
        for(int lists : list){
            sum += lists;
        }
       
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        
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

    public static double variance(ArrayList<Integer> list) {
        // write code here
        double average = average(list);
        int denominator = list.size()-1;
        double numerator = 0;
        for(int lists : list){
            
            numerator += (double)Math.pow((lists - average), 2);
        }
        
        double variance = (double)numerator/denominator;
        
        
        return variance;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
