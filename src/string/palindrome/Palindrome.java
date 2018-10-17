package string.palindrome;


public class Palindrome {

    public static void main(String[] args) {
        String testStringTrue = "abbaabba";
        String testStringFalse = "abbabfgbaa";
        System.out.println(isPalindromeStringBuilder(testStringTrue));
        System.out.println(isPalindromeFor(testStringFalse));
    }

    public static boolean isPalindromeStringBuilder(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse().toString().equals(str);
    }

    public static boolean isPalindromeFor(String str) {
        char[] array = str.toCharArray();
        for (int i = 0; i <= array.length / 2; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
