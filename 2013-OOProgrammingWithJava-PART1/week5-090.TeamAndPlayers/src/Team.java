
import java.util.ArrayList;

   
public class Team {
    
    private String name;
    private ArrayList<Player> players;
    private int maxSize;
    
    
    public Team(String name){
        
        this.name = name;
        players = new ArrayList();
        this.maxSize = 16;
    }
    
    public String getName(){
        
        return this.name;
    }
    
    public void addPlayer(Player player){
        
        
        //only add players if smaller than max team size
        if(this.size() < this.maxSize){
            this.players.add(player);
        }
        
        
    }
    
    public void printPlayers(){
        String allPlayers ="";
        
        for(Player player : this.players ){
            allPlayers += "  " + player.getName() + ",goals "+player.goals()+"\n";
        }
        
        System.out.print(allPlayers);
    }
    
    public void setMaxSize(int maxSize){
        
        this.maxSize = maxSize;
    }
    
    public int size(){
        
        return players.size();
    }
    
    public int goals(){
        
        int totalGoals = 0;
        
        for(Player player : this.players){
            
            totalGoals += player.goals();
        }
        
        
        return totalGoals;
    }
    
}
