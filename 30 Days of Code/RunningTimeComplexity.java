import java.io.*;
import java.util.*;

public class RunningTimeComplexity {
    public static boolean prime(int testNumber){
        for(int j = 2; j <= Math.sqrt(testNumber); j++){
            if(testNumber % j == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for(int i = 0; i < n; i++){
            int testNumber = input.nextInt();
            if(testNumber >= 2 && prime(testNumber))
                System.out.println("Prime");
            else
                System.out.println("Not prime");
        }
    }
}
