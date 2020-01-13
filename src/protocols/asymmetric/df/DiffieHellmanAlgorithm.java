package protocols.asymmetric.df;


public class DiffieHellmanAlgorithm {

    public static void main(String[] args) {
        println("Start algorithm");
        println("---------------------------");

        // Part 1

        // Initialization of 'g' and 'p' numbers
        int g = 5;
        int p = 23;
        println(String.format("Initialization common 'g' and 'p' numbers: g = %d ; p = %d", g, p));
        println("---------------------------");

        // Generate Alice (a) and Bob (b) big random numbers
        int a = 6;
        int b = 15;
        println(String.format("Generate Alice (a) and Bob (b) secret keys: a = %d ; b = %d", a, b));
        println("---------------------------");

        int A = (int) (Math.pow(g, a) % p);
        println(String.format("Alice count remainder of the division A = g^a mod p = %d^%d mod %d = %d", g, a, p, A));
        println("Alice send to Bob A (" + A + ") ==>>");
        println("---------------------------");

        int B = (int) (Math.pow(g, b) % p);
        println(String.format("Bob count remainder of the division B = g^b mod p = %d^%d mod %d = %d", g, b, p, B));
        println("Bob send to Alice B (" + B + ") <<==");
        println("---------------------------");

        // Part 2

        // Alice and Bob count their common secret key
        int aliceKey = (int) (Math.pow(B, a) % p);
        println(String.format("Alice secret key S = B^a mod p = %d^%d mod %d = %d", B, a, p, aliceKey));
        int bobKey = (int) (Math.pow(A, b) % p);
        println(String.format("Bob secret key S = A^b mod p = %d^%d mod %d = %d", A, b, p, bobKey));

        println("---------------------------");
        println("End algorithm");
    }

    private static void println(String message) {
        System.out.println(message);
    }
}
