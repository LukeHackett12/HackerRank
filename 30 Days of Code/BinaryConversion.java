import java.io.*;
import java.util.*;

public class BinaryConversion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> binaryNum = new ArrayList<Integer>();

        while(n > 0){
            int remainder = n % 2;
            n = n/2;

            binaryNum.add(remainder);
        }

        int countConsecutive[] = {binaryNum.size()};

        for(int i = 0; i < binaryNum.size()-1; i++){
            for(int j = 0; j < binaryNum.size()-1; j++){
                if(binaryNum.get(i) == binaryNum.get(i+1) && binaryNum.get(i) == 1){
                    countConsecutive[i] += 1;
                }
            }
        }

        System.out.println(countConsecutive);
    }
}
