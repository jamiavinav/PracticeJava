package avinav.practice;

import java.util.*;

public class NumberConverter {
    public static void main(String []args) {
        NumberConverter testObject = new NumberConverter();
        long number = testObject.stringToLong("234561");
        System.out.println("Test 1 Result: " + number);

        number = testObject.stringToLong("-659");
        System.out.println("Test 2 Result: " + number);
      
        number = testObject.stringToLong("0");
        System.out.println("Test 3 Result: " + number);
      
        try {
            number = testObject.stringToLong("76t");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Program ends");
    }

    public long stringToLong(final String stringNumber) { 
        /* The approach is to first ensure that as you walk through the number,
        / each character is a number. If it is not, you throw back a Exception.
        / Else you use the number to increment by a factor of ten.
        */
        // Set up a numbers Map, to aid lookup
        final Map<Character, Integer> numbersMap = new HashMap<Character,Integer>();
            numbersMap.put('0', 0);
            numbersMap.put('1', 1);
            numbersMap.put('2', 2);
            numbersMap.put('3', 3);
            numbersMap.put('4', 4);
            numbersMap.put('5', 5);
            numbersMap.put('6', 6);
            numbersMap.put('7', 7);
            numbersMap.put('8', 8);
            numbersMap.put('9', 9);
            
        long longNumber = 0;
        long signOfNumber = 1;

        // Walkthrough the string, character by character
        for (int i = 0; i <= stringNumber.length() - 1; i++) { 
            char c = (char) stringNumber.charAt(i); 
            // First test for negative numbers
            if (c == '-') {
              signOfNumber = -1;
              continue;
            }
            Integer value = numbersMap.get(c);
            if (value == null) {
                throw new NumberFormatException("Character:" + c + " is not a number in string:" +stringNumber );
            }
            longNumber= longNumber*10 + value; 
        }
        return longNumber*signOfNumber; 
    }
    
    public void testHelperFunction() throws Exception {
        HashSet<Integer> hashTable = new HashSet<Integer>(); 
       
    }
}
