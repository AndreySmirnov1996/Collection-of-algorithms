package string.reverse;

public class Reverse {

    static String reverse(String str) {
        StringBuilder res = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            res.append(str.charAt(length - i - 1));
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse("abc"));
    }
}
