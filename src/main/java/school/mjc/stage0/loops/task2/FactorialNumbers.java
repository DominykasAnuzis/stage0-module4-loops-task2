package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int factorial;
        int i;
        int numbers = 0;
        while (numbers <= printToInclusive) {
            i = 1;
            factorial = 1;
            while (i <= numbers) {
                factorial *= i;
                i++;
            }
            if (numbers == 0){
                factorial = 1;
            }
            System.out.println(factorial);
            numbers++;
        }
    }
}
