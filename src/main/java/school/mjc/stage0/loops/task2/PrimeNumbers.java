package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int x = 2;
        int y;
        int flg;
        while (x <= printToInclusive) {
            flg = 1;
            y = 2;
            while (y * y <= x) {
                if (x % y == 0) {
                    flg = 0;
                    break;
                }
                y++;
            }

            if (flg == 1) {
                System.out.println(x);
            }
            x++;
        }
    }
}
