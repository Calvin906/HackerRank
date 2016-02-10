import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SherlockAndSquares {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int numTest = sc.nextInt();
          for (int i = 0; i < numTest; i++) {
            int rangeStart = sc.nextInt();
            int rangeEnd = sc.nextInt();
            int count = 0;
            for (int j = rangeStart; j <= rangeEnd; j++) {
                long sqrt = (long) (Math.sqrt(j));
                Math.floor(sqrt);
                sqrt = sqrt * sqrt;
                if ((sqrt) == j) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}