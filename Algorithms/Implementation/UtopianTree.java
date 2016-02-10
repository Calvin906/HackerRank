import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class UtopianTree {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            boolean isSpring = true;
            int h = 1;
            for(int i = 0; i < n; i++) {
                if(isSpring) {
                    h *= 2;
                    isSpring = false;
                } else {
                    h += 1;
                    isSpring = true;
                }
            }
            System.out.println(h);
            
        }
    }
}

