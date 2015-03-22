package Problem_7;

public class Main {
    public static void main(String[] args) {
        int x = 0;
        int y;

        for (int i = 1;; i++) {
            if (isSimple(i)) x++; y=i;
            System.out.println("X:" + x + " y:" + y);
            if (x==10001) break;
        }
    }

    public static boolean isSimple(long x) {
        int x1 = 0;
        for (int i = 1; i <= x; i++) {
            if (x%i==0) x1++;
        }
        return x1 == 2;
    }
}
