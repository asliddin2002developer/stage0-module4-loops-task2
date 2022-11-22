package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int counter = 0;
        int factorial = 1;
        while (counter <= printToInclusive) {
            if (counter == 0) {
                System.out.println(factorial);
            }
            factorial *= counter;
            System.out.println(factorial);
            counter++;
        }


    }
}
