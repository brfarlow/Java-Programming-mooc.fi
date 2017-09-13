
public class NumberStatistics {
    
    private int amountOfNumbers;
    private int sum;

    public NumberStatistics() {
        // initialize here the object variable amountOfNumbers
    }

    public void addNumber(int number) {
        // code here
        this.sum+= number;
        this.amountOfNumbers++;
    }

    public int amountOfNumbers() {
        // code here
        
        return this.amountOfNumbers;
    }
    
    public int sum(){
        
        return sum;
    }
    
    public double average(){
        
        if(amountOfNumbers > 0)
            return (double)sum/amountOfNumbers;
        
        return 0;
    }
    
    
}
