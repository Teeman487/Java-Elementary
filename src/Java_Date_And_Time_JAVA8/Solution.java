package Java_Date_And_Time_JAVA8;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        String input_date = day + "/" + month + "/" + year;

        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy"); // instantiated
        try
        {
            DateFormat format2 = new SimpleDateFormat("E"); //instatiated
            String final_day = format2.format(format1.parse(input_date));//
           //String varName = new SimpleDateFormat().format(new SimpleDateFormat().parse(""));
            System.out.println(final_day.toUpperCase());
        }
        catch(Exception e){}
    }
}
