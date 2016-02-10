import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AVeryBigSum {

    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        int end;
        long sum;
        sum = 0;
        end =  in.nextInt();
        for(int i = 0; i < end; i++) {
            sum += in.nextLong();
            
        }
        System.out.println(sum);
        
    }
}