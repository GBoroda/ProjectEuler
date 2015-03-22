package Problem_3;

public class Main {
    public static void main(String[] args) {
        for (long i = 0; i < 600851475143l; i++) {
            if (isPrime(i)) {
                if (isDelitsa(i)) System.out.println(i);
            }
        }
    }

    public static boolean isPrime(long N) {
        if (N < 2) return false;
        for (int i = 2; i*i <= N; i++)
            if (N % i == 0) return false;
        return true;
    }

    public static boolean isDelitsa(long N) {
        return 600851475143l % N == 0;
    }
}
