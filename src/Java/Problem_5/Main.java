package Problem_5;

public class Main {
    public static void main(String[] args) {

        for (int i = 10;; i+=10) {
            if (isGood(i)) {
                System.out.println(i);
                break;
            }
        }
    }

    public static boolean isGood(long x) {
        int y = 0;
        for (int i = 1; i <= 20; i++) {
            if (x%i==0) y++;
        }
        return y == 20;
    }

}
