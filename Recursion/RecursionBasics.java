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

    //  Check array is sorted or not
    public static boolean isSorted(int arr[], int i) {
        if(i == arr.length - 1){
            return true;
        }
        if(arr[i] > arr[i+1]) {
            return false;
        }

        return isSorted(arr, i+1);
    } 
    
    // First Occurence
    public static int firstOccurence(int arr[], int key, int i) {
     if(i == arr.length - 1){
        return  -1;
     }
        if(arr[i] == key){
            return i ;
        }
        return firstOccurence(arr, key, i+1);
    }

    //  Last occurence
    public static int lastOccurence(int arr[], int key, int i) {
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOccurence(arr, key, i+1);
            if(isFound == -1 && arr[i] == key){
                return i;
            }

            return isFound;
    }

    // print x to the power n
    public static int power(int x, int n) {
        if(n == 0){
            return 1;
        }
    //    int xnm1 = power(x, n-1);
    //    int xn = x * xnm1;
    //    return xn;
      return x * power(x, n-1);
    }
    
     // print x to the power n(optimization)
      public  static int optimizedPower(int a, int n){
        if(n == 0){
            return 1;
        }
        int halfPower = optimizedPower(a, n/2);
        int halfPowerSq = halfPower * halfPower;


        //  n is odd
        if(n % 2 != 0){
            halfPowerSq = a * halfPowerSq;
        }
        return halfPowerSq;
      }

    public static void main(String args[]) {
        int n = 10;
        // printDec(n);
        // printInc(n);
    //    System.out.println( fact(n));
    // System.out.println(calcSum(n));
    // System.out.println(Fibonacci(n));

    int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
    // System.out.println(isSorted(arr, 0));
    // System.out.println(firstOccurence(arr, 5, 0));
    // System.out.println(lastOccurence(arr, 5, 0));
    // System.out.println(power(2, 5));
    System.out.println(optimizedPower(2, 10));

    }
}