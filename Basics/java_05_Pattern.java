package Basics;
public class java_05_Pattern {
    public static void main(String[] args) {

        // Star pattern

        for(int line1 = 1; line1 <= 4; line1++) {
            //  one line
            for(int line2 = 1; line2 <= line1; line2++) {
                // System.out.print("*");
            }
            // System.out.println();
        }

        //  Inverted star pattern

        int n1 = 4;
        for(int line3 = 1; line3 <= n1; line3++) {
            for(int line4 = 1; line4 <= n1-line3+1; line4++) {
        // System.out.print("* ");
            }
            // System.out.println();
        }

        // Half Pyramid Pattern
        
        int n2 = 4;
        for(int line5 = 1; line5 <=n2; line5++) {
            for(int number = 1; number <= line5; number++) {
                // System.out.print(number + " ");
            }
            // System.out.println();
        } 

        //  Character Pattern

        int n3 = 4; 
        char ch = 'A';

        for(int line6 = 1; line6 <= n3; line6++) {
           for(int character = 1; character <= line6; character++) {
            System.out.print(ch + " ");
            ch++;
           }
           System.out.println();
        }
    }
}
