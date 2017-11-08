package avinav.practice;

import java.io.BufferedReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

class Parent {
    protected static int count = 0;
    public Parent() {
        count++;
    }
     static int getCount() {
         return count;
     }
}
public class Chile extends Parent { 
    public Chile() {
        count++;
    }
    static int total = 10;
    
    public static void main(String[] args) {
        System.out.println("Count " + getCount());
        Chile o = new Chile();
        System.out.println("count " + getCount());
        List<String> list = Arrays.asList("d", "o", "g");
         
        System.out.println();
        YearMonth  y1 = YearMonth.of(2015, Month.SEPTEMBER);
        YearMonth y2 = YearMonth.of(2016, Month.FEBRUARY);
        //System.out.println(y2.un(y1));    
        Float f = new Float(23.43);
        //Double d = new Double("17.46d");
        int total = 5;
        //System.out.println(this.total);
        try {
            Date d = new SimpleDateFormat("yyyy-mm-dd").parse("2016-09-09");
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Path p = Paths.get("mytext.");
        String s = new String("blah");
        //s.ind
        //List<Long> l = new ArrayList<Integer>();
       // BufferedReader reader = Files.newBufferedReader(p, Charset.defaultCharset());
    }

}
