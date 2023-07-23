package Java_Strings_Introduction_JAVA10;

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        sc.close();

        System.out.println( A.length() + B.length() );
        System.out.println( (A.compareTo(B) > 0) ? "Yes" : "No"); // A.compareTo(B)=14
        System.out.println(
                A.substring(0,1).toUpperCase() + A.substring(1) + " " +
                       B.substring(0, 1).toUpperCase() + B.substring(1)
        );





    }
}

//A= swing
//B= sin
//A.compareTo(B) = swing.compareTo(sin) = w - i = 119 - 105 = 14 ~ Control Code Chart
// A.substring(0,1) = swing.substring(0,1) =S
// A.substring(beginIndex 1) = swing.substring(beginIndex 1) =wing
// B.substring(0,1) = sin.substring(0,1) = S
// B.substring(beginIndex 1) = sin.substring(beginIndex 1) = in