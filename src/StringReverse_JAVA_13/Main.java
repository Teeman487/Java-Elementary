package StringReverse_JAVA_13;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            String A=sc.next();
            String R = new StringBuilder(A).reverse().toString();  // System.out.println(R); // ade = eda
            //StringBuilder(A) creates a string Builder with the string A.
            //reverse() is used to reverse the string A.
            //toString() method is used to convert it into a string representation of an object.

            if(A.equals(R))
                System.out.println("Yes");
            else System.out.println("No");
        }
    }
