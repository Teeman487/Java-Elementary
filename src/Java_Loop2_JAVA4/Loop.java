package Java_Loop2_JAVA4;

import java.util.Scanner;

public class Loop {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t; int a ; int b ;int n ;
        t = in.nextInt();  // insert integer=== 2
        for(int i=0;i<t;i++) { // 0<2 ; 0,1 ; loop twice
            a = in.nextInt(); // 1  //2   looped twice
            b = in.nextInt(); // 2  // 3   looped twice
            n = in.nextInt(); // 3  // 4   looped twice
            for(int j =0;j<n;j++) {  // 0<3 ; 0,1,2 ; j looped thrice
                System.out.print(getValue(a,b,j)+" "); // this result will be looped thrice
            }
            System.out.println("=============");
        }
    }

    static int getValue(int a,int b, int n) {

        int sum = a;
        for(int z=n;z>=0;z--) {  // z=3; 0<=3 ; 0,1,2,3 ; looped four times
            sum = sum + ((int) Math.pow(2,z))*b;  // a + 2^z=3 * b ; where z is 3
        }

        return sum;  // sum = a + 2^z * b
    }
}