public class isPalindrome {
    public static boolean is_Palindrome(String str) {
        for(int i=0; i<str.length()/2; i++) {
            int n= str.length();
            if(str.charAt(i)!= str.charAt(n-1-i)) {
                return false;
                //not a palindrome
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "asdffdsa";
        System. out .println(is_Palindrome(str));
    }
}
