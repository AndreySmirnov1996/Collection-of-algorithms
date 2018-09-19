package palindrome;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("abbagabba"));
    }

    public static boolean isPalindrome(String str){
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse().toString().equals(str);
    }
}
