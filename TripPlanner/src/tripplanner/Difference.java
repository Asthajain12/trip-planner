
package tripplanner;

import java.util.*;
public class Difference {
    double distance;
    int time;
    public void time_diff(){
        Scanner scan = new Scanner(System.in);
        System.out.println("what is time difference, in hours betwwen your home and destination?");
        time = scan.nextInt();
        System.out.println("that means when it is midnight at home it will be "+time+":00pm in your travel destination");
        time=time+12;
        System.out.println("and when it is noon at home it will be"+time+":00");
        System.out.println("*********");
    }
    public void distance(){
        Scanner scan=new Scanner(System.in);
        System.out.println("what is square area of your destination country in km?");
        distance =scan.nextDouble();
        distance=distance*1.60;
        System.out.println("total distance in mile is "+distance+"miles");
    }
}
