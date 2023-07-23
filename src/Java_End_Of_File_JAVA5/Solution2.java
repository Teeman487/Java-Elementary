package Java_End_Of_File_JAVA5;

import java.util.Scanner;

public class Solution2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line_num = 0; // init
        while(sc.hasNext())  // check condition is true
            System.out.println(++line_num + " " + sc.nextLine()); // ++line_num=1  nextLine(s)
       // sc.close();

    }
}