package Strings;
import java.util.*;

import java.util.Scanner;

public class strings {
public static void printLetters(String str) {
    for(int i=0; i<str.length(); i++) {
        System.out.print(str.charAt(i) + " ");
    }
    System.out.println();
}

    public static void main(String[] args) {
        // char arr[] = {'a', 'b', 'c', 'd'};
        // String str = "abcd";
        // String str2 = new String("xyz");
        
        //Strings are IMMUTABLE 

        // Scanner sc = new Scanner(System.in);
        // String name; 
        //  name = sc.nextLine();
        //  System.out.println(name);

        //  String fulName = "Bhawna Pal";
        //  System.out.println(fulName.length());

        //   concatenation
        
         String firstName = "Bhawna";
         String lastName = "Pal";
         String fullName = firstName + " " + lastName;
        //  System.out.println(fullName.charAt(1));
         printLetters(fullName);
    }
}
