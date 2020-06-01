
package tripplanner;
//import java.util.*;

public class TripPlanner {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Helper help = new Helper();
        help.greeting();
        help.travelling_time_budget();
        help.output();
        Difference diff = new Difference();
        diff.time_diff();
        diff.distance();
    }
    
}
