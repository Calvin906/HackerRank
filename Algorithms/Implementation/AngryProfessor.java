import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AngryProfessor {

   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            int count = 0;
            for(int i=0; i < n; i++){
             int num = in.nextInt(); 
                if(num <= 0) {
                    count++;
                }
            }
            if(count < k ) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}