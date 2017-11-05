import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> binaryNum = new ArrayList<Integer>();

        while(n > 0){
            int remainder = n % 2;
            n = n/2;

            binaryNum.add(remainder);
        }

        int countConsecutive = 0;
        int maxConsecutive = 0;

        for(int i = 0; i < binaryNum.size(); i++){
            if(binaryNum.get(i) == 1){
                countConsecutive += 1;
                maxConsecutive = Math.max(maxConsecutive, countConsecutive);
            } else {
                countConsecutive = 0;
            }
        }

        System.out.println(maxConsecutive);
    }
}
