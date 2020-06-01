
package tripplanner;
import java.util.*;

public class Helper {
    String name,place,currency;
    double money,money_in_USD,symbol_rate;
    int days;
   // Scanner scan = new Scanner(System.in);
    public void greeting(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome To Vacation Planner!");
        System.out.print("What is your name?");
        name = scan.nextLine();
        System.out.print("Nice to Meet you "+name+",where are you Travelling to?");
        place =scan.nextLine();
        System.out.println("Great! "+place+" is Sounds like a Great place");
        System.out.println("***********");
    }
    public void travelling_time_budget(){
        Scanner scan = new Scanner(System.in);
        System.out.print("How many days are they going to spend in their destination?");
        days = scan.nextInt();
        System.out.print("How much money,in USD,are you planning to spend on your trip?");
        money_in_USD = scan.nextDouble();
        System.out.print("what is three letter currency symbol for your travel destination?");
         currency=scan.next();
       // System.out.println(currency);
        System.out.print("how many "+currency+" are there in USD?");
        symbol_rate = scan.nextDouble();
    }
    public void output(){
        System.out.println("if you are travelling for "+days+" days that is the same as "+days*24+"hours or "+days*24*60+"minutes");
        System.out.println("if you are going to spend $"+money_in_USD+" USD that means per day you can spend up to $"+money_in_USD/days+"USD");
        System.out.println("your total budget in "+currency+" is "+money_in_USD*symbol_rate+currency+", which per day is a "+money_in_USD*symbol_rate/days+currency);
        System.out.println("***********");
    }
}
