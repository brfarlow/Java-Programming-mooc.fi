
public class Main {

    public static void main(String[] args) {
        // Test your code here
        
        NightSky sky = new NightSky(0.1,40,10);
        
        sky.print();
        System.out.println("Number of stars: " + sky.starsInLastPrint());
        
        sky.print();
        System.out.println("Number of stars: " + sky.starsInLastPrint());
    }
}
