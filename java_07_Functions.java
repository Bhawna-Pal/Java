// import java.util.*;
public class java_07_Functions {
    // only for n >= 2
    public static boolean isPrime(int n) {
        //  corner cases
        //  1
        if(n == 2) {
            return true;
        } 

        for(int i=2; i<=n-1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // check if a number is prime or not (Optimized)

     public static boolean isprime(int n) {
        if(n == 2) {
            return true;
        }

          for(int i=2; i<= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
          }
          return true;
     }

    //   Print all primes in a Range

    public static void primeInRange(int n) {
        for(int i = 2; i <= n; i++){
            if(isprime(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
        //  Convert from Binary to Decimal

         public static void binToDec (int binNum ) {
            int myNum = binNum;
            int pow = 0;
            int decNum  = 0;

            while (binNum > 0) {
              int lastDigit = binNum % 10;
              decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
              pow++ ;
              binNum = binNum / 10;
         }
         System.out.println("decimal of " + myNum + " = " + decNum);
    }
    //  Convert from Decimal to binary
    public static void decToBin (int n) {
        int myNum = n;
        int pow = 0;
        int binNum = 0; 
        while (n > 0) {
            int rem = n % 2;
            binNum = binNum + (rem * (int)Math.pow(10, pow)) ;
            pow++ ;
            n = n / 2;
        }
        System.out.println("binary form of  " + myNum + " = " + binNum);
    }
    
    public static void main(String[] args) {
        // System.out.println(isPrime(8));

      //  optimized

        // System.out.println(isprime(8));

     //   Print all primes in a Range

        // primeInRange(20);

      //   Convert from Binary to Decimal

        // binToDec(1010);

        // Convert from Decimal to binary
        decToBin(15);
    }
}