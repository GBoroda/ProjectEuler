package Problem_3;

public class Main {
    public static long x = 600851475143l;

    public static void main(String[] args) {
        for (long i = 0; i < x; i++) {
            if (isPrime(i)) {
                if (x%i==0) System.out.println(i);
            }
        }
    }

    public static boolean isPrime(long N) {
        if (N < 2) return false;
        for (int i = 2; i*i <= N; i++)
            if (N % i == 0) return false;
        return true;
    }
}
