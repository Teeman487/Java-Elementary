package Java_Strings_Introduction_JAVA10;

public class Main4 {


    public static String capitalizeFirstLetter(String original) {
        if (original == null || original.length() == 0) {
            return original;
        }
        return original.substring(0, 1).toUpperCase() + original.substring(1);
       // or //else{ return original.substring(0, 1).toUpperCase() + original.substring(1);}
    }
}
class Main5{
    public static void main(String[] args) {

        //instantiating Main4

        System.out.println(Main4.capitalizeFirstLetter(null));



    }



}