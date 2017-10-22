package avinav.practice;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import javax.management.ImmutableDescriptor;

public class HelloWorld {

    public static void main(String []args) {
        HelloWorld testObject = new HelloWorld();
        boolean result = testObject.checkUniqueCharsInString("alph");
        System.out.println(result);
    }

    public boolean checkUniqueCharsInString(final String testString) {
        if (testString == null) {
        throw new NumberFormatException();
        }
        Set<Character> characterSet = new HashSet<Character>();
        for (int i=0; i<testString.length(); i++) {
            if (characterSet.contains(testString.charAt(i))) {
                return true;
            }
            characterSet.add(testString.charAt(i));
        }
        return false;
    }
    
    public void removeDuplicates (List<Integer> listOfNumbers) { 
        // As you read each number, insert it into a hash set.
        // If the number is already in the set, remove it from the array list
         Objects.nonNull(listOfNumbers);
         Set<Integer> numberSet = new HashSet<Integer>(); 
         
         for (int i =0; i < listOfNumbers.size(); i++) {
             if (numberSet.contains(listOfNumbers.get(i))) {
                 listOfNumbers.remove(i);
              }
         }
      }
   
    
}

