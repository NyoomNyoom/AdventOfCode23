import java.util.*;
import java.lang.*;
import java.io.*;

public class Day1 {
    public char findFirstNum(String[] listIn, String line) {
        for(int i = 0; i < line.length(); i++){

            for (String number : listIn) {
                if(line.charAt(i) == number.charAt(0)){
                    if(Character.isDigit(line.charAt(i))) {
                        return line.charAt(i);
                    }
                }

                try{
                    if(line.charAt(i) == number.charAt(0)){
                        if(line.charAt(i+1) == number.charAt(1)){
                            int num  = 0;
                            
                            for(String answer : listIn){
                                num++;
                                if(answer.equals(number)){
                                    return(char)(num + '0');
                                }
                            }
                        }
                    }
                } catch (StringIndexOutOfBoundsException e) {
                    //catching the end evauluation to move to next char in input line.
                }
            }
        }

        return '0';
    }

    public char findLastNum(String[] listIn, String line) {
        
        return '0';
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