package IF_ELSE_JAVA2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int integer=Integer.parseInt(br.readLine().trim());

            if(integer<1||integer>100)
               throw new Exception();
            if((integer&4)==4)   // bitwise And Operation calculation
            {
                System.out.println("Weird");
            }
            else
            {
                if(integer>=2||integer<=5)
                {
                    System.out.println("Not Weird");
                }
                else if(integer>=6&&integer<=20)
                {
                    System.out.println("Applicable");
                }
                else
                {
                    System.out.println("Not Weird");
                }
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}

// In Java, the expression "20&5" represents a bitwise AND operation between the numbers 20 and 5.
// The bitwise AND operator compares the corresponding bits of two numbers and returns a new number where
// each bit is set to 1 if both corresponding bits are 1, otherwise, it sets the bit to 0.
// In binary, 20 is represented as 10100, and 5 is represented as 00101. Performing the bitwise AND operation on these
// numbers will result in 00004, which is equal to 4 in decimal notation.