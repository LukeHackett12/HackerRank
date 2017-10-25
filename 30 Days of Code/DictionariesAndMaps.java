//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class DictionariesAndMaps{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String, Integer> phoneMaps= new HashMap<String,Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneMaps.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(phoneMaps.containsKey(s))
                System.out.println(s + "=" + phoneMaps.get(s));
            else if(s != "")
                System.out.println("Not found");
        }
        in.close();
    }
}
