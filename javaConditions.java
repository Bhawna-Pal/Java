import java.util.*;
public class javaConditions {
    public static void main(String[] args) {

        //  if - else conditions
        
        int age = 22;
         if(age >= 18){
            // System.out.println("adult: drive, voting");
         }
         if (age > 13 && age < 18) {
            // System.out.println("teenager");
            
         }
         else{
            // System.out.println("Not adult");
         }

        //  Largest of 2 Numbers

        int A = 1;
        int B = 5;
        if (A >= B) {
            // System.out.println("A is Largest of 2");
    }
    else {
        // System.out.println("B is Largest of 2");
    }

    // Number is Even or Odd 

     Scanner sc = new Scanner(System.in);
    //  int number =  sc.nextInt();

    //  if (number % 2 == 0) {
        // System.out.println("Number is Even");
// } else {
    // System.out.println("Number is Odd");
// }
     
    //  else - if conditions

    int Age = 13;
    if (Age >= 18) {
        // System.out.println("Adult");
    }
    else if (Age >= 13 && Age <18) {
        // System.out.println("Teenager");
    }
    else {
        // System.out.println("Child");
    }

    // Income Tax Calculator

    // int income = sc.nextInt();
    int tax;

    // if (income < 500000) {
    tax = 0;
    // }
    // else if (income >= 500000 && income < 1000000) {
        // tax = (int) (income * 0.2);
    // }
    // else {
        // tax = (int) (income * 0.3);
    // }
    // System.out.println("Your tax is :" + tax);

    // Largest of 3 Numbers

    int a = 10, b = 3, c = 6;
    if ((a >= b) && (a >= c)) {
        // System.out.println("Largest of A");
    }
    else if (b >= c) {
    // System.out.println("Largest of B");
    }
    else {
        // System.out.println("Largest of C");
    }

    //  Ternary Operator

    int x = 45;
    String type = ((x % 2 == 0) ? "even" : "odd");

    // System.out.println(type);

    // Check if a student is pass or fail

    int marks = 45;
    String result = ((marks >=33) ? "Pass" : "Fail"); 
    // System.out.println(result);

    // Switch Conditions

    int y = 2;
    // switch (y) {
    //     case 1 : System.out.println("samosa");
    //     break;
    //     case 2 : System.out.println("burger");
    //     break;
    //     case 3 : System.out.println("mango shake");
    //     break;
    //     default : System.out.println("we realize we are dreaming");
    // }

    //  Calculator
    System.out.println("Enter num1 : ");
    int num1 = sc.nextInt();
    System.out.println("Enter num2 : ");
    int num2 = sc.nextInt();
    System.out.println("Enter operator : ");
    char operator = sc.next().charAt(0);

    switch (operator) {
        case '+': System.out.println(num1 + num2);
        break;
        case '-': System.out.println(num1 - num2);
        break;
        case '*': System.out.println(num1 * num2);
        break;
        case '/': System.out.println(num1 / num2);
        break;
        case '%': System.out.println(num1 % num2);
        default: System.out.println("Wrong Operator");
            
    }
}
}