package Problem_2;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1;; i++) {
            if (fib(i) > 4000000) break;
            else {
                if (fib(i)%2==0) sum+=fib(i);
            }
        }
        System.out.println(sum);
    }

    static int fib(int i) {
        if (i == 1) return 1;
        if (i == 2) return 1;
        return fib(i - 1) + fib(i - 2);
    }
}
