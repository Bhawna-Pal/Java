package Basics;
import java.util.*;
public class java_01_Basics {
    public static void main(String args[] ) {
        // output 
        System.out.println("Hello World");
         
        // Variable 
        int a = 10;
        int b = 20;
        System.out.println(a);
        System.out.println(b);
        String name = "Bhawna Pal";
        System.out.println(name);
        

        // Data Types

        byte c = 8;
        System.out.println(c);
        char ch = 'a';    //char
        System.out.println(ch); 
        int n = 5;    // int
        System.out.println(n);
        boolean var = true;  // boolean
        float price = 2;     // float 
        System.out.println(var);
        System.out.println(price);

        // long 
        // double
        // short

        // Sum of x and y

        int x = 5;
        int y = 10;
        int sum = x + y;
        System.out.println(sum);

        // Input 

        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(input);

        String anotherName = sc.nextLine();
        System.out.println(anotherName);

        int number = sc.nextInt();
        System.out.println(number);

        // Sum of two number (Input from User)

         int num1 = sc.nextInt();
         int num2 = sc.nextInt();
          int Sum = num1 + num2;
          System.out.println(Sum);

        int product = num1 * num2;
        System.out.println(product);

        // Area of a Circle

        float radius = sc.nextInt();
        float area = 3.14f * radius * radius;
        System.out.println(area);
        sc.close();
}
}