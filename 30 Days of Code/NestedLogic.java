import java.io.*;
import java.util.*;

public class NestedLogic {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int[] dateReturned = new int[3];
        for(int i = 0; i < 3; i++){
            dateReturned[i] = input.nextInt();
        }
        int[] dateExpected = new int[3];
        for(int i = 0; i < 3; i++){
            dateExpected[i] = input.nextInt();
        }

        int fine = 0;
        if(dateReturned[2] >= dateExpected[2]){
            if(dateReturned[2] != dateExpected[2]){
                fine = 10000;
            }
            else if(dateReturned[1] >= dateExpected[1]){
                if(dateReturned[1] != dateExpected[1]){
                    fine = Math.abs(dateReturned[1] - dateExpected[1]) * 500;
                }
                else {
                    if(dateReturned[0] != dateExpected[0]){
                        fine = Math.abs(dateReturned[0] - dateExpected[0]) * 15;
                    }
                }
            }
        }
        /*
        difference[0] *= 15;
        difference[1] *= 31 * 15;
        difference[2] *= 12 * 31 * 15;
        */
        System.out.println(fine);
    }
}
