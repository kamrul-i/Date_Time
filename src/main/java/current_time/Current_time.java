package current_time;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Current_time {

    public static void main(String[] args) {

        LocalTime time = LocalTime.now();
        System.out.println("Current Time is : " + time);

        DateTimeFormatter formmatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        String Formatted = time.format(formmatter);
        System.out.println("Current Time is : " + Formatted);
    }
}
