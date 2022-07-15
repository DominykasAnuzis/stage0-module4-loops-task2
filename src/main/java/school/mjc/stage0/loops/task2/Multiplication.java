package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int count = 0;
        while (count != ((multiplyByAndToInclusive > 0) ? multiplyByAndToInclusive + 1 : -multiplyByAndToInclusive + 1) && multiplyByAndToInclusive != 0){
            System.out.println(count * multiplyByAndToInclusive);
            count++;
        }
    }
}
