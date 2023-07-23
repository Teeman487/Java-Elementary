package Java_Int_To_String_JAVA7;

import java.util.Scanner;

public class ConvertIntToString {
    public static void main (String[] args) throws Exception
        {
            Scanner sc = new Scanner(System.in);

            // your code goes here
            //int number = -782;
            int number = sc.nextInt();
            String numberAsString = Integer.toString(number);// String varName = Integer.toString();
            System.out.println("Result is=== " + numberAsString);
        }

}
