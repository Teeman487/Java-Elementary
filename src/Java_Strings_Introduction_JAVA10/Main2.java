package Java_Strings_Introduction_JAVA10;

public class Main2 {

    public static void main(String args[]) {
        String A = "StringA";
        String B = "StringB";
        int result = A.compareTo( B ); //  A-B=65-66 use int to compare String to String ; a a= 0; a b =-1 , a c = -2


        if(result>0)
            System.out.println("A is lexicographically larger than B");
        else if(result<0)
            System.out.println("A is lexicographically smaller than B");
        else
            System.out.println("A is lexicographically equal to B");
    }
}
// A negative integer if the invoking object (A) is less than the object being compared (B).
//Zero if the invoking object (A) is equal to the object being compared (B).
//A positive integer if the invoking object (A) is greater than the object being compared (B).
//If result is negative, it means that A is lexicographically smaller than B.
//If result is zero, it means that A is lexicographically equal to B.
//If result is positive, it means that A is lexicographically greater than B.