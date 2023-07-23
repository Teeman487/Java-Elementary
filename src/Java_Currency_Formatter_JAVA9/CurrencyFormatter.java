package Java_Currency_Formatter_JAVA9;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            double payment = scanner.nextDouble();
           // scanner.close();

            // creating country currency
            NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
            NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
            NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
            NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
            NumberFormat nigeriaFormat = NumberFormat.getCurrencyInstance(new Locale("en","Nig"));
           // NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(Locale.N);

            // country currency payment
            String us = usFormat.format(payment);
            String india = indiaFormat.format(payment);
            String china = chinaFormat.format(payment);
            String france = franceFormat.format(payment);
            String nigeria = nigeriaFormat.format(payment);
            System.out.println("US: " + us);
            System.out.println("India: " + india);
            System.out.println("China: " + china);
            System.out.println("France: " + france);
            System.out.println("Nigeria: " + nigeria);
        }
    }