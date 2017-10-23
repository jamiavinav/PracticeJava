package avinav.practice;

/*
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
Given two integers x and y, calculate the Hamming distance.
Note:
0 ≤ x, y < 231.
 */
public class HammingDistance {
    public static void main(String[] args) {
        System.out.println("hammingDistance: " + hammingDistance(1,4));
    }

    public static int hammingDistance(int x, int y) {
        // Convert the two integers to strings 
        // Convert the strings to binary numbers
        String xString = Integer.toBinaryString(x);
        char[] xBinary = xString.toCharArray();
        String yString = Integer.toBinaryString(y);
        char[] yBinary = yString.toCharArray();
        
        int hammingDistance = 0;

        // Convert the smaller binary array to be same sized as the larger
        char[] largerArr = (xBinary.length > yBinary.length) ?
                xBinary: yBinary;
        char[] shorterArr = (xBinary.length > yBinary.length) ?
                yBinary: xBinary;
        char[] secondArr = new char[largerArr.length];
        
        // For smallerArr, fill in preceding zeroes
        for (int i=0; i<(largerArr.length - shorterArr.length); i++) {
            secondArr[i] = '0';
        }
        for (int i=(largerArr.length - shorterArr.length), j=0; i<secondArr.length; i++, j++) {
            secondArr[i] = shorterArr[j];
        }
        // Compare element by element and increment hammingDistance
        for (int i=0; i<largerArr.length; i++) {
            if (largerArr[i] != secondArr[i]) {
                hammingDistance++;
            }
        }
        System.out.println("x: " + xString);
        System.out.println("y: " + yString);
        return hammingDistance;
    }

}
