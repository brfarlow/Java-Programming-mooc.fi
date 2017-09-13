package validation;

public class Calculator {

    public int multiplication(int fromInteger) {

        if(fromInteger < 0){
            throw new IllegalArgumentException("The number must be greater than zero");
        }
        
        int multiplication = 1;
        for (int i = 1; i <= fromInteger; i++) {
            multiplication *= i;
        }

        return multiplication;
    }

    public int binomialCoefficient(int setSize, int subsetSize) {
        
        if(setSize < 0 || subsetSize < 0){
            throw new IllegalArgumentException("All values must be greater than zero");
        }
        if(subsetSize >= setSize){
            throw new IllegalArgumentException("The subset must be smaller than the set");
        }

        int numerator = multiplication(setSize);
        int denominator = multiplication(subsetSize) * multiplication(setSize - subsetSize);

        return numerator / denominator;
    }
}
