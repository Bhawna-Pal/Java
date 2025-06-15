package Strings;

public class Substring {
    public static String subString(String str, int si, int ei) {
        String substr = "";
        for(int i=si; i<ei; i++){
            substr += str.charAt(i);
        }
        return substr;
    }

    //  Print the largest String


   public static void main(String[] args) {
    // Substring
       String str = "HelloWorld";
    //    System.out.println(str.substring(0, 5));
    //    System.out.println(subString(str, 0, 5));

    String fruits[] = {"apple", "mango", "banana"};

    String largest = fruits[0];
    for(int i=1; i<fruits.length; i++) {
        if (largest.compareTo(fruits[i]) < 0){
            largest = fruits[i];
        }
    }
     System.out.println(largest);
  }
}
