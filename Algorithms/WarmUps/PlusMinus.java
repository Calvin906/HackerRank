import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PlusMinus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double pos = 0; double zero = 0; double neg = 0;
        int arr[] = new int[n];
        for(int i=0; i < n; i++){
            int num = in.nextInt();
           if(num > 0 ) {
               pos++;
           } 
           else if(num == 0) {
              zero++; 
           }
           else {
               neg++;
           }
        }
        System.out.printf("%.6f\n%.6f\n%.6f", pos/n, neg/n, zero/n);
    }
}