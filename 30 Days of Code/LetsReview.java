import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LetsReview {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        for(int i = 0; i < number; i++){
            String myString = input.next();
            char[] stringToArray = myString.toCharArray();

            for(int j = 0; j < myString.length(); j++){
                if(j % 2 == 0)
                    System.out.print(stringToArray[j]);
            }
            System.out.print(" ");
            for(int j = 0; j < myString.length(); j++){
                if(j % 2 != 0)
                    System.out.print(stringToArray[j]);
            }

            System.out.println();
        }
    }
}
