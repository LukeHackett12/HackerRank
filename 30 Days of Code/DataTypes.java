import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DataTypes {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        /* Declare second integer, double, and String variables. */
        int itwo = 0;
        double dtwo = 0.0;
        String stwo = "";
        /* Read and save an integer, double, and String to your variables.*/
        itwo = scan.nextInt();
        dtwo = scan.nextDouble();
        scan.nextLine();
        stwo = scan.nextLine();
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */
        System.out.println(itwo + i);
        /* Print the sum of the double variables on a new line. */
		System.out.println(dtwo + d);
        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        System.out.println(s + stwo);
        scan.close();
    }
}
