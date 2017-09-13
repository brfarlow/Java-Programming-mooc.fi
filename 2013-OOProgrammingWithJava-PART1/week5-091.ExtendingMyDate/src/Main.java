
public class Main {

    public static void main(String[] args) {
        // test your code here
        
        MyDate myDate = new MyDate(30, 10, 2000);
        MyDate myDate2 = new MyDate(30, 12, 2000);
        MyDate myDate3 = new MyDate(1, 1, 2000);
        
        myDate.advance(30);
        myDate2.advance(34);
        myDate3.advance();
        
        System.out.println(myDate.toString());
        System.out.println(myDate2.toString());
        System.out.println(myDate3.toString());
        
        MyDate day = new MyDate(25, 2, 2011);
    MyDate newDate = day.afterNumberOfDays(7);
    for (int i = 1; i <= 7; ++i) {
        System.out.println("Friday after  " + i + " weeks is " + newDate);
        newDate = newDate.afterNumberOfDays(7);
    }
    System.out.println("This week's Friday is " + day);
    System.out.println("The date 790 days from this week's Friday is  " + day.afterNumberOfDays(790));
        
    }
}
