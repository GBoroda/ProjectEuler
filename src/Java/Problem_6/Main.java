package Problem_6;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        int answer = (int) getDifference(100);
        System.out.println(answer);
    }

    public static double getDifference(int x) {
        double z = 0;
        double y = 0;

        for (int i = 1; i <= x ; i++) {
            z+=i;
        }

        for (int i = 1; i <= x; i++) {
            y+=pow(i,2);
        }

        z = pow(z, 2);

        return z-y;
    }
}
