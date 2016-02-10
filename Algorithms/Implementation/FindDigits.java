import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FindDigits {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int tmp = n;
            int count = 0;
            int[] a = new int[n];
            int i = 0;
            while(n != 0) {
                
                 a[i] =  n%10;
                
                if( a[i] != 0 && tmp % a[i] == 0) {
                   count++; 
                }
                n/=10;
                i++;
            }
            System.out.println(count);
            
        }
    }
}