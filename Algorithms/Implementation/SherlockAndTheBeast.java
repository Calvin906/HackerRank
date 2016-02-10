import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SherlockAndTheBeast {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            StringBuilder b = new StringBuilder();
            int j = 0;
            for(int i = n; i > 0; i--) {
                if(i%3 ==0 && (n-i)%5 == 0) {
                    for(j = 0; j < i; j++) {
                        b.append("5");
                    }
                    for(int k = j; k < n; k++) {
                        b.append("3");
                    }
                    break;
                }
            }
            if(b.length()== 0 && n %5 == 0) {
                for(int k = n ; k > 0; k--) {
                    b.append("3");
                }
            } else if(b.length() == 0) {
                b.append(-1);
            }
            System.out.println(b);
        }
    }
}

