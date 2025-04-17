package arrays;
import java.util.*;

public class linearSearch {

    //  linear Search
    public static int LinearSearch(int numbers[], int key) {
       
        for(int i=0; i<numbers.length; i++) {
           if(numbers[i] == key) {
            return i;
           }
        }

        return -1;
    }

    //  Largest Number 

    public static int getLargest(int number[]) {
       int largest = Integer.MIN_VALUE;
       int smallest = Integer.MAX_VALUE;

       for(int i=0; i<number.length; i++) {
        if(largest < number[i]) {
            largest = number[i];
        }
        if(smallest > number[i]) {
        smallest = number[i];
        }
       }
        System.out.println("smallest value is : " + smallest);
       return largest;
    }
    public static void main(String[] args) {

        //  linear Search

        // int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        // // String menu[] = {"dosa", "Chole bhature", "samosa"};
        // int key = 20;

    //     int index = LinearSearch(numbers, key);
    //     if(index == -1) {
    //         System.out.println("Not found");
    //     } else {
    //     System.out.println("Key is at index : " + index);
    // }

    //  largest Number
    int number[] = {1, 2, 6, 3, 5};
    System.out.println("largest value is : " + getLargest(number));
}
}