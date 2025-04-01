import java.util.*;
public class java_06_Functions {
    public static void printHelloWorld() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }
    //   sum of two number function
    public static int calculateSum(int num1, int num2) { // parameter or formal parameter
        int sum = num1 + num2;
        return sum;
    }

    public static void swap(int a, int b) {
         //  swap  function
         int temp = a;
         a = b;
         b = temp;
         System.out.println("a = " + a);
         System.out.println("b = " + b);
    }
    //  product of two number function
    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

       //  Factorial of a number function
       public static int factorial(int n) {
        int f = 1;
      for(int i = 1; i<=n; i++) {
        f  = f * i;
      }
    return f;
    }

    //  Binomial coefficient function
    public static int binCoef(int k, int r) {
        int fact_k = factorial(k);
        int fact_r = factorial(r);
        int fact_nmr = factorial(k-r);
        int binCoef = fact_k / (fact_r * fact_nmr);
        return binCoef;
    }
    //  function Overloading using parameter

    // function to calculate of 2 number   
    public static int sum(int a, int b) {
     return a + b;   
    }

    // function to calculate of 3 number
    public static int sum(int a, int b, int c) {
        return a+ b + c ;
    }

    // function overloading using data types

    // function to calculate sum of two integer number 
     
    public static int Sum (int p, int q) {
        return p + q;
    }

    // function to calculate sum of float number
    public static Float Sum (float p, float q) {
        return p + q;
    }
    public static void main(String[] args) {
       // printHelloWorld();
         
       Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        //  int sum = calculateSum(a, b);  // arguments or actual parameter
        // System.out.println("sum is : " + sum);
    

        // swap - values exchanges
        int a = 5;
        int b = 10;
        swap(a, b);

        int a1 = 3;
        int b1 = 5;
        int prod = multiply(a1, b1);
        System.out.println("Product is : " + prod);
        prod = multiply(10, 20);
        // System.out.println("Product is : " + prod);

        
        //  Factorial of a number
        //    System.out.println(factorial(7));

        //    Binomial Coefficient
        System.out.println(binCoef(5, 2));
        
        // function Overloading using parameters 
        //   System.out.println(sum(3, 5));
        //   System.out.println(sum(5, 2, 1));

        //  function overloading using with datatypes
        System.out.println(Sum(5, 6));
        System.out.println(Sum(5.3f, 6.6f));
        sc.close();
    }
}
