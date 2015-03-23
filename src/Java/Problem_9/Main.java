package Problem_9;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 999; i++) {
            for (int j = 1; j <= 999; j++) {
                for (int k = 1; k <= 999; k++) {
                    if ( ( pow(i,2) + pow(j,2) == pow(k,2)) && (i+j+k == 1000)) {
                        System.out.println(i*j*k);
                        System.exit(0);
                    }
                }
            }
        }
    }
}
