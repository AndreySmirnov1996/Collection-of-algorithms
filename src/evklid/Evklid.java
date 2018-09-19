package evklid;

public class Evklid {

    public static void main(String[] args) {
        System.out.println(divide(16,4));
    }

    public static int divide(int a, int b){
        if(b == 0){
            return a;
        }
        return divide(b,a%b);
    }
}
