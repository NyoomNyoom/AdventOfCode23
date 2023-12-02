import java.util.*;
import java.lang.*;
import java.io.*;

public class Day1 {
    public char findFirstNum(String[] listIn, String line) {
        String tempString = "";
        char output = '0';

        int num = 0;

        for (String number : listIn) {
            num++;

            for (int i = 0; i < line.length(); i++) {
                if (number.charAt(0) == line.charAt(i)) {
                    if (Character.isDigit(line.charAt(i))) {
                        output = line.charAt(i);
                    }

                    if (number.charAt(1) == line.charAt(i + 1)) {
                        output = (char) num;
                    }
                }
            }
        }

        return 'f';
    }

    public boolean findLastNum(String[] listIn, String line) {

        return false;
    }

    public boolean findNumber(String[] listIn, String line) {
        return false;
    }

    public static void main(String[] args) {
        int sum = 0;
        int lineNum = 0;

        String[] numberList = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        try {
            Scanner sc = new Scanner(new File("A:/Coding/AdventOfCode23/Day 1 Trebuchet/input.txt"));
            while (sc.hasNextLine()) {
                char firstNum = '0';
                char lastNum = '0';
                int numFound = 0;

                lineNum++;
                System.out.println("Line: " + lineNum);

                String line = sc.nextLine();

                for (int i = 0; i < line.length(); i++) {
                    char c = line.charAt(i);
                    if (Character.isDigit(c) || ) {
                        if (numFound == 0) {
                            firstNum = c;
                            numFound++;
                        } else {
                            lastNum = c;
                            numFound++;
                        }
                    }
                    if (numFound == 1) {
                        lastNum = firstNum;
                    }
                }
                System.out.println("FirstNum: " + firstNum);
                System.out.println("LastNum: " + lastNum);

                String s = "" + firstNum + lastNum;

                sum += Integer.parseInt(s);

                System.out.println("Sum: " + s);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e);
        }

        System.out.println("Sum: " + sum);
    }
}