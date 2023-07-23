package Java_Stdin_Stdout_II_JAVA3;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("================================");
            for (int i = 0; i < 2; i++) //i.e i++ ~ i+=1 ; 0 1 2 3 4; loop in five times
            {
                // i-- similar to i-=1 or any digit; i-- keeps looping for infinity
                // String and int will loop five times; 0 1 2 3 4
                String s1 = sc.next();
                int x = sc.nextInt();
                System.out.printf("%-15s%03d %n", s1, x); //%-15s%03d %n"
            }
            System.out.println("================================");
        } catch (Exception e) {

        }
        /*finally {
            System.out.println("Exception noticed");
        }*/

    }
}