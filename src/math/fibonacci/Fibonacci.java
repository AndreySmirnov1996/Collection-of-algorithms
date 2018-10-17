package math.fibonacci;

public class Fibonacci {

    static int fibonacciRec(int n){
        if(n < 2) {
            return 1;
        }
        return fibonacciRec(n - 1) + fibonacciRec(n - 2);
    }

    static int fibonacci(int n){
        if(n == 0) {
            return 1;
        }
        int previous = 1;
        int current = 1;
        for (int i = 2; i <= n; i++) {
            int t = current;
            current += previous;
            previous = t;
        }
        return current;
    }

    public static void main(String[] args) {
        System.out.println(fibonacciRec(10));
        System.out.println(fibonacci(10));
    }
}
