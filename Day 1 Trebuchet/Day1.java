import java.util.*;
import java.io.*;

public class Day1 {
    public static void main(String[] args){
        try{
            Scanner sc = new Scanner( new File("input.txt"));
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }catch(FileNotFoundException e){
            System.out.println("Error: " + e);
        }
    }
}