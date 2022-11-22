package school.mjc.stage0.loops.task2;

public class PrimeNumbers {

    public void printPrimeNumbers(int printToInclusive) {
        int counter = 2;
        while (counter <= printToInclusive){
            if (isPrime(counter)){
                System.out.println(counter);
            }
            counter++;
        }
    }

    public boolean isPrime(int num) {
        int count = 1;
        for (int i = 2; i <= num; i++){
            if (num % i == 0) {
                count++;
            }
        }
        return count == 2;
    }
}
