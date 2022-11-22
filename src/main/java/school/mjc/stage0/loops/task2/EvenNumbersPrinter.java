package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int counter = 1;
        while (counter <= printTillInclusive) {
            if (counter % 2 ==0){
                System.out.println(counter);
            }
            counter++;
        }
        System.out.println("");
    }
}
