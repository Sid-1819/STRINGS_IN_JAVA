
public class Palindrome {
    public static void main(String[] args) {
String s = "vbibvw";
        System.out.println(isPalindrome(s));

    }
    static boolean isPalindrome(String str){
str =str.toLowerCase();
for(int i= 0;i<str.length();i++){
    char start = str.charAt(i);
    char end  = str.charAt(str.length()-i-1);
    if (start != end) {

        return false;
    }
}return true;


    }
}