import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        String str[]=new String[testCases];
        for (int i =0;i<testCases;i++){
            str[i] =  scan.next();
            
        }
        for(int i=0;i<testCases;i++){
            String even ="",odd="";
            for(int j=0;j<str[i].length();j++){
                
                if (j%2==0){ even += str[i].charAt(j);}
                else{ odd += str[i].charAt(j);}
            }
            System.out.println(even+" "+odd);
        }
    }
}