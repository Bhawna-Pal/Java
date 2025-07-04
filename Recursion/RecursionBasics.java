public class RecursionBasics{ 

    // Print Number in Decreasing Order
   public static void printDec(int n) {
    if(n == 1) {
        System.out.println(n);
        return;
    }
    System.out.print(n + " ");
    printDec(n-1);
   }

//   Print Number in Increasing Order

   public static void printInc(int n) {
    if(n == 1) {
        System.out.print(n + " ");
        return;
   }
   printInc(n-1);
   System.out.print(n + " ");
}

//    Factorial Number
   public static int fact(int n) {
  if(n == 0) {
    return 1;
  }
    int fnm1 = fact(n-1);
    int fn = n * fact(n-1);
        return fn;
   }

//     Print sum of first n natural number

   public static int calcSum(int n) {
    if(n == 1 ) {
        return 1;
    }
   int Sum1 = calcSum(n-1);
   int Sn = n + Sum1;
   return Sn;
   }

//    Fibonacci number
    public static int Fibonacci(int n) {
        if(n == 0 || n == 1) {
            return n;
        }
        int fnm1 = Fibonacci(n-1);
        int fnm2 = Fibonacci(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }
    public static void main(String args[]) {
        int n = 10;
        // printDec(n);
        // printInc(n);
    //    System.out.println( fact(n));
    // System.out.println(calcSum(n));
    System.out.println(Fibonacci(n));
    }
}