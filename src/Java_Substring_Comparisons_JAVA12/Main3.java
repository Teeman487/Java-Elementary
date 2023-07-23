package Java_Substring_Comparisons_JAVA12;

import java.util.Arrays;
import java.util.Scanner;

public class Main3 {


    public static String getSmallestAndLargest(String s, int k) {
        // instantiate
        String[] substrings = new String[s.length() - k + 1];
        //          arr

        for (int i = 0; i <= s.length() - k; i++) { // 0<=1
            // Add a substring of length 'k' to our array
            substrings[i] =  s.substring(i, i + k); // substrings[0, 1] = ade.substring(0, 2)
        }

        // Sort array
        Arrays.sort(substrings);

        // Set first and last elements as smallest and largest
        String smallest = substrings[0];
        String largest = substrings[substrings.length - 1];

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}

