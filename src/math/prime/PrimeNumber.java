package math.prime;

public class PrimeNumber {

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; ++i) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


    static boolean isPrimeFast(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i < num; ++i) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(7));
        System.out.println(isPrimeFast(7));
    }
}
