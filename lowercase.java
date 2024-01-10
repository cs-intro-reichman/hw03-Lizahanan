public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str));
    }

  /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String s) {
       String newString = "";
       for (int i = 0; i< s.length(); i++){ 
        char c ='a';
        int charIndex = s.charAt(i);
        if (64<charIndex&&charIndex<91)
        c = (char)(charIndex + 32);
        else 
        c = (char)(charIndex);
        newString+=c;

       }
        
        return newString;
    }
} 
    

