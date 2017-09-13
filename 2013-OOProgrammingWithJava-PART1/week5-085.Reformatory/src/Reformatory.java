public class Reformatory {

    private int timesMeasured;
    
    public int weight(Person person) {
        // return the weight of the person
        this.timesMeasured++;
        return person.getWeight();
    }
    
    public void feed(Person person){
        
        //get the person's weight and increase it by 1
        int weight = person.getWeight();
        weight++;
        person.setWeight(weight);
        
    }
    
    public int totalWeightsMeasured(){
        
        return this.timesMeasured;
    }

}
