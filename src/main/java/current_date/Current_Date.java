package current_date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Current_Date {

    public static void main(String[] args) {

        //--------------------------------------------
        Date date = new Date();
        System.out.printf("Current date is : " + date);

        System.out.printf("\n\n");

        //--------------------------------------------
        Date date1 = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");

        String currentDate = dateFormat.format(date1);
        System.out.println("Current Date is : " + currentDate);

    }
}
