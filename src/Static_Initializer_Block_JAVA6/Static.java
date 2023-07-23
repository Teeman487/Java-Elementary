package Static_Initializer_Block_JAVA6;

import java.util.Scanner;

public class Static {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        int B = s.nextInt();
       int  H = s.nextInt();
       Boolean flag;

        if (B > 0 && H > 0)
            flag = true;
        else
            System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
    }



