import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolveMeFirst {


    static int solveMeFirst(int a, int b) {
        return a+b;
   }

   
 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int first;
        first = in.nextInt();
        int second;
        second = in.nextInt();
        int sum;
        sum = solveMeFirst(first, second);
        System.out.println(sum);
        
   }
}