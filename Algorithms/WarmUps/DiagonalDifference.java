import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DiagonalDifference {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sumRTL = 0;
        int sumLTR = 0;
        int a[][] = new int[n][n];
        for(int i=0; i < n; i++){
            for(int j=0; j < n; j++){
                int num = in.nextInt();
                
                if(i==j) {
                    sumRTL += num;
                }
                if(i+j == (n-1)) {
                    sumLTR += num;
                }
                
                
            }
        }
        System.out.println(Math.abs(sumRTL - sumLTR));
    }
}