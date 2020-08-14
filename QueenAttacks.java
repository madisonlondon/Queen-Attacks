// Madison London

import java.io.*; 
import java.util.*; 

public class QueenAttacks { 
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String queen = s.nextLine(); // Read input from STDIN
        StringTokenizer foo = new StringTokenizer(queen);
        int queenX = Integer.parseInt(foo.nextToken());
        int queenY = Integer.parseInt(foo.nextToken());
        String oppponent = s.nextLine(); // Read input from STDIN
        foo = new StringTokenizer(oppponent);
        int oppX = Integer.parseInt(foo.nextToken());
        int oppY = Integer.parseInt(foo.nextToken());

        boolean canAttack = false; 
        // Check if the queen and opponent piece are in the same row 
        if(queenX == oppX) {
            canAttack = true; 
        }
        // Check if the queen and opponent piece are in the same column 
        else if(queenY == oppY) {
            canAttack = true; 
        }
        // Check if the queen and opponent piece are on the same diagonal 
        else if(Math.abs(queenX - oppX) == Math.abs(queenY - oppY)) {
            canAttack = true; 
        }

        if(canAttack) {
            System.out.print("Yes");
        }
        else { 
            System.out.print("No");
        }
    }
}