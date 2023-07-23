package Java_Substring_Comparisons_JAVA12;

import java.util.Scanner;

public class Main5 {


    public class Solution {


        public static String getSmallestAndLargest(String s, int k) {
            String substring = s.substring(0, k); // substring of ade(0,2) = ad
            String smallest = substring; // =ad
            String largest = substring;  // =ad

            for (int i = 1; i <= s.length() - k; i++) {
                // Create a substring of length 'k'
                substring = s.substring(i, i + k);
                //ad      = ade.substring(1, 1+2)

                // If current substring is lexicographically smaller than 'smallest'
                if (substring.compareTo(smallest) < 0) {
                    smallest = substring;
                }

                // If current substring is lexicographically larger than 'largest'
                if (substring.compareTo(largest) > 0) {
                    largest = substring;
                }
            }

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
}
