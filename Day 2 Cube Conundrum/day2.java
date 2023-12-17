import java.io.*;
import java.util.*;

public class day2 {

    public static int[] informationGather(String line) {
        int numRed = 0;
        int numBlue = 0;
        int numGreen = 0;

        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == 'r') {
                if (line.charAt(i + 1) == 'e') {
                    if (line.charAt(i + 2) == 'd') { // added a check for d here because the substrin 're' is in the
                                                     // string 'green'.
                        numRed = line.charAt(i - 2) + '0';
                    }
                }
            } else if (line.charAt(i) == 'g') {
                if (line.charAt(i) == 'r') {
                    numGreen = line.charAt(i - 2) + '0';
                }
            } else if (line.charAt(i) == 'b') {
                if (line.charAt(i) == 'l') {
                    numBlue = line.charAt(i - 2) + '0';
                }
            }
        }

        int[] output = { numRed, numBlue, numGreen };
        return output;
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("A:/Coding/AdventOfCode23/Day 2 Cube Conundrum/input.txt"));

            while (sc.hasNextLine()) {

            }
        } catch (FileNotFoundException e) {

        }
    }
}
