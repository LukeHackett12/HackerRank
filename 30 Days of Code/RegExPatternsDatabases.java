import java.io.*;
import java.util.regex.*;
import java.util.Scanner;
import java.util.Arrays;

public class RegExPatternsDatabases {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String regEx = "@gmail.com";
        Pattern gmail = Pattern.compile(regEx);

        int n = input.nextInt();
        String[] names = new String[n];
        for(int i = 0; i < n; i++){
            String name = input.next();
            String email = input.next();
            Matcher user = gmail.matcher(email);
            if(user.find()){
                names[i] = name;
            }
            else {
                names[i] = "null";
            }
        }

        Arrays.sort(names);
        for(int i = 0; i < n; i++){
            if(names[i] != "null"){
                System.out.println(names[i]);
            }
        }
    }
}
