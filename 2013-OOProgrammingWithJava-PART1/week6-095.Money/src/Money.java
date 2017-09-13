
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added){
        
        Money sum = new Money(this.euros()+added.euros(),this.cents()+added.cents());
        
        return sum;
    }
    
    public boolean less(Money compared){
        
        if(this.euros()<compared.euros()){
            
            return true;
        }else if(this.cents()<compared.cents() && this.euros()==compared.euros()){
            
            return true;
        }
        
        return false;
    }
    
    public Money minus(Money decremented){
        
        int euroDiff = euros - decremented.euros();
        int centDiff = cents - decremented.cents();
 
        if (centDiff < 0) {
            centDiff += 100;
            euroDiff--;
        }
 
        if (euroDiff < 0) {
            return new Money(0, 0);
        }
 
        return new Money(euroDiff, centDiff);
    }
    
}
