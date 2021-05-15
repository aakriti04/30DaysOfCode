import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int[] dates = new int[2];
        int []months =  new int[2];
        int []years =new int[2];
        int inp=0;
        while(sc.hasNextLine()){
           String s = sc.nextLine();
           dates[inp]=Integer.parseInt(s.split(" ")[0]);
           months[inp]=Integer.parseInt(s.split(" ")[1]);
           years[inp]=Integer.parseInt(s.split(" ")[2]);
           inp++;
        }
        int returnDate = dates[0], dueDate =dates[1];
        int returnMonth =months[0], dueMonth = months[1];
        int returnYear =years[0], dueYear = years[1];
        int fine = 0;
        if(returnYear> dueYear){
            fine=10000;
            
        } else if (returnYear==dueYear) {
            if ((returnMonth<=dueMonth) && (returnDate>dueDate)){
                fine = 15 *(returnDate-dueDate);
            } else if ((returnMonth>dueMonth)) {
                fine = 500 *(returnMonth-dueMonth);
            }
        }
        System.out.println(fine);
    }
}