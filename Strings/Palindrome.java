package Strings;

public class Palindrome {
    public static boolean isPalindrome(String str) {
        for(int i=0; i<str.length()/2; i++) {
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)) {
                return false;
            }
        }
        return true;
    }
    public static Float getShortestPath(String path) {
        int x = 0, y = 0;
        for(int i=0; i<path.length(); i++) {
            char dir = path.charAt(i);
            //  South
               if(dir == 'S') {
                y--;
            }  
            //  North
            else if(dir == 'N') {
                y++;
            }  
            // West
            else if(dir == 'W') {
                x--;
            }
            else {
                x++;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2 + Y2);
    }
    public static void main(String[] args) {
        String str = "racecar";
        // System.out.println(isPalindrome(str));
        String path = "WNEENESENNN";
        // System.out.println(getShortestPath(path));

        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");

        // if(s1 == s2) {
        //     System.out.println("String are equal");
        // } else {
        //     System.out.println("Strings are not equal");
        // }
        // if(s1 == s3) {
        //     System.out.println("String are equal");
        // } else {
        //     System.out.println("Strings are not equal");
        // }

        if (s1.equals(s3)) {
            System.out.println("String are equal");
        } else {
            System.out.println("Strings are not equal");
        }   
    }
}
