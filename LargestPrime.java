public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
    }

    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }
        int i, j, c = 0, f = -1;
        for (i = 2; i < number; i++) {
            for (j = 1; j <= i; j++) {
                if (i % j == 0) {
                    c++;
                }
            }
            if ((c == 2) && (number % i == 0)) {
                f = i;
            }
            c=0;
        }
        return f;
    }
}