
public class Main {

    public static void main(String[] args) {
        int[] t = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(build(t));
    }

    public static String build(int[] t) {
        
        StringBuilder string = new StringBuilder();
        string.append("{\n ");
        int x = 1;
        for(int i = 0;i < t.length;i++){
            
            string.append(t[i]);
            if(i != t.length-1){
                string.append(", ");
            }
            if(x%4 == 0 && i != t.length-1){
                string.append("\n ");
            }
            x++;
        }
        
        string.append("\n}");
        return string.toString();
    }
}
