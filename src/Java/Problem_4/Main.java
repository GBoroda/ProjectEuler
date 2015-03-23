package Problem_4;

public class Main {
    public static void main(String[] args) {
        int biggestPaslindrom = 0;
        for (int i = 100; i < 999; i++) {
            for (int j = 100; j < 999; j++) {
                if (isPalyndrom(i*j)) {
                    if (i*j > biggestPaslindrom) biggestPaslindrom = i*j;
                }
            }
        }
        System.out.println(biggestPaslindrom);
    }

    public static boolean isPalyndrom(int x) {
        boolean g = false;
        String str = String.valueOf(x);
        char[] orig = str.toCharArray();
        for (int i = 0, j = orig.length - 1; (i < j); i++, j--) {
            if (orig[i] != orig[j]) {
                g = false;
                break;
            } else {
                g = true;
            }
        }
        return g;
    }
}
