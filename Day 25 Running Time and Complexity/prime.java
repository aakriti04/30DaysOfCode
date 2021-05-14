import java.io.*;
import java.util.*;

public class Solution { 
    
    public static void isPrime(int ele){
        boolean prime = true;
        if (ele==1){
            prime=false;
        }else{
        for(int i =2;i<(int)(Math.sqrt(ele)+1);i++){
            if(ele%i==0){
                
                prime= false;
                break;
            }
            
        }
        }
        if (prime) 
           System.out.println("Prime");
        else
            System.out.println("Not prime");
    }



    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        int arr [] = new int[T];
        int index = 0;
        while(T-->0){
            arr[index]=sc.nextInt();
            index++;
        }
        for (int i =0;i<index;i++){
            isPrime(arr[i]);
            //System.out.println(arr[i]);
        }
}
}
