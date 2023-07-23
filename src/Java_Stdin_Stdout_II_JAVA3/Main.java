package Java_Stdin_Stdout_II_JAVA3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

     try {


         Scanner sc = new Scanner(System.in);
         // sc.nextLine(); // String is usually above; and not allowed in between and below; this is required to next to String
         String s = sc.nextLine();
         double y = sc.nextDouble();
         int x = sc.nextInt();

         System.out.println("String: " + s);
         System.out.println("Double: " + y);
         System.out.println("Int: " + x);

          }
     catch (Exception e){

     }
     finally {
         System.out.println("Exception recognized");

     }

    }
}

