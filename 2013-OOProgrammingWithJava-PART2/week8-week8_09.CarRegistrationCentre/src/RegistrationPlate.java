
public class RegistrationPlate {
    // don't change the code which is already given to you

    // ATTENTION: the object variable types are final, meaning that their value cannot be changed!
    private final String regCode;
    private final String country;

    public RegistrationPlate(String country, String regCode) {
        this.regCode = regCode;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + regCode;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + (this.regCode != null ? this.regCode.hashCode() : 0);
        hash = 31 * hash + (this.country != null ? this.country.hashCode() : 0);
        return hash;
    }
    
    @Override
    public boolean equals(Object object){
      
        if(object == null){
            return false;
        }
        
        if(getClass() != object.getClass()){
            return false;
        }
        RegistrationPlate compared = (RegistrationPlate) object;
        
        if(this.regCode.equals(compared.regCode) && this.country.equals(compared.country)){
            
            return true;
        }
        
        return false;
    }

}