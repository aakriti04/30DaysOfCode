import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        List <String> names= new ArrayList<>();
        IntStream.range(0, N).forEach(NItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                String firstName = firstMultipleInput[0];

                String emailID = firstMultipleInput[1];
                Pattern p = Pattern.compile("@(.*)");
                Matcher m = p.matcher(emailID);
                if(m.find()){
                    String s = m.group(1);;
                    if (s.equals("gmail.com")){
                        names.add(firstName);
                    }
                }
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        Collections.sort(names);
        for (String name: names){
            System.out.println(name);
        }
        bufferedReader.close();
    }
}
