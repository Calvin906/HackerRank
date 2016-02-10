import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConversion {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String time = sc.next();
        
       try {
           DateFormat input = new SimpleDateFormat("hh:mm:ssa");
           DateFormat output = new SimpleDateFormat("HH:mm:ss");
           Date date = input.parse(time);
           System.out.println(output.format(date));
       }
       catch(Exception e) {
           e.printStackTrace();
       }
    }
}