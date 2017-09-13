package boxes;

public class Thing {

    private String name;
    private int weight;

    public Thing(String name, int weight) throws IllegalArgumentException {

        if(weight < 0){
            throw new IllegalArgumentException("Weight must be 0 or greater");
        }
        
        this.name = name;
        this.weight = weight;
    }

    public Thing(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        final Thing other = (Thing) obj;
        if (this.name == null || !this.name.equals(other.name)) {
            return false;
        }
        
        return true;
    }

    @Override
    public int hashCode(){
        if(this.name == null){
            return 42;
        }
        return this.name.hashCode();
    }
}
