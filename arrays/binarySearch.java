package arrays;
import java.util.*;
public class binarySearch {

    //  Binary Search 
     public static int BinarySearch(int numbers[], int key){
        int start = 0, end = numbers.length-1;
        while(start <= end){
            int mid = (start + end) / 2;

            if(numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end =  mid -1;
            }
        }
        return -1;
     }

    //   Reverse an Array

    public static void reverse(int number[]) {
        int first = 0, last = number.length-1;
        while(first < last) {
            //  swap
             int temp = number[last];
             number[last] = number[first];
             number[first] = temp;

             first++;
             last--;
        }
    }

    //  Pairs in an Array

    public static void printPairs(int arr[]) {
        int tp = 0;
        for(int i = 0; i < arr.length; i++) {
            int curr = arr[i]; 
            for(int j = i+1; j < arr.length; j++) {
                System.out.print("(" + curr + "," + arr[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs = " + tp);
    }

    //  Print Subarrays

    public static void printSubarrays(int arr[]) {
        int ts = 0;
        for(int i = 0; i < arr.length; i++) {
            int start = i;
            for(int j = i; j < arr.length; j++) {
                int end = j;
                for(int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                ts++;
                  System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays = "+ ts);
    }
    public static void main(String[] args) {
        // Binary Search
        int numbers[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 4;
        // System.out.println("index for key is : " + BinarySearch(numbers, key));
    
    //  Reverse an Array
        int number[] = {2, 4, 6, 8, 10};
        
        // reverse(number);
        for(int i=0; i < number.length; i++) {
            // System.out.print(number[i] + " ");
        }
        System.out.println();

        //  Pairs in an Array
        
        int arr[] = {2, 4, 6, 8, 10};
        // printPairs(arr);

        //   Print Subarrays

           printSubarrays(arr);
    }
}
