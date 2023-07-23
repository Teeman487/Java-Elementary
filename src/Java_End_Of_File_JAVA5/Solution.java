package Java_End_Of_File_JAVA5;

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int lines = 1;  // init

        while (true) // check 1 is true
        {
            String line = input.nextLine(); // the scanner is effective here
            System.out.println(lines + " " + line);
            lines++; //  then new line =1
            if (input.hasNext()) // if (next input does not end)-line increases with it;if (lines>)
            {
                break;
            }
        }
        input.close();
    }
}