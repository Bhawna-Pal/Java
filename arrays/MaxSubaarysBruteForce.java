package arrays;
import java.util.*;
public class MaxSubaarysBruteForce {
    // Brute Force
    public static void maxSubarraySum(int number[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i = 0; i<number.length; i++) {
          int start = i;
          for(int j = i; j < number.length; j++) {
            int end = j;
             currSum = 0;
            for(int k = start; k <= end; k++) {
                currSum += number[k];
            }
            System.out.println(currSum);
                if(maxSum < currSum) {
                    maxSum = currSum;
                }
          }
        }
        System.out.println("Maximum subarray sum is " + maxSum);
    }
    public static void main(String[] args) {
        //  Brute force
        int number[] = {2, 4, 6, 8, 10};
        maxSubarraySum(number);
    }
}