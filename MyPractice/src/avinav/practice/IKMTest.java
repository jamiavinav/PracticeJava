package avinav.practice;

import java.io.BufferedReader;
import java.io.FileReader;

public class IKMTest {

    private static int count;
    static {
        System.out.println("In block 1");
        count = 10;
    }
    
    private int[] data;
    {
        System.out.println("In block 2");
        data = new int[count];
        for (int i=0; i<count; i++) {
            data[i] = i;
        }
          
    }
    
    public static void main(String[] args) { 
        System.out.println("Count = " +count);
        System.out.println("Before 1");
        IKMTest test1 = new IKMTest();
        System.out.println("Before 2");
        IKMTest test2 = new IKMTest();
        
        boolean b = false;
        System.out.println((b = true) ? "true" : "false");
    }
}
