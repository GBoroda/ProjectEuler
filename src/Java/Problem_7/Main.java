package Problem_7;

public class Main {
    public static void main(String[] args) {
        int x = 0;
        int y;

        for (int i = 1;; i++) {
            if (isPrime(i)) x++; y=i;
            System.out.println("X:" + x + " y:" + y);
            if (x==10001) break;
        }
    }

    public static boolean isPrime(int N) {
        if (N < 2) return false;
        for (int i = 2; i*i <= N; i++)
            if (N % i == 0) return false;
        return true;
    }
}
