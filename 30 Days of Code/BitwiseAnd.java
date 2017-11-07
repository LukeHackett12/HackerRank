import java.io.*;
import java.util.*;

public class BitwiseAnd {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int i = 0; i < t; i++){
            int n = input.nextInt();
            int k = input.nextInt();
            int maxAnd = 0;
            for(int j = 1; j < n; j++){
                for(int p = j + 1; p <= n; p++){
                    int and = j & p;
                    if(and >= maxAnd && and < k)
                        maxAnd = and;
                }
            }
            System.out.println(maxAnd);
        }
    }
}
