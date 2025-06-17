package BitManipulation;

class BitManipulation {

    public static void oddOrEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0) {
            // even number
            System.out.println("even number");
        } else {
            // odd number
            System.out.println("odd number");
        }
    }

    public static int getIthBit(int n, int i){
        int bitMask = 1<<i;
        if((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setIthBit(int n, int i){
        int bitMask = 1<<i;
         return n | bitMask;
    }

    public static int clearIthBit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit) {
    //     if(newBit == 0) {
    //         return clearIthBit(n, i);
    //     } else {
    //         return setIthBit(n, i);
    //     }
 
       n = clearIthBit(n, i);
       int BitMask = newBit<<i;
       return n | BitMask;
    }

    public static int clearLastBit(int n, int i) {
        int bitMask = (~0)<<i;
        return n & bitMask;
    }

    public static int clearRangeOfBits(int n, int i, int j) {
       int a = ((~0)<<(j+1));
       int b = (1<<i)-1;
       int bitMask = a | b;
       return n & bitMask;
    }

    public static boolean isPowerOfTwo(int n){
        return (n & (n-1)) == 0;
    }

    public static int countSetBits(int n) {
        int count = 0;
        while(n > 0){
            if((n&1) != 0) {
                count++;
            }
           n = n >> 1;
        }
        return count++;
    }

    public static int fastExponentiation(int a, int n){
        int ans = 1;
        while(n > 0) {
            if((n & 1) != 0) {
                ans = ans * a;
        }
        a = a * a;
        n = n>>1;
    }
    return ans;
}    
    public static void main(String[] args) {
        // Binary AND
        // System.out.println((5 & 6));
        // Binary OR
        // System.out.println((5 | 6));
        // Binary XOR
        // System.out.println((5 ^ 6));
        // Binary one's Complement
        // System.out.println((~5));
        //  Binary Left Shift
        // System.out.println((5<<2));
        //  Binary Right Shift
        // System.out.println((6>>1));

        // Check is a number id odd or even
        //  oddOrEven(3);
        //  oddOrEven(11);
        //  oddOrEven(14);
        
        //  Get Ith Bit 
        System.out.println(getIthBit(10, 3));

        //  Set Ith bit
         System.out.println(setIthBit(10, 2));

        //  Clear Ith Bit
        System.out.println(clearIthBit(10, 1));

        // update Ith Bit
        System.out.println(updateIthBit(10, 2, 1));
        
        // Clear Last i bits
        System.out.println(clearLastBit(15,2));

        //  Clear Range of bits
        System.out.println(clearRangeOfBits(10, 2, 4));

        //  Check If A Number Is Power of 2 Or Not
        System.out.println(isPowerOfTwo(15));

        // Count Set Bits in a Number
        System.out.println(countSetBits(10));

        // Fast Exponentiation
        System.out.println(fastExponentiation(5, 3));
    }

}
    
