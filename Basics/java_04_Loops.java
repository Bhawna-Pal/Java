package Basics;
import java.util.*;
public class java_04_Loops {
    public static void main(String[] args) {

        //  while Loop


        int counter = 0;
        while (counter < 10) {
            System.out.println("Hello World");
            counter++;
        }
        System.out.println("Printed Hw 10x");

        // Print Number from 1 To 10

        int count = 1;
        while (count <= 10) {
            System.out.print(count +" ");
            count++;
    }
    System.out.println();

    // Print Number from 1 To N

    Scanner sc = new Scanner(System.in);
    int range = sc.nextInt();
    int count1 = 1;
    while (count1 <= range) {
        System.out.print(count1 + " ");
        count1++;
    }
    System.out.println();

    // Sum of n natural numbers


    int num1 = sc.nextInt();
    int sum = 0;
    int i1 = 1;
    while (i1 <= num1) {
        sum += i1;
        i1++;
    }
    System.out.println("Sum is : " + sum);

    //  For Loops
 
    for(int i2 = 1; i2 <= 10; i2++) {
        System.out.println("Hello World");
    }

    // Print Square Pattern

    for (int line = 1; line <= 4; line++) {
        System.out.println("* * * *");
    }

    // Print Reverse of a number

    int num2 = 10899;
    while (num2 > 0) {
        int lastdigit = num2 % 10;
        System.out.print(lastdigit + " ");
        num2 /= 10;      
    }
    System.out.println();

    // Reverse the number

    int num3 = 10899;
    int rev = 0;
    while (num3 > 0) {
       int  lastDigit = num3 % 10;
       rev = (rev * 10) + lastDigit;
       num3 /= 10;
    }
    System.out.println(rev);

    //  do - while Loop

    int count2 = 1;
    do {
        System.out.println("Hello World");
        count2++;
    } while (count2 <= 10);

    //  Break Statement 

    for (int i3 = 1; i3 < 5; i3++) {
        if(i3 == 3){
        break;
        }
        System.out.println(i3);
    }
    System.out.println("I am the out of loop");

    // Keep entering numbers till user enter a multiple of 10

    do{
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        if (n % 10 == 0) {
            System.out.println("I am out of loop");
            break;
        }
        System.out.println(n);
    } while(true);


    //  continue statements

    for (int i4 = 1; i4 <= 5 ; i4++) {
        if (i4 == 3) {
            continue;
        }
        System.out.println(i4);
    }

          
    //    Display all numbers entered by user except multiples of 10 

    do {
        System.out.print("Enter Your Number : ");
        int n2 = sc.nextInt();
        if (n2 % 10 == 0) {
            continue;
        }
        System.out.println("Number was " + n2);
    } while(true);  
    
     // check if a number is prime or not


//     int pNumber = sc.nextInt();
//     // int pNumber = 7; 
//     if (pNumber == 2) {
//         System.out.println("N is prime");
//     } else{

//     boolean isPrime = true;
//     for(int i5 = 2; i5 <= Math.sqrt(pNumber); i5++) {
//     if (pNumber % i5 == 0) {
//         isPrime = false;
//     }
//     }


//     if (isPrime == true) {
//         System.out.println("N is Prime");
//     } else {
//         System.out.println("N is not Prime");
//     }
// }

    
 
}
}

