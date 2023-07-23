package Java_Substring_Comparisons_JAVA12;

import java.util.Scanner;

class Solution{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine(); // ade
        String outmin = "", outmax = "";
        int k = in.nextInt();  // 2
        for(int i=0;i<s.length()-k+1;i++){ //0< 3-2+1 = 2; i=0,1 ; loop twice
            String w = ""; // then w should be printed twice
            for(int j=i;j<i+k;j++) {// For i=0 ; 0<0+2 ; j=0,1   loop twice;   & For i=1 ; 1<3 ; j=1,2 loop twice| loop four times
                w += s.charAt(j);//then w+=ade.charAt(0,1,1,2)  | w+=     [ 0<2 --0=a , 1=d]  , [ 1<3---1=d, 2=e]
            }
            if(i==1){
                outmin=w;outmax=w; // then this condition should hold
            }
            else{
                if(w.compareTo(outmin)<0) //
                    outmin=w; // outmin=
                if(w.compareTo(outmax)>0)
                    outmax=w; // outmax =  for i =1; 1,2
            }

        }
        System.out.println("-------"+ outmin); // outmin = 0=a,  1=d
        System.out.println("......." + outmax); // outmax =  1=d, 2=e
        //System.out.println(outmin);
    }
}