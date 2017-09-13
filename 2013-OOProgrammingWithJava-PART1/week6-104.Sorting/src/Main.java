
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // write testcode here
        int[] values = {8, 3, 7, 9, 1, 2, 4};
sort(values);
    }

    
    public static int smallest (int[] array){
        
        int smallest = array[0];
        
        for(int value : array){
            
            if(value < smallest){
                smallest = value;
            }
            
        }
        
        return smallest;
    }
    
    
    public static int indexOfTheSmallest(int [] array){
    
    int index = 0;
    int smallest = array[0];
    
    for(int value = 0; value < array.length;value++){
        
        if(smallest > array[value]){
            smallest = array[value];
            index = value;
        }
        
    }
    
    return index;
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index){
        
        int startingFrom = index;
    int smallest = array[index];

    
    for(int value = index; value < array.length;value++){
        
        if(smallest > array[value]){
            smallest = array[value];
            startingFrom = value;
        }
        
    }
    
    return startingFrom;
        
    }
    
    public static void swap(int[] array, int index1, int index2){
        
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        
    }
    
    public static void sort(int[] array){
        

        for(int i = 0;i<array.length;i++){
            
            System.out.println( Arrays.toString(array) );
            int smallestIndex = indexOfTheSmallestStartingFrom(array,i);
            swap(array, i, smallestIndex);
        }
        
        
    }
    
}