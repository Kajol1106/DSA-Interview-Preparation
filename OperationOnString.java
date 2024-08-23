import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str =  br.readLine();            // Reading input from STDIN
        
        String res = str.trim();
        //1st case
        System.out.println(res);
        //2nd case
        System.out.println(res.length());
        //3rd case
        System.out.println(res.charAt(0)+" "+res.charAt(res.length()-1));
        //4th case
        if (res != null && !res.isEmpty()) {
            for (int i = 0; i < res.length(); i++) {
                System.out.print(res.charAt(i) + " ");
            }
            System.out.println();
        }
        //5th case
        System.out.println(res.length()-1);
        //6th case
        System.out.println(res.toUpperCase());
    }
}