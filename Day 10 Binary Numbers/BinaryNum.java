import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        scanner.close();
        int num = n;
        long  res = 0;
        while(num>0){
            int rem = num %2;
            res= res *10+rem;
            num=num/2;
        }
        //System.out.println("res="+res);
        int max =0;
       List<Integer> arr = new ArrayList<Integer>(); 
       String s = "";
        while(res>0){

            long dig = res %10;

            if (dig ==1){
                s+=dig;

            } else {
                arr.add(s.length());
                s="";
            }
            if ((res/10==0))
              arr.add(s.length());  
            
            
           res=res/10; 
        }

        System.out.println(Collections.max(arr));
    }
}
