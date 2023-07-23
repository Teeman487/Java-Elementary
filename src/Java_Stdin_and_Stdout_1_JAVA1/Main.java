package Java_Stdin_and_Stdout_1_JAVA1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {


        Scanner sc = new Scanner(System.in);
        String d = sc.nextLine();// prefferable we have String scanner above ints
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        }
        //System.out.println(a);
        //System.out.println(b);
       // System.out.println(c);
        //System.out.println(d);

        catch (Exception e){ // Exception catches all types of exception for possible errors

        }
        finally {
            System.out.println("After inserting String; Exception was found in variable c");
            System.out.println();
        }


    }
    }
