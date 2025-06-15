package  Strings; 
public class Stringbuilder {

    //  convert lettrs ToUpperCase
    public static String toUpperCase(String str){
    StringBuilder Sb = new StringBuilder("");
    
    char ch = Character.toUpperCase(str.charAt(0));
    Sb.append(ch);

    for(int i=1; i<str.length(); i++) {
        if(str.charAt(i) == ' ' && i<str.length()-1){
            Sb.append(str.charAt(i));
            i++;
            Sb.append(Character.toUpperCase(str.charAt(i))); 
        } else {
            Sb.append(str.charAt(i));
        }
    }
    return Sb.toString();
}

// String Compression

  public static String compress(String Str) {
    String newStr = "";
    for(int i=0; i<Str.length(); i++){
        Integer count = 1;
        while(i<Str.length()-1 && Str.charAt(i) == Str.charAt(i+1)){
            count++;
            i++;
        }
        newStr += Str.charAt(i);
        if(count > 1){
            newStr += count.toString();
        }
    }
    return newStr;
}

    public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("");
    for(char ch='a'; ch<='z'; ch++) {
        sb.append(ch);
    }
    // System.out.println(sb);

    String str = "hi, i am bhawna pal";
    // System.out.println(toUpperCase(str));

    String Str = "aaabbcccdd";
    System.out.println(compress(Str));
    }
}