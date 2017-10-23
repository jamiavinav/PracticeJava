package avinav.practice;

/*
 * Initially, there is a Robot at position (0, 0). Given a sequence of its moves,
 *  judge if this robot makes a circle, 
 *  which means it moves back to the original place.
 *  The move sequence is represented by a string. 
 *  And each move is represent by a character.
 *  The valid robot moves are R (Right), L (Left), U (Up) and D (down). 
 *  The output should be true or false representing 
 *  whether the robot makes a circle.

    Example 1:
    Input: "UD"
    Output: true

    Example 2:
    Input: "LL"
    Output: false
 */
public class JudgeRouteCircle {
    public static void main(String[] args) {
        String input = "URDL";
        System.out.println("Input: " + input 
                + "\nOutput: " + judgeCircle(input) );
    }
    
    public static boolean judgeCircle(String moves) {
        // Start at 0,0
        int x = 0;
        int y = 0;
        char[] movesArr = moves.toCharArray();
        
        for (int i=0; i<movesArr.length; i++) {
            // For U = x + 0, y + 1
            // For D = x + 0, y -1
            // For R = x + 1, y + 0
            // For L = x + 0, y-1
            if (movesArr[i] == 'U' || movesArr[i] == 'u') {
                y++;
            } else if (movesArr[i] == 'D' || movesArr[i] == 'd') {
                y--;
            } else if (movesArr[i] == 'R' || movesArr[i] == 'r') {
                x++;
            } else if (movesArr[i] == 'L' || movesArr[i] == 'l') {
                x--;
            } else {
                return false;
            }
        }

        if (x==0 && y==0) {
            return true;
        }
        return false;
    }
}
