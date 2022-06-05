import java.util.Scanner;
import java.util.*;
import java.io.*;

public class prac16{
    public static void main(String arg[]){
        Set<String> hSet = new HashSet<String>();
        try{
            File file = new File(arg[0]);
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()){
                for(String i : sc.nextLine().split(" ")) hSet.add(i);
            }
            sc.close();
        } catch (Exception e){
            System.out.println("error occurred : ");
            System.out.println(e);
        }
        
        System.out.println("Words : ");
        for(String k : hSet) System.out.print(k+" ");

        System.out.println();

    }
}