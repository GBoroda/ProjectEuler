package Problem_10;

public class Main {

    public static void main(String[] args) {
        long answer = 0;
        for (int i = 2000000; i > 1; i--) {
            if (isPrime(i)) {
                answer+=i;
                System.out.println("i:" + i);
            }
        }
        System.out.println(answer);
    }


    public static boolean isPrime(int N) {
        if (N < 2) return false;
        for (int i = 2; i*i <= N; i++)
            if (N % i == 0) return false;
        return true;
    }
}
