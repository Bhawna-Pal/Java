package arrays;

public class MaxSubarraysKadane {
    public static void  kadane(int number[]) {
     int ms = Integer.MIN_VALUE;
     int cs = 0;
     for(int i=0; i<number.length; i++){
        cs = cs + number[i];
        if(cs < 0) {
            cs = 0;
        }
        ms = Math.max(cs, ms);
     }

     System.out.println("Our max subarray sum is : " + ms);
    }

    public static void main(String[] args) {
        // int number[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int number[] = {2, 4, 6, 8, 10};
        kadane(number);
    }
}
