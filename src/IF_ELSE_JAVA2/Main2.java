package IF_ELSE_JAVA2;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String ans = null;  // attribute
        if(n%4==1)ans = "Weird"; // String ans refers to Weird
        else
        {
            if(n>=2 && n<=5)ans = "Not Weird";
            else if(n>=5 && n<=20)ans="Really Weird";
            else {} ans = "Not Applicable";
        }
        System.out.println(ans);

    }
}
